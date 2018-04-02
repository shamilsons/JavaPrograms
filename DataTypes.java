/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 11.09.2017
 * Description : Variables, data types and type casting   
 */

public class DataTypes {

	public static void main(String[] args) {
		//Variable declarations
		//You can create variable once but call it and change the value as much as you can
		int student_age = 20;
		
		//Do-not name primitive variable like constants !!!
		int PROCESS_TIME = 100; // This is wrong variable declaration
		
		//Donot declare different variable types with same name !!!
		final int STUDENT_AGE = 30;
		
		//Practice with type casting
		int number1=20;
		short number2=10;
		byte result2=0;
		result2 = (byte)(number1 + number2);
		
		
		
		
		
		
		
		// Variable definitions
		String name = "Niyara";
		String surname = "Muradova";
		
		//Defining integers
	    byte weight = 127;
	    float num1 = 5.11235f; 
	    int num2 = 6;
	    float result;
	    
	    //Type casting : is a process of changing types of one variable to other
	    result = (float)num1/num2;
	    System.out.println(result);
	   
	    boolean check = true;
	    char gender = 'F';
	    
		/* Information messages for the world
		   SOP -> short cut of System out println 
		*/
		System.out.println("Dear students, welcome to INF-103 course");
		System.out.println("My name is : "+name);
		System.out.println("My surname is :"+surname);
		
		System.out.println("Modulus result : "+(num1%num2));
		// num1++ -> num1=num1+1;
		System.out.println("Increment result : "+((++num1)+(++num2)));
	
		//Testing logical operators AND, OR, NOT
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
