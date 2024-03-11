package javaStreamsBoom;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users= new ArrayList<User>();
		users.add(new User(11, "Thomas", "Hello1234", "thomas@gmail.com"));
		users.add(new User(12, "Jerry", "Jerry1234", "jerry@gmail.com"));
		users.add(new User(13, "Geetha", "Geetha1234", "geetha@gmail.com"));
		users.add(new User(14, "Yuva", "Yuva1234", "yuva@gmail.com"));
		users.add(new User(15, "Nagaraju", "Nagaraju1234", "nagaraju@gmail.com"));
		
		
		//**************************************Before Java 8**********************************************
		System.out.println("=======Using normal process=========");
		//Creating list to store the UserDTO data
		
		List<UserDTO> userDTO= new ArrayList<UserDTO>();
		//For loop for adding the required fileds to the DTO class
		for(User user: users) {
			userDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		
		
		for(UserDTO dto: userDTO) {
			System.out.println(dto);
		}
		
		
		//**************************************After Java 8************************************************
		//i.e., using stream.map()
		users.stream().map(new Function<User, UserDTO>() {
			//Here, Function is an interface which takes two aruguments
			//Here, User is for input data
			//UserDTO is for output

			@Override
			public UserDTO apply(User t) {
				// TODO Auto-generated method stub
				return new UserDTO(t.getId(), t.getUserName(), t.getEmail());
			}
		
		});
		
		System.out.println("\n\n+++++++Using Lambda Expression+++++++");
		//Writing the above logic using lambda expression
		users.stream().map((User user)->new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
		              //.forEach(System.out::println);
		              //or
						.forEach((userdto)->{
							System.out.println(userdto);
						});

	}

	
}

//This is UserDTO Class
//Using DTO(Data Transfer Object) we can hide the sensitive data 
class UserDTO{
	
	private int id;
	private String userName;
	private String email;
	
	
	public UserDTO(int id, String userName, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
	
}


//This is Entity Class
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	
	
	public User(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}
