/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 23.11.2017 / SDU (Suleyman Demirel University)
 * Description : Fundamental concepts of recursion   
 */

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//decreaseOne(10);
		int n=3;
		System.out.println("Facotrial of "+n+" is "+fact(n));
		//System.out.println(decreaseValue(10));
	}
	
	public static int decreaseValue(int number){
		if(number>=0){
			System.out.println("Decrease value method has been called ..."+number);			
			number=number-1;
			return decreaseValue(number);
		} else {
			return number;
		}
	}
	
	public static void decreaseOne(int n){
		if(n!=0)
			decreaseOne(n-1);
		
		System.out.println("Current value of n is:"+n);
	}
	
	public static int fact(int n){
		if(n==0)
			return 1;
		else {
			return n*fact(n-1);
		}
	}
}
