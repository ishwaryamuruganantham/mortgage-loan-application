package casestudy3;

public class MortageLoanApplication{

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("   MORTGAGE LOAN APPLICATION SYSTEM");
        System.out.println("====================================");

        // Interface static method
        Verifiable.systemMessage();

        // 1. Customer
        Customer customer = new Customer(
                101,
                "Arun Kumar",
                "9876543210",
                "arun@gmail.com"
        );

        // 2. Employment
        Employment employment = new Employment(
                "ABC Technologies",
                "Software Developer",
                850000
        );

        // 3. Property
        Property property = new Property(
                "Coimbatore, Tamil Nadu",
                4500000
        );

        // 4. Credit Check
        CreditCheck creditCheck = new CreditCheck(750);

        // 5. Mortgage Loan
        MortgageLoan mortgageLoan = new MortgageLoan(
                3000000,
                8.5,
                20
        );

        // Runtime Polymorphism
        Loan loan = mortgageLoan;

        // 6. Loan Application
        LoanApplication application =
                new LoanApplication(
                        customer,
                        employment,
                        property,
                        creditCheck,
                        loan
                );

        // Display customer and loan details
        application.displayApplicationDetails();

        // Static method
        double maximumLoan =
                LoanCalculator.calculateMaximumLoan(
                        employment.getAnnualIncome()
                );

        System.out.println("\nMaximum Eligible Loan : Rs."
                + maximumLoan);

        // Process Loan
        LoanProcessor processor = new LoanProcessor();

        processor.processLoan(application);

        // Method Overloading
        System.out.println("\n====================================");
        System.out.println("       OVERLOADING DEMONSTRATION");
        System.out.println("====================================");

        // calculateEMI()
        System.out.println("Normal EMI : Rs."
                + String.format("%.2f",
                mortgageLoan.calculateEMI()));

        // calculateEMI(double amount)
        System.out.println("EMI for Rs.2500000 : Rs."
                + String.format("%.2f",
                mortgageLoan.calculateEMI(2500000)));

        // calculateEMI(double amount, int years)
        System.out.println("EMI for Rs.2500000 / 15 years : Rs."
                + String.format("%.2f",
                mortgageLoan.calculateEMI(2500000, 15)));

        System.out.println("\n====================================");
        System.out.println("       APPLICATION COMPLETED");
        System.out.println("====================================");
    }
}