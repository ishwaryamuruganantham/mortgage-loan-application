package casestudy3;

public class LoanApplication {

    // HAS-A relationships
    private Customer customer;
    private Employment employment;
    private Property property;
    private CreditCheck creditCheck;
    private Loan loan;

    public LoanApplication(Customer customer,
                           Employment employment,
                           Property property,
                           CreditCheck creditCheck,
                           Loan loan) {

        this.customer = customer;
        this.employment = employment;
        this.property = property;
        this.creditCheck = creditCheck;
        this.loan = loan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employment getEmployment() {
        return employment;
    }

    public Property getProperty() {
        return property;
    }

    public CreditCheck getCreditCheck() {
        return creditCheck;
    }

    public Loan getLoan() {
        return loan;
    }

    public boolean checkEligibility() {

        return employment.verify()
                && property.verify()
                && creditCheck.verify();
    }

    public void displayApplicationDetails() {

        System.out.println("\n======================================");
        System.out.println("       CUSTOMER DETAILS");
        System.out.println("======================================");

        customer.displayCustomerDetails();

        System.out.println("\nEmployment : " +
                employment.getCompanyName());

        System.out.println("Job Role   : " +
                employment.getJobRole());

        System.out.println("Annual Income : Rs." +
                employment.getAnnualIncome());

        System.out.println("\nProperty Address : " +
                property.getPropertyAddress());

        System.out.println("Property Value : Rs." +
                property.getPropertyValue());

        System.out.println("\nCredit Score : " +
                creditCheck.getCreditScore());

        System.out.println("\nLoan Details");

        loan.displayLoanDetails();
    }
}