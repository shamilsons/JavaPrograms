/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 28.09.2017 / SDU (Suleyman Demirel University)
 * Description : This programs test character and string methods   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

import java.util.Random;
import java.util.Scanner;

public class CharStringOperations {

	public static void main(String[] args) {
		char gender = 'M';
		Character num_char = new Character('9');
		Character ltr_char = new Character('a');
		
		String std_name1="Asan";
		String std_name2="Ali";
		String std_name3="Asan";
		String lab_word = "Kalamburbek";
		
		System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
	    System.out.println("Formfeed       : " + "ABCDE\fFGHIJ");
	    System.out.println("Linefeed       : " + "ABCDE\nFGHIJ");
	    System.out.println("Single Quote   : " + "ABCDE'FGHIJ");
	    System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
	    System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
	    System.out.println("Horizontal Tab : " + "ABCDE\tFGHIJ");
	    System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");
	    
	    
	    System.out.println("Operation result : "+ltr_char.toUpperCase(ltr_char));
	    System.out.println("Operation result : "+Character.toUpperCase(ltr_char));
	    System.out.println("Operation result : "+ltr_char.isDigit(ltr_char));
	    System.out.println("Operation result : "+ltr_char.isLetter(ltr_char));
	    
	    //The method from Character class called directly on object
	    System.out.println("Operation result : "+ltr_char.hashCode());
	    System.out.println("Operation result : "+ltr_char.toString());
		/*
		for(int counter=0; counter<lab_word.length(); counter++){
				System.out.print(lab_word.charAt(counter)+" ");
				System.out.println(lab_word.indexOf(counter));
		}
		*/
		//foreach logic for strings
		for(char word : lab_word.toCharArray()){
			System.out.println("Word is:"+word);
		}
		
		System.out.print("Dear, \nPassagengers welcome to flight\tPA-302 which is accompanie"
				+ " 3 \rpilots \b and 5 board \f personel \\ \' \" \n");
			
		byte char_a_count = 0;
	     
		
		System.out.println("Is char is digit : "+std_name1.charAt(2));
		System.out.println("Is char is digit : "+std_name1.length());
		
		for(int counter=0; counter<std_name1.length();counter++){
			if(Character.toLowerCase(std_name1.charAt(counter))=='a')
				char_a_count++;
		}
		System.out.println("Number of As : "+char_a_count);
		//if(num_char.isDigit(0)){
			
		//}
		System.out.println("Check Hello char h:"+checkCharacter("Hello",'h'));
		
		
		//comparing Strings
		String str_msg1="Hello";
		String str_msg2="Hello";
		String str_msg3= new String("Hello");
		String str_msg4= new String("Hello");
		
		//boolean result = str_msg1 == str_msg2;
		System.out.println("1. result : "+(str_msg1 == str_msg2));           //True
		System.out.println("2. result : "+(str_msg1.equals("Hello")));       //True 
		System.out.println("3. result : "+(str_msg1.equals(str_msg3)));      //True
		System.out.println("4. result : "+(str_msg3.compareTo((str_msg4)))); // 0
		System.out.println("5. result : "+(str_msg3.equals(str_msg4)));      //True
		System.out.println("6. result : "+(str_msg3.equals("Hello")));       //True
		System.out.println("7. result : "+(str_msg3 == str_msg4));           //False 
		
		
		String some = "some string";
		String other = "some string";
		boolean identical = some == other;
		System.out.println("Identity : "+identical);
		
		boolean equal = some.equals(other);
		System.out.println("Equal : "+equal);
		
		Random rand = new Random(); 
		System.out.println("Random value : "+rand.nextInt(5));
		System.out.println("Next float value: " + ((4)*rand.nextFloat()));
		
		System.out.println("Message with digits : "+checkDigits("hel1lo"));
		System.out.println("Message without digits : "+checkDigits("hello"));
	
		double num1=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter double number : ");
		num1=scn.nextDouble();
		System.out.println("Entered number is : "+num1);
	}
	
	public static boolean checkDigits(String message){
		boolean check = false;
		
		for(char word: message.toCharArray()){
			if(Character.isDigit(word)){
				check=true;
				break;
			}
		}
		return check;
	}
	
	
	//String and character to search it returns true/false
	public static boolean checkCharacter(String message, char chr_check){
		boolean check = false;
		for(int counter=0; counter<message.length();counter++){
			if(message.charAt(counter)==chr_check){
				check = true;
			    break;
			}
		}
		return check;
	}

}
