package com.example.github_actions;


/**
 * TEST FIXTURE ONLY.
 * Every value below is FAKE (made up, correct format, not issued by any provider).
 * Do not replace with real credentials. Do not copy into production code.
 *
 * Sections:
 *   A. Provider-format secrets  -> TruffleHog detectors should match (expect UNVERIFIED, fake values)
 *   B. Generic password / key   -> no verifier; expect GENERIC_SECRET (manual review)
 *   C. Placeholders / references -> expect PLACEHOLDER (false positive candidates)
 *   D. Edge cases
 */
public class SecretTestFixtures {

    // =====================================================================
    // A. PROVIDER-FORMAT SECRETS (fake values with real formats)
    // =====================================================================

    // AWS: access key ID + secret key together (the detector needs both)
    private static final String AWS_ACCESS_KEY_ID = "AKIAJ4Q7ZXN2MWT5R3LP";
    private static final String AWS_SECRET_ACCESS_KEY = "k3Fq9Zr2Lm7Xv0BtYp5Nc8Wd1Hs4Ga6Ju+Te/IoQz";

    // AWS config style (key and secret on nearby lines, gives the detector context)
    String awsConfig =
            "aws_access_key_id = AKIAJ4Q7ZXN2MWT5R3LP\n" +
                    "aws_secret_access_key = k3Fq9Zr2Lm7Xv0BtYp5Nc8Wd1Hs4Ga6Ju+Te/IoQz";

    // GitHub personal access token (ghp_ + 36 chars)
    private static final String GITHUB_TOKEN = "ghp_R7kT2mXq9LbV4nZc8WdY1HsA6GuJ3TeP0oIf";

    // GitLab personal access token (glpat- + 20 chars)
    private static final String GITLAB_TOKEN = "glpat-Xk29LmQ7ZrT4vB8nWc3Y";

    // Slack bot token
    private static final String SLACK_BOT_TOKEN = "xoxb-2847391056238-5039182746591-Tq8LmZx3Rv7KpW2nYc4HdJ6B";

    // Stripe live secret key (may be blocked by GitHub push protection; see notes)
    private static final String STRIPE_SECRET_KEY = "sk_live_51Hx9LmQ7ZrT4vB8nWc3YkPa";

    // SendGrid API key
    private static final String SENDGRID_API_KEY =
            "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";

    // Twilio API key (SK + 32 hex)
    private static final String TWILIO_API_KEY = "SK3f9a1c7e5b2d4086af13c9e7d5b2a4f6";

    // Google API key (AIza + 35 chars)
    private static final String GOOGLE_API_KEY = "AIzaSyA7Zr2Lm9Xv0BtYp5Nc8Wd1Hs4Ga6Ju3Te";

    // Credentials embedded in connection strings / URIs
    private static final String JDBC_URL =
            "jdbc:mysql://admin:Zq8mLp2vXk91@db.internal.example.com:3306/appdb";
    private static final String MONGO_URI =
            "mongodb://appuser:Zq8mLp2vXk91@mongo.internal.example.com:27017/appdb";
    private static final String REDIS_URI =
            "redis://default:Zq8mLp2vXk91@cache.internal.example.com:6379";
    private static final String FTP_URI =
            "ftp://deploy:Zq8mLp2vXk91@files.internal.example.com/releases";

    // Private key (fake body, so it will not parse as a usable key)
    private static final String PRIVATE_KEY =
            "-----BEGIN RSA PRIVATE KEY-----\n" +
                    "MIIBOgIBAAJBAKj34GkxFhD90vcNLYLInFEX6Ppy1tPf9Cnzj4p4WGeKLs1Pt8Qu\n" +
                    "KUpRKfFLfRYC9AIKjbJTWit+CqvjWYzvQwECAwEAAQJAIJLixBy2qpFoS4DSmoEm\n" +
                    "o3qGy0t6z09AIJtH+5OeRV1be+N4cDYJKffGzDa88vQENZiRm0GRq6a+HPGQMd2k\n" +
                    "-----END RSA PRIVATE KEY-----";

