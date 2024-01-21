package pojo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"King",8000);
		System.out.println(emp);
		System.out.println(emp.getEid());
		Employee emp2 = new Employee();
		emp2.setEid(102);
		System.out.println(emp2);
		System.out.println(emp2.getEid());
		
		

	}

}
