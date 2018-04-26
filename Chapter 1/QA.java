import java.util.Random;
import javax.swing.JOptionPane;
public class QA 
{
    public static void Main ()
    {
        String question1 = JOptionPane.showInputDialog("Road splint into 2, do you go left or right?");
        int choice1 = Integer.parseInt(question1);
        
        if ( choice1 == 1)
        {
            Random rand = new Random();
            int  n = rand.nextInt(2) + 1;
            //50 is the maximum and the 1 is our minimum 
          
           if ( n == 1)
           {
                String question2 = JOptionPane.showInputDialog("A huge bear is staring at you");
           }
           else if ( n == 2)
           {
                String question3 = JOptionPane.showInputDialog("A snake Bites you");
                
           }
        }
        else
        {
            Random rand = new Random();
            int  n = rand.nextInt(2) + 1;
            
            if ( n == 1)
           {
                String question4 = JOptionPane.showInputDialog("Rainbows");
           }
           else
           {
                String question5 = JOptionPane.showInputDialog("Unicorns");
                
           }
            
        }
    }
}