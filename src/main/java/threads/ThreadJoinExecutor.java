package threads;

public class ThreadJoinExecutor {

	public static void main(String[] args) throws InterruptedException {

		MyThread r = new MyThread();
		Thread t = new Thread(r);
		t.start();
		t.join(1000);
		for(int i=0;i<10;i++){
		System.out.println("Main Thread");	
		}
	}

}
