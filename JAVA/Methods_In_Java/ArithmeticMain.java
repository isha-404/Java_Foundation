
public class ArithmeticMain {

	public static void main(String[] args) {
		ArithmaticOperation  obj1 = new ArithmaticOperation();
		obj1.setValue1(200);
		obj1.setValue2(100);
		obj1.additionOperation();
		double result = obj1.getResult();
		System.out.println(" Addition is : "+result);
		
	}

}
