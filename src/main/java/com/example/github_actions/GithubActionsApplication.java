package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

	private static final String GITHUB_TOKEN = "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";

	public static void main(String[] args) {
		
		//SpringApplication.run(GithubActionsApplication.class, args);

		System.out.println("GITHUB_TOKEN : " + GITHUB_TOKEN);		
	}

}
