//Java Streams:
//Types of streams creations.

package javaStreamsBoom;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreation {
	
	public static void main(String args[]) {
		
		//creating stream
		Stream<String> stream = Stream.of("Nagaraju","Akhil","Hari");
		stream.forEach(System.out::println);
		
		//creating stream form collection resources
		Collection<String> collection = Arrays.asList("Hello","Hai","How do you do","Welcome");
		Stream<String> stream2= collection.stream();
		stream2.forEach(System.out::println);
		
		List<String> list= Arrays.asList("You","Are","My","World");
		Stream<String> stream3=list.stream();
		stream3.forEach(System.out::println);
		
		Set<String> set= new HashSet<>(list);
		Stream<String> stream4=set.stream();
		stream4.forEach(System.out::println);
		
		//Creating stream form array
		String item[]= {"Abhi","You","Me","Friends"};
		Stream<String> stream5=Arrays.stream(item);
		stream5.forEach(System.out::println);
		
	}

}
