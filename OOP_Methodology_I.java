/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 26.10.2017 / SDU (Suleyman Demirel University)
 * Description : OOP methodology I.   
 * NOTE: Make sure to give a proper names and follow naming conventions
 */

//Importing needed classes for the program
import java.util.Arrays;

class Human{
	String name, surname;
	char gender;
	int age;
	
	public void showDetails(){
		System.out.println("\n=== HUMAN DETAILS===");
		System.out.println("Name:"+this.name);
		System.out.println("Surname:"+this.surname);
		System.out.println("Gender:"+this.gender);
		System.out.println("Age:"+this.age);
	}
}

//Complex data type (class) called Student
//Encapsulation
/*
class Student {
	String name, surname, course;
	double gpa;
	
	//base constructor
	Student(){
		this.name="No name set";
		this.surname="No surname set";
		this.course="No course set";
		this.gpa=0.01;
	}
	
	public void showDetails(){
		System.out.println("Name:"+this.name);
		System.out.println("Surname:"+this.surname);
		System.out.println("Course:"+this.course);
		System.out.println("GPA:"+this.gpa);
	}
}
*/

//Creating a class car and encapsulating all information inside
class Car{
	//Attributes which are belong to class
	String model, color;
	int year, millage;
	double price;
	
	//Default constructor
	Car(){
		this.model="Toyota Corolla";
		this.color="Red";
		this.year=1998;
		this.millage=230000;
		this.price=2000;
	}
	
	//Another parametric constructor
	Car(int millage){
		this.millage=millage;
	}
	
	//Parametric constructor
	Car(String model){
		this.model=model;
	}
	
	void showDetails(){
		System.out.println("Model:"+this.model);
		System.out.println("Color:"+this.color);
		System.out.println("Year:"+this.year);
		System.out.println("Millage:"+this.millage);
		System.out.println("Price:"+this.price);
		System.out.println("\n");
	}
	
	void checkCarCondition(){
		if(this.year>2005 && this.millage<100000 && this.price>10000){
			System.out.println("CAR CONDITION GREAT");
		} else {
			System.out.println("CAR CONDITION TERRIBLE");
		}
	}
}


public class OOP_Methodology_I {

	public static void main(String[] args) {
		//Instance of car class
		Car car1 = new Car();
		Car car2 = new Car("Chevrolet Camaro");
		
		car1.showDetails();
		car1.checkCarCondition();
		
		car2.color="Black";
		car2.year=2014;
		car2.millage=50000;
		car2.price=25000;
		car2.showDetails();
		car2.checkCarCondition();
		
		Car car3= new Car("Ford Mustang");
		car3.showDetails();
		car3.price=13000;
		car3.year=2015;
		car3.millage=30000;
		car3.checkCarCondition();
		/*
		//Instance of student class
		Student std1= new Student();
		std1.name="Azamat";
		std1.surname="Serek";
		std1.course="4 year IS";
		std1.gpa=3.82;
		
		Student std2= new Student();
		std2.name="Nazira";
		std2.surname="Beko";
		std2.course="3 year CS";
		std2.gpa=3.91;
		
		std1.showDetails();
		std2.showDetails();
		
		Student std3= new Student();
		std3.showDetails();
		std3.name="ABC";
		std3.surname="XYZ";
		std3.course="1 year CS";
		std3.gpa=1.51;
		std3.showDetails();
		
		
		//Created an instance of Human class
		Human azamat_serek= new Human();
		Human ainur_zhapassova= new Human();
		
		//Human details
		/*
		System.out.println("Name:"+azamat_serek.name);
		System.out.println("Surname:"+azamat_serek.surname);
		System.out.println("Gender:"+azamat_serek.gender);
		System.out.println("Age:"+azamat_serek.age);
		*/
		
		//Setting all parameters for the human class
		/*
		azamat_serek.name="Azamat";
		azamat_serek.surname="Serek";
		azamat_serek.gender='M';
		azamat_serek.age=25;
		
		ainur_zhapassova.name="Ainur";
		ainur_zhapassova.surname="Zhapassova";
		ainur_zhapassova.gender='F';
		ainur_zhapassova.age=26;
		/*
		System.out.println("Name:"+azamat_serek.name);
		System.out.println("Surname:"+azamat_serek.surname);
		System.out.println("Gender:"+azamat_serek.gender);
		System.out.println("Age:"+azamat_serek.age);
		*/
		//azamat_serek.showDetails();
		//ainur_zhapassova.showDetails();
	}

}
