public class B_Loop
{
    public static void main(String args[])
    {
       int a = 1;
       for(int i=1; i<=5; i++)
       {
           int j = 3;
           
           j = j*a;
           
           a++;
         
           System.out.println(j);
           
       }
    }
}