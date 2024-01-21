package basics;

public class Student {
	int sid;
	String name;
	static int rollNumber;
	public Student() {super();}
	public int getSid() {
		return sid;
		
	}
	public static void hello() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid = 40;
		s1.name = "James";
		s1.rollNumber = 100;
		System.out.println(s1.sid);
		System.out.println(s1.name);
		System.out.println(s1.rollNumber);
		s1.getSid();
		hello();
		Student s2 = new Student();
		System.out.println(s2.sid);
		System.out.println(s2.name);
		System.out.println(s2.rollNumber);
		
	}

}
