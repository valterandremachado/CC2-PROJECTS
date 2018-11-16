
package age;


import java.util.Scanner;


public class Age {

    public static void main(String[] args) {
        
        int x;
          
            Scanner in = new Scanner(System.in);
            
            System.out.println("How Old Are You? ");
        
        int age;
        
        age = in.nextInt();
        
        if (age <= 2){
            System.out.println("You Are A Baby!"); 
        }
        else if (age > 2 && age < 6 ){
            System.out.println("You Are A Toddler!");
        }
        else if (age > 5 && age < 13){
            System.out.println("You Are A Kid!");
        }
        else if (age > 12 && age < 20){
            System.out.println("You Are A Teenager!");
        }
        else if (age > 19 && age < 34){
            System.out.println("You Are A Young Adult!");
        }
        else if (age >33 && age < 45){
            System.out.println("you Are A Middle Ager!");
        }
        else if (age > 44 && age < 110){
            System.out.println("You Are A Senior!");
        }
        else {
            System.out.println("ERROR");
        }
    }
    
}
