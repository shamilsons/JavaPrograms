
public class FirstJavaProgram {

	public static void main(String[] args) {
		// Variable definitions
		String name = "Niyara";
		String surname = "Muradova";
		
		//Defining integers
	    byte weight = 127;
	    float num1 = 5.11235f; 
	    int num2 = 6;
	    float result;
	    
	    //Type casting
	    //changing types of one variable to other
	    result = (float)num1/num2;
	    System.out.println(result);
	   
	    boolean check = true;
	    char gender = ' ';
	    
		/* Information messages for the world
		   SOP -> short cut of System out println 
		*/
		System.out.println("Dear students, welcome to INF-103 course");
		System.out.println("My name is : "+name);
		System.out.println("My surname is :"+surname);
		
		System.out.println("Modulus result : "+(num1%num2));
		// num1++ -> num1=num1+1;
		System.out.println("Increment result : "+((++num1)+(++num2)));
	
		if(name=="Madina" & check!=false || gender == 'F'){
			System.out.println("IF statement executed ...");
		} else {
			System.out.println("ELSE statement executed ...");
		}
		
		if((weight>=55 & gender=='F') || gender=='M') {
			System.out.println("OMG");
		} else {
			System.out.println("Perfect");
		}
		
		System.out.println("Result is : "+ (num1/num2));
	}
}
