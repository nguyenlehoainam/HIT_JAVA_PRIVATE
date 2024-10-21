package bai2;
import java.util.Scanner;

public class nhapSo {
	
	public static void thuatToan() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Nhập vào 1 Số tự nhiên Bất Kỳ ");
	
	int num = sc.nextInt();
	
	int sum = 1;
	int x ;
	
	while(num>0) {
		 x = (num%10);
		num = num/10;
		sum *= x;	
	}
	
	System.out.print("Tích Của Các Chữ Số Của Số Tự Nhiên Bạn Vừa Nhập là :" + sum);
	
	
	sc.close();
	}
}
