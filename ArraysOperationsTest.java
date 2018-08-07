import java.awt.font.NumericShaper;
import java.util.Arrays;

/* test changes
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 05.10.2017 / SDU (Suleyman Demirel University)
 * Description : This programs tests different arrays structures   
 
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

public class ArraysOperationsTest {

	public static void main(String[] args) {
		//Array declarations
		int counter = 0;
		int numberSet1[]=new int[3];
		int []numberSet4=new int[3];
		
		//1. way of printing arrays
		for(counter=0; counter<numberSet1.length; counter++)
		{
			System.out.println(counter+".index value is:"+numberSet1[counter]);
		}
		
		numberSet1[2]=10;
		numberSet1[1]=numberSet1[2]/2;
		numberSet1[0]=-20;
		
		//2. way of printing arrays
		System.out.println(java.util.Arrays.toString(numberSet1));
		
		//initialize the size of the array in parameteric mode
		int size=0;
		java.util.Scanner getSize= new java.util.Scanner(System.in);
		
		System.out.print("Enter size of the array:");
		size=getSize.nextInt();
		int numberSet2[] = new int[size];
		
		counter=0;
		while(counter<numberSet2.length){
			System.out.print("Enter value for "+counter+" the element:");
			numberSet2[counter]=getSize.nextInt();
			counter++;
		}
		
		System.out.println(java.util.Arrays.toString(numberSet2));
		//Sorting the array in ascending order from small to big
		//java.util.Arrays.sort(numberSet2); //behind it means numberSet2=Array.sort(numberSet2)
		//System.out.println(java.util.Arrays.toString(numberSet2));
		
		//numberSet2=addValue(numberSet2, 300);
		//System.out.println(java.util.Arrays.toString(numberSet2));
		
		int found_index=searchArrayValue(numberSet2, 23);
		if(found_index!=-1){
			System.out.println("Index is:"+found_index);
		} else {
			System.out.println("Arrays does not contain searched value");
		}
		
		/*
		//Declare arrays	
		int size;
		int[] numberSetInt1;
		
		float[] numberSetFloat1= new float[5];
		
		//Direct import of the needed classes
		java.util.Scanner getSize = new java.util.Scanner(System.in); 
		System.out.print("Enter the size of the array:");
		size=getSize.nextInt();
		
		//In order to make parametric initialize array after getting the size value
		numberSetInt1 = new int[size];
		
		for(int counter=0; counter<size; counter++){
			System.out.print("Enter next element for index "+counter+":");
			numberSetInt1[counter]=getSize.nextInt();
		}
			
		//numberSetInt1[2]=20;
		System.out.println("=== Array is not sorted ===");
		printArrayContents(numberSetInt1);
		//numberSetInt1 = addValue(numberSetInt1,500);
		printArrayContents(addValue(numberSetInt1,500));
		//printArrayContents(numberSetFloat1);
		System.out.println("=== Array is sorted ===");
		//Array sort is sorting in ascending order = from small to big
		Arrays.sort(numberSetInt1); //numberSetInt1=Arrays.sort(numberSetInt1) ???
		printArrayContents(numberSetInt1);
		*/
	}
	
	//Search a value in the int array and returs the index if found
	public static int searchArrayValue(int[] arrayList, int value){
		int index=-1;
		int counter=arrayList.length-1;
		
		while(counter>=0){
			if(arrayList[counter]==value)
				index=counter;
			counter--;
		}
		
		return index;
	}
	
	//prints the contents of int array
	public static void printArrayContents(int[] arrayList){
		int counter=0;
		System.out.println("=== THE CONTENTS OF ARRAY ===");
		while(counter<arrayList.length){
			System.out.println(counter+". index is : "+arrayList[counter]);
			counter++;
		}
	}
	
	public static int[] addValue(int[] arrayList, int value){
		int counter=0;
		while(counter<arrayList.length){
			arrayList[counter]+=value;
			//System.out.println(counter+". index is : "+);
			counter++;
		}
		return arrayList;
	}
}
