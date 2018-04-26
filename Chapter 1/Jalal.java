import javax.swing.*;


public class Jalal
{
    public static void main (String args [])
    {
        String input = JOptionPane.showInputDialog(null, "enter a number");
        //System.out.println(n);
        int n = Integer.parseInt(input);
       // 3 2 8 1
        for(int i=0; i<=5; i ++)
        {
            if(n%2==0)
            {
                n = n/2;
                System.out.println(n);
            }
            else
            {
                n = (3*n)+1;
                System.out.println(n);
            }
        }
        
    }
}