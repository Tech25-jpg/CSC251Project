public class Policy { // Variable collectively holding separate information about the policyholder. (Added 5/28/25)
    private PolicyHolder policyHolder;
private static int policyCount = 0; // The policycount keeps track of how many policyholders there are. (Added 6/25/25)

    // Null argument constructor (Added 5/28/25)
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyHolder = new PolicyHolder();
        policyCount++;
    }

    // Constructors that possess arguments that allow the program to run. (Added 5/28/25)
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new policyHolder(holder); // Utilizing a copy for security. (Added 6/25/25)
        policyCount++;
    }

    // Getters, Setters, and Arguments. (Added 5/28/25)
    public PolicyHolder getPolicyHolder() {
    return new PolicyHolder(policyHolder); // returning copy to avoid leaks Added 6/25/25
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
    
    /**
     * Returns a copy of the PolicyHolder object.
     */
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
        
    }

    /**
     * Sets the policy holder using a deep copy.
     */
    public void setPolicyHolder(PolicyHolder holder) {
        this.policyHolder = new PolicyHolder(holder);
    }
   
    // Calculated BMI (Body Mass Index) of the Policyholder.
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // Calculating the policy price (Added 5/28/25)
    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyholder.getAge > 50) {
            price += 75.0;
        }
        if (policyHolder.getsmokerStatus().equalsIgnoreCase("smoker")) {
            price += 100.0;
        }
        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
        }

/**
     * Returns the total number of Policy objects created. (Added 6/25/25)
     * @return number of policies in the tallied score
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    /**
     * Returns a string representation of the policy, including holder info and price.
     * @return string describing the policy, through the addition of "toString" method. Implemented code to implicitly call toString method and output information about both policy and their holders respectively.
     */
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + "\n"
             + "Provider Name: " + providerName + "\n"
             + policyHolder.toString()
             + String.format("Policy Price: $%.2f\n", calculatePolicyPrice());
    }
}

