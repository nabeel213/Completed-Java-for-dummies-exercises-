import java.util.Scanner;
import java.util.Random;

class P_Test
{
    public static void main (String args[])
    {
       myMethod();
       System.exit(0);
    }
    public static void myMethod()
    {
         Scanner keyboard = new Scanner(System.in);
        System.out.println ("choose a number");
        
        int input = keyboard.nextInt();
        int random = new Random().nextInt(10)+1;
        
        if(input == random)
        {
            System.out.println("you won bitch");
        }
        else
        {
            System.out.println("you lose");
            myMethod();
            
        }
    }
}