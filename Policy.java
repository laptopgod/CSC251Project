public class Policy //Policy class that will model an insurance policy for one person
{
   //instance fields
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
      smokingStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }
   public Policy(int pNum, String provName, String fName, String lName, int pAge, String smokeStatus, double pHeight, double pWeight) //constructor that accepts arguments
   {
      policyNum = pNum;
      providerName = provName;
      firstName = fName;
      lastName = lName;
      age = pAge;
      smokingStatus = smokeStatus;
      height = pHeight;
      weight = pWeight;
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
   
   /**
   Sets the Policyholder’s First Name
   @param fn the Policyholder’s First Name
   */
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   
   /**
   Returns the Policyholder’s First Name
   @return The Policyholder’s First Name
   */
   public String getFirstName()
   {
      return firstName;
   }

   /**
   Sets the Policyholder’s Last Name
   @param ln the Policyholder’s Last Name
   */
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   
   /**
   Returns the Policyholder’s Last Name
   @return The Policyholder’s Last Name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Sets the Policyholder’s Age
   @param a the Policyholder’s Age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   Returns the Policyholder’s Age
   @return The Policyholder’s Age
   */
   public int getAge()
   {
      return age;
   }

   /**
   Sets the Policyholder’s Smoking Status
   @param s the Policyholder’s Smoking Status
   */
   public void setSmokingStatus(String s)
   {
      smokingStatus = s;
   }
   
   /**
   Returns the Policyholder’s Smoking Status
   @return The Policyholder’s Smoking Status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   Sets the Policyholder’s Height (in inches)
   @param h the Policyholder’s Height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   Returns the Policyholder’s Height (in inches)
   @return The Policyholder’s Height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   Sets the Policyholder’s Weight (in pounds)
   @param w the Policyholder’s Weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
   Returns the Policyholder’s Weight (in pounds)
   @return The Policyholder’s Weight
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
