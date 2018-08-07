/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 16.10.2017 / SDU (Suleyman Demirel University)
 * Description : This program checks the user buy products and applies the discount.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
import java.util.Arrays;
import java.util.Scanner;

public class DiscountChecker {

	public static void main(String[] args) {
		/*
		boolean prime_number;
		int number=0;
		for(number=110; number<=151; number++){
			prime_number=true;
			for(int counter=2; counter<number-1; counter++){
				if(number%counter==0) {
					prime_number=false;
					break;
				} 
			}
			//prime_number=true;
			System.out.println("The "+number+" is prime:"+prime_number);
			//prime_number=false;
		}
		*/
		//defining products
		String[] customer_bag;
		String[] products = {"Bread","Cola","Flour","Fruits"};
 		float[] product_prices = {100.51f, 175.78f, 365.45f, 550.66f};
	    float total_price=0;
		//The user can buy N number of products from the store
 		Scanner inData = new Scanner(System.in);
 		int prd_number=0;
 		
 		
 		System.out.println("=== YASMIN SMART-MARKET ===\n"
 				+ "These are products available in the market:"+Arrays.toString(products));
 		System.out.print("\nPlease enter number of products you want to buy:");
 		prd_number= inData.nextInt();
 		
 		String product="";
 		customer_bag= new String[prd_number];
 		for(int counter=0; counter<prd_number; counter++){
 			System.out.print("Enter "+(counter+1)+" product name:");
 			product=inData.next();
 			
 			if(product!=""){
				if(product.equals("Bread")){
	 				total_price=total_price+product_prices[0];
	 				customer_bag[counter]=product;
				} else if(product.equals("Cola")){
	 				total_price=total_price+product_prices[1];
	 				customer_bag[counter]=product;
				} else if(product.equals("Flour")){
	 				total_price=total_price+product_prices[2];
	 				customer_bag[counter]=product;
				} else if(product.equals("Fruits")){
	 				total_price=total_price+product_prices[3];
	 				customer_bag[counter]=product;
				} else {
	 				System.out.println("You entered wrong product re-enter the product");
	 				counter--;
	 			}
 			} else
 				counter--;
 			//System.out.println("Customer bag is:"+Arrays.toString(customer_bag));
 		}
 		
 		//If total_price is
 		int discount;
 		if(total_price>=300 && total_price<500){
 			discount=4;
 		} else if(total_price>=500 && total_price<750){
 			discount=7;
 		} else if(total_price>=750){
 			discount=10;
 		} else {
 			discount=0;
 		}
 		
 		System.out.println("\n=== YASMIN SMART-MARKET BILL ===");
 		System.out.println("You bought these products:"+Arrays.toString(customer_bag));
 		System.out.println("The total bill price :"+total_price+" tenge."+" Discount obtained:"+discount+"%");
 		System.out.println("The price to pay :"+(total_price-(total_price*discount)/100)+" tenge");
 		System.out.println("Thank you for shopping and waiting you again");
	}
}
