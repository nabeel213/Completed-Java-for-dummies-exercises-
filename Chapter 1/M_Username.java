import javax.swing.JOptionPane;

class M_Username
{
    public static void main (String args [])
    {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        
        if(username != null && password != null && 
        (username.equals("bburd") && password.equals("swordfish")) || (username.equals("hritter") &&
        (password.equals("preakston")) ))
        {
            JOptionPane.showMessageDialog(null, "You're in.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bruv you are suspicious.");
        }
    }
}
