

/*Q1. Write a java program to find volume and surface area of a sphere using multiple classes?

		Notes :
		     Surface Area of Sphere = 4 * Math.PI * radius* radius
		     Volume of Sphere = 4/3 * Math.PI * radius * radius * radius
		     Use constructor to set radius
		     User Scanner to take user input */
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Enter the radius");// taking input from user using scanner 
		double R1= scan.nextDouble();
		
		Surfaceareasphere S1= new Surfaceareasphere ();// create object S1 of class surface area sphere
		Volumeofsphere V1= new Volumeofsphere ();// create object V1 of class volume of sphere 
		
		S1.Area(R1);//method calling of class surface area of sphere by object 
		
		V1.volume(R1);// method calling of class volume of sphere by passing radius as argument
		
		
		

	}

}
