package extra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExtraDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new LinkedList<Integer>(); // Number-super class of all the number types except boolean and char
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(40);
		l.add(20);
		Object arr[] = l.toArray();
		System.out.println(arr);
		
		Integer a1[] = {1,2,3,4};
		int a2[] = new int[4];
		System.out.println(a1);
		System.out.println(a1[0]);
		System.out.println(a1.length);
		System.out.println(a2);
		System.out.println(a2[0]);
		System.out.println(a2.length);
		Arrays.asList(a1);
		System.out.println(Arrays.asList(a1));

	}

}
