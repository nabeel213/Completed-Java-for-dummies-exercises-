import java.util.Random;
import java.util.Scanner;

class P_While
{
    public static void main (String args []){
        
        
        System.out.println("hi");
        
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        
        System.out.println(num);
        
    
    }
}

   /* {
        Scanner keyboard = new Scanner(System.in);
        int randomNum = new Random().nextInt(3)+1;
        
        int numGuesses = 0;
        
        System.out.println("Welcom to game");
        System.out.println("enter a number");
        int keyInput = keyboard.nextInt();
        
        numGuesses ++;
        
        while(keyInput != randomNum)
        {
            System.out.println("Try again");
            keyInput = keyboard.nextInt();
            numGuesses ++;
        }
        System.out.println("you win bro");
        System.out.println(numGuesses + " guesses");
    }
}
*/