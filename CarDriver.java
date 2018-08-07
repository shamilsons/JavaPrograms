
interface operateCar{
	public void driveCar();
	public void stopCar();
}

class Human2{
	String name, surname;
	
	Human2(){
		this.name="None";
		this.surname="None";
	}
	
	public void showInfo(){
		System.out.println("Name:"+this.name+" Surname:"+this.surname);
	}
}

class Assan extends Human2 implements operateCar{
	private int age;
	
	Assan(int age){
		this.age=age;
		this.name="Assan";
		this.surname="Agibetov";
	}
	
	public void driveCar(){
		System.out.println("Assan is driving the car");
	}
	
	public void stopCar(){
		System.out.println("Assan has crushed the poor car");
	}
}

class Assel extends Human2 implements operateCar{
	private int age;
	
	Assel(int age){
		this.age=age;
		this.name="Assel";
		this.surname="Boronbay";
	}
	
	public void driveCar(){
		System.out.println("This method called from Assel class");
		System.out.println("Assel is driving the car");
	}
	
	public void stopCar(){
		System.out.println("This method called from Assel class");
		System.out.println("Assel has crushed the poor car");
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return this.age;
	}
}

public class CarDriver {

	public static void main(String[] args) {
		Assel nicegirl=new Assel(25);
		//Private attributes cannot be accessed directly
		nicegirl.setAge(30);
		System.out.println("Assel age is:"+nicegirl.getAge());
		nicegirl.showInfo();
	}
}
