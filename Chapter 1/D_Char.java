class D_Char
{
    public static void main (String args [])
    {
        for(char alphabet = 'A'; alphabet<='F'; alphabet++)
        {
            
            char a = 'n';
            char b = 'A';
            char c = 'b';
            char d = 'e';
            char e = 'E';
            char f = 'l';
            char big = Character.toLowerCase(alphabet);
            System.out.println((char)big);
          
            //System.out.println (a+""+b+""+c+""+d+""+e+""+f); // Correct form of doing it
            //System.out.println(); // Correct form of doing it
        }  
    }
}