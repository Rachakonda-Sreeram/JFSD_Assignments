package threads;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		ThreadDemo t1 = new ThreadDemo();
		System.out.println(t1);
		t1.start();
		for(int i =0;i<5;i++) {
			System.out.println("Main thread");
		}
	}
	@Override
	public void run() {
		//System.out.println("run() method is called");
		for(int i =0;i<5;i++) {
			System.out.println("Child thread");
		}
		//super.run();
	}
}
