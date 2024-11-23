package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Classroom {
	private static ArrayList<Student> studentlist = new ArrayList<Student>() ;
	
	static {
		studentlist.add(new Student("nguyễn văn a ",20,12345678,"KTPM",3.5f,
										new Address("nhổn",20)));
		studentlist.add(new Student("nguyễn văn b",19,12345677,"CNTT",3.0f,
										new Address("cầu diễn",36)));
		studentlist.add(new Student("nguyễn văn c",18,12345667,"DAPT",2.8f,
										new Address("thanh xuân",39)));
		studentlist.add(new Student("nguyễn văn d",20,12345567,"ATTn",3.2f,
										new Address("Đống Đa",40)));
		studentlist.add(new Student("nguyễn văn e",21,12344567,"KHMT",2.9f,
										new Address("Minh Khai",26)));
		
	}
	
	public void inputList() {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("nhập vào số sinh viên muốn thêm (tối đa 555 sinh viên) :");
		n = sc.nextInt();
		sc.nextLine();
		
		Student St = new Student();
	
		for(int i=0;i<555;i++) {
			System.out.println("nhập vào sinh viên thứ " +i+1+": ");
			St.input();
		
		
	
		studentlist.add(St);
		}
	}

	public void outputList() {
		for(Student students : studentlist) {
			students.output();
			if(students.checkFall()){
				System.out.println("sinh viên tượt");
			}else {
				System.out.println("sinh viên ở lại lớp");
			}
		}
	}
	public void sortbygpa() {
		 Collections.sort(studentlist, (s1, s2) -> Float.compare(s1.getGpa(), s2.getGpa()));
	        System.out.println("Danh sách đã được sắp xếp theo điểm GPA (tăng dần):");
	}
	 public boolean removeById(int id) {
	        return studentlist.removeIf(student -> student.getId() == id);

}
}
