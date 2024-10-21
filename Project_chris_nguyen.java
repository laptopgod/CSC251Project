import java.util.*;
import java.io.*;

public class Project_chris_nguyen 
{
   public static void main(String[] args) 
   {
      try
      {
         /*Create an instance of the File class. Pass the string "PolicyInformation.txt" to the constructor. 
         This process creates a File object that represents the file PolicyInformation.txt.*/
         File file = new File("PolicyInformation.txt");
         
         /* Pass a reference to the File object as an argument to the Scanner class constructor (i.e., file) */                             
         Scanner inputFile = new Scanner(file);
         
         //declare the variables
         int policyNum = 0, age = 0;
         double height = 0.0, weight = 0.0;
         String providerName = "", firstName = "", lastName = "", smokingStatus = "";
         
         //Create an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policy = new ArrayList<Policy>();
      
         while(inputFile.hasNext())
         { //open loop
      
            policyNum = inputFile.nextInt();
            age = inputFile.nextInt();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            /* Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            Policy p = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight); //Passing variables as arguments to the constructor
         
            /* Add Policy objects to the ArrayList (Note: policy is the reference variable for the ArrayList and p is the
            reference variable for the Policy objects)*/
            policy.add(p); 
         
         } //close loop
      
         inputFile.close();//close the file
      
         //use a for loop to display the output
         for(int i =0; i < policy.size(); i++)
         {
            System.out.println( "Policy Number: " + policy.get(i).getPolicyNum());
            System.out.println( "Provider Name: " + policy.get(i).getProviderName());
            System.out.println( "Policyholder's First Name: " + policy.get(i).getFirstName());
            System.out.println( "Policyholder's Last Name: " + policy.get(i).getLastName());
            System.out.println( "Policyholder's Age: " + policy.get(i).getAge());
            System.out.println( "Policyholder's Smoking Status: " + policy.get(i).getSmokingStatus());
            System.out.println( "Policyholder's Height: " + policy.get(i).getHeight() + " inches");
            System.out.println( "Policyholder's Weight: " + policy.get(i).getWeight() + " pounds");
            System.out.printf( "Policyholder's BMI: %.2f%n", policy.get(i).calculateBMI());
            System.out.printf( "Policy Price: $%.2f%n", policy.get(i).calculateInsurancePrice());
            System.out.println();
            
         }
      
      }//close the "try" block of code
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
   } //close main
   
} //close the class container