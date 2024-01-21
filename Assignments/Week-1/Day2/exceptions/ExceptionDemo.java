package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) { // caller
		// TODO Auto-generated method stub
		System.out.println("Open File");
		System.out.println("Reading Data From File");
		int result = 0;
		try {
		result = div(10,2);
		String name = null;
		System.out.println("Length of Name: "+ name.length());
		System.out.println("Result :" + result);
		}
		catch(ArithmeticException e) {
			System.err.println("Sorry, You cannot divide the number by Zero");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		finally {
		System.out.println("Close the File");
		}
		
		
		

	}
	public static int div(int a, int b) throws ArithmeticException { //callee
		return a/b;
		
	}
}
