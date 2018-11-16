
package Odd ;

public class Odd {

 
    
    public static void main(String[] args) {
       
        
        
        int [] zac = {3,9,15,23,65,20,18,4,2,14,21,32};
   
        int [] even = new int [zac.length];
        int [] odd = new int [zac.length];
        
        
        int e = 0;
        int o = 0;
        
        
        
        
        for (int x = 0; x < zac.length; x++)
        {
            if (zac[x] % 2 == 0)
            {
               even[e] = zac[x]; e++;
            }
            else if (zac[x] % 2 != 0);
            {
                odd[o] = zac[x]; o++;
            }
        }
        
        System.out.println("EVEN    ODD");
        for (int x = 0; x < e; x++) 
        {
            System.out.println(even[x] + "\t" + odd[x]);
        

                
   
    }
    }
}

