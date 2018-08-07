/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 29.09.2017 / SDU (Suleyman Demirel University)
 * Description : This programs test character and string methods   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

import java.util.*;

public class ChrStrOpts {

	public static void main(String[] args) {
		/*
		//Tests escape sequences
		System.out.println("Linefeed       : " + "ABCDE\nFGHIJ");
	    System.out.println("Single Quote   : " + "ABCDE'FGHIJ");
	    System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
	    System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
	    System.out.println("Horizontal Tab : " + "ABCDE\tFGHIJ");
	    System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");
	    System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
	    System.out.println("Formfeed       : " + "ABCDE\fFGHIJ");
	    */
	    
	    char gender = 'm';
	    Character num_chr= new Character('9');
	    Character ltr_chr= new Character('a');
	    
	    System.out.println("Upper case letter : "+Character.toUpperCase(gender));
	    System.out.println("Upper case letter : "+ltr_chr.toUpperCase(ltr_chr));
	    System.out.println("Upper case letter : "+Character.isDigit(gender));
	    System.out.println("Upper case letter : "+Character.isDigit(num_chr));
	    
	    //The method from Character class called directly on object
	    System.out.println("Operation result : "+ltr_chr.hashCode());
	    System.out.println("Operation result : "+ltr_chr.toString());
	    
	    String lab_word = "Kalamburbek";
	    System.out.println("Operation result : "+lab_word.toUpperCase());
	    char letter = lab_word.charAt(0);
	    System.out.println("Operation result : "+Character.toLowerCase(letter));
	    System.out.println("Search char : "+checkChar("KKKKTTTFFF", 't'));
	    //System.out.println("Split : "+);
	    
	    for(String ltr: lab_word.split("a")){
	    	System.out.println("Letter : "+ltr);
	    }
	    
	    System.out.println("Substring function : "+Arrays.toString(lab_word.split("h")));
	    int max=11, min=2;
	    System.out.println("Random number Math.random : "+((int)((max-min)*Math.random())+min));
	}
	
	public static int checkChar(String message, char search_char){
		int found = 0;
		//for-each logic to traverse the string
		System.out.println("Message : "+message+" To set char : "+message.toCharArray());
		message = message.toLowerCase();
		for(char ltr: message.toCharArray()){
			if(ltr==search_char){
				found=1;
			    break;
			}
		}
		return found;
	}
}
