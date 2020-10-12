import java.util.Scanner;

public class Bmitest {

	public Bmitest() {
		super();
		
	}

	// entry point function
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
	   Bmical B1= new Bmical ();
		
		System.out.println("Enter name of patient:");//input taken in mtr
		String name = scan.nextLine();
		
		System.out.println("Enter the height in Meters :");//input taken in mtr
		double H1= scan.nextDouble();
		
		//taken input weight in kg
		
		System.out.println("Enter the weight in kg :");
		double W1= scan.nextDouble();
		
		B1.cal( name ,H1,W1);

		
	}

}
