package synchronize;

public class Admissions implements Runnable{
	
	int seats = 1;

	public static void main(String[] args) {
		
		Runnable ad = new Admissions();
		Thread t1 = new Thread(ad,"Student-1");
		Thread t2 = new Thread(ad,"Student-2");
		System.out.println(t1);
		System.out.println(t2);
		t1.start();
		t2.start();
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Number of Seats Before: " +seats);
		if(seats > 0) {
			System.out.println("Seat Allocated to: "+Thread.currentThread().getName());
			seats = seats - 1;
		}
		else {
			System.out.println("Sorry, Try in another college");
		}
		
		System.out.println("No. of Seats Left are: " +seats);
		
		
	}

}
