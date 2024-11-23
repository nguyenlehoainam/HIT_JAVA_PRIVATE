package bai1;

import java.util.Scanner;

public class Student extends Person {
	
	private int id;
	private String nameClass;
	private float gpa;
	final float criteria = 2;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param id
	 * @param nameClass
	 * @param gpa
	 */
	public Student(String name, int age, int id, String nameClass, float gpa,Address address) {
		super(name,age,address);
		this.id = id;
		this.nameClass = nameClass;
		this.gpa = gpa;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getCriteri() {
		return criteria;
	}
	
	
	
	@Override
	public String toString() {
		return "\nid=" + id 
				+"\nHọ tên: " + name 
				+"\nTuổi: " + age 
				+ "\n nameClass=" + nameClass 
				+ "\n gpa=" + gpa 
				+"\nĐịa chỉ: " + address;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập vào mã sinh viên ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("nhập vào tên lớp của sinh viên ");
		nameClass = sc.nextLine();
		System.out.println("nhập vào điểm gpa của sinh viên :");
		gpa = sc.nextFloat();
		sc.nextLine();
		sc.close();
	}
	
	public void output() {
		super.output();
		System.out.println(toString());
	}
	
	public boolean checkFall() {
		if(gpa < criteria) {
			return true;
		}else {
			return false;
		}
	}

}
