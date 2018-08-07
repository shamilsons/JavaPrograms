/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 28.09.2017 / SDU (Suleyman Demirel University)
 * Description : This programs test string methods   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */
import java.io.*;

public class StringOperations {
	public static void main(String[] args) {
		
		  // create 2 char primitives ch1, ch2
	      char ch1, ch2;

	      // assign values to ch1, ch2
	      ch1 = '9';
	      ch2 = 'V';

	      // create 2 boolean primitives b1, b2
	      boolean b1, b2;

	      // assign isDigit results of ch1, ch2 to b1, b2
	      b1 = Character.isDigit(ch1);
	      b2 = Character.isDigit(ch2);

	      String str1 = ch1 + " is a digit is " + b1;
	      String str2 = ch2 + " is a digit is " + b2;

	      // print b1, b2 values
	      System.out.println( str1 );
	      System.out.println( str2 );
	      
		/*
		int counter = 200;
		float pi_num = 3.14f;
		String name = "Math Operation";
		
		System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", pi_num, counter, name+" \n");  
		
		
		String message;
		message = String.format("The value of the float variable is " +
		                   "%f, while the value of the integer " +
		                   "variable is %d, and the string " +
		                   "is %s", pi_num, counter, name);
		System.out.println(message);
		
		/*
		  String title = new String("Welcome-to-INF-103-course");
	      System.out.println("Return Value :" );      
	      
	      for (String retval: title.split("-")) {
	         System.out.println(retval);
	      }
		
	      char char_from_title = title.charAt(6);
	      System.out.println("Chart at position 6 : "+char_from_title);
	    
		  String str1 = "Strings are immutable";
	      String str2 = new String("Strings are immutable");
	      String str3 = new String("Integers are not immutable");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println(result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println(result);
	      
		
		String title = new String("   Welcome to INF-103 course   ");

	    System.out.print("Return Value :" );
	    System.out.println(title.trim() );
	   */
	}
}

