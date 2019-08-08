package Inheritance;
class Address {
	private String city;
	private String state;
	private String country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	


class Person1 {
	private String  name; 
	private String gender;
	private static int age;
	private static String Address;
	public Person1(String name, String gender, int age, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	class HW8{
		
		public static void main(String[] args) {
			
			Person1 p=new Person1(Address, Address, age, Address);
		}
			
	}
	