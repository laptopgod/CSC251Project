import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         // Create a PolicyHolder object
         PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, policyHolder));
      
      }
      
      //print out information about each Policy object
      for(Policy policy : policyList)
      { 
         //display information about the Policy
         //we can now access the data through the PolicyHolder object associated with each Policy object
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getPolicyHolder().getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getPolicyHolder().getLastName());
         System.out.println("Policyholder's Age: " + policy.getPolicyHolder().getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolder().getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getPolicyHolder().getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getPolicyHolder().getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getPolicyHolder().getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
         System.out.println();
         
         if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++; //check the smoking status of the policyholder within the Policy object by accessing getPolicyHolder()
      }
      
      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   }
}