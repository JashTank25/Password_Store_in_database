import java.util.Scanner;

public class PasswordStoreDatabase 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
        
        System.out.println("Enter the password");

        String s1=jt.nextLine();                    //Enter password from the user

        String s2="";

        short j=1234;

        for(int i=0;i<s1.length();i++)              //add some salting in string s1
        {
            
            if(i%3==0)
            {
                s2+=j;
            }
            else
            {
                s2+=s1.charAt(i);
            }
            j+=4567;
        }

        long a=s2.hashCode();                        //string convert into hashcode

        //System.out.println(s2);

        System.out.println(a);                      //how to our password stored in database from big company's
    }    
}
