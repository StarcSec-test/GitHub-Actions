package com.example.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {

	private static final String GITHUB_TOKEN = "ghs_11A3U5O4Q0ur4DG5kl5L7g_FgaDykpoDMBuL4hulctiDoHy8jHrHcRpQBiWJs1pKlW3JQFYQ6SeCbSV4SL";
    private static final String API_SECRET_KEY = "sk_live_8f7a9d123456789";
    private static final String JWT_TOKEN = "eyJhbGciOiJIUzI1NiJ9.test.token";
    private static final String AWS_ACCESS_KEY = "AKIAVFXAGOYT4KNG2IGA FOFywANRCnPJGtV8oI5ynAFA6x7U3OID+vpvB7Bi";

	public static void main(String[] args) {
	
		//SpringApplication.run(GithubActionsApplication.class, args);
		System.out.println("GITHUB_TOKEN : " + "ghs_11A3U5O4Q0ur4DG5kl5L7g_FgaDykpoDMBuL4hulctiDoHy8jHrHcRpQBiWJs1pKlW3JQFYQ6SeCbSV4SL");
        System.out.println("API Secret: " + API_SECRET_KEY);
        // System.out.println("JWT Token: " + JWT_TOKEN);
        System.out.println("AWS Key : " + AWS_ACCESS_KEY);	
	}
}
