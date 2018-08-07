/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 27-08.12.2017 / SDU (Suleyman Demirel University)
 * Description : The Final Exam answers.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

import java.util.Scanner; 

//Importing needed classes for the program
interface classInfomation{
	//the method shows information about class attributes
	public void showDetails();
	//the method shows the information about the class itself
	public void classInfo();
}

//This is a base (parent) class for CompAbst class 
class CompAbst implements classInfomation{
	public String clsinfo;
	
	//For this class it is better to have only one parametric constructor
	CompAbst(){
		this.clsinfo="Base class";
	}
	
	CompAbst(String clsinfo){
		this.clsinfo=clsinfo;
	}
	
	public void showDetails(){
		System.out.println("This method is declared in CompAbst class, and contains one variable:"+this.clsinfo);
		System.out.println("This class does not have any operational methods");
	}
	
	public void classInfo(){
		System.out.println("This is a CompAbst base class");
	}
}


//This is a child class for CompAbst class 
class VariousAlgos extends CompAbst implements classInfomation{
	public int factNum, checkNum;
	public String text, substring;
	
	//Default constructor for the VariousAlgos class
	//Displays useful information about attributes and variables
	VariousAlgos(){
		classInfo();
		showDetails();
	}
	
	//Method for searching the substring in a string
	public int searchSubstring(String text, String substring){
		boolean check=false;
		//convert everything to lowercase in order to find the exact match
		check = text.toLowerCase().contains(substring.toLowerCase());
		if(check==true)
			return text.indexOf(substring);
		else
			return -1;
	}
	
	//Recursive method to find the factorial of a given number
	public int factorialOfNumber(int number){
		int result;
	    if(number==0 || number==1)
	    	return 1;

	    result = factorialOfNumber(number-1) * number;
	    return result;
	}
	
	//Check whether the number is ODD or EVEN
	public void evenOrOdd(int number){
		if(number%2 == 0)
			System.out.println("Entered number is EVEN");
		else
			System.out.println("Entered number is ODD");
	}
	
	public void showDetails(){
		System.out.println("This method is declared in VariousAlgos class, and contains four variables");
		System.out.println("This class has three operational methods {searchSubstring(String text, String substring), factorialOfNumber(int number), evenOrOdd(int number)}");
	}
	
	public void classInfo(){
		System.out.println("This is a VariousAlgos child class");
	}
}

public class FinalExm2017 {
	public static void main(String[] args) {
		//CompAbst class instantiation
		CompAbst ca_df = new CompAbst();
		CompAbst ca_pr = new CompAbst("BASE CLASSICO");
		
		ca_df.showDetails();
		ca_df.classInfo();
		
		//VariousAlgos class instantiation
		System.out.println("Create a variousalgos class with default constructor"); 
		VariousAlgos valgo= new VariousAlgos();
		
		Scanner inData = new Scanner(System.in);
		//Calling the method searching substring
		System.out.println("Enter text:");
		valgo.text=inData.next();
		System.out.println("Enter substring:");
		valgo.substring=inData.next();
		valgo.searchSubstring(valgo.text, valgo.substring);
		
		//Calling number factorial method
		System.out.println("Enter number for factorial calculation:");
		valgo.factNum=inData.nextInt();
		System.out.println("Factorial of a number:"+valgo.factorialOfNumber(valgo.factNum));
		
		//Calling method EvenOrOdd number
		System.out.println("Enter number for check even or odd:");
		valgo.checkNum=inData.nextInt();
		valgo.evenOrOdd(valgo.checkNum);
	}
}
