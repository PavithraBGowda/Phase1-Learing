package program.test;

public class Student {
	String name;
	int age;
	String section;
	String gender;
	int subject1 = 0;
	int subject2;
	int subject3;
	int total;
	

	public static void main(String[] args) {
		Student s1 = new Student("Pavithra",20,"A","Female",60,70,50);
		Student s2 = new Student("Rishvik",19,"A","Male",59,80);
		Student s3 = new Student("Ashray",21,"A","Male",53,95);
		Student s4 = new Student("Pallavi",22,"A","Female",60,50,90);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		

	}
	Student(String name,int age,String section,String gender,int sub1,int sub2,int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		total = sub1+sub2+sub3;
		System.out.println(total);
		
		}
	Student(String name,int age,String section,String gender,int sub2,int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		total = subject1+sub2+sub3;
		System.out.println(total);
	}
	void display()
	{
		System.out.println(name+" "+" "+age+" "+section+" "+gender);
	}
}