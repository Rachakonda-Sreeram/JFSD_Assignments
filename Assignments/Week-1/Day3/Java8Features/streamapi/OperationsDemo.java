package streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class OperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(30);
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(20);
		//ll.add(null);
		Stream<Integer> stre = ll.stream();
		//stre.limit(4).forEach(System.out::println);
		//stre.skip(3).forEach(System.out::println);
		//stre.distinct().forEach(System.out::println);
		Integer res = stre.reduce((a,b) ->{return a+b;}).orElse(0);
		System.out.println(res);
		

	}

}
