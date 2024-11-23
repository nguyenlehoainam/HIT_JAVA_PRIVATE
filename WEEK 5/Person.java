package bai1;

import java.util.Scanner;


public class Person {
	
	protected String name;
	protected int age;
	protected Address address;
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "name=" + name 
				+ ", age=" + age 
				+ ", address=" + address ;
	}
	

	public  void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào tên học sinh :");
		name = sc.nextLine();
		System.out.println("nhập vào tuổi của học sinh :");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("nhập vào địa chỉ của học sinh :");
		address = new Address();
		System.out.println("nhập vào tên đường học sinh đang ở ; ");
		address.setDiachi(sc.nextLine());
		System.out.println("nhập vào số nhà của học sinh");
		address.setSoNha((sc.nextInt()));
	}
	
	public  void output() {
		System.out.println(toString());
	}
	
	
	
}
