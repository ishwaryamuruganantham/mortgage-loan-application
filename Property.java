package casestudy3;

public class Property implements Verifiable {

    private String propertyAddress;
    private double propertyValue;

    public Property(String propertyAddress,
                    double propertyValue) {

        this.propertyAddress = propertyAddress;
        this.propertyValue = propertyValue;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    @Override
    public boolean verify() {

        return propertyValue >= 1000000;
    }

    @Override
    public void showVerificationStatus() {

        if (verify()) {
            System.out.println("Property Verification : PASSED");
        } else {
            System.out.println("Property Verification : FAILED");
        }
    }
}