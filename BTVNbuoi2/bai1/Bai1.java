package bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.print("Mời Nhập Vào Giá Trị Của mảng nums(1<n<=104) :");
		 n = sc.nextInt();
		 if(n<=1 || n > 104) {
			 System.out.println("số Vừa Nhâp không hợp lệ! mời nHập Lại :");
		 }
		}while(n<=1 || n >104);
		
		System.out.print("mời Nhập Vào số Nguyên K :");
		int k = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0 ; i<n;i++) {
			System.out.print("nhập vào phần tử thứ "+i+ ": " );
			nums[i] = sc.nextInt();	
		}
		for(int i = 0 ;i<n-1;i++ ) {
			for(int j = i+1;j<n;j++ ) {
				if(nums[i]>nums[j]) {
					int swaps ;
					swaps = nums[i];
					nums[i] = nums[j];
					nums[j] = swaps;
				}
			}
		}	
		boolean found = false;
		for(int i = 0 ; i<n;i++) {
		if(nums[i]==k) {
		System.out.println( + i  );
		found = true;
		break;
		}
	}
		if(!found) {
			System.out.print("-1");
		}
		sc.close();
	}
	
}



