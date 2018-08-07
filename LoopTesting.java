/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 26.09.2017 / SDU (Suleyman Demirel University)
 * Description : This programs test several loop structures   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

public class LoopTesting {

	public static void main(String[] args) {
		//Variable declaration that are used inside loops
		int counter=1; 
		
		//FOR loop
		System.out.println("=== FOR Loop Structure ===\n");
		for(counter=-5; counter<11; counter++) {
			System.out.println("The current value is : "+counter);
		}
		
		//WHILE Loop
		System.out.println("\n=== WHILE Loop Structure ===\n");
		System.out.println("Last value for counter is: "+counter+"\n");
		while(counter<15){
			System.out.println("The current value is : "+counter);
			++counter; //Increment counter=counter+1
		}
		
		//DO-WHILE Loop
		System.out.println("\n=== DO-WHILE Loop Structure ===\n");
		System.out.println("Last value for counter is: "+counter+"\n");
		do{
			//do-while first executes the statements inside the loop
			//then checks the condition
			System.out.println("The current value is : "+counter);
			++counter; //Increment counter=counter+1
		} while(counter<18);
				
		
		/*
		double studentGPA = (float)3.27;
		
		//initialize the counter
		int counter;
		
		for(counter=1; counter<10; counter++){
			System.out.println(counter+". statement called");
		}
		
		//In order to use a for-each statement make sure that you compiler version is higher 1.5 !
		int[] numberSet={100,102,103,104};
		for(int number : numberSet){
			System.out.println("For each loop and number is :"+number);
		}
		
		while (counter<15){
			System.out.println(counter+". while statement called");
			counter++; //counter=counter+1
		}
		
		counter=1;
		do{
			System.out.println(counter+". do-while statement called");
			counter++; //counter=counter+1
		} while (counter>10);
		*/
		
		
	
		/*
		
		//constant variables for ranges to use in the loops
		final int UPPER_BOUND = -1, LOWER_BOUND = -1; 
		
		int counter = 1;
				
		for(;counter<=7; ){
			System.out.println("Counter is :"+counter);
			counter++;
		}
		
		//In order to use a for-each statement make sure that you compiler version is higher 1.5 !
		int[] numberSet={100,102,103,104};
		for(int number : numberSet){
			System.out.println("For each loop and number is :"+number);
		}
				
		boolean check=true;
		while(check){
			if(counter==15){
				break;
			}
			System.out.println("while loop and counter is :"+counter);
			counter++;
		}
		
		do {
			System.out.println("do-while and counter is :"+counter);
			counter++;
		} while (counter>100);
		
		*/
	}
}
