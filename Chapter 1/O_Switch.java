import static java.lang.System.out;
import java.util.Scanner;

class O_Switch
{
    public static void main (String args [])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select a verse");
        
        int input = keyboard.nextInt();
        
        switch(input)
        {
            case 1: 
            System.out.println("this is verse one mate");
            break;
            case 2: 
            System.out.println("case 2 bro");
            break;
            case 3:
            System.out.println("this is case 3");
            break;
            default:
            System.out.println("naa fam that doesnt exist");
            break;
        }
        System.out.println("that is the verse ohhhh");
    }
}
