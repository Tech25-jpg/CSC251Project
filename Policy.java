/**
* This models an insurance policy. (Added 6/12/25)
*/

public class Policy { // Variable collectively holding separate information about the policyholder. (Added 5/28/25)
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokerStatus;
    private double height; // in inches
    private double weight; // in pounds

    // Null argument constructor (no argument initializing values) (Added 5/28/25)
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
     /**
     * Constructs a Policy with all required parameters. (Added 6/12/25)
     *
     * @param policyNumber Policy number
     * @param providerName Provider name
     * @param firstName Policyholder's first name
     * @param lastName Policyholder's last name
     * @param age Policyholder's age
     * @param SmokerStatus Smoking status (smoker/non-smoker)
     * @param height Policyholder's height in inches
     * @param weight Policyholder's weight in pounds
     */

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
    /** returning the policy number */ //(Added 6/12/25)
    public int getPolicyNumber() {
        return policyNumber;
    }
   /** @param policyNumber, which the policy number is set to */ //(Added 6/12/25)
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    // Getters and Setters for the named Provider.
/** returning the provider's name */ //(Added 6/12/25)
    public String getProviderName() {
        return providerName;
    }
/** @param providerName the name of the provider is set. */ //(Added 6/12/25)
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    // Getters and Setters for First Name.
/** return policyholder's first name to set */ //(Added 6/12/25)
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
/** @param firstName policyholder's first name to set. */ //(Added 6/12/25)
    public void setPolicyholderFirstName(String firstName) {
        this.policyholderFirstName = firstName;
    }
   // Getters and Setters for Last Name.
   /** return policyholder's last name. */ //(Added 6/12/25)
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }
/** @param lastName policyholder's last name toward set. */ //(Added 6/12/25)
    public void setPolicyholderLastName(String lastName) {
        this.policyholderLastName = lastName;
    }
   // Getters and Setters for Policyholder's Age.
   /** return policyholder's age. */ // (Added 6/12/25)
    public int getPolicyholderAge() {
        return policyholderAge;
    }
/** @return age policyholder's age to set. */ // (Added 6/12/25)
    public void setPolicyholderAge(int age) {
        this.policyholderAge = age;
    }
   // Getters and Setters for Smoking Status.
   /* return policyholder's smoker status. */ // (Added 6/12/25)
    public String getSmokerStatus() {
        return smokerStatus;
    }
/** @param smokerStatus policyholder's smoking status to set. */ // (Added 6/12/25)
    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }
   // Getters and Setters for Height of the Policyholder.
   /** @return policyholder's height */ // (Added 6/12/25)
    public double getHeight() {
        return height;
    }
/** @param height policyholder's height to set. */ //(Added 6/12/25)
    public void setHeight(double height) {
        this.height = height;
    }
    // Getters and Setters for the Weight of the Policyholder.
/** @return policyholder's weight */ // (Added 6/12/25)
    public double getWeight() {
        return weight;
    }
/** @param weight policyholder's weight to set. */ // (Added 6/12/25)
    public void setWeight(double weight) {
        this.weight = weight;
    }

/** Calculates and returns BMI
*
*
* @return BMI value
*/
    // Calculated BMI (Body Mass Index) of the Policyholder.
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

/** Calculates and returns policy price.
*
* @return the total policy price
*/
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

