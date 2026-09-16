package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GithubActionsApplication.class, args); 
		final String AWS_ACCESS_KEY = System.getenv("AWS_ACCESS_KEY");
		if (AWS_ACCESS_KEY == null || AWS_ACCESS_KEY.isEmpty()) {
			throw new IllegalStateException("AWS_ACCESS_KEY environment variable is not set");
		}
		System.out.println("AWS Key loaded from environment: " + !AWS_ACCESS_KEY.isEmpty());
	}
}
