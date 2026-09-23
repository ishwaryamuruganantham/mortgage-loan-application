package casestudy3;

class MortgageLoan extends Loan {

    public MortgageLoan(double loanAmount, double interestRate, int tenure) {
        super(loanAmount, interestRate, tenure);
    }

    // Method Overriding
    @Override
    public double calculateEMI() {
        return loanAmount / (tenure * 12);
    }

    // Method Overloading
    public double calculateEMI(double amount) {
        return amount / (tenure * 12);
    }

    // Method Overloading
    public double calculateEMI(double amount, int years) {
        return amount / (years * 12);
    }
}
