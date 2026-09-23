package casestudy3;

public interface Verifiable {

    boolean verify();

    // Default method
    default void showVerificationStatus() {
        System.out.println("Verification process completed.");
    }

    // Static method
    static void systemMessage() {
        System.out.println("Mortgage verification system started.");
    }
}