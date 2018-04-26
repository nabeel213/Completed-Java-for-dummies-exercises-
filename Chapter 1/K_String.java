import java.util.Scanner;

class K_String
{
    public static void main (String args [])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("password?");
        
        String input = keyboard.next();
        if( input.equals("Hi"))
        {
            System.out.println("good");
        }
        else
        {
            System.out.println("NO");
        }
    }
}