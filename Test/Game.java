import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Game{
    public static void main (String [] args){
        
        firstEncounter();
        randomNumMethod();
        System.exit(0);
        
    }
    public static void firstEncounter(){
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("who goes there");
        int input = keyboard.nextInt();
      
        switch (input){
            case 1: 
            System.out.println("Me");
            break;
            case 2: 
            System.out.println("You");
            break;
        }
    }
    public static void randomNumMethod(){ 
        
        Random rand = new Random();
        int r = rand.nextInt(10)+1;
        xxx(r);
  
    }
    public static void xxx(int r){
     
        System.out.println(r);
        
         
    }
}