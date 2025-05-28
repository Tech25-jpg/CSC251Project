public class Policy { // Variable collectively holding separate information about the policyholder. (Added 5/28/25)
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokerStatus;
    private double height; // in inches
    private double weight; // in pounds

    // Null argument constructor (Added 5/28/25)
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokerStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    // Constructors that possess arguments that allow the program to run. (Added 5/28/25)
    public Policy(int policyNumber, String providerName, String firstName, String lastName, int age,
                  String smokerStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = firstName;
        this.policyholderLastName = lastName;
        this.policyholderAge = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters, Setters, and Arguments. (Added 5/28/25)
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    // Getters and Setters for the named Provider.

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    // Getters and Setters for First Name.
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String firstName) {
        this.policyholderFirstName = firstName;
    }
   // Getters and Setters for Last Name.
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String lastName) {
        this.policyholderLastName = lastName;
    }
   // Getters and Setters for Policyholder's Age.
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public void setPolicyholderAge(int age) {
        this.policyholderAge = age;
    }
   // Getters and Setters for Smoking Status.
    public String getSmokerStatus() {
        return smokerStatus;
    }

    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }
   // Getters and Setters for Height of the Policyholder.
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // Getters and Setters for the Weight of the Policyholder.

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Calculated BMI (Body Mass Index) of the Policyholder.
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // Calculating the policy price (Added 5/28/25)
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyholderAge > 50) {
            price += 75.0;
        }
        if (smokerStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}

