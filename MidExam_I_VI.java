/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 22.10.2017 / SDU (Suleyman Demirel University)
 * Description : The Midterm Exam 1 with Q1 questions.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MidExam_I_VI {
	public static void main(String[] args) {
		int counter=1, range_min=29, range_max=558;
		int[] number_bag = new int[997];
		
		Random genNum = new Random();
		for(counter=1; counter<number_bag.length; counter++){
			number_bag[counter]=genNum.nextInt((range_max-range_min)+1)+range_min;
		}
		
		System.out.println("=== ARRAY NUMBERS OPERATIONS ===");
		System.out.println("\nThe even numbers in range 101 and 210:"+checkEvenRange(number_bag));
		System.out.println("The prime numbers check:"+primeNumberCheck(number_bag));
		System.out.println("Even and divisible by 14"+numberDivisibility(number_bag));
		totalsOfNumbers(number_bag);
		
		Scanner getNum= new Scanner(System.in);
		System.out.print("Enter number to search in array:");
		searchNumber(number_bag, getNum.nextInt());
	}
	
	//Check and count how many numbers are even and between 101 and 210 (both ranges are not inclusive)
	public static int checkEvenRange(int[] number_bag){
		int even_count=0;
		
		for(int counter=1; counter<number_bag.length; counter++){
			if(number_bag[counter]%2==0){
				if(number_bag[counter]>101 && number_bag[counter]<210){
					even_count++;
				}
			}
		}
		return even_count;
	}
	
	//Check and count how many numbers are prime and greater than 50
	public static int primeNumberCheck(int[] number_bag){
		boolean prime_number=false;
		int count_prime_num=0;
		for(int counter=0; counter<number_bag.length; counter++) {
			if(number_bag[counter]>50){
				prime_number=true;
				for(int counter2=2; counter2<=997; counter2++){
					if(number_bag[counter]%counter2==0) {
						prime_number=false;
						break;
					} 
				}
			}
			
			if(prime_number==true){
				count_prime_num++;
				prime_number=false;
			}
		}
		//System.out.println("Number of prime numbers greater than 50:"+count_prime_num);
		return count_prime_num;
	}
	
	//Count how many generated numbers are even and divisible by 14
	public static int numberDivisibility(int[] number_bag){
		int div_count=0;
		
		for(int counter=1; counter<number_bag.length; counter++){
			if(number_bag[counter]%2==0 && number_bag[counter]%14==0){
				div_count++;
			}
		}
		return div_count;
	}
	
	//Show the total of all even and odd numbers separately and print “Out of range” if the total is over 150000 
    //for both integer types  
	public static void totalsOfNumbers(int[] number_bag){
		int total_even=0, total_odd=0;
		
		for(int counter=1; counter<number_bag.length; counter++){
			if(number_bag[counter]%2==0){
				total_even++;
			} else {
				total_odd++;
			}
		}
		
		if(total_even>150000)
			System.out.println("The total of even numbers OUT OF RANGE");
		else
			System.out.println("The total of even numbers IN RANGE");
		
		if(total_odd>150000)
			System.out.println("The total of odd numbers OUT OF RANGE");
		else
			System.out.println("The total of odd numbers IN RANGE");
	}
	
	//Ask the user to enter any numbers and check whether the number exists 
	//in the generated ones and print the message accordingly.
	public static void searchNumber(int[] number_bag, int num_search){
		boolean number_check=false;
		for(int counter=1; counter<number_bag.length; counter++){
			if(number_bag[counter]==num_search){
				number_check=true;
			    break;
			} 
		}
		
		if(number_check==true)
			System.out.println("The number exists in array");
		else 
			System.out.println("The number does not exists in array");
	}
}