    // =====================================================================
    // B. GENERIC PASSWORD / SECRET KEY (no provider format, cannot be verified)
    // =====================================================================

    private static final String password = "Zq8!mLp2vX#91";
    private static final String PASSWORD = "Tr0ub4dor&3x9";
    private String dbPassword = "Pr0d-Db!Pass#2291";
    private String adminPwd = "s3cr3tAdm1n!77";
    private String secretKey = "9f86d081884c7d659a2feaa0c55ad015";
    private String apiKey = "7c4a8d09ca3762af61e59520943dc264";
    private String clientSecret = "Zx81Qw3Er5Ty7Ui9Op0As2Df4Gh6Jk8L";
    private String jwtSecret = "mY$up3rS3cr3tJwtSign1ngKey!2026";
    private String authToken = "e3b0c44298fc1c149afbf4c8996fb924";

    // key: value / config style
    String yamlStyle = "password: Zq8!mLp2vX#91";
    String propertiesStyle = "spring.datasource.password=Zq8!mLp2vX#91";
    String envStyle = "DB_PASSWORD=Zq8!mLp2vX#91";
    String jsonStyle = "{\"client_secret\": \"Zx81Qw3Er5Ty7Ui9Op0As2Df4Gh6Jk8L\"}";

    // =====================================================================
    // C. PLACEHOLDERS AND REFERENCES (no real secret exposed)
    // =====================================================================

    // Obvious placeholder values
    private String password1 = "changeme";
    private String password2 = "password";
    private String password3 = "your-password-here";
    private String password4 = "<password>";
    private String password5 = "xxxxxxxx";
    private String password6 = "********";
    private String secretKey1 = "${SECRET_KEY}";
    private String apiKey1 = "{{API_KEY}}";
    private String token1 = "TODO";
    private String token2 = "null";
    private String dummyPassword = "dummy";
    private String testPassword = "test";

    // Values read from the environment, config, or a vault (not hardcoded)
    private String fromEnv = System.getenv("DB_PASSWORD");
    private String fromProp = System.getProperty("db.password");
    private String passwordFromVault = VaultClient.read("secret/app/db");

    // Config-injected style (plain comment instead of the Spring annotation so no dependency is needed)
    // @Value("${db.password}")
    private String injectedPassword = System.getenv("INJECTED_DB_PASSWORD");
    // @Value("${app.secret-key}")
    private String injectedSecretKey = System.getenv("INJECTED_SECRET_KEY");

    // =====================================================================
    // D. EDGE CASES (variable names mention password/key, no literal value)
    // =====================================================================

    void edgeCases(AssetModel assetModel, User user, Config config, String rawPassword, String accessToken) {
        assetModel.setKey(PASSWORD);                    // passes a constant, no literal here
        assetModel.setSecret(secretKey);
        user.setPassword(password);
        user.setPassword(user.getPassword());
        config.setApiKey(System.getenv("API_KEY"));
        config.setToken(TokenService.generate());
        String authHeader = "Bearer " + accessToken;
        user.setPassword(PasswordEncoder.encode(rawPassword));
        String passwordLabel = "Password";               // UI label, not a secret
        String passwordHint = "Enter your password";     // UI text
        String keyName = "api_key";                      // field name, not a value
        String url = "https://example.com/reset-password";
    }

    // Redacted / masked values (cannot be verified)
    private String maskedAws = "AKIA****************";
    private String maskedToken = "ghp_********************************";

    // ---------------------------------------------------------------------
    // Minimal stubs so this file compiles with no other classes or libraries
    // ---------------------------------------------------------------------
    static class AssetModel {
        void setKey(String v) { }
        void setSecret(String v) { }
    }

    static class User {
        private String password;
        String getPassword() { return password; }
        void setPassword(String v) { this.password = v; }
    }

    static class Config {
        void setApiKey(String v) { }
        void setToken(String v) { }
    }

    static class VaultClient {
        static String read(String path) { return null; }
    }

    static class TokenService {
        static String generate() { return null; }
    }

    static class PasswordEncoder {
        static String encode(String raw) { return raw; }
    }
}

