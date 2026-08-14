package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

	private static final String DB_PASSWORD = "Admin@12345";
    private static final String API_SECRET_KEY = "sk_live_8f7a9d123456789";
    private static final String JWT_TOKEN = "eyJhbGciOiJIUzI1NiJ9.test.token";
    private static final String AWS_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";

	public static void main(String[] args) {
		
		
		//SpringApplication.run(GithubActionsApplication.class, args);

		System.out.println("Database Password: " + DB_PASSWORD);
        System.out.println("API Secret: " + API_SECRET_KEY);
        System.out.println("JWT Token: " + JWT_TOKEN);
        System.out.println("AWS Key: " + AWS_ACCESS_KEY);
		
		
	}

}
