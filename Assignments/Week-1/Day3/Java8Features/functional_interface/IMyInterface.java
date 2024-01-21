package functional_interface;

@FunctionalInterface
public interface IMyInterface {

	int add(int a, int b);
	default void show1() {
		System.out.println("This is default");
	}
	static void show2() {
		System.out.println("This is Static");
	}
}
