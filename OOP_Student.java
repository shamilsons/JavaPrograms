/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 26.10.2017 / SDU (Suleyman Demirel University)
 * Description : OOP Student class and gpa with averages   
 * NOTE: Calculator application implemented in OOP way
 */

//Importing needed classes for the program
import java.util.Arrays;

class Student{
	//Declaring attributes related to the class
	String name, surname;
	int age;
	char gender;
	double gpa;
	
	//Default constructor - I
	Student(){
		this.name="Enter name for student";
		this.surname="Enter surname for student";
		this.age=18;
		this.gender='N';
		this.gpa=0;
	}
	
	//Parametric constructor - II
	Student(String name, String surname, double gpa){
		//Below parameters are set with attributes
		this.name=name;
		this.surname=surname;
		this.gpa=gpa;
		//Below parameters are set with direct values
		this.gender='F';
		this.age=20;
	}
	
	//Method that shows the parameters contents
	public void showDetails(){
		System.out.println("Name:"+this.name);
		System.out.println("Surname:"+this.surname);
		System.out.println("Age:"+this.age);
		System.out.println("Gender:"+this.gender);
		System.out.println("GPA:"+this.gpa);
	}
}

public class OOP_Student {

	public static void main(String[] args) {
		int counter=0;
		int size=0;
		double average_gpa=0;
		
		java.util.Scanner getSize= new java.util.Scanner(System.in); 
		System.out.print("Enter number of students in the class:");
		size=getSize.nextInt();
		
		//checkpoint for students number in the class
		if(size>0){
			Student[] students_group= new Student[size];
			
			while(counter<size){
				System.out.print("Enter "+(counter+1)+" student's GPA:");
				
				//Instantiate an object from the Student class
				students_group[counter] = new Student();
				//then set the value
				students_group[counter].gpa=getSize.nextDouble();
				
				average_gpa=average_gpa+students_group[counter].gpa;
				
				//****Add codes which will ask a user to enter remaining attribute parameters 
				//and set them to particular student
				
				counter++;
			}
			
			System.out.println("The average gpa for the class is:"+(average_gpa/size));
			
			//****Develop a special method and call it from here
			//The method must display all entered parameters for students
			//Display average age for the class 
			
		} else {
			System.out.println("Please enter proper students number in the group");
		}
	}
}
