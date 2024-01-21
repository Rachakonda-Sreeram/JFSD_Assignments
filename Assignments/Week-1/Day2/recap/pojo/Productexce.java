package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Productexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(101,"P1",20.89);
		Product pd1 = new Product(103,"P3",30.89);
		Product p2 = new Product(102,"P2",10.89);
		
		//System.out.println(p1);
		//System.out.println(pd1);
		Set<Product> pro = new HashSet<Product>();
		pro.add(p1);
		pro.add(pd1);
		pro.add(p2);
		System.out.println(pro);
		Set<Product> proc = new TreeSet<Product>(new ProComp());
		proc.add(p1);
		proc.add(pd1);
		proc.add(p2);
		System.out.println(proc);
		
		
		

	}

}
