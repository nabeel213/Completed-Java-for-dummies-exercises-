import javax.swing.JOptionPane;

class N_Parse
{
   public static void main (String args [])
   {
       int numberOfPeople = Integer.parseInt(JOptionPane.showInputDialog("insert a number"));
       System.out.println(numberOfPeople);
       
       double numberOfDogs = Double.parseDouble(JOptionPane.showInputDialog("Give me number of dogs"));
       System.out.println(numberOfDogs);
      
       
   }
}
