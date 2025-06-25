public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int policyCount = 0; // The policycount keeps track of how many policyholders there are. (Added 6/25/25)
  
  // Null argument constructor (Added 5/28/25)
    public Policy(int policyNumber, String providerName, PolicyHolder holder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(holder);
        policyCount++;
    }
// Constructors that possess arguments that allow the program to run. (Added 5/28/25)
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }

    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder); // returning copy (6/25/25)
    }

    public void setPolicyHolder(PolicyHolder holder) {
        this.policyHolder = new PolicyHolder(holder);
    }

    public double calculatePolicyPrice() {
        double price = 600.0;

        if (policyHolder.getAge() > 50) {
            price += 75.0;
        }

        if (policyHolder.getSmokerStatus().equalsIgnoreCase("smoker")) {
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
     *
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
             + String.format("Policyholder's BMI: %.2f\n", policyHolder.calculateBMI())
             + String.format("Policy Price: $%.2f\n", calculatePolicyPrice());
    }
}
