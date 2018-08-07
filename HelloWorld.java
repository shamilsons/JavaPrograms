/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 04.09.2017
 * Description : Variables, data types and type casting   
 */

public class HelloWorld {
	public static void main(String[] args) {
		
		int[] numberBag1 = new int[5];
		numberBag1[0]=20;
		numberBag1[4]=numberBag1[0]+2;
		
		float []numberBag2 = new float[10];
		
		Integer numberBag3[]={10,22,31,41,15};
		
		String[] messageSet1=new String[3];
		messageSet1[0] = "Hello my name is Asan";
		messageSet1[1] = "I live in Astana";
		messageSet1[2] = "My favorite color is blue";
		
		int counter = 0;
		
		printArrayContents(numberBag3);
		//numberBag1=java.util.Arrays.sort(numberBag3);
		//printArrayContents();
		/*
		System.out.println("=== Array contents as follows ===");
		while(counter<numberBag1.length){
			System.out.println(counter+ ".index element is:"+numberBag1[counter]);
			counter++;
		}
		
		
		int size;
		java.util.Scanner getSize = new java.util.Scanner(System.in);
		System.out.print("Enter size for the array:");
		size=getSize.nextInt();
		int[] numberSet = new int[size];
		
		for(counter=0; counter<numberSet.length; counter++){
			System.out.print("Enter value for array element:");
			numberSet[counter] = getSize.nextInt(); 
		}
		
		counter=0;
		while(counter<numberSet.length){
			System.out.println(counter+ ".index element is:"+numberSet[counter]);
			counter++;
		}
		
		*/
		
		/*
		//Variables declarations
		int num1=10, num2=20;
		
		char gender = 'F';
		String name_surname="Anara Myrzagulova";
		
			
		//The below statement prints the message (this statement will not compile)
		System.out.println("Hello world");
		System.out.println("Welcome to Java PL");
		System.out.println("Result is : "+(21+54));
		//Increment pre
		//System.out.println("Result:"+((++num1)+(++num2)));
		System.out.println("1.EQ:"+(10-20/2*4+5));
		System.out.println("2.EQ:"+(10+25/2*2-15));
		
		//The logic of switch-case as follows
		// It will check the operationalNumber if it equals to any case value
		//if operationalNumber equals to particular value, that case is going to run
		//This variable is going to be used inside switch-case
		int operationalNumber = 20;
		float operationalNumber2 = 20.7f;	
		
		switch(operationalNumber){
		case 20:
			System.out.println("Customer got 5% discount");
			break;
			
		case 50:
			System.out.println("Customer got 8% discount");
			break;
		
		case 100:
			System.out.println("Customer got 12% discount");
			break;
		
		default:
			System.out.println("There is no policy for customer discount");
			break;
		}
		*/
	}
	
	public static void printArrayContents(Object[] list){
		int counter;
		for(counter=0; counter<list.length; counter++){
			System.out.print(list[counter]+",");
		}
		
		/*
		/*
		 * Name : Shahriar Shamiluulu
		 * Email : shamilsons@gmail.com
		 * Date and venue : 11.10.2017 / SDU (Suleyman Demirel University)
		 * Description : This program performs operations on students GPA    
		 * 
		 * i) The program randomly generates 10 students gpas b/w 0.0-4.0 inclusive
		 * ii) Find the average, max, min and std for the class
		 * iii) Sort the gpa values in ascending order
		 * iv) Find the number of students of gpas in three groups
		 *      - gpa1 (0.0-1.8) up limit not inclusive
		 *      - gpa2 (1.8-2.8) up limit not inclusive
		 *      - gpa3 (2.8-4.0)
		 * Implement each operation in each method
		 * 
		 * NOTE: Make sure to give a proper names and follow naming conventions
		 */
		
		/*
		//import needed classes
		import java.util.Arrays;
		import java.util.Random;
		import java.util.Scanner;

		public class GPACaseStudy {
			public static void main(String[] args) {
				//declarations of needed variables
				int students_no=0, counter=0, max_limit_gpa=4, min_limit_gpa=0;
				double[] class_gpas;
				
				//Request students no
				Scanner getIntData=new Scanner(System.in);
				System.out.print("Enter student class number:");
				students_no = getIntData.nextInt();
				
				//initialize the gpa class array
				class_gpas = new double[students_no];
						
				Random gnrGPA= new Random();
				
				while(counter<class_gpas.length){
					class_gpas[counter]=(max_limit_gpa-min_limit_gpa)*gnrGPA.nextDouble();
					counter++;
				}
				
				//Show generated class gpas
				System.out.println("Class GPAs : "+Arrays.toString(class_gpas));
				//displayGPA(class_gpas);
				
				if(class_gpas.length>0){
					classStatistics(class_gpas);
				}
			}
			
			public static void displayGPA(double[] gpa_list){
				System.out.println("=== CLASS GPAs ===");
				for(int counter=0; counter<gpa_list.length; counter++)
					System.out.println((counter+1)+" student no GPA :"+gpa_list[counter]);
			}
			
			public static void classStatistics(double[] gpa_list){
				double total_gpa=0;
				double average_gpa=0;
				
				System.out.println("=== CLASS STATISTICS ===");
				
				//Code to calculate average
				for(int counter=0; counter<gpa_list.length; counter++)
					total_gpa=total_gpa+gpa_list[counter];
				
				average_gpa=total_gpa/gpa_list.length;
				System.out.println("Mean:"+average_gpa);
				
				//Code to calculate population standard deviation
				double values_sum=0;
				for(int counter=0; counter<gpa_list.length; counter++)
					values_sum=values_sum+Math.pow(gpa_list[counter]-average_gpa, 2);
				
				System.out.println("STDP:"+(Math.sqrt(values_sum/gpa_list.length)));
			}
			
			public static void minmaxGPA(double[] gpa_list){
				System.out.println("=== MIN-MAX ===");
				
			}
			
			public static void gpaIntervals(double[] gpa_list){
				System.out.println("=== INTERVALS ===");
				
			}
		}
		*/
	}
}