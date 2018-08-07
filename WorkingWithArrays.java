/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 10.10.2017 / SDU (Suleyman Demirel University)
 * Description : This programs tests different arrays structures   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class WorkingWithArrays {
	public static void main(String[] args) {
		/*
		//needed variables 
		int check_code = 0;
		
		Scanner getNum = new Scanner(System.in);
		
		System.out.print("Please enter your code:");
		check_code = getNum.nextInt(); // check_code = getNum.nextInt(); 
		
		if(check_code!=-1){
			//Checks if code is between 1 and 10 (higher range exclusive)
			if(check_code>=1 && check_code<10) // check_code>1 && check_code<10 
				System.out.println("Code is too small");
			//Checks if the code is in between 100 and 200 (both ranges inclusive)
			else if(check_code>=100 && check_code<=200)
				System.out.println("Code is too big");
			else
				System.out.println("Code is normal");
		} else {
			System.out.println("Please enter a proper code number");
		}
		*/
		
		//initializing useful variables
		int index = -1;
		int class_size = 0;
		int[] students_grades;
		
		Scanner getValue = new Scanner(System.in);
		
		//Force user to enter the proper class
		while(class_size==0){
			System.out.print("Enter number of students in the class:");
			class_size = getValue.nextInt();
			System.out.print("\n");
			
			if(class_size<0){
				class_size=0;
				continue;
			}
		}
		
		//initialize students grades array
		students_grades = new int[class_size];
		
		//Code to get the grades for the students
		System.out.println("=== GETTING CLASS GRADES ===");
		for(index=0; index<=class_size-1; index++){
			System.out.print("Enter grade for a "+(index+1)+" student:");
			students_grades[index]=getValue.nextInt();
			
			//If user enters the negative grade for the student (1.solution)
			if(students_grades[index]<0){
				students_grades[index]=students_grades[index]*-1;
				System.out.println("\n WARNING: Negative grade converted to positive");
			}
			//(2.solution) lets see tomorrow
			
			System.out.print("The grade for a "+(index+1)+" student store properly\n");
		}
		
		System.out.println("\nThe class grades are:"+Arrays.toString(students_grades));
		System.out.println("The average for the class is:"+calculateAverage(students_grades));
	}
	
	//Calculates the average grade for the class
	public static float calculateAverage(int[] students_grades){
		float sum_of_grades=0;
		int index=0;
		
		//Calculate total of all grades
		while(index<students_grades.length){
			sum_of_grades = sum_of_grades+students_grades[index];
			index++;
		}
		
		return (sum_of_grades/students_grades.length);
	}
}
