package functional_interface;

public class Java7Imp implements IMyInterface{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String args[]) {
		
		IMyInterface mi = new Java7Imp();
		mi.add(5, 5);
		System.out.println(mi.add(5, 5));
	}

}
