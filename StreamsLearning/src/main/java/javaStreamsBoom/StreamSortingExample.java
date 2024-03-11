package javaStreamsBoom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits= new ArrayList<>();
		fruits.add("Mango");
		fruits.add("PineApple");
		fruits.add("Promogranate");
		fruits.add("Apple");
		fruits.add("Grapes");
		
		//Sorting the items in alphabetical order.
		//Using direct methods
		//Method-1(Sorting in assending oreder)
		System.out.println("================Using Natural Order Method=====================");
		List<String> result= fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		//Method-2(Sorting in assending order)
		//Sorting using lambda expressions. Taking 2 varibles x1,x2 and comparing 
		System.out.println("================Using Lambda Expression=====================");
		fruits.stream().sorted((x1,x2)->x1.compareTo(x2)).forEach(System.out::println);
		
		//Method-3(Sorting in assending order)
		System.out.println("================Using Direct Method=====================");
		fruits.stream().sorted().forEach(System.out::println);
		
		
		
		System.out.println("\n\n================Desending Order Outputs=====================");
		//Model-1(Using reverseOder Method
		System.out.println("================Using Reverse Order Method=====================");
		List<String> result1= fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		result1.forEach(System.out::println);
		
		//Model-2(Using lambda Expressions and swapping the varibles.)
		//Note: Just obsorb the difference between the asending and desending in methods2 
		System.out.println("================Using Lambda Expression=====================");
		fruits.stream().sorted((x1,x2)->x2.compareTo(x1)).forEach(System.out::println);

	}
}
