/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 26.10.2017 / SDU (Suleyman Demirel University)
 * Description : OOP methodology I.   
 * NOTE: Calculator application implemented in OOP way
 */

//Importing needed classes for the program
import java.util.Arrays;

class Calculator{
	//Four variables for performing operation
	int opt_num1, opt_num2, opt_num3, opt_num4;
	
	//default constructor
	Calculator(){
		opt_num1=-1;
		opt_num2=-1;
		opt_num3=-1;
		opt_num4=-1;
		System.out.print("THIS DEFAULT CALCULATOR CONSTRUCTOR");
	}
	
	//Parametric constructor with four variables
	Calculator(int opt_num1, int opt_num2, int opt_num3, int opt_num4){
		this.opt_num1=opt_num1;
		this.opt_num2=opt_num2;
		this.opt_num3=opt_num3;
		this.opt_num4=opt_num4;
		System.out.print("THIS PARAMETRIC CALCULATOR CONSTRUCTOR");
	}
	
	public void showDetails(){
		System.out.println("\n=== OPARATIONAL VARIABLES DETAILS ===");
		System.out.println("Opt num1:"+this.opt_num1);
		System.out.println("Opt num2:"+this.opt_num2);
		System.out.println("Opt num3:"+this.opt_num3);
		System.out.println("Opt num4:"+this.opt_num4);
	}
	
	public void additionOpt(){
		if(opt_num1!=-1 && opt_num2!=-1 && opt_num3!=-1 && opt_num4!=-1){
			int result = opt_num1+opt_num2+opt_num3+opt_num4;
			System.out.println("The addition result is:"+result);
		} else {
			System.out.println("In order for the operation to complete all values must be set");
		}
	}
	
	public void subtractionOpt(){
		if(opt_num1!=-1 && opt_num2!=-1 && opt_num3!=-1 && opt_num4!=-1){
			int result = opt_num1-opt_num2-opt_num3-opt_num4;
			System.out.println("The subtraction result is:"+result);
		} else {
			System.out.println("In order for the operation to complete all values must be set");
		}
	}
	
	public void multiplicationOpt(){
		if(opt_num1!=-1 && opt_num2!=-1 && opt_num3!=-1 && opt_num4!=-1){
			int result = opt_num1*opt_num2*opt_num3*opt_num4;
			System.out.println("The multiplication result is:"+result);
		} else {
			System.out.println("In order for the operation to complete all values must be set");
		}
	}
	
	public void divisionOpt(){
		if(opt_num1!=-1 && opt_num2!=-1 && opt_num3!=-1 && opt_num4!=-1){
			int result = opt_num1/opt_num2/opt_num3/opt_num4;
			System.out.println("The division result is:"+result);
		} else {
			System.out.println("In order for the operation to complete all values must be set");
		}
	}
}

public class OOP_Calculator {
	public static void main(String[] args) {
		System.out.println("Create a calculator class with default constructor"); 
		Calculator clc1= new Calculator();
		clc1.opt_num1=2;
		clc1.opt_num2=4;
		clc1.opt_num3=6;
		clc1.opt_num4=8;
		clc1.showDetails();
		clc1.additionOpt();
		clc1.subtractionOpt();
		clc1.multiplicationOpt();
		clc1.divisionOpt();
		
		System.out.println("\n\nCreate a calculator class with parametric constructor"); 
		Calculator clc2= new Calculator(10,20,30,40);
		clc2.showDetails();
		clc2.additionOpt();
		clc2.subtractionOpt();
		clc2.multiplicationOpt();
		clc2.divisionOpt();
	}
}
