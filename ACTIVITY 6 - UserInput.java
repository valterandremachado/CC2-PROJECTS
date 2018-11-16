package user;


import java.util.*;


public class UserInput  {

    public static void main(String[] args) {
        
        Scanner zac = new Scanner(System.in);
        System.out.println("Enter Row Size: ");
        int r = zac.nextInt();
        System.out.println("Enter Column Size: ");
        int c = zac.nextInt();
        System.out.println("Enter Elements: ");

        String[][] names =  new String[r][c];
        
            for (int x = 0; x < r; x++){
                
                for (int y = 0; y < c; y++){
                    System.out.print("Row: " + x + " Column: "+ y + " : ");
                    String A = zac.next();
                    names[x][y] = A;
                }
            }
            System.out.println(" Two Dimensional Array: ");
 
                for(int z = 0; z < r; z++){
                    
                    for(int v = 0; v < names[z].length; v++){
                        
                        System.out.print(names[z][v] + "\t");
                    }  
                    System.out.println("");
                }
                    
    }
}
