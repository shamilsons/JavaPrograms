/*
 * Author: Shahriar Shamiluulu
 * Date: 10:26 - 03.11.2015
 * Name:FUMEDSYS - version: 1.1
 * Description: This program performs basic Molecular Biology and Genetics operations 
 */

import java.util.Random;
import java.util.Scanner;

//Gastroenterology area no is: 101
//Treatment no is: 1001

//Interface makes sure that all classes who implements it, must define the
//methods inside the interface
interface Details{
	//Display information about the object of particular class
	public void showDetails();
}


//The base(parent) class for Patient and Doctor (child) classes
class Human implements Details{
	public String name, surname; 
	public char gender;
	public int age;
	protected String email, address;
	private int ssno;
	
	Human(){
		this.name="John";
		this.surname="Keneddy";
		this.gender='M';
		this.age=80;
		this.email="john.keneddy@usa.gov";
		this.address="White House";
		this.ssno=123456789;
	}
	
	Human(String name, String surname, char gender, int age, String email, String address, int ssno){
		this.name=name;
		this.surname=surname;
		this.gender=gender;
		this.age=age;
		this.email=email;
		this.address=address;
		this.ssno=ssno;
	}
	
	//Setter and getter methods for SSNO attribute
	public void setSSNO(int ssno){
		this.ssno=ssno;
	}
	
	public int getSSNO(){
		return this.ssno;
	}
	
	public void showDetails(){
		System.out.println("Name:"+name+"\nSurname:"+surname+"\nGender:"+this.gender+"\nAge:"+this.age+"\nSSNO:"+this.getSSNO()+"\nEmail:"+this.email+"\nAddress:"+this.address);
	}
}

class MedDATA implements Details{
	public float rbc, plt, lmp;
	public String SBT, HP;
	public String PMT;
	
	MedDATA(){
		genMedDATA();
	}
	
	public void genMedDATA(){
		Random rndGenerator = new Random();
		
		//RBC attribute
		int min=3, max=8;
		this.rbc= ((max-min)*rndGenerator.nextFloat())+min;
		
		//PLT attribute
		min=3;
		max=11;
		this.plt= ((max-min)*rndGenerator.nextFloat())+min;
		
		//LMP attribute
		min=3;
		max=8;
		this.lmp= ((max-min)*rndGenerator.nextFloat())+min;
		
		//SBT attribute
		this.SBT=(rndGenerator.nextInt(2)==1?"Positive":"Negative");
		
		//HP attribute
		this.HP=(rndGenerator.nextInt(2)==1?"Positive":"Negative");
		
		//SNP_ANALYSIS attribute
		int pmt_check=rndGenerator.nextInt(2);
		this.PMT=(pmt_check==0?"NONE":pmt_check==1?"PARTIAL":"TOTAL");
	}
	
	public void showDetails(){
		System.out.println("RBC:"+this.rbc+" PLT:"+this.plt+" LMP:"+this.lmp+" SBT:"+this.SBT+" HP:"+this.HP+" PMT:"+this.PMT);
	}
}


class Patient extends Human implements Details{
	//parameters (by default all the parameters are public) 
	private int ptno;
	protected int trt_no, area_no;
	public MedDATA medData;
	
	//Constructors
	Patient(){
		setPatientAttributes();
	}
	
	Patient(String name, String surname, int age, char gender){
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.gender=gender;
	}
	
	//Setter and getter for patient no
	public int getPTNO(){
		return this.ptno;
	}
	
	public void setPTNO(int ptno){
		this.ptno=ptno;
	}
	
	//Generation of demographic data for the patient
	public void setPatientAttributes(){
		Random rndGenerator = new Random();
		
		String[] name_set={"Mehmet", "Ahmed", "John", "Bill", "Mariam", "Abdurahman", "Hatice", "Shahriar", "Ye Zalika", "Khadi", "Bisaya"};
		String[] surname_set={"Gençaslan", "Shamiluulu", "Sarigul", "Erdogan", "Teme", "Barro", "ibn-İbrahim", "Ndiaye", "India", "China", "Tomson"};
		
		
		//SSNO attribute
		int max=99999, min=10000;
		this.setSSNO(rndGenerator.nextInt((max-min)+1)+min);
		
		//PTNO attribute
		max=9999; min=1000;
		this.setPTNO(rndGenerator.nextInt((max-min)+1)+min);
		
		min=10; max=90;
		this.age=rndGenerator.nextInt((max-min)+1)+min;
		
		//Gender attribute
		this.gender=(rndGenerator.nextInt(2)==1?'F':'M');
		
		max=name_set.length-1;
		min=0;
		this.name=name_set[rndGenerator.nextInt((max-min)+1)+min];
		this.surname=surname_set[rndGenerator.nextInt((max-min)+1)+min];
		
		this.medData=new MedDATA();
	}
	
