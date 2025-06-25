/**
 * This policyholder class represents an individual who owns a policy of their own. (Added 6/25/25)
 */
public class PolicyHolder {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokerStatus;
    private double height; // in inches
    private double weight; // in pounds

    /**
     * Constructor defaulted. (6/25/25)
     */
    public PolicyHolder() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokerStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Constructor defaulted with variable arguments. (Added 6/25/25)
     * @param firstName First name of the policyholder
     * @param lastName Last name of the policyholder
     * @param age Age of the policyholder
     * @param smokerStatus Smoker status (\"smoker\" or \"non-smoker\")
     * @param height Height in inches
     * @param weight Weight in pounds
     */
    public PolicyHolder(String firstName, String lastName, int age, String smokerStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters (Added 6/25/25)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSmokerStatus() {
        return smokerStatus;
    }

    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates the BMI using the formula:
     * BMI = (weight * 703) / (height^2)
     * @return the calculated BMI
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Returns a string representation of the policyholder's info. The toString method.
     Implemented code to implicitly call toString method and output information about Policy and PolicyHolders */
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n"
             + "Policyholder's Last Name: " + lastName + "\n"
             + "Policyholder's Age: " + age + "\n"
             + "Policyholder's Smoking Status (Y/N): " + smokerStatus + "\n"
             + String.format("Policyholder's Height: %.1f inches\n", height)
             + String.format("Policyholder's Weight: %.1f pounds\n", weight)
             + String.format("Policyholder's BMI: %.2f\n", calculateBMI());
    }
}
