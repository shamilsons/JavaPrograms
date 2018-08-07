package part2;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListCollectionExample {
	public static void main(String[] args) {
		  //Creating ArrayList that holds strings objects
		  List<String> courseINF104 = new ArrayList<String>();

		  //This is how elements added to the array list
		  courseINF104.add("Miras");
		  courseINF104.add("Yernar");
		  courseINF104.add("Aigerim");
		  courseINF104.add("Yengilik");
		  courseINF104.add("Izzatilla");
		  courseINF104.add("Aigerim");
		  
		  System.out.println("Exist or not: "+courseINF104.contains("Aigerim1"));
		  
		  //Displaying array list contents
		  System.out.println("Array list has following students:"+courseINF104);

		  //Add element at the given index
		  courseINF104.add(0, "Vera");
		  courseINF104.add(1, "Justin Biber");

		  //Remove elements from array list like this
		  courseINF104.remove("Aigerim");
		  courseINF104.remove("Yengilik");

		  System.out.println("Currently array list contains:"+courseINF104);

		  //Remove element at a given index (remember indexes starts at 0)
		  courseINF104.remove(2);

		  System.out.println("Currently array list contains:"+courseINF104);
	}
}
