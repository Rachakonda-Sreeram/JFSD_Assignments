package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream stream = Stream.of(10,20,30,40,50);
		//long count = stream.count();
		//System.out.println(count);
	
		Comparator<Integer> comp = (i1,i2) -> {return i1.toString().compareTo(i2.toString());};
		Optional<Integer> optional = stream.max(comp);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println(optional.orElse(0));
			
		}
		String names[] = {"Satish","Ravi","Ford","King","Adam"};
		Stream<String> stream2 = Arrays.stream(names);
		stream2.map((str) -> {System.out.println(str); return str.length();})
		.forEach((len) -> {System.out.println(len);});
		
		
	}
	
	

}
