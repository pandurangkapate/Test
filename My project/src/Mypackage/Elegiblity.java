package Mypackage;
/*7. Write a program to enter the age of a person and check whether the person is eligible for voting or not ?[optional]


*/
 
import java .util.Scanner;
 class Elegiblity {
   
    public static void main (String[] args)
    {
      Scanner scan  = new Scanner (System.in);
      System.out.println ("enter the number ");
      int age = scan.nextInt();
     
     if(age > 18)
    
     System.out.println ("candidate eligible for voting ");
     
     else 
     
     
     System.out.println ("Candidate not eligible for voting" );


    }


}


