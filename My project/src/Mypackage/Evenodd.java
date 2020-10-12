package Mypackage;
/*6. Write a program to check whether a given number is EVEN or ODD ?


*/
 

import java.util.Scanner;
class Evenodd{
   public static void main (String args[])
   { 
     Scanner number  = new Scanner (System.in);
     System.out.println(" enter the number");
     int num= number.nextInt();
     
     if(num%2==0)
      
      System.out.println (num+ "is even");
     
     else

      System.out.println (num+"is odd");



}
}

     
       
  
   
 
