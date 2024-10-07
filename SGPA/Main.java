import java.util.Scanner;
class Subject{
	int marks, credits, grade;
	
}
class Student{
	Subject subject[];
	String name, usn;
	double SGPA;
	Scanner s=new Scanner(System.in);
	Student(){
		int i;
		subject = new Subject[9];
		for(i=0;i<9;i++)
		{subject[i] = new Subject();} 
	}
	void getStudentDetails() {
		System.out.println("Enter name :");
		this.name=s.nextLine();
		System.out.println("Enter usn :");
		this.usn=s.nextLine();
	}
	void getMarks() {
		for(int i=0;i<9;i++) {
			System.out.println("Enter marks of subject "+(i+1)+":");
			subject[i].marks=s.nextInt();
			System.out.println("Enter credits of subject "+(i+1)+":");
			subject[i].credits=s.nextInt();
			subject[i].grade=(subject[i].marks/10)+1;
			if (subject[i].grade==11)
				subject[i].grade=10;
			else if(subject[i].grade==4)
				subject[i].grade=0;
		}
	}
	void computeSGPA(){
		double points=0;
		double totalcredits=0;
		for (int i=0;i<9;i++) {
			int sub=subject[i].credits*subject[i].grade;
			points=points+sub;
			totalcredits=totalcredits+subject[i].credits;
		}
		SGPA=points/totalcredits;
		System.out.println("SGPA of the student is : "+SGPA);
	}
}
public class Main{
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getMarks();
		System.out.println("Name : "+s1.name);
		System.out.println("USN : "+s1.usn);
		s1.computeSGPA();

	}
}