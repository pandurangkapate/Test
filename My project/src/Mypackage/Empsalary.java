package Mypackage;

/* double HRA = .4* basic ;
e bASIC= 0.12basic;
   int MA=1200;
   int TA =800;
   int PT =300;
   double salary = basic + HRA- pf+ ma + ta -pt;
   System.out.println(" salary "+ salary);
*/
  import java.util.Scanner;
  class Empsalary
  {
    public static void main ( String args[] )
   {
     Scanner scan = new Scanner (System.in);
     System.out.println (" enter the basic salary: ");
     double basic = scan. nextDouble();
     
     double HRA = 0.4* basic ;
     double PF= 0.12*basic;
   
     System.out.println (" enter the MA");
     double MA = scan.nextDouble ();

     System.out.println (" enter the TA");
     double TA = scan.nextDouble ();
 
     System.out.println (" enter the PT");
     double PT = scan.nextDouble ();
   
     double salary = basic + HRA- PF +MA+ TA -PT;
     System.out.println(" salary "+ salary);

     
     
       
   }
   
  }

