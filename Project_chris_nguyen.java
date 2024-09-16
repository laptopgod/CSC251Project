import java.util.Scanner;

public class Project_chris_nguyen 
{
   public static void main(String[] args) 
   {
      Scanner keyboard = new Scanner(System.in);//instantiating a Scanner object

      // Input section
      System.out.print("Please enter the Policy Number: ");
      int policyNum = keyboard.nextInt();
      keyboard.nextLine(); //clear the buffer from previous input

      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder's Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine(); //clear the buffer from previous input

      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();

      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = keyboard.nextDouble();

      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = keyboard.nextDouble();

      //instantiate our Policy object
      Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);

      // Output section
      System.out.println("\nPolicy Number: " + policy.getPolicyNum());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

      // Calculating and displaying BMI and policy price
      System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f%n", policy.calculateInsurancePrice());
   }
}