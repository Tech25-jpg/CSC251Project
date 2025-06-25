import java.util.Scanner;

public class Project_Kevin_Teah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smokerCount = 0; // (Added 6/25/25)
        int nonSmokerCount = 0; // (Added 6/25/25)
        int totalPolicies = 0; // initalized counter (6/25/25)
        String anotherPolicy;

        do {
            System.out.print("Please enter your designated policy number, ex: 101, 250625: ");
            int policyNumber = input.nextInt();
            input.nextLine(); // Cleared newline

            System.out.print("Enter the provider name of your healthcare service (ex: Atrium Health, State Farm): ");
            String providerName = input.nextLine();

            System.out.print("Enter the policyholder's first name: ");
            String firstName = input.nextLine();

            System.out.print("Enter the policyholder's last name: ");
            String lastName = input.nextLine();

            System.out.print("Enter the policyholder's age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Enter the policyholder's smoking status (smoker/non-smoker): ");
            String smokerStatus = input.nextLine();
            if (smokerStatus.equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }

            System.out.print("Please enter the policyholder's height (in inches, ex: 70): ");
            double height = input.nextDouble();

            System.out.print("Enter the policyholder's weight (in pounds, ex: 180): ");
            double weight = input.nextDouble();
            input.nextLine();

            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokerStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName, policyHolder);

            System.out.println("\nPolicy Information:");
            System.out.println(policy);

            System.out.println("\nNumber of Smokers: " + smokerCount);
            System.out.println("Number of Non-Smokers: " + nonSmokerCount);
            
            totalPolicies++;

            System.out.print("Would you like to enter another policy? (Y/N): ");
            anotherPolicy = input.nextLine();

        } while (anotherPolicy.equalsIgnoreCase("Y"));
        
        // After loop ends, print total policies
        System.out.println("Total number of policies entered: " + totalPolicies);

    }
}