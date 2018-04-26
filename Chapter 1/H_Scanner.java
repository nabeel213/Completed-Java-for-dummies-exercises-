import java.util.Scanner;
import java.util.Random;

class H_Scanner
{
    public static void main (String args[])
    {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Put number between 1 and 10" );
        
        int input = key.nextInt();
        int random = new Random() .nextInt(1)+1;
        
        System.out.println(random);
        /*
        if(input == random)
        {
            System.out.println("Win");
        }
        else
        {
            System.out.println("Lose");
        }
        */
    }
}