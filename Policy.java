public class Policy //Policy class that will model an insurance policy for one person
{
   //instance fields
   private int policyNum;
   private String providerName;
   
   //adding a PolicyHolder field   
   private PolicyHolder policyHolder;
   
   public Policy() //no-arg constructor (set default values for all fields)
   {
      policyNum = 0;
      providerName = "";
   }
   public Policy(int pNum, String provName, PolicyHolder holder) //constructor that accepts arguments
   {
      policyNum = pNum;
      providerName = provName;
      policyHolder = holder;
      policyCount++;
   }
   
   /**
   Sets the policy number
   @param p the policy number
   */
   public void setPolicyNum(int p) // setter/mutator method
   {
      policyNum = p;
   }
   
   /**
   Returns the policy number
   @return The policy number
   */
   public int getPolicyNum() // getter/accessor method
   {
      return policyNum;
   }
   
   /**
   Sets the provider's name
   @param pn the provider's name
   */
   public void setProviderName(String pn)
   {
      providerName = pn;
   }
   
   /**
   Returns the provider's name
   @return The provider's name
   */
   public String getProviderName()
   {
      return providerName;
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
   
   public String toString() 
   {
      return "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName + "\n" + 
             policyHolder.toString() +
             String.format("Policy Price: $%.2f\n", getPrice());
   }
   
}
