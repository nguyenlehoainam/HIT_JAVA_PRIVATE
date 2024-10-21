package bai1;

import java.util.Scanner;

public class chuyenDoi {

	public static void nhapSo() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Mời Nhập Vào Số Tự Nhiên Cần Chuyển Đổi :");
	int num = sc.nextInt();
	System.out.print("Mời Nhập Vào Hệ Cơ Số Cần Chuyển Đổi :");
	int b = sc.nextInt();
	System.out.println("Số Bạn Vừa Nhập là:" + num);
	System.out.println("Hệ Cơ Số Bạn Muốn Đổi:" + b);
	
	String str = "";
	
	
	while (num > 0) {
	    int m = num % b;
	    num = num / b;
	    
	    if (m == 10) {
	        str = "A" + str;
	    } else if (m == 11) {
	        str = "B" + str;
	    } else if (m == 12) {
	        str = "C" + str;
	    } else if (m == 13) {
	        str = "D" + str;
	    } else if (m == 14) {
	        str = "E" + str;
	    } else if (m == 15) {
	        str = "F" + str;
	    } else {
	        str = m + str;
	    }
	}
	System.out.print("Kết Quả "+ str );
	sc.close();
	}
}


