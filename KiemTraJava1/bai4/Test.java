package bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		 int[] arrsum = new int[n];
		int arr[] = new int[n];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			 arrsum[i] = arrsum[i] + arr[i];
		}
		
		int q = sc.nextInt();
	
		
		for(int i = 0;i<=q;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();	
			int sum = arrsum[r] - arrsum[l - 1];
			  System.out.println(sum);
		}
		 
	
		
        
		
	}	

}
