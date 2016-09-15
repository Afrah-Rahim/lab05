
/**
 * Write a description of class PersonCreator here.
 * This class is used to get the user's name, age, sex, height, weight, Social Security Number, 
 * Address, Phone Number, DOB
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
     
    
 /**
 * This method is used to find the age of the user
 * Since this is void, there is no ouput
 * This method tells the age of user in years
 */ 
public void getAge (int years) 
    { 
    age = years;
    } 
    
 /**
 * This method is used to find the sex of the user
 * Since this is void, there is no ouput
 */
    
    public void UserSex (String personSex)
    {
        sex = personSex;
    }
    
/**
* This method is used to find the height of the user
* Since this is void, there is no ouput
* This method gets the height of the user in centimeters
*/
public void getHeight (int cm)
    {
        height = cm;
    }
    
 /**
 * This method is used to find the weight of the user
 * Since this is void, there is no ouput
 *This method gets the weight of the user in pounds
 */
public void getWeight (int lbs)
    {
        weight = lbs;
    }
     
 /**
 * This method is used to get the social security number of the user
 */
public void getSocialSecurityNumber (int block1, int block2, int block3)
    {
        
         if (block1 < 100 || block1 > 999)
         {
             System.err.println (" That is invalid. ");
             
            } else if (block2 < 100 || block2 >999) 
            { 
                System.err.println (" That is invalid. ");
                
            } else if (block3 < 1000 || block3 >9999) 
            { 
                System.err.println (" That is invalid. ");
                
            }
            else {
                 socialsecuritynumber = block1 + " - " + block2 + " - " + block3;
                }
            
    }
    
     /**
 * This method is used to find the address of the user
 * Since this is void, there is no ouput
 */
public void getAddress (String local)
    {
       address = local;
    }
    
     /**
 * This method is used to find the date of birth of the user
 * Since this is void, there is no ouput
 */
public void getDateOfBirth (String DOB)
    { 
        dateofbirth = DOB;

    }
    
      /**
 * This method is used to find the user's phone number
 */
public void GetPhoneNumer ( int areaCode, int numBegin, int numEnd)
     {
         if (areaCode < 100 || areaCode > 999)
         {
             System.err.println (" That is invalid. ");
             
            } else if (numBegin < 100 || numBegin >999) 
            { 
                System.err.println (" That is invalid. ");
                
            } else if (numEnd < 1000 || numEnd >9999) 
            { 
                System.err.println (" That is invalid. ");
                
            }
            else {
                 phonenumber= areaCode + " - " + numBegin + " - " + numEnd;
                }
            
           
        }
        
      /**
 * This method is used to print all the user's given information
 * Since this is void, there is no ouput
 */    public void printForm()
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

        
    }
    } 
    