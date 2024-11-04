package bai3;

import java.util.Scanner;

public class Student {
	private String studentCode;
	private String fullName;
	private Byte age;
	private String gender;
	private String phoneNum;
	private String email;
	
	public Student() {}
	

	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student(String studentCode, String fullName, Byte age, String gender, String phoneNum, String email) {
		super();
		this.studentCode = studentCode;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.email = email;
	}


	@Override
	public String toString() {
		return "StudentCode : " + studentCode 
				+ "\n fullName : " + fullName 
				+ "\n age : " + age 
				+ "\n gender : " + gender
				+ "\n phoneNum : " + phoneNum 
				+ "\n email : " + email + "";
	}
public void inputInFor() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mời Nhập Vào Mã Học Sinh : ");
		studentCode = sc.nextLine();
		System.out.print("Mời Nhập Vào Họ Và tên Học Sinh : ");
		fullName = sc.nextLine();
		System.out.print("Mời Nhập Vào Tuổi của Học Sinh : ");
		age = Byte.parseByte( sc.nextLine());
		System.out.print("Mời Nhập Vào Số Điện thoại Học Sinh : ");
		phoneNum = sc.nextLine();
		System.out.print("Mời Nhập Vào Giới Tính Học Sinh : ");
		gender = sc.nextLine();
		System.out.print("Mời Nhập Vào email Học Sinh : ");
		email = sc.nextLine();
		
		sc.close();
	}
public void displayInFor() {
	
	System.out.println("Thông Tin Học Sinh : \n" + toString());
	
}
	
}