	public void showDetails(){
		System.out.println("PTNO:"+this.getPTNO()+" Name:"+super.name+" Surname:"+super.surname+" Age:"+super.age+" Gender:"+super.gender+" SSNO:"+this.getSSNO());
	}
	
	public int showDetails(int option){
		if(option==0){
			System.out.println("WARNING MESSAGE: Please enter option");
			return 1;
		} else if(option==1){
			System.out.println("Name:"+this.name);
			return 0;
		} else if(option==2){
			System.out.println("Name:"+this.name+" Surname:"+this.surname);
			return 0;
		} else {
			System.out.println("Name:"+this.name+" Surname:"+this.surname+" Age:"+this.age+" Gender:"+this.gender);
			return 0;
		}
	}
	
}


public class FUMedSys {
	
	//void means it does not return 
	public static void prgMenu(int option){
		//Program menu for FUMEDSYS program
		System.out.println("Welcome to FUMEDSYS-1.1");
		System.out.println("== MENU ==");
		System.out.println("1. Create Patients and Doctors");
		System.out.println("2. Generate medical data");
		System.out.println("3. Process medical data");
		System.out.println("4. Calculate statistics on medical data");
		System.out.println("5. Display program menu");
		System.out.print("6. EXIT");
		if(option==1)
			System.out.print("\nPlease select option:");
	}
	
	//method creates Patients and Doctors 
	public static void createPD(){
		System.out.println("Patients and doctors created");
	}
	
	//method generating medical data
	public static void generateMD(){
		System.out.println("Patients data has been generated");
	}
	
	//method process medical data
	public static void processMD(){
		System.out.println("Patients data has been processed");
	}
	
	//method for showing statistics on medical data
	public static void showStatistics(){
		System.out.println("Statistics on patients data");
	}
	
	//The method that test the patient condition (healthy/unhealthy) based on clinical data for that patient
	public static String evaluatePatientCondition(Patient ptn){
		String  ptncnd="Undefined"; //initially will be unknown condition 
		
		int rbc_check=(ptn.medData.rbc<4.6 || ptn.medData.rbc>5.2)?1:0;
		int plt_check=(ptn.medData.plt<5.0 || ptn.medData.plt>9.0)?1:0;
		int lmp_check=(ptn.medData.lmp<4.9 || ptn.medData.lmp>6.1)?1:0;
		
		int blood_cnd=rbc_check+plt_check+lmp_check;
		
		String SBT=ptn.medData.SBT;
		String HP=ptn.medData.HP;
		//checking for particular SNP mutations related to stomach disorder
		String PMT=ptn.medData.PMT;
		
		if(PMT=="TOTAL"){
			//unhealthy
			ptncnd="UNHEALTHY :'(";
		} else if (blood_cnd==3){
			ptncnd="UNHEALTHY :'(";
		} else if (SBT=="Positive" && HP=="Positive"){
			ptncnd="UNHEALTHY :'(";
		} else if(blood_cnd>=2 && (SBT=="Positive" || HP=="Positive")){
			ptncnd="UNHEALTHY :'(";
		} else if(blood_cnd>=2 && (PMT=="PARTIAL")){
			ptncnd="UNHEALTHY :'(";
		} else if((SBT=="Positive" || HP=="Positive") && (PMT=="PARTIAL")){
			ptncnd="UNHEALTHY :'(";
		} else {
			//healthy
			ptncnd="HEALTHY :)";
		}
		return ptncnd;
	}
	
	//MAIN method from where IP(Instruction pointer) 
	//starts its execution
	public static void main(String[] args) {
		Patient p1=new Patient();
		System.out.println("==== PATIENT PERSONAL DETAILS ==========");
		p1.showDetails();
		System.out.println("\n==== PATIENT CLINICAL DATA DETAILS ==========");
		p1.medData.showDetails();
		System.out.println("\n==== PATIENT CONDITION ==========");
		System.out.println(evaluatePatientCondition(p1));
		/*
		//Stores selected option from user
		int option=0;
		//Make sure that program works
		boolean checker=true;
		
		//Create an instance of Scanner class to get input from user
		Scanner inOption= new Scanner(System.in);
		
		prgMenu(1);
		option=inOption.nextInt();
		
		//The first if is controlling the range
		if(option>0 && option<=6){
			
			//Nullify the previous option 
			option=0;
			//User already did an operation
			if(option==0){
				System.out.print("Please select option:");
				option=inOption.nextInt();
			}
			
			while(checker==true){
				switch(option){
				case 1:
					createPD();
					break;
				case 2:
					generateMD();
					break;
				case 3:
					processMD();
					break;
				case 4:
					showStatistics();
					break;
				case 5:
					prgMenu(0);
					break;
				default:
					System.out.println("Thank you for using FUMEDSYS-1.1");
					checker=false;
					break;
				}
				System.out.print("\n");
			}
		} else {
			System.out.print("ERROR MESSAGE: Wrong option entered");
		}
		*/
	}
}
