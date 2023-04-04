package QuizSession7;


import java.util.Scanner;

class Person {
	String name;
	String date;
	int point;
	int sanity;
	
	Person (String names, String dates, int points, int sanitys){
		this.name =names;
		this.date = dates;
		this.point = points;
		this.sanity = sanitys;
	}
	
	public void sleep () {
		sanity += 5;
		System.out.println();
		System.out.println(this.name + " just slept");
		System.out.println("Current sanity : "+ this.sanity);
	}
}

class Mahasiswa extends Person{
	String student_id;
	Mahasiswa(String names, String dates, int points, int sanitys, String students) {
		super(names, dates, points, sanitys);
		this.student_id = students;
	}

	public void helpingDosen() {
		super.point += 10;
		System.out.println();
		System.out.println("Current Point : "+super.point);
	}
}

class Dosen extends Person{
	String dosen_id;
	Dosen(String names, String dates, int points, int sanitys, String dosens) {
		super(names, dates, points, sanitys);
		this.dosen_id = dosens;
	}
	
	public void selfDev() {
		System.out.println();
		System.out.println("Self Development Dosen");
	}
	
	public void teach() {
		System.out.println();
		System.out.println("Dosen just teach something");
	}
	
	public void p2m() {
		System.out.println();
		System.out.println("Dosen finished P2M");
	}
	
	public void research() {
		System.out.println();
		System.out.println("Dosen just completed a research");
	}
	
	public void otherWorks() {
		System.out.println();
		System.out.println("Dosen completed other works");
	}
}

public class Quiz {

	public static void main(String[] args) {
		Scanner getNew = new Scanner(System.in);
		System.out.println("Pick which data to see: ");
		System.out.println("1. Person");
		System.out.println("2. Dosen");
		System.out.println("3. Mahasiswa");
		System.out.println("Option : ");
		
		Person person1 = new Person("NamaPerson","TestDatesP",100,100);
		Mahasiswa mahasiswa1 = new Mahasiswa("NamaMahasiswa","TestDatesM",100,100,"Mah1");
		Dosen dosen1 = new Dosen("NamaDosen","TestDateD",100,100,"Dos1");
		
		int option = getNew.nextInt();
		switch(option) {
			case 1:
				System.out.println("Class of Person");
				System.out.println("Name : "+person1.name);
				System.out.println("Birth Date : "+person1.date);
				System.out.println("Point : "+person1.point);
				System.out.println("Sanity : "+person1.sanity);
				person1.sleep();
				break;
			case 2:
				System.out.println("Class of Mahasiswa");
				System.out.println("Name : "+mahasiswa1.name);
				System.out.println("Birth Date : "+mahasiswa1.date);
				System.out.println("Point : "+mahasiswa1.point);
				System.out.println("Sanity : "+mahasiswa1.sanity);
				System.out.println("Student ID : "+mahasiswa1.student_id);
				mahasiswa1.helpingDosen();
				break;
			case 3:
				System.out.println("Class of Dosen");
				System.out.println("Name : "+dosen1.name);
				System.out.println("Birth Date : "+dosen1.date);
				System.out.println("Point : "+dosen1.point);
				System.out.println("Sanity : "+dosen1.sanity);
				System.out.println("Dosen ID : "+dosen1.dosen_id);
				dosen1.selfDev();
				dosen1.p2m();
				dosen1.research();
				dosen1.teach();
				dosen1.otherWorks();
				break;
		}
	}

}
