//call needed classes
import java.util.Random;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		//declaring needed variable types
		final int UPPER_NUM, LOWER_NUM;
		
		//array where the generated random values are going to be stored
		int[] numberSet;
		
		UPPER_NUM=558;
		LOWER_NUM=29;
		
		numberSet=new int[997];
		
		//Random generator for number
		Random rndGenerator= new Random();
		
		for(int counter=0; counter<numberSet.length; counter++){
			numberSet[counter]=(rndGenerator.nextInt(UPPER_NUM-LOWER_NUM)+1)+LOWER_NUM;
			//System.out.println("Random value is:"+numberSet[counter]);
		}
		
		System.out.println("Even numbers count in range 101-210 :"+checkEvenInRange(numberSet,210,101));
		System.out.println("Odd and divisible by 9 count :"+checkOdd(numberSet,9));
		totalEvenOdd(numberSet);
	}
	
	public static int checkEvenInRange(int[] numberList, int up_num, int low_num){
		int even_count=0;
		for(int counter=0; counter<numberList.length; counter++){
			if(numberList[counter]%2==0 && (numberList[counter]>low_num && numberList[counter]<up_num)){
				even_count++;
			}
		}
		return even_count;
	}
	
	public static int checkOdd(int[] numberList, int div_num){
		int odd_count=0;
		for(int counter=0; counter<numberList.length; counter++){
			if(numberList[counter]%2!=0 && numberList[counter]%9==0 ){
				odd_count++;
			}
		}
		return odd_count;
	}
	
	public static void totalEvenOdd(int[] numberList){
		int even_count=0;
		int total_even=0;
		int odd_count=0;
		int total_odd=0;
		
		for(int counter=0; counter<numberList.length; counter++){
			if(numberList[counter]%2==0){
				even_count++;
				total_even=total_even+numberList[counter];
			} else {
				odd_count++;
				total_odd=total_odd+numberList[counter];
			}
		}
		
		if(total_even>2500)
			System.out.println("Even number total is OUT OF RANGE with total:"+total_even);
		else
			System.out.println("Even number total is IN RANGE with total:"+total_even);
		
		if(total_odd>2500)
			System.out.println("Even number total is OUT OF RANGE with total:"+total_odd);
		else
			System.out.println("Even number total is IN RANGE with total:"+total_odd);
	}
}
