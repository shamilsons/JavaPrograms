package part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollectionExample {
	public static void main(String[] args) {
		  //This is how to declare HashMap
	      HashMap<Integer, String> sduGroup = new HashMap<Integer, String>();

	      //Adding objects to HashMap in terms of key-value
	      sduGroup.put(110, "Azamat Kibekbayev");
	      sduGroup.put(111, "Yernar Serek");
	      sduGroup.put(112, "Aigerim Zhunussova");
	      sduGroup.put(113, "John Black");
	      sduGroup.put(114, "Anuar Idrisov");

	      //Display contents of the HashMap by using Iterator
	      Set set = sduGroup.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.println("KEY is: "+ mentry.getKey() + " - VALUE is: "+mentry.getValue());
	      }

	      //Get values based on key
	      String var= sduGroup.get(113);
	      System.out.println("Value at index 113 is: "+var);

	      //Remove values based on key
	      sduGroup.remove(112);
	      System.out.println("\nHashMap key and values after removal:");
	      Set set2 = sduGroup.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.println("KEY is: "+mentry2.getKey() + " - VALUE is: "+mentry2.getValue());
	       }
	}
}
