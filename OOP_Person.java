/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date and venue : 17.11.2017 / SDU (Suleyman Demirel University)
 * Description : Concept of polymorphism, interface and inheritance.   
 * NOTE: Calculator application implemented in OOP way
 */

//Importing needed classes for the program
import java.util.Arrays;

interface personAction{
	public void speak();
	public void eat();
}

//Parent or base class
class Person{
	//Attributes (alias variables)
	public String name_surname;
	protected char gender;
	private int age;
	
	//Default constructor
	Person(){
		System.out.println("Default person constructor called");
		this.name_surname="None";
		this.gender='U';
		this.age=-1;
	}
	
	//Parametric constructor - example of polymorphism
	Person(String name_surname){
		this.name_surname=name_surname;
		System.out.println("Parametric person constructor ...");
	}
	
	Person(String name_surname, char gender, int age){
		this.name_surname=name_surname;
		this.gender=gender;
		this.age=age;
		System.out.println("Parametric person constructor ...");
	}
	
	//Private age attribute setter 
	public void setAge(int age){
		this.age=age;
	}
	
	//Private age attribute getter 
	public int getAge(){
		return this.age;
	}
	
	public void showDetails(){
		System.out.println("Name and Surname:"+this.name_surname);
		System.out.println("Gender:"+this.gender);
		System.out.println("Age:"+this.age);
	}
	
	//Overloading 
	public void showDetails(int code){
		if(code==103){
			System.out.println("Name and Surname:"+this.name_surname);
			System.out.println("Gender:"+this.gender);
			System.out.println("Age:"+this.age);
		} else {
			System.out.println("Wrong code cannot display info ...");
		}
	}	
}

class Student101 extends Person implements personAction{
	private double gpa;
	
	Student101(){
		this.gpa=0.0;
	}
	
	//Overriding 
	public void showDetails(){
		System.out.println("GPA:"+this.gpa);
		super.showDetails();
	}
	
	//Private gpa attribute setter 
	public void setGPA(double gpa){
		//Check point
		if(gpa>=0.0 && gpa<=4.0)
			this.gpa=gpa;
		else {
			System.out.println("Wrong GPA range ...");
			this.gpa=-1;
		}
	}
	
	//Private gpa attribute getter 
	public double getGPA(){
		return this.gpa;
	}
	
	public void speak(){
		int num1=10,num2=30, result;
		result=num1+num2;
		System.out.println("Students please DONOT SPEAK ..."+result);
	}
	
	public void eat(){
		System.out.println("Students please DONOT EAT MUCH ...");
	}
}

class Doctor extends Person implements personAction {
	private String area;
	
	Doctor(String area){
		this.area=area;
	}
	
	//Private area attribute setter 
	public void setArea(String area){
		if(area=="Gastroenterology" || area=="Uorlogy")
			this.area=area;
		else 
			this.area="No applicable";
	}
	
	//Private gpa attribute getter 
	public String getArea(int code){
		if(code==101)
			return this.area;
		else
			return "Wrong code access denied ...";
	}
	
	public void showDetails(){
		System.out.println("Area:"+this.area);
		super.showDetails();
	}
	
	public void speak(){
		int num1=10,num2=30, result;
		result=num1*num2;
		System.out.println("Doctor please SPEAK ..."+result);
	}
	
	public void eat(){
		System.out.println("Doctor please EAT MUCH ...");
	}
}

public class OOP_Person {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student101 std101 = new Student101();
		std101.name_surname="Asan Agybetov";
		std101.gender='M';
		std101.setAge(24);
		std101.setGPA(2.45);
		System.out.println("GPA:"+std101.getGPA());
		std101.showDetails();
	
		Doctor doc101= new Doctor("Urology");
		System.out.println("Get area of doctor:"+doc101.getArea(101));
	
		std101.speak();
		doc101.speak();
		
		Person p= new Person();
		p.setAge(10);
		p.getAge();
	}
}
