package part2;

/*
import java.io.IOException;
import java.util.Scanner;

public class Testarea {
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("scores.txt");
		if (file.exists()) {
			System.out.println("File exists at path:"+file.getAbsolutePath());
			
			//Create a Scanner for the file
			Scanner input = new Scanner(file);
			
			//Read data from a file
			while (input.hasNext()) {
				String first_last_name = input.next();
				String mi = input.next();
				int score = input.nextInt();
				System.out.println(first_last_name+" "+mi+" "+score);
			}
			
			// Close the file
			input.close();
			System.exit(1);
		}
		// Create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		// Write formatted output to the file
		output.print("Azamat Serek ");
		output.println(90);
		output.print("Aigerim Zhunussova ");
		output.println(85);
		
		// Close the file
		output.close();
		System.out.println("Program completed ...");
	}
}
*/

//importing needed classes
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

class Car {
  //attributes of object Car
  public String model;
  public int milage;

  //parametric constructor
  public Car(String model,int milage){
      this.model = model;
      this.milage = milage;
  }
}

//main class where car class will be initialized
public class Testarea {
  public static void main(String[] args) {
      //using hashSet to hold cars as objects
      HashSet<Car> setOfCars = new HashSet<>();

      Car car1 = new Car("BMW",17000);
      Car car2 = new Car("Toyota",70000);
      Car car3 = new Car("Tesla",56000);
      Car car4 = new Car("Nissan",30002);
      Car car5 = new Car("Hundai",35000);

      setOfCars.add(car1);
      setOfCars.add(car2);
      setOfCars.add(car3);
      setOfCars.add(car4);
      setOfCars.add(car5);

      checkMilage(setOfCars);
  }

  public static void checkMilage(HashSet<Car> setOfCars){

      Iterator<Car> it = setOfCars.iterator();

      int counter1 = 0;
      int counter2 = 0;
      int counter3 = 0;

      for (Car car : setOfCars){
          int milage = car.milage;

          System.out.println(car.model);
          if (milage > 10000 && milage <= 30000)
              counter1++;
          else if(milage > 30000 && milage <= 70000)
              counter2++;
          else if (milage > 70000 && milage <= 120000)
              counter3++;
      }
      System.out.println(counter1 + " Cars in range from 10000 to 30000");
      System.out.println(counter2 + " Cars in range from 30000 to 70000");
      System.out.println(counter3 + " Cars in range from 70000 to 120000");
  }
}

