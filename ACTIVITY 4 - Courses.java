
package nestedif.pkgif;


import java.util.Scanner;

public class Courses {

    public static void main(String[] args) {
       
        String[] DpmntArray = {"CITCS", "COA", "CEA", "CAS", "CBA", "CTE"};
        
        String[] CITCS_Array = {"BSCS", "BSIT"};
        String[] COA_Array = {"BSA", "BSAT", "BSMA", "BSFA"};
        String[] CEA_Array = {"BSA", "BSCE", "BSCE", "BSEE", "BSESE"};
        String[] CAS_Array = {"BAE", "BAPS", "BAC", "BSP"};
        String[] CBA_Array = {"BSBA", "BSE", "BSOA"};
        String[] CTE_Array = {"BSEE-G", "BSEE", "BSSE"};
       
        System.out.println("WHAT COLLEGE DEPARTMENT ARE YOU IN? ");
        Scanner sc = new Scanner(System.in);
        String C = sc.nextLine();
        
        
        if (C.equals(DpmntArray[0]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[0] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN COMPUTER SCIENCE!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[0] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN INFORMATION TECHNOLOGY!");
                }
        }
        
        else if (C.equals(DpmntArray[1]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[1] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ACCOUNTANCY!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[1] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ACCOUNTING TECHNOLOGY!");
                }
                if (B.equals(CITCS_Array[2]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[1] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN MANAGEMENT ACCOUNTING!");
                }
                if (B.equals(CITCS_Array[3]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[1] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN FORENSIC ACCOUNTING!");
                }
        }
        
        else if (C.equals(DpmntArray[2]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[2] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ARCHITECTURE!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[2] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN CIVIL ENGINEERING!");
                }
                if (B.equals(CITCS_Array[2]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[2] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN COMPUTER ENGINEERING!");
                }
                if (B.equals(CITCS_Array[3]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[2] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ELECTRONICS ENGINEERING!");
                }
                 if (B.equals(CITCS_Array[4]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[2] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ENVIRONMENTAL & SANITARY ENGINEERING!");
                }
        }
        
         else if (C.equals(DpmntArray[3]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[3] + " AND YOUR COURSE IS BACHELOR OF ARTS IN ENGLISH!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[3] + " AND YOUR COURSE IS BACHELOR OF ARTS IN POLITICAL SCIENCE!");
                }
                if (B.equals(CITCS_Array[2]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[3] + " AND YOUR COURSE IS BACHELOR OF ARTS IN COMMUNICATION!");
                }
                if (B.equals(CITCS_Array[3]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[3] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN PSYCHOLOGY!");
                }
        }
        
        else if (C.equals(DpmntArray[4]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[4] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN BUSINESS ADMINISTRATION!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[4] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ENTREPRENEURSHIP!");
                }
                if (B.equals(CITCS_Array[2]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[4] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN OFFICE ADMINISTRATION!");
                }
        }
        
         else if (C.equals(DpmntArray[5]))
        {
            System.out.println("WHAT TYPE OF PROGRAM ARE YOU TAKING UP? ");
            String B = sc.nextLine();
                if (B.equals(CITCS_Array[0]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[5] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ELEMENTARY EDUCATION-GENERAL!");
                }
                if (B.equals(CITCS_Array[1]))
                {
                   System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[5] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN ELEMENTARY EDUCATION!");
                }
                if (B.equals(CITCS_Array[2]))
                {
                    System.out.println("THE PROGRAM THAT YOU ARE TAKING UP IS UNDER " +DpmntArray[5] + " AND YOUR COURSE IS BACHELOR OF SCIENCE IN SECONDARY EDUCATION!");
                }
        }
        
         else
         {
             System.out.println("YOU HAVE ENTERED THE WRONG PROGRAM!");              
         }

    }
    
}
