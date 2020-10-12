
public class Bmical {
	
	double height, weight ;
	
	public void cal (  String name ,double height ,double weight) {
		
	double result= weight/(height*height) ;
	
	System.out.println("***************************************************");
	System.out.println( name +": " +result+ "  kg/m^2");
	
	if (result<18.5) {
		
		System.out.print("ur a under weight ");
		
	}
	

	else if (result>=18.5&& result<24.9) {
		
		System.out.print("ur BMI is normal ");
		
	}
	

	else if(result>=25&& result<29.9) {
		
		System.out.print("ur BMI is normal ");
		
	}
	
else if(result>30) {
		
		System.out.print("ur obese ");
		
	}
	
	
	 
    		
		
		
		
		
	}

}
