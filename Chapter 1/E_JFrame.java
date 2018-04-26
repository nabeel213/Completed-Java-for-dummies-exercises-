import javax.swing.JFrame;

class E_JFrame
{
    public static void main (String args []) 
    {
        JFrame frame1 = new JFrame();
        String myTitle = "Some mad title";
        
        frame1.setTitle(myTitle);
        frame1.setSize(500, 500);
        frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        
    }
}