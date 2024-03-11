//Examples on findFirst(): It returns the fist element 
//findAny(): It will return output as any element of the stream 
//count(): It will count the no.of elements in the stream
//min(): It will find the minimum element in the stream
//max(): It will find the maximum element in the stream
package javaStreamsBoom;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindingElementExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,2,3,2,1);
		
		//findFirst() and findAny() methods
		Optional<Integer> element = list.stream().findFirst(); 
		//here the method findFirst return type is Optional. 
		//So we are storing the answer in it's return type. i.e, Optional<>
		
		//After storing the value we have to check weather element found or not(list is empty).
		//for this Optional provides an API called isPresent() method
		if(element.isPresent()) {
			System.out.println(element.get());
		}else {
			System.out.println("Stream is empty");
		}
		
		//findAny() method:- It will return output as any element of the stream
		Optional<Integer> element1 = list.stream().findAny();

		if(element1.isPresent()) {
			System.out.println(element1.get());
		}else {
			System.out.println("Stream is empty");
		}
			
		
		
		//================================================================================================
		//************************************************************************************************
		//================================================================================================
		System.out.println("\n\n\nExamples on count, min, max");
		
		Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println("count::"+stream.count());
		
		//We store the value in integer because. The operation returns an Integer as the result. So we are storing the value in Integer
		Integer min= Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min -> "+min);
		
		Integer max= Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min -> "+max);
		
		
	}

}
