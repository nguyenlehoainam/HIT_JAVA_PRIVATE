package service;

import java.util.ArrayList;
import java.util.Scanner;
import common.Account;
import model.Role;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AuthService User = new AuthServiceImpl();
		Account currentUser = null;
		 User.login(sc);
		 System.out.println("Dang nhap thanh cong!");
		 if(currentUser.getRole()==Role.ADmin) {
			 adminMenu(); 
		 }else {
			 usermenu();
		 } 
	}	
		public static void adminMenu() {
			int choice=0;
			do {
				System.out.println("===HỆ THỐNG QUẢN LÝ TÀI KHOẢN===");
				System.out.println("Xin Chào Admin : " );
				System.out.println("chọn 1 trong những chức năng sau:");
				System.out.println("1.xem danh sách tài khoản :");
				System.out.println("2.tạo tài khoản mới :");
				System.out.println("3.tìm kiếm tìa khoản theo username :");
				System.out.println("4.Xóa Tài Khoản");
				System.out.println("5.Thay đổi trạng thái tài khoản :");
				System.out.println("6.xem thông tin cá nhân.");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1 :System.out.println("danh sách tài khoản là :");
					
				case 2 :
				case 3 :
				case 4 :
				case 5 :
				case 6 :	
				}
			}while(choice!=6);
	}
		public static void usermenu() {
			int choice=0;
			do {
				System.out.println("===HỆ THỐNG QUẢN LÝ TÀI KHOẢN===");
				System.out.println("Xin Chào Admin : " );
				System.out.println("chọn 1 trong những chức năng sau:");
				System.out.println("1.xem danh sách tài khoản :");
				System.out.println("2.tạo tài khoản mới :");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1 :
			case 2 :
				default : System.out.println("lựa chọn không hợp lệ");
			}
		}while(choice != 2);
}
		
		

}
