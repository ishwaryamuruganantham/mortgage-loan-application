package casestudy3;

public class CreditCheck implements Verifiable {

    private int creditScore;

    public CreditCheck(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getCreditScore() {
        return creditScore;
    }

    @Override
    public boolean verify() {

        return creditScore >= 650;
    }

    @Override
    public void showVerificationStatus() {

        if (verify()) {
            System.out.println("Credit Check        : PASSED");
        } else {
            System.out.println("Credit Check        : FAILED");
        }
    }
}
