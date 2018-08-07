/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 07-08.12.2017 / SDU (Suleyman Demirel University)
 * Description : The Midterm Exam 2 answers.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
interface DGOperations{
	//the method shows information about class attributes
	public void showDetails();
	//the method shows the information about the class itself
	public void classInfo();
}

//this is a base class for Calculator class 
class DigitalMachines implements DGOperations{
	public double num1, num2;
	
	DigitalMachines(){
		this.num1=0;
		this.num2=0;
	}
	
	DigitalMachines(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void showDetails(){
		System.out.println("This method is declared in DigitalMachines class, and contains two variables");
		System.out.println("This class does not have any operational methods");
	}
	
	public void classInfo(){
		System.out.println("This is a DigitalMachines base class");
	}
}


class Calculator1 extends DigitalMachines implements DGOperations {
	private double num1, num2;
	
	//default constructor
	Calculator1(){
		this.num1=0;
		this.num2=0;
	}
	
	//Parametric constructor
	Calculator1(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	//Setters and getters for the variables
	public void setNum1(double num1){
		this.num1=num1;
	}
	
	public double getNum1(){
		return this.num1;
	}
	
	public void setNum2(double num2){
		this.num2=num2;
	}
	
	public double getNum2(){
		return this.num2;
	}
	
	//Methods for matematical operations
	public void addition(double num1, double num2){
		System.out.println("Addition operation result is:"+(num1+num2));
	}
	
	public void subtraction(double num1, double num2){
		System.out.println("Substruction operation result is:"+(num1-num2));
	}
	
	public void multiplication(double num1, double num2){
		System.out.println("Multiplication operation result is:"+(num1*num2));
	}
	
	public void division(double num1, double num2){
		System.out.println("Division operation result is:"+(num1/num2));
	}
	
	public void showDetails(){
		System.out.println("This method is declared in Calculator class, and contains two variables");
		System.out.println("This class four operational methods (Addition, Subtraction, Division, Multiplication)");
	}
	
	public void classInfo(){
		System.out.println("This is a Calculator child class");
	}
}

public class MidExam_II {
	public static void main(String[] args) {
		//DigitalMachines class instantiation
		DigitalMachines dg_df = new DigitalMachines();
		DigitalMachines dg_pr = new DigitalMachines(10,20);
		
		dg_df.showDetails();
		dg_df.classInfo();
		
		//Calculator class instantiation
		System.out.println("Create a calculator class with default constructor"); 
		Calculator1 clc1= new Calculator1();
		clc1.setNum1(2);
		clc1.setNum2(4);
		clc1.showDetails();
		clc1.classInfo();
		clc1.addition(2,4);
		clc1.subtraction(2,4);
		clc1.multiplication(2,4);
		clc1.division(2,4);
		
		System.out.println("Create a calculator class with parametric constructor"); 
		Calculator1 clc2= new Calculator1(5,10);
		clc2.setNum1(5);
		clc2.setNum2(10);
		clc2.showDetails();
		clc2.classInfo();
		clc2.addition(5,10);
		clc2.subtraction(5,10);
		clc2.multiplication(5,10);
		clc2.division(5,10);
	}
}
