package casestudy3;

public abstract class Loan {

    protected double loanAmount;
    protected double interestRate;
    protected int tenure;

    public Loan(double loanAmount,
                double interestRate,
                int tenure) {

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    // Abstract method
    public abstract double calculateEMI();

    // Concrete method
    public void displayLoanDetails() {

        System.out.println("Loan Amount   : Rs." + loanAmount);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Tenure        : " + tenure + " years");
    }
}