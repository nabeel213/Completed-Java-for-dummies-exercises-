import javax.swing.*;
public class APP
{   public static void main(String [] args)
    {
       myMethod();
       //System.exit(0);
    }
    public static void myMethod()
    {
       String anotherFilm = JOptionPane.showInputDialog (null, "would you like to put a film?");
       while(anotherFilm.toLowerCase().equals("yes"))
       {
                      
           String [] A = new String [10];
           int size = A.length;
          // String [] B = new String [size];
           
           String movieName = JOptionPane.showInputDialog (null, "please enter a film");
          // anotherFilm = JOptionPane.showInputDialog (null, "would you like to put a film?");

          if(anotherFilm.toLowerCase().equals("yes"))
          {
              for(int i=0; i<= size; i++)
              {
                   A [i]=movieName;
                  
                   break;
              }
          } 
       }
       if(anotherFilm.toLowerCase().equals("no"))
       {
           System.exit(0);
           
       }
    } 
}
