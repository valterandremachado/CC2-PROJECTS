
package practice;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
     
        {
       Scanner paul = new Scanner(System.in);
       System.out.println("ENTER THE NUMBER TO BE GUESSED: ");
       
     int y = paul.nextInt();
   
        System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
            System.out.println("GUESS THE NUMBER: "); 
            
     int x = paul.nextInt();
      int z = 0;
    
    
while (x != y) {
    System.out.println("OOPS! TRY AGAIN!");
    
    if (x < y) {
        System.out.println("THE NUMBER TO BE GUESSED IS HIGHER!");
    }
    
    else {
        System.out.println("THE NUMBER TO BE GUESSED IS LOWER!");
    }
    
    if (y % 2 == 0) {
        System.out.println("THE NUMBER IS EVEN!");
    }
    
    else {
        System.out.println("THE NUMBER IS ODD!");
    }
    
   
    z++;
    
    System.out.println("NUMBER OF TRIES: "+z);
    
    x = paul.nextInt();
    
        }

    System.out.println("YOU GOT IT RIGHT AFTER " +z+ " TRIES!");
    
 
    }
}
}

   





    

