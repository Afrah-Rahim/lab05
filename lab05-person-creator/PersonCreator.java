
/*
 * Description: This class is used to get the user's name, age, sex, height,
  weight, Social Security Number, Address, Phone Number, DOB. 
 * @author (Afrah Rahim) 
 * @version (9/13/2016)
 */
public class PersonCreator
{
   private String Name;
   private int age;
   private String sex;
   private int height;
   private int weight;
   private String socialsecuritynumber;
   private String address;
   private String phonenumber;
   private String dateofbirth;
   
   /* Description: This methos is used to assign values for all the field variables
    * Example; age = 0
    */
   public PersonCreator (String First, String Last)
   { Name = First + "  " + Last;
       age = 0;
       sex = " ";
       height = 0;
       weight = 0;
       socialsecuritynumber = " ";
       address = " ";
       dateofbirth = " ";
    }
     
    
 /*
  * Description: This method is used to find the age of the user
  * Output: void
  * Purpose: This method tells the age of user in years
  * Example: age = 5
  */ 
public void getAge (int years) 
    { 
    age = years;
    } 
    
 /*
  * Description: This method is used to find the sex of the user
  * Output: void
  * Purpose: Whether the user is female/male
  * Example: sex = male
  */
    
    public void UserSex (String personSex)
    {
        sex = personSex;
    }
    
/*
 * Description: This method is used to find the height of the user
 * Output: void
 * Purpose: This method gets the height of the user in centimeters
 * Example: 176
 */
public void getHeight (int cm)
    {
        height = cm;
    }
    
/*
 * Description: This method is used to find the weight of the user
 * Output:  void
 * Purpose: This method gets the weight of the user in pounds
 * Example; weight = 100
 */
public void getWeight (int lbs)
    {
        weight = lbs;
    }
     
/*
 * Description:This method is used to get the social security number of the user
 * Output: void
 * Purpose: To get user's social security number 
 * Example: SSN: 000-100-1000
 */
public void getSocialSecurityNumber (int block1, int block2, int block3)
    {
        
         if (block1 < 100 || block1 > 999)
         {
             System.err.println (" That is invalid. ");
             
            } 
            else if (block2 < 100 || block2 >999)
            { 
                System.err.println (" That is invalid. ");
                
            } 
            else if (block3 < 1000 || block3 >9999) 
            { 
                System.err.println (" That is invalid. ");
                
            }
            else
            {
                 socialsecuritynumber = block1 + " - " + block2 + " - " + block3;
                }
            
    }
    
/*
 * Desription: This method is used to find the address of the user
 * Output: void
 * Purpose: This method is used to get the street address of the user
 * Example: 256th St., Queens
 */
public void getAddress (String local)
    {
       address = local;
    } 
    
 /*
 * Description: This method is used to find the date of birth of the user
 * Output: void
 * Purpose: Methos is used to get the user's date of birth 
 * Example: 24th of April
 */
public void getDateOfBirth (String DOB)
    { 
        dateofbirth = DOB;

    }
    
/*
 * Description :This method is used to find the user's phone number
 * Output: void
 * Purpose: To get user's phone number; split in three blocks
 * Example: PhoneNumber: 123-234-3456
 */
public void GetPhoneNumer ( int areaCode, int numBegin, int numEnd)
     {
         if (areaCode < 100 || areaCode > 999)
         {
             System.err.println (" That is invalid. ");
             
            }
            else if (numBegin < 100 || numBegin >999) 
            { 
                System.err.println (" That is invalid. ");
                
            } 
            else if (numEnd < 1000 || numEnd >9999) 
            { 
                System.err.println (" That is invalid. ");
                
            }
            else 
            {
                 phonenumber= areaCode + " - " + numBegin + " - " + numEnd;
                }
            
           
        }
        
/*
 * Description: This method is used to print all the user's given information
 * Output: void
 * Purpose: The purpose of this method is to print the user's info 
 * Example: User Name: Jack
            User Age: 25
 */   
    public void printForm()
    {
       
        System.out.println("User Name: " + Name);
        System.out.println ("     ");
        System.out.println("User Age:" + age);
        System.out.println ("     ");
        System.out.println("User Sex:" + sex);
        System.out.println ("     ");
        System.out.println("User Height:" + height);
        System.out.println ("     ");
        System.out.println("User Weight:" + weight);
        System.out.println ("     ");
        System.out.println("Address:" + address);
        System.out.println ("     ");
        System.out.println (" Date of Birth:" + dateofbirth);
        System.out.println ("     ");
        System.out.println("Phone Number:" + phonenumber);
        System.out.println ("     ");
        System.out.println("Social Security Number:" + socialsecuritynumber);
        System.out.println ("-----------------------------");

        
    }
    } 
    