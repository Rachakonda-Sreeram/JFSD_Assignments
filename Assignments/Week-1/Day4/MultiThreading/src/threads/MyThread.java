package threads;

public class MyThread extends Thread{

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setPriority(MAX_PRIORITY);
		t1.setName("Child-1");
		// NORM_PRIORITY,MIN_PRIORITY
		System.out.println(t1);
		MyThread t2 = new MyThread();
		t2.setPriority(MIN_PRIORITY + 9);
		t2.setName("Child-2");
		System.out.println(t2);
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
	}
	@Override
	public void run() {
		
		for(int i =0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		super.run();
	}
}
