
public class GraduateStudent extends Student{
	String Speciallization;
	
	public void getSpeciallization(String Speciallization) {
		this.Speciallization = Speciallization;
	}

	public void setSpeciallization() {
		System.out.println("Speciallization of the Student: "+Speciallization);
	}


	public static void main(String[] args) {
		GraduateStudent g1 = new GraduateStudent();
		g1.getInfo("Isha", 19);
		g1.getStudentDetails(1508, 88.75);
		g1.getSpeciallization("Data Science");
		
		System.out.println("=== STUDENT DETAILS ===");
		
		g1.setInfo();
		g1.setStudentDetails();
		g1.setSpeciallization();
	}
}
