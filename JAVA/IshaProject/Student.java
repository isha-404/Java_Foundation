
public class Student extends Person{
	int rollNumber;
	double marks;
	
	void getStudentDetails(int rollNumber, double marks) {
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	void setStudentDetails() {
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Marks: "+marks);
		
		
	}
}
