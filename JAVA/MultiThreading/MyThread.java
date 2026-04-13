
public class MyThread extends Thread{
	public void run() {
		//TASK II
		for(int i =1; i<=5; i++) {
			System.out.println("Child Thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//this is a child thread.
	}
}
