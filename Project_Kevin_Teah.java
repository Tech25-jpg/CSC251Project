import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Kevin_Teah {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("PolicyInformation.txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<Policy> policies = new ArrayList<>();

        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Reading files on data and creating Policy objects (//Added 6/12/25)
        while (fileScanner.hasNextLine()) {
            int policyNumber = Integer.parseInt(fileScanner.nextLine());
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = Integer.parseInt(fileScanner.nextLine());
            String smokerStatus = fileScanner.nextLine();
            double height = Double.parseDouble(fileScanner.nextLine());
            double weight = Double.parseDouble(fileScanner.nextLine());

            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);
            policies.add(policy);
             
             if (policy.getSmokerStatus().equalsIgnoreCase("smoker")) {
            smokerCount++;
        } else {
            nonSmokerCount++;
            
        }
        
    }
    
    if (fileInput.hasNextLine()) {
        fileInput.nextLine(); // Skipping blank lines between entries. (Added 6/12/25)
        
        }
        
     }
     
     fileInput.close()

        }
        
        fileScanner.close();

        // Output all information for each policyholder and count the number of smokers/non-smokers.
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
        
         
        //Display the smoker statistics collected (Added 6/12/25)
        System.out.println("\nNumber of Smokers: " + smokerCount); // Amount of smokers entered. (Added 6/12/25)
        System.out.println("Number of Non-Smokers: " + nonSmokerCount // Amount of non-smokers added. (Added 6/12/25)
        
        input.close();
    }
}
