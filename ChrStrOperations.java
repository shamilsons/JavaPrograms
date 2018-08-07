/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 03.10.2017 / SDU (Suleyman Demirel University)
 * Description : This programs test character and string methods   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Import random generator class
import java.util.Random;

public class ChrStrOperations {

	public static void main(String[] args) {
		//Character class, String class, Random generator class
		char option_chr = 'A';
		char option_num = '7';
		
		Character digit_chr= new Character('9');
		Character check_chr= new Character('E');
		
		System.out.println("Checking whether is "+option_chr+" letter : "+Character.isLetter(option_chr));
		System.out.println("Checking whether is "+option_chr+" letter : "+check_chr.isLetter(check_chr));
		
		System.out.println("The ascii code for letter "+check_chr+" is : "+check_chr.hashCode());
		//method to check the type of a variable ???
		System.out.println("The new data type for character is : "+check_chr.toString());
		
		if(digit_chr.isLetter(digit_chr)){
			//Operational statements
			System.out.println("Character is digit, you can perform mathematical operation");
			System.out.println("Hascode for digit char :"+digit_chr.hashCode());
			// ??? in typecasting
			int number = (int)digit_chr;
			
			System.out.println("Digit increment is :"+(number++));
		} else {
			System.out.println("You cannot perform mathematical operation");
		}
		
		String message1_obj= new String("Universe");
		String message2_obj= new String("Universe");
		String message12_obj=message1_obj;
		String message3="Hello";
		String message4="Hello";
		String message5="Hello Everyone, welcome to INF-103 course. Blabla bla. bla bla.";
		
		System.out.println("Length of the string :"+message1_obj.length());
		System.out.println("Length of the string :"+message1_obj.toUpperCase());
		System.out.println("1. EQUALITY :"+(message1_obj == message2_obj));
		System.out.println("1.2 EQUALITY :"+(message1_obj == message12_obj));
		message1_obj = "Test message";
		System.out.println("1.3 HOW FAR :"+(message12_obj));
		System.out.println("2. EQUALS Method :"+message1_obj.equals(message2_obj));
		System.out.println("3. COMPARETO Method:"+message1_obj.compareTo(message2_obj));
		
		//Foreach loop
		int counter = 1;
		//Split method uses a delimiter to separate the particular message
		for(String word : message5.split(" ")){
			System.out.println(counter+". word in the message is : "+word);
			counter++;
		}
		
		Random rndGenerator = new Random();
		//Simple random generators
		System.out.println("Random with Math class value:"+Math.random());
		System.out.println("Random int value:"+rndGenerator.nextInt(5));
		System.out.println("Random float value:"+rndGenerator.nextFloat());
		System.out.println("Random boolean value:"+rndGenerator.nextBoolean());
		//Random numbers between ranges
		int max=10, min=3; //Both values must be inclusive
		System.out.println("Random int value in range ["+max+"/"+min+"]:"+(rndGenerator.nextInt((++max)-min)+min));
		System.out.println("Random float value in range ["+max+"/"+min+"]:"+(((max-min)*rndGenerator.nextFloat())+min));	
		System.out.println("Random int value by using user-define method in range ["+max+"/"+min+"]:"+getRandomValue(max, min));	
	
		if(1<3) 
		{
			System.out.println("Hello");
		}
		
		for(int count=0;count<10;count++)
		{
			System.out.println("Hello");
		}
				
	}
	
	//hello
	public static int getNumber()
	{
		int randomValue=-1;
		return randomValue;
	}
	
	//User define method getRandomValue which accepts to parameters
	public static int getRandomValue(int max, int min){
		int randomValue=-1;
		Random rndGenerator=new Random();
		randomValue=rndGenerator.nextInt((++max)-min)+min;
		return randomValue;
	}
	
}
