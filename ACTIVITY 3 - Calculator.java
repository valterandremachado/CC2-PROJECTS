
package calculator;


import java.util.Scanner;


public class Calculator {

  
    public static void main(String[] args) {
        
       int a,b,c;
       Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
       
       a = scanner.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
       
       b = scanner.nextInt();
        System.out.println("CHOOSE AN OPERATION(+, -, *, /, %): ");
        
       char operator = scanner.next().charAt(0);
       
       
       scanner.close();
       
       int output;
       
       
       switch(operator)
       {
           case '+':
               output = a + b;
               break;
           
           case '-':
               output = a - b;
               break;
               
           case '*':
               output = a * b;
               break;
               
           case '/':
               output = a / b;
               break;
           
           case '%':
               output = a % b;
               break;
               
               
           default:
               System.out.println("YOU HAVE ENTERED A WRONG OPERATION!PLEASE TRY AGAIN! ");
               return;
          
    
    
       }
       
    System.out.println(a+" "+operator+" "+b+": " +output);
      
    }
    
}
