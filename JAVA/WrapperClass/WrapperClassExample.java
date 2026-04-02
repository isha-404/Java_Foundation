
public class WrapperClassExample {
	public static void main(String args[]) {
		int a = 10;
		Integer i1 = new Integer(a);	//primitive to object
		System.out.println(i1);
		int i1new = i1.intValue();		//object to primitive
		
		float b = 3.14f;
		Float f1 = new Float(b);
		System.out.println(f1);
//		float f1new = f1.floatValue();
		float f1new = f1;		// autoUnboxing i.e., no need of floatValue() method
		
		double c = 12.34d;
		Double d1 = new Double(c);		// the "....new Double..." was deprecated after Java 8
		System.out.println(d1);
		double d1new = d1.doubleValue();
		
		byte d = 10;
		Byte b1 = d;		//autoBoxing: no need of new keyword
		System.out.println(b1);
		byte b1new = b1.byteValue();
	}
}
