import java.util.Scanner;
public class I_Scanner2
{
  public static void main(String args[])
  {
      myMethod();
      System.exit(0);
   }
  public static void myMethod()
  {
      System.out.println("Please put the right password");
      
      Scanner keyboard = new Scanner(System.in);
      String input = keyboard.next();
      
      if( input.equals("hi") )
      {
          System.out.println("She said, Come on phush ting");
        }
        else 
        {
            System.out.println("ALERT!! you are not authorised fag");
            
            myMethod();
            
        }
   }
}
