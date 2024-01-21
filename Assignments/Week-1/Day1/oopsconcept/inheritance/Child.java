package inheritance;

public class Child extends Parent{
	int cid = 99;
	public Child() {
		super();
		System.out.println("Child Object created");
	}
	public Child(int cid) {
		 this.cid = cid;
		System.out.println("Parameterized Constructor of Child class");
	}
	public void m2() {
		System.out.println("m2() method from Child..");
	}
	public void m1() {
		System.out.println("m1() from Child class...");
	}
	@Override
	public String toString() {
		return "Child Object Here";
	}
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.toString());
		System.out.println(c.cid);
		c.m2();
		System.out.println(c.pid);
		c.m1();
		Child c2 = new Child(101);
		Parent P = new Parent();
		// Parent P = new Child();
		System.out.println(P);
	}

}
