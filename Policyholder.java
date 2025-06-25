public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokerStatus;
    private double height;
    private double weight;

    public PolicyHolder() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokerStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }

    public PolicyHolder(String firstName, String lastName, int age, String smokerStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokerStatus = smokerStatus;
        this.height = height;
        this.weight = weight;
    }

    public PolicyHolder(PolicyHolder other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.smokerStatus = other.smokerStatus;
        this.height = other.height;
        this.weight = other.weight;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSmokerStatus() { return smokerStatus; }
    public void setSmokerStatus(String smokerStatus) { this.smokerStatus = smokerStatus; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n"
              + "Policyholder's Last Name: " + lastName + "\n"
              + "Policyholder's Age: " + age + "\n"
              + "Policyholder's Smoking Status (Y/N): " + smokerStatus + "\n"
              + String.format("Policyholder's Height: %.1f inches\n", height)
              + String.format("Policyholder's Weight: %.1f pounds\n", weight);
              }

}