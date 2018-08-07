/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 22.10.2017 / SDU (Suleyman Demirel University)
 * Description : The Midterm Exam 1 with Q2 questions.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
import java.util.Arrays;
import java.util.Scanner;

public class MidExam_I {

	public static void main(String[] args) {
		int counter, std_age;
		int[] students_ages=new int[30];
		
		Scanner inData = new Scanner(System.in);
		//function to enter ages properly
		for(counter=0; counter<30; counter++){
			System.out.print("Enter the student "+(counter+1)+" age:");
			std_age=inData.nextInt();
			if(std_age>=10 && std_age<=95)
				students_ages[counter]=inData.nextInt();
			else{
				System.out.println("WARNING:Re-enter the age, must be between 10 and 95");
				counter--;
			}
		}
		
		ageRanges(students_ages);
		ageDivisibility(students_ages);
		agePrimeCheck(students_ages);
	}
	//method to check range
	public static void ageRanges(int[] age_set){
		/*
		1. between 10 and 25 (two boundaries are inclusive)
		2. between 35 and 45 (two boundaries are not-inclusive)
		3. between 55 and 70 (upper boundary is not-inclusive)
		*/
		int range10_25=0, range35_45=0, range55_70=0;
		
		for(int counter=0; counter<age_set.length; counter++) {
			if(age_set[counter]>=10 && age_set[counter]<=25){
				range10_25++;
			} else if(age_set[counter]>35 && age_set[counter]<45){
				range35_45++;
			} else if(age_set[counter]>=55 && age_set[counter]<70){
				range55_70++;
			}
		}
		
		System.out.println("Age between 10 and 25:"+range10_25);
		System.out.println("Age between 35 and 45:"+range35_45);
		System.out.println("Age between 55 and 70:"+range55_70);
	}
	
	public static void ageDivisibility(int[] age_set){
		int cnt_div=0;
		for(int counter=0; counter<age_set.length; counter++) {
			if(age_set[counter]%2==0 && age_set[counter]%4==0){
				cnt_div++;
			}
		}
		System.out.println("Numbers that are even and divisible by 4:"+cnt_div);
	}
	
	public static void agePrimeCheck(int[] age_set){
		boolean prime_number=false;
		int count_prime_age=0;
		for(int counter=0; counter<age_set.length; counter++) {
			if(age_set[counter]>25){
				prime_number=true;
				for(int counter2=2; counter2<=95; counter2++){
					if(age_set[counter]%counter2==0) {
						prime_number=false;
						break;
					} 
				}
			}
			
			if(prime_number==true){
				count_prime_age++;
				prime_number=false;
			}
		}
		System.out.println("Number of prime numbers greater than 25:"+count_prime_age);
	}
}
