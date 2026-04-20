
public class Person {
	String name;
	int age;
	
	
	void getInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void setInfo() {
		
		System.out.println("Name of the student: "+name);		
		System.out.println("Age of the student: "+age);
	}
	
}
