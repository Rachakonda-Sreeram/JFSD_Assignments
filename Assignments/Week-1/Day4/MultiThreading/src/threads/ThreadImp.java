package threads;

public class ThreadImp implements Runnable{

	public static void main(String[] args) {
		
		Runnable ti = new ThreadImp();
		Thread td = new Thread(ti);
		td.start();
		System.out.println(ti);
		System.out.println(td);
		for(int i =0;i<5;i++) {
			System.out.println("Main thread");
		}
		
	}

	@Override
	public void run() {
		
		for(int i =0;i<5;i++) {
			System.out.println("Child thread");
		}
		
	}

}
