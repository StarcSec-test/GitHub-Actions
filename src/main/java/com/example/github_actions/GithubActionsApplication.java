package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GithubActionsApplication.class, args); 
		private static final String AWS_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";
		System.out.println("AWS Key: " + AWS_ACCESS_KEY);
	}
}
