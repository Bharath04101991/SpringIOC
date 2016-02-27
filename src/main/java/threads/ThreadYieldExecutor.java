package threads;

public class ThreadYieldExecutor {

	public static void main(String[] args) {

		MyThread r = new MyThread();
		Thread t = new Thread(r);
		
		t.start();
		for(int i=0;i<10;i++){
		System.out.println("Main Thread");	
		Thread.yield();
		}
	}

}
