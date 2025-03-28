

class Student{
	private String StName;
	private int marks1,marks2,marks3;
	
	void setDetails(String name,int mark1,int mark2,int mark3) {
		this.StName = name;
		this.marks1 = marks1;
		this.marks2 = mark2;
		this.marks3 = mark3;
	}
	
	int getTotal() {
		return (marks1 + marks2 + marks3);
	}
	
	float getAverage() {
		return (float) ((marks1 + marks2 + marks3) / 3.0);
	}
	
	void studentInfo() {
		System.out.println("Student Name is : "+StName);
		System.out.println("Total Marks is : "+(marks1 + marks2 + marks3));
		System.out.println("Average of the marks is : "+(marks1 + marks2 + marks3) / 3.0);
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setDetails("Gourav",82,75,93);
		s1.studentInfo();
		
		System.out.println("-------------------------------");
		
		Student s2 = new Student();
		s2.setDetails("Rahul",87,55,43);
		s2.studentInfo();
		
		System.out.println("-------------------------------");
		
		Student s3 = new Student();
		s3.setDetails("Gagan",72,65,55);
		s3.studentInfo();

	}

}
