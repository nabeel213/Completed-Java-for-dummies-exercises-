public class doong{
    public static void main (String [] args){
        
        int x = myMethod();
        System.out.println(x);
       
    }
    public static int myMethod()
    {
        int a = 1;
        int papoi = 33;
        if(a==1){
            papoi = papoi + 1;
            
        }
        else{
            
           return papoi; 
        }
        return papoi;
    }
}