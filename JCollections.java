package part2;

//Importing needed classes for using collections
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

//import java.util.Set;
//import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


//Student class implementation (complex data-type)
class Student{
	public String name_surname;
	protected int sid;
	
	private double gpa;
	private int coursegrade;
	
	//One parametric constructor
	Student(String name_surname, int sid, double gpa){
		//this keyword is a reference to itself (object that has been called) 
		this.name_surname=name_surname;
		this.sid=sid;
		this.gpa=gpa;
	}
	
	//ShowDetails method which displays information about set attributes 
	public void showDetails(){
		System.out.println("=== STUDENT DETAILS ===");
		System.out.println("Student ID:"+this.sid);
		System.out.println("Name and Surname:"+this.name_surname);
		System.out.println("GPA:"+this.gpa);
	}
	
	//Private gpa attribute setter 
	public void setGPA(double gpa){
		//Check point for gpa ranges
		if(gpa>=0.0 && gpa<=4.0)
			this.gpa=gpa;
		else {
			System.out.println("Wrong GPA range ...");
			this.gpa=0.0;
		}
	}
	
	//Private gpa attribute getter 
	public double getGPA(){
		return this.gpa;
	}
	
	//Private coursegrade attribute setter 
	public void setGrade(int grade){
		//Check point for gpa ranges
		if(grade>=0 && grade<=100)
			this.coursegrade=grade;
		else {
			System.out.println("Wrong course grade ...");
			this.coursegrade=0;
		}
	}
	
	//Private gpa attribute getter 
	public int getGrade(){
		return this.coursegrade;
	}
}

public class JCollections {
	public static void main(String[] args) {
		//Create three students by initializing the Student class
		Student stdTemp;
		Student std1= new Student("Akram Tursunov", 1001, 2.8);
		std1.setGrade(80);
		//std1.name_surname="AKRAM TURSUNOV";
		//std1.sid=10001;
		//std1.showDetails();
		
		Student std2= new Student("Madina Kalybayeva", 1002, 3.3);
		std2.setGrade(70);
		
		//std2.showDetails();
		Student std3= new Student("Ruslan Kamarev", 1003, 2.5);
		std3.setGrade(90);
		//std3.showDetails();
		
		Student std4= new Student("Aziza Kamareva", 1003, 3.7);
		std4.setGrade(65);
		
		Student std5= new Student("Syrym Zharkyn", 1003, 3.7);
		std5.setGrade(75);
		
		Student std6= new Student("Tair Akhmedov", 1003, 3.7);
		std6.setGrade(55);
		
		ArrayList<Student> grp1EN03A = new ArrayList<Student>();
		grp1EN03A.add(std1);
		grp1EN03A.add(std2);
		grp1EN03A.add(std3);
		
		ArrayList<Student> grp1EN03B = new ArrayList<Student>();
		grp1EN03B.add(std4);
		grp1EN03B.add(std5);
		grp1EN03B.add(std6);
		//grpClass.add(22);
		//grpClass.add("Hello");
		//Add student 4 to index location 0 in arraylist
		//grpClass.add(0,std4);
		
		
		HashMap<String, ArrayList <Student>> classSet = new HashMap<String, ArrayList <Student>>();
		classSet.put("grp1EN03A", grp1EN03A);
		classSet.put("grp1EN03B", grp1EN03B);
		//System.out.println("Nested arraylist is:"+classSet.get(0).get(0).getGPA());
		
		int total_grades=0;
		for(int index=0; index<grp1EN03A.size();index++){
			total_grades=total_grades+classSet.get("grp1EN03A").get(index).getGrade();
		}	
		System.out.println("Average grade for group 1EN03A:"+(total_grades/grp1EN03A.size()));
		
		
		//1.Write the code to access efficietly the students details (std1, std3) for two groups
		/*2. - Add to Student class private coursegrade attribute
		     - Initialize 4 students with coursegrades (0-100) 
		     - Make structure with MAP for two groups with 3 students 
		                                   ("1EN03A" - ArrayList of students)
		     - Through the Map collection call the groups and show the average for the 
		       coursegrade  
		       
		*/
		//grpClass.add("Hello World");
		
		//System.out.println("Display student:"+grpClass.get(0).name_surname);
		//grpClass.remove(std2);
		//grpClass.remove(2);
		
		
		//System.out.println("Nested arraylist is:"+groupNames.get(0).get(0).name_surname);
		/*
		//Array List that add the objects into the list
		ArrayList<Student> grp1EN03A = new ArrayList<Student>(); 
		grp1EN03A.add(std1); //0 index
		grp1EN03A.add(std2); //1 index
		
		ArrayList<Student> grp1EN03B = new ArrayList<Student>(); 
		grp1EN03B.add(std3); //2 index
		grp1EN03B.add(std4); //3 index
		//stdGroup.add("Hello World"); //5 index
		//stdGroup.add(22); 
		
		List<ArrayList <Student>> groupNames= new ArrayList<ArrayList <Student>>();
		groupNames.add(grp1EN03A);
		groupNames.add(grp1EN03B);
		
		System.out.println("Nested arraylist is:"+groupNames.get(0).get(0).name_surname);
		
		
		int counter=0;
		for(Student std: stdGroup) {
			System.out.println(counter+".index is:"+std.name_surname+" gpa:"+std.getGPA());
			counter++;
		}
		
		System.out.println("Searching for particular student ...");
		for(int index=0; index<stdGroup.size(); index++){
			//get(int index) -> gets particular object at specified index
			if(stdGroup.get(index).sid==1003)
				System.out.println("Student exists");
		}
		
		//contains check according to provided object
		if(stdGroup.contains(std2))
			System.out.println("Yes it contains");
		
		
		 * TASK: Implement ArraList (group names-1EN03A, 1EN03B) inside ArrayList (3 students inside particular group) 
		 *       Retrieve the students' details from the group and display them
		 */
		
		/*	
		//Avoid duplicates
		Set hashSetGroup = new HashSet(); 
		hashSetGroup.add(std1);
		hashSetGroup.add(std1);
		hashSetGroup.add(std2);
		hashSetGroup.add(std3);
	
		System.out.println("===HashSet Before===");
		displayContents(hashSetGroup);
		System.out.println("===HashSet After===");
		
		Map<String,Student> mapGroup = new HashMap<String,Student>(); 
		mapGroup.put("class101", std1); 
		mapGroup.put("class102", std2); 
		mapGroup.put("class101", std3); 
		
		System.out.println("===HashMap Before===");
		mapGroup.get("class101").showDetails();
		System.out.println("===HashMap After===");
		
		for(int index=0; index<stdGroup.size(); index++){
			//stdTemp=stdGroup.get(index);
			//System.out.println("Name and Surname:"+stdTemp.name_surname);
			//System.out.println("GPA:"+stdTemp.getGPA());
			System.out.println("GPA:"+stdGroup.get(index).getGPA());
		}		//try {
			displayContents(stdGroup);
			stdGroup.remove(3);
			System.out.println("=== After remove operation ===");
			displayContents(stdGroup);
		/*} catch(Exception e) {
			System.out.println("Exception occurred ..."+e.toString());
			System.out.println("Details of exception ..."+e.getMessage());
		}*/
		
	}
	
	public static void displayContents(Collection call){
		Student stdTemp;
		Iterator<Student> groupItr = call.iterator();
		while(groupItr.hasNext()){
			stdTemp=groupItr.next();
			System.out.println("Name and Surname:"+stdTemp.name_surname);
			System.out.println("GPA:"+stdTemp.getGPA());
			//System.out.println("\n");
		}
	}
}
