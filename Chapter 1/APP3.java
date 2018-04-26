import java.util.List;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class APP3
{   public static void main(String [] args)
    {
       myMethod();
       //System.exit(0);
    }
    public static void myMethod()
    {
        String ask = JOptionPane.showInputDialog(null, "yes or no");
        
        String hM = JOptionPane.showInputDialog(null, "How many");
        int howMany = Integer.parseInt(hM);
  
        int j = 0;
        if(ask.toLowerCase().equals("yes"))  {
            
            List<String> list2 = new ArrayList<String>();
        
            do{
                for(int i = 0; i<=howMany;)
                {
                    String film = JOptionPane.showInputDialog(null, "name?");
                    List<String> list = new ArrayList<String>();
                    list.add(film);
                    
                    i++;
                    j++;
                    list = list2;
                }
                //System.out.println(list);
                String a = "df";
                JFrame aFrame = new JFrame("Films");      
                aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                aFrame.add(new TextField(list2));
                aFrame.setSize(400, 400);
                aFrame.setVisible(true);
                    
            }
            while(j<howMany);
        }
                     
        else if(ask.toLowerCase().equals("no"))
        {
            System.exit(0);
           
        }
    } 
}

