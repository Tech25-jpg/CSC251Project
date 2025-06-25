public class Policy { // Variable collectively holding separate information about the policyholder. (Added 5/28/25)
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0; // The policycount keeps track of how many policyholders there are. (Added 6/25/25)

 // Null argument constructor (Edited 6/25/25)
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.policyHolder = new PolicyHolder();
        policyCount++;
    }

    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(holder); // deep returning copy
        policyCount++;
    }
// Getters, Setters, and Arguments. (Added 5/28/25)
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
    }
     /**
     * Sets the policy holder using a deep copy.
     */
    public void setPolicyHolder(PolicyHolder holder) {
        this.policyHolder = new PolicyHolder(holder);
    }

    public double getPolicyPrice() {
        double baseFee = 600.0;
        if (policyHolder.getAge() > 50) {
            baseFee += 75.0;
        }
        if (policyHolder.getSmokerStatus().equalsIgnoreCase("smoker")) {
            baseFee += 100.0;
        }
        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) {
            baseFee += (bmi - 35) * 20;
        }
        return baseFee;
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
     @Override
     */

    public String toString() {
        return "Policy Number: " + policyNumber + "\n"
             + "Provider Name: " + providerName + "\n"
             + policyHolder.toString()
             + String.format("Policy Price: $%.2f%n", getPolicyPrice());
    }
}

