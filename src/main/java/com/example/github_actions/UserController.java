package com.example;

import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @GetMapping("/search")
    public List<User> searchUsers(@RequestParam String name) {
        List<User> results = new java.util.ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();

            // some unrelated logging
            System.out.println("Searching for user: " + name);

            // padding lines to simulate a real file with more context
            long startTime = System.currentTimeMillis();
            String logPrefix = "[UserSearch]";
            boolean auditEnabled = true;
            if (auditEnabled) {
                System.out.println(logPrefix + " audit: search initiated");
            }

            // === VULNERABLE LINE (line 42) ===
            String sql = "SELECT * FROM users WHERE name = '" + name + "'";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                results.add(u);
            }

            rs.close();
            stmt.close();
            conn.close();

            long duration = System.currentTimeMillis() - startTime;
            System.out.println(logPrefix + " completed in " + duration + "ms");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM users WHERE id = ?", new Object[]{id}, User.class);
    }
}
