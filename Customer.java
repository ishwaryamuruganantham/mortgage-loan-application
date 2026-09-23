package casestudy3;

public class Customer {

    // Encapsulation
    private int customerId;
    private String customerName;
    private String phoneNumber;
    private String email;

    // Constructor
    public Customer(int customerId, String customerName,
                    String phoneNumber, String email) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Display method
    public void displayCustomerDetails() {

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);
        System.out.println("Email         : " + email);
    }
}