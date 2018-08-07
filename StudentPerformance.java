/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 19.09.2017
 * Description : This program returns student's letter grades based on student's numeric grade   
 */

//Connecting needed class
import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {
		//Variable to use inside the loop
		int counter=11;
		
		for(;counter>1;) {
			System.out.println(counter+". for statement called");
			
			//trap to control counter
			if(counter>0 && counter==1000){
				break;
			}
			counter--;
		}
		
		System.out.println("The value of counter is :"+counter);
		while(counter<10){
			System.out.println(counter+". while statement called");
			counter++;
		}
		
		/*
		while(true){
			System.out.println("Now I am going to run forever ....");
		}*/
		
		System.out.println("The last value of the counter is : "+counter);
		do {
			
			System.out.println(counter+". do-while statement called");
			counter++;
			
			if(counter==100)
				break;
			
		} while(counter>1);
		
		//break
		for(int row=1; row<=5; row++){
			for(int col=1; col<=5; col++){
				System.out.println(row+"x"+col+" = "+(row*col));
				if(col==3)
					//Break kills the loop
					break;
			}
			if(row==3)
				break;
		}
		
		//continue
		counter=0;
		while(counter<=10){
			counter++;
			
			if(counter==5)
				//Continue sends IP(instruction pointer) to the beginning of the loop
				continue;
			
			System.out.println("Current value of counter is : "+counter);
			System.out.println("Statments below ...");
		}
		
		
		
		
		
		/*
		int discountType=5; //very good declaration
		switch(discountType) {
			case 1:
				System.out.println("Customer got 10% discount");
			    break;
			
			case 5:
				if(true) {
					System.out.println("You also won a car :D");
				}
				
				System.out.println("Customer got 20% discount");
			    break;
			
			case 10:
				System.out.println("Customer got 30% discount");
			    break;
			
			default:    
				System.out.println("There is not discount for customer");
			    break;
		}
		
		//Make sure to declare variables first
		//Needed variables are declared below
		final int LOW_INDEX = 0, UP_INDEX = 100;
		
		int studentGrade = -1;
		
		//Instantiating the instance of the Scanner class
		Scanner ingrade = new Scanner(System.in);
		
		System.out.print("Please enter student numeric grade: ");
		studentGrade = ingrade.nextInt();
		
		//Conditional statements that checks and return letter grade
		//First if condition checks whether the entered number is between 0 and 100
		if(studentGrade>=LOW_INDEX && studentGrade<=UP_INDEX){
			//Conditional stms below checks the range for the entered grade
			//1. if-else if-else with logical operators
			
			if(studentGrade>=90){
				System.out.println("Student letter grade is AA");
			} else if((studentGrade>80 || studentGrade==80) && (studentGrade < 90)){
				System.out.println("Student letter grade is BA");
			} else if(studentGrade>=75 && studentGrade<=79){
				System.out.println("Student letter grade is BB");
			} else if(studentGrade>=70 && studentGrade<=74){
				System.out.println("Student letter grade is BC");
			} else if(studentGrade>=65 && studentGrade<=69){
				System.out.println("Student letter grade is CC");
			} else if(studentGrade>=60 && studentGrade<=64){
				System.out.println("Student letter grade is CD");
			} else if(studentGrade>=50 && studentGrade<=59){
				System.out.println("Student letter grade is DD");
			} else {
				System.out.println("Student letter grade is FF");
			}
			
			
			//int num1=101;
			//if(num1==100)
			//	System.out.println("Hi All"); 
			//	System.out.println("Welcome to here");
			
			//------------------------------------------------------------------//
			//2. if-else with logical operators
			if(studentGrade>=90){System.out.println("Student letter grade is AA");
			} else {
				if(studentGrade>=80 && studentGrade<=89) {
					System.out.println("Student letter grade is BA");
				} else {
					if(studentGrade>=75 && studentGrade<=79){
						System.out.println("Student letter grade is BB");
					} else {
						if(studentGrade>=70 && studentGrade<=74){
							System.out.println("Student letter grade is BC");
						} else {
							if(studentGrade>=65 && studentGrade<=69){
								System.out.println("Student letter grade is CC");
							} else {
								if(studentGrade>=60 && studentGrade<=64){
									System.out.println("Student letter grade is CD");
								} else {
									if(studentGrade>=50 && studentGrade<=59){
										System.out.println("Student letter grade is DD");
									} else {
										System.out.println("Student letter grade is FF");
									}
								}
							}
						}
					}
				}
			}
			//------------------------------------------------------------------//

			//3. if-else without logical operators
			//Below code is implemented in nested form
			if(studentGrade>=90){
				System.out.println("Student letter grade is AA");
			} else {
				if(studentGrade>=80){
					System.out.println("Student letter grade is BA");
				} else {
					if(studentGrade>=75){
						System.out.println("Student letter grade is BB");
					} else {
						if(studentGrade>=70){
							System.out.println("Student letter grade is BC");
						} else {
							if(studentGrade>=65){
								System.out.println("Student letter grade is CC");
							} else {
								if(studentGrade>=60){
									System.out.println("Student letter grade is CD");
								} else {
									if(studentGrade>=50){
										System.out.println("Student letter grade is DD");
									} else {
										System.out.println("Student letter grade is FF");
									}
								}
							}
						}
					}
				}
			}
			
		} else {
			System.out.println("ERROR:The entered grade must be between 0 and 100");
		}
		*/
	}
}
