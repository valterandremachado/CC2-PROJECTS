

package fibonaccii;

import java.util.*;

public class Fibonaccii {
   static int fibonacci (int f){
       
       if  (f == 0 || f == 1)
           return f;
       
       else
           return fibonacci(f - 1) + fibonacci(f - 2);
   }
   
    public static void main(String[] args) {
        
        System.out.print("ENTER NUMBER THE NUMBER UPTO WHICH FIBONACCI SERIES TO PRINT: ");
            
            int n = new Scanner(System.in).nextInt();
            
            System.out.print("\n" + "\n" + "THE FIBONACCI SERIES UPTO " + n + " NUMBER IS: " + "\n"+ "\n"+ "\n");
            
            for (int i = 0; i <= n; i++) {
                System.out.print("f("+i+")" + "\t");
            }
            
            System.out.println("");
            
            for (int x = 1; x <= n; x++){
                for (int i = 0; i <= x; i++) {
                    System.out.print(fibonacci(i) + "\t");
                }
                System.out.println("");
            }
            


    }
    
}
