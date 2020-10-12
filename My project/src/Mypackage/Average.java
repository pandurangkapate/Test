package Mypackage;
/*
Write a java program to take three numbers from user and print the average ?
  -- float, double
  > java Average 
*/







import java.util.Scanner;
class Average {
  public static void main (String args[]){
  Scanner scan = new Scanner (System.in);
  System.out.println ("enter the three number");
  double num1 =scan.nextDouble();
  double num2 =scan.nextDouble();
  double num3 =scan.nextDouble();
   
  double avg = (num1+num2+num3)/3;
  
  System.out.println(avg);
  
}


}



