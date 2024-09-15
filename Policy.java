import java.util.Scanner;

public class Policy //Policy class that will model an insurance policy for one person
{
   private int policyNum;
   private String providerName, firstName, lastName;
   private int age;
   private String smokingStatus;
   private double height; // in inches
   private double weight; // in pounds
   public Policy() //no-arg constructor (set default values for all fields)
   {
      policyNum = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   public Policy(int policyNum, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) //constructor that accepts arguments
   {
      policyNum = policyNum;
      providerName = providerName;
      firstName = firstName;
      lastName = lastName;
      age = age;
      smokingStatus = smokingStatus;
      height = height;
      weight = weight;
   }
   
   /**
   Sets the policy number
   @param policyNum the policy number
   */
   public void setPolicyNum(int policyNum) // setter/mutator method
   {
      policyNum = policyNum;
   }
   
   /**
   Returns the policy number
   */
   public int getPolicyNum() // getter/accessor method
   {
      return policyNum;
   }
   
   /**
   Sets the provider's name
   @param providerName
   */
   public void setProviderName(String providerName)
   {
      providerName = providerName;
   }
   
   /**
   Returns the provider's name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   Sets the Policyholder’s First Name
   @param firstName 
   */
   public void setFirstName(String firstName)
   {
      firstName = firstName;
   }
   
   /**
   Returns the Policyholder’s First Name
   */
   public String getFirstName()
   {
      return firstName;
   }

   /**
   Sets the Policyholder’s Last Name
   @param lastName 
   */
   public void setLastName(String lastName)
   {
      lastName = lastName;
   }
   
   /**
   Returns the Policyholder’s Last Name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Sets the Policyholder’s Age
   @param age 
   */
   public void setAge(int age)
   {
      age = age;
   }
   
   /**
   Returns the Policyholder’s Age
   */
   public int getAge()
   {
      return age;
   }

   /**
   Sets the Policyholder’s Smoking Status
   @param smokingStatus 
   */
   public void setSmokingStatus(String smokingStatus)
   {
      smokingStatus = smokingStatus;
   }
   
   /**
   Returns the Policyholder’s Smoking Status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   Sets the Policyholder’s Height (in inches)
   @param height 
   */
   public void setHeight(double height)
   {
      height = height;
   }
   
   /**
   Returns the Policyholder’s Height (in inches)
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   Sets the Policyholder’s Weight (in pounds)
   @param weight 
   */
   public void setWeight(double weight)
   {
      weight = weight;
   }
   
   /**
   Returns the Policyholder’s Weight (in pounds)
   */
   public double getWeight()
   {
      return weight;
   }
   
   //method that calculates and returns the BMI of the policyholder
   public double calculateBMI()
   {
      return (weight * 703) / Math.pow(height, 2);
   }
   
   //method that calculates and returns the price of the insurance policy
   public double calculateInsurancePrice()
   {
      double baseFee = 600; //The Insurance Policy has a base fee of $600
      double additionalFee = 0;

      //If the Policyholder is over 50 years old, there is an additional fee of $75
      if (age > 50) 
      {
         additionalFee += 75;
      }

      //If the Policyholder is a smoker, there is an additional fee of $100
      if (smokingStatus.equalsIgnoreCase("smoker")) 
      {
         additionalFee += 100;
      }

      //If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows: Additional Fee = ( BMI – 35 ) * 20
      double bmi = calculateBMI();
      if (bmi > 35) 
      {
         additionalFee += (bmi - 35) * 20;
      }

      return baseFee + additionalFee;
   }
}