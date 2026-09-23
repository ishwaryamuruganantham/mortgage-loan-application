package casestudy3;

public class Employment implements Verifiable {

    private String companyName;
    private String jobRole;
    private double annualIncome;

    public Employment(String companyName,
                      String jobRole,
                      double annualIncome) {

        this.companyName = companyName;
        this.jobRole = jobRole;
        this.annualIncome = annualIncome;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    // Interface method implementation
    @Override
    public boolean verify() {

        return annualIncome >= 500000;
    }

    // Overriding default method
    @Override
    public void showVerificationStatus() {

        if (verify()) {
            System.out.println("Income Verification : PASSED");
        } else {
            System.out.println("Income Verification : FAILED");
        }
    }
}