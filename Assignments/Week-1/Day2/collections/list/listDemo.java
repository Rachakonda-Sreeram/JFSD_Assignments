package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> l = new ArrayList<>(); // Number-super class of all the number types except boolean and char
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(40);
		l.add(20);
		l.add(null);
		l.add(4.55);
		l.add(2.54f);
		l.add(1234567);
		System.out.println(l);
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(30);
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(20);
		ll.add(null);
		System.out.println(ll);
		
		Iterator<Integer> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		for(Integer i:ll) {
			System.out.println(i);
		}
		
		
		

	}

}
