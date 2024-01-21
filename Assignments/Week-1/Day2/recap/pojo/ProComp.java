package pojo;

import java.util.Comparator;

public class ProComp implements Comparator <Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareTo(s2);
	}

}
