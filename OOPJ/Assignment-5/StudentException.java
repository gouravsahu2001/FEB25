import java.util.*;

public class StudentException {

	private String StName;
	private int StRollNo;
	private double marks[] = new double[5];
	private double average;
	private char grade;
	private double total;
	
	Student (String name ,int Rollno ,double marks[]) {
		this.StName = name;
		this.StRollNo = Rollno;
		for(int i=0;i<5;i++) {
			if(marks[i] > 100 || marks[i] < 0) {
				throw new IllegalArgumentException();
			}else {
				this.marks[i] = marks[i];
			}
		}
	}
	
	void calculateAverage(){
		
		for(int i=0;i<5;i++) {
			total += marks[i];
		}
		 average=total/5.0;
	}
	
	void calculateGrade() {
		
		if(average >= 90) {
			grade = 'A';
		}
		if(average >= 80  && average < 90) {
			grade = 'B';
		}
		if(average >= 70 && average < 80) {
			grade = 'C';
		}
		if(average >= 60 && average < 70) {
			grade = 'D';
		}
		if(average < 60) {
			grade = 'F';
		}
	}
	
	void displayStudentInfo() {
		System.out.println("Name : "+StName);
		System.out.println("Roll no. : "+StRollNo);
		System.out.println("Total Marks : "+total);
		System.out.println("Average : "+average);
		System.out.println("Grade : "+grade);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			double marks[] = new double[5];
			System.out.println("Enter the Student Name: ");
			String name = sc.nextLine();
			System.out.println("Enter the Student Roll number: ");
			int rollno = sc.nextInt();
			System.out.println("Enter the Student's marks of all 5 subject: ");
			for(int i=0;i<5;i++) {
				marks[i] = sc.nextDouble(); 
			}
			Student s = new Student(name,rollno, marks);
			s.calculateAverage();
			s.calculateGrade();
			s.displayStudentInfo();
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid input....Please enter a numeric value.");			
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid input...PLease enter valid value for marks");
		}

	}

}
