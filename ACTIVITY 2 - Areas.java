package areas_eligio;

import java.util.Scanner;
public class Areas_Eligio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE RADIUS OF THE CIRCLE: ");
        
        double radius = sc.nextDouble();
        double AreaCircle = Math.PI * (radius * radius);
        System.out.println("THE AREA OF THE CIRCLE IS: " + AreaCircle);
        double circumference= Math.PI * 2*radius;
        System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS: " + circumference + "\n\n\n");
        
        
        double size, AreaSquare;
        System.out.print("ENTER THE ARE OF THE SQUARE: ");
        size = sc.nextDouble();
        AreaSquare = Math.pow(size, 2);
        System.out.println("THE AREA OF THE SQUARE IS: " + AreaSquare + "\n\n\n");
        
        double height, base, AreaTriangle;
        System.out.print("ENTER HEIGHT OF THE TRIANGLE: ");
        height = sc.nextInt();
        System.out.print("ENTER THE BASE OF THE TRIANGLE: ");
        base = sc.nextInt();
        AreaTriangle = ((height * base) / 2);
        System.out.println("THE AREA OF THE TRIANGLE IS: " + AreaTriangle);
        
    }
    
}
