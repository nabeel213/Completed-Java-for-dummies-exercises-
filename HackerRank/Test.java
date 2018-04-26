public class Test{
    public static void main(String [] args){
     
        myMethod();
        //System.exit(0);
    }
    public static void myMethod(){
        
        for(int i=0; i<5; i++){
            
            for(int j=0; j<5-i; j++){
                
                
                System.out.print("* ");
                
                
            }
            System.out.println();
            for (int k=5; k>=5-i; k--){
                
                System.out.print(" ");
            }
            //System.out.println();
            
            
        }
        
    }
}