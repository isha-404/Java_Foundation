
public class MainThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		MyThread t1 = new MyThread(); //object of child thread
		t1.start(); //start child thread
		
		//TASK I
		for(int i =1; i<=5; i++) {
			System.out.println("Main Thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//THE THREAD GETS OVERLOADED.
		//THUS WE CREATE CHILD THREAD.
	}
}
