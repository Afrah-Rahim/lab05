
/**
 * Write a description of class PersonCreator here.
 * 
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
      System.out.println (" Enter your first and last name:" + Name);
       age = 0;
       sex = " ";
       height = 0;
       weight = 0;
       socialsecuritynumber = " ";
       address = " ";
       dateofbirth = " ";
    }
    
    public void getAge (int years) 
    { 
    age = years;
    }
    
    public void UserSex (String personSex)
    {
        sex = personSex;
    }
    
    public void getHeight (int cm)
    {
        height = cm;
    }
    
    public void getWeight (int lbs)
    {
        weight = lbs;
    }
     
    public void getSocialSecurityNumber (String number)
    {
        socialsecuritynumber = number;
    }
    
    public void getAddress (String local)
    {
       address = local;
    }
    
    public void getDateOfBirth (String DOB)
    { 
        dateofbirth = DOB;
    }
 
     public void GetPhoneNumer ( String block1, String block2,String block3)
     {
         PhoneNumber = block1 + " " + block2 + " " + block3;
         if ( 100 <= block1 <= 999)
           {
               System.out.println ( "block1 is accepted");
            } else
            {
                System.out.println (" block1 is not accepted");
            }

{ if ( 100 <= block2 <= 999)
     System.out.println ( "block2 is accepted");
    } else
    {System.out.println (" block2 is not accepted");  
    }
}

{ if ( 1000 <= block3 <= 9999)
     System.out.println ( "block3 is accepted");
    } else
    {System.out.println (" block3 is not accepted");  
    }
}

}
  
 

    
   
