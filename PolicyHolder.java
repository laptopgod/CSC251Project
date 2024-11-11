public class PolicyHolder
{  //instance fields specific to the policyholder
   private String firstName, lastName;
   private int age;
   private String smokingStatus;
   private double height; // in inches
   private double weight; // in pounds


   // No-arg constructor
   public PolicyHolder() 
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }

   public Policy(String fName, String lName, int pAge, String smokeStatus, double pHeight, double pWeight) //constructor that accepts arguments
   {
      firstName = fName;
      lastName = lName;
      age = pAge;
      smokingStatus = smokeStatus;
      height = pHeight;
      weight = pWeight;
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
   
   // Method to calculate BMI
   public double getBMI() 
   {
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (height * height);
   }
}