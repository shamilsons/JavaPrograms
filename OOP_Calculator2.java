/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 14.11.2017 / SDU (Suleyman Demirel University)
 * Description : Concept of polymorphism.   
 * NOTE: Calculator application implemented in OOP way
 */

//Importing needed classes for the program
import java.util.Arrays;

class SimpleCalculator{
	int num_int1, num_int2;
	float num_flt1, num_flt2;
	
	//Default constructor
	SimpleCalculator(){
		num_int1=0;
		num_int2=0;
		num_flt1=0;
		num_flt2=0;
		System.out.println("Default constructor called, all attributes set to 0");
	}
	
	//Constructor to set integer attribute values - example concept of Polymorphism
	SimpleCalculator(int num_int1, int num_int2){
		this.num_int1=num_int1;
		this.num_int2=num_int2;
		System.out.println("Integer constructor called, all attributes set to entered ones");
	}
	
	//Constructor to set float attribute values - example concept of Polymorphism
	SimpleCalculator(float num_flt1, float num_flt2){
		this.num_flt1=num_flt1;
		this.num_flt2=num_flt2;
		System.out.println("Float constructor called, all attributes set to entered ones");
	}
	
	//Different polymorphic methods
	public int addition(int num_int1, int num_int2){
		int opt_result=0;
		opt_result=num_int1+num_int2;
		//System.out.println("Addition of two integers :"+opt_result);
		return opt_result;
	}
	
	public float addition(float num_flt1, float num_flt2){
		float opt_result=0;
		opt_result=num_flt1+num_flt2;
		//System.out.println("Addition of two floats :"+opt_result);
		return opt_result;
	}
	
	public void showDetails(){
		System.out.println("\n=== OPARATIONAL VARIABLES DETAILS ===");
		System.out.println("Integer num1:"+this.num_int1);
		System.out.println("Integer num2:"+this.num_int2);
		System.out.println("Float num1:"+this.num_flt1);
		System.out.println("Float num2:"+this.num_flt2);
	}
}

public class OOP_Calculator2 {

	public static void main(String[] args) {
		//Default constructor
		SimpleCalculator simCal1= new SimpleCalculator();
		simCal1.showDetails();
		
		//Integer constructor
		SimpleCalculator simCalInt= new SimpleCalculator(12,56);
		simCalInt.showDetails();
		//The problem is: If we already providing the values for attributes in the constructor
		//why we must provide same values again ? and how to solve this problem ?
		System.out.println("Integer addition results is:"+simCalInt.addition(12,56));
		
		//Float constructor
		SimpleCalculator simCalFlt= new SimpleCalculator(54.56f,35.8f);
		simCalFlt.showDetails();
		System.out.println("Float addition results is:"+simCalFlt.addition(54.56f,35.8f));
	}

}
