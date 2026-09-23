package casestudy3;

public class LoanCalculator {

    // Static method
    public static double calculateMaximumLoan(double annualIncome) {

        return annualIncome * 5;
    }

    public static void displayCalculationMessage() {

        System.out.println("Loan calculation completed.");
    }
}