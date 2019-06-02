package java8practice;

public class Person {

	private String firstName;
	private String lasName;
	private int age;
	
	public Person(String firstName, String lasName, int age) {
		super();
		this.firstName = firstName;
		this.lasName = lasName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
