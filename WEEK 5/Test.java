package bai1;

import java.util.Collections;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Classroom cl = new Classroom();
		
		System.out.println("====Menu====");
		System.out.println("1. Nhập sinh viên : ");
		System.out.println("2.in ra thông tin các sinh viên : ");
		System.out.println("3.sắp xếp danh sách các sinh viên theo điểm gpa (tăng dần) ");
		System.out.println("4.xóa sinh viên theo id : ");
		System.out.println("5.thoát chương trình");
		
		System.out.println("nhập lựa chọn : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			cl.inputList();
			break;
		case 2:
			cl.outputList();
			break;
		  case 3:
              cl.sortbygpa();
              cl.outputList();
              break;
          case 4:
              System.out.print("Nhập ID sinh viên cần xóa: ");
              int id = sc.nextInt();
              if (cl.removeById(id)) {
                  System.out.println("Xóa thành công!");
              } else {
                  System.out.println("Không tìm thấy sinh viên với ID: " + id);
              }
              break;
          case 5:
              System.out.println("Thoát chương trình");
              sc.close();
              return;
          default:
              System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
      }
  }

			
		
		
		
		
	}
	
	

