import static java.lang.System.out;
import java.util.Scanner;

class OA
{
    public static void main (String args [])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Select a verse");
        
        String input = keyboard.next();
        
        switch(input)
        {
            case "one": 
            System.out.println("this is verse one mate");
            break;
            
            case "two": 
            System.out.println("case 2 bro");
            break;
            
            case "three":
            System.out.println("this is case 3");
            break;
            
            default:
            System.out.println("naa fam that doesnt exist");
            break;
        }
        System.out.println("that is the verse ohhhh");
    }
}
