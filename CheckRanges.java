/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 26.09.2017 / SDU (Suleyman Demirel University)
 * Description : This implements the conditions between particular ranges   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Import needed libraries 
import java.util.Scanner;

public class CheckRanges {

	public static void main(String[] args) {
		//First create all variables that you are going to use in your program
		// Lower and Upper limit variables
		//You cannot change constant (final) values
		final int UPPER_BAND, LOWER_BAND;
		
		//Variables to store operations results
		int cnt_div_by_four = 0;
		int cnt_odd_number = 0;
		int cnt_even_number = 0;
		int upper_band = 0, lower_band = 0;
		int counter = -1;
		
		//In order to use Scanner class, we have to first create (instantiate) 
		//the instance of Scanner class
		Scanner inBands = new Scanner(System.in);
		System.out.print("Enter lower band : ");
		LOWER_BAND = inBands.nextInt();
		
		System.out.print("Enter upper band : ");
		UPPER_BAND = inBands.nextInt();
		
		counter = LOWER_BAND;
		while(counter<UPPER_BAND){
			//if counter value is divisible by 4, record it
			if(counter % 4 == 0)
				cnt_div_by_four++;
			
			//if the counter number is not divisible by 2 then it means 
			//it is odd number
			if(counter % 2 != 0)
				cnt_odd_number++;
			else
				cnt_even_number++;
			
			
			counter++;
		}
		
		for(counter=0; counter<=5; counter++){
			//Continue to the beginning of the loop
			if(counter==2)
				continue;
			
			//Kills the loop
			if(counter==4)
				break;
			
			System.out.println("Value of counter : "+counter);
		}
		
		/*
		//Non-inclusive >> because upper bond is not included
		for(counter=LOWER_BAND; counter<UPPER_BAND; counter++){
			//if counter value is divisible by 4, record it
			if(counter % 4 == 0)
				cnt_div_by_four++;
			
			//if the counter number is not divisible by 2 then it means 
			//it is odd number
			if(counter % 2 != 0)
				cnt_odd_number++;
			else
				cnt_even_number++;
		}
		*/
		
		System.out.println("=== CONDITIONS RESULTS FOR RANGES ["+LOWER_BAND+" : "+UPPER_BAND+"] ARE AS FOLLOWS ===\n");
		System.out.println("Numbers divisible by 4  : "+cnt_div_by_four);
		System.out.println("Odd numbers count       : "+cnt_odd_number);
		System.out.println("Even numbers count      : "+cnt_even_number);
		System.out.println("\n                      THE END                ");
	}
}
