import java.util.Scanner;

public class Project_Kevin_Teah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your policy number (101, 2205191, etc.): ");
        int policyNumber = input.nextInt();
        input.nextLine(); // consuming newline

        System.out.print("Please enter the name of your  healthcare provider (Atrium Health, State Farm, etc): ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the age of the Policyholder: ");
        int age = input.nextInt();
        input.nextLine(); // consuming newline

        System.out.print("Please enter the Smoking Status of the Policyholder(smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the height of the Policyholder (in inches, for ex: 70): ");
        double height = input.nextDouble();

        System.out.print("Please enter the weight of the Policyholder (in pounds, for ex: 180): ");
        double weight = input.nextDouble();

        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Output all information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getPolicyholderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getPolicyholderLastName());
        System.out.println("Age of the Policyholder: " + policy.getPolicyholderAge());
        System.out.println("The Smoking Status of Policyholder: " + policy.getSmokerStatus());
        System.out.printf("Height of Policyholder: %.1f inches%n", policy.getHeight());
        System.out.printf("Weight of Policyholder: %.1f pounds%n", policy.getWeight());
        System.out.printf("BMI of Policyholder: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());

        System.out.println("\nNumber of Smokers: " + smokerCount); // Amount of smokers entered. (Added 6/12/25)
        System.out.println("Number of Non-Smokers: " + nonSmokerCount // Amount of non-smokers added. (Added 6/12/25)
        
        input.close();
    }
}
