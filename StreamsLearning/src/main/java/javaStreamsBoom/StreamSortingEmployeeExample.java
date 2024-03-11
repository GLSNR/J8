//NOTE:- "::" is a new operator included in Java 8 that is used to refer to a method of an existing class.
//Performing sorting using "Stream APIs" and "Comparators"

package javaStreamsBoom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingEmployeeExample {
	
	public static void main(String args[]) {
		List<Employee> emp= new ArrayList<>();
		emp.add(new Employee(26, "Hari", 25, 35000));
		emp.add(new Employee(25, "Akhil", 20, 50000));
		emp.add(new Employee(24, "Nagaraju", 30, 15000));
		emp.add(new Employee(24, "Jagadeesh", 22, 20000));
		emp.add(new Employee(24, "Jagan", 15, 31000));
		
		//**************sort employee by salary in assending order*********************
		//Model-1(Normal sorting using streams)
		System.out.println("\n*****************sort employee by salary in assending order.****************");
		List<Employee> result= emp.stream().sorted(new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSalary()-o2.getSalary();
			}
			
		}).collect(Collectors.toList());
		System.out.println(result);
		
		//Model-2(Sorting using lambda expressions)
		List<Employee> result1= emp.stream().sorted((o1,o2)->(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		System.out.println(result1);
		
		//Model-3(Using comparator method)
		List<Employee> result3= emp.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(result3);
		
		
		//*********************sort employee by salary in desending order.*************************
		//Model-1(Using lambda expression by swapping the varibles)
		System.out.println("\n*****************sort employee by salary in desending order.****************");
		List<Employee> result2= emp.stream().sorted((o1,o2)->(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println(result2);
		
		//Model-2(Using comparator method reversed())
		List<Employee> result4= emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(result4);
		
		
		
		//***********************Sorting Employee By Age*********************************
		//Assending order
		//Model-1(Using lambda expression)
		System.out.println("\n\n=============================Based on Age Assending oder sorting======================");
		emp.stream().sorted((x1,x2)->x1.getAge()-x2.getAge()).forEach(System.out::println);
		
		//Model-2(Using Comparator. Note Based on the varible type we have to change the method name like: for int comparingInt, for long comparingLong
		System.out.println();
		emp.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		//*************************Sorting Employe By Name in Assending order**********************************
		System.out.println("\n\n=============================Based on Name Assending oder sorting======================");
		emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		//*************************Sorting Employe By Name in Desending Order**********************************
		//Using comparator reversed method
		System.out.println("\n\n=============================Based on Name in Desending oder sorting======================");
		emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
	}
	
	

}

class Employee{
	private int id;
	private String name;
	private int age;
	private int salary;
	
	
	public Employee(int id, String name, int age, int salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
