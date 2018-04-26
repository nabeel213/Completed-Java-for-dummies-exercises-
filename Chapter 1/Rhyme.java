import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class Rhyme
{
    public static void main(String [] args)
    {
        String a = "df";
        JFrame aFrame = new JFrame("Films");      
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        aFrame.add(new TextField(a));
        aFrame.setSize(400, 400);
        aFrame.setVisible(true);

    }
}
