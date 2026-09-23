package casestudy3;

public class LoanProcessor {

    public void processLoan(LoanApplication application) {

        System.out.println("\n======================================");
        System.out.println("       VERIFICATION PROCESS");
        System.out.println("======================================");

        application.getEmployment()
                .showVerificationStatus();

        application.getCreditCheck()
                .showVerificationStatus();

        application.getProperty()
                .showVerificationStatus();

        System.out.println("\n======================================");
        System.out.println("       ELIGIBILITY CHECK");
        System.out.println("======================================");

        if (application.checkEligibility()) {

            System.out.println("Loan Eligibility : ELIGIBLE");

            System.out.println("\n======================================");
            System.out.println("       LOAN CALCULATION");
            System.out.println("======================================");

            double emi = application.getLoan()
                    .calculateEMI();

            System.out.println("Monthly EMI : Rs." +
                    String.format("%.2f", emi));

            System.out.println("\nLoan Status : APPROVED");

            System.out.println("\n======================================");
            System.out.println("       LOAN PROCESSING");
            System.out.println("======================================");

            System.out.println(
                    "Mortgage loan processed successfully.");

        } else {

            System.out.println("Loan Eligibility : NOT ELIGIBLE");
            System.out.println("Loan Status : REJECTED");
        }
    }
}
