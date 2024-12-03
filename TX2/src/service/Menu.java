package service;


import java.util.Scanner;
import common.Account;
import model.Role;
import model.Status;

public class Menu {
	 static AuthService authService = new AuthServiceImpl();
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  while (true) {
	            System.out.println("\n=== Login Menu ===");
	            System.out.println("1. Login");
	            System.out.println("2. thoát");
	            int choice ;
	            choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1 :
	                    authService.login(sc);
	                    break;
	                case 2 :
	                    System.out.println("Goodbye!");
	                    return;
	                default :
	                    System.out.println("lựa chọn không hợp lệ!");
	            }
	        }
	 }
		
		public static void adminMenu() {
			int choice=0;
		
				System.out.println("===HỆ THỐNG QUẢN LÝ TÀI KHOẢN===");
				System.out.println("Xin Chào Admin : " );
				System.out.println("chọn 1 trong những chức năng sau:");
				System.out.println("1.xem danh sách tài khoản :");
				System.out.println("2.tạo tài khoản mới :");
				System.out.println("3.tìm kiếm tìa khoản theo username :");
				System.out.println("4.Xóa Tài Khoản");
				System.out.println("5.Thay đổi trạng thái tài khoản :");
				System.out.println("6.xem thông tin cá nhân.");
				System.out.println("7.Đăng xuất");
				
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1 :System.out.println("danh sách tài khoản là :");	
				break;
				case 2 :
				case 3 :
				case 4 :
				case 5 :
				case 6 :	
				case 7 :{
					 authService.logout();
				}
				default : System.out.println("Invalid choice. Try again.");
				}
			
	}
		public static void usermenu() {
			int choice=0;
			
				System.out.println("===HỆ THỐNG QUẢN LÝ TÀI KHOẢN===");
				System.out.println("Xin Chào User : " );
				System.out.println("chọn 1 trong những chức năng sau:");
				System.out.println("1.xem danh sách tài khoản :");
				System.out.println("2.tạo tài khoản mới :");
				System.out.println("3.đăng xuất.");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1 :
			case 2 :
				default : System.out.println("lựa chọn không hợp lệ");
			}
		
}
		
		

}
