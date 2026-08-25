@RestController
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<Map<String, Object>> getUser(
            @RequestParam String username) {

        String query =
                "SELECT * FROM users WHERE username = '"
                        + username
                        + "'";
        return jdbcTemplate.queryForList(query);
    }
}
