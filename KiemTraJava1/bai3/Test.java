package bai3;

import java.util.Scanner;
import java.lang.Math;

public class Test {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		do {
			if(-1000>x || 100<x) {
				System.out.print("Chưa Hợp Lệ,Nhập lại :");
			}
		}while(-1000>x || 100<x);
		
		int y = sc.nextInt();
		do {
			if(Math.pow(-2,31)-1 > y || Math.pow(2, 31)<y) {
				System.out.print("Chưa Hợp Lệ,Nhập lại :");
			}
		}while(Math.pow(-2,31)-1 > y || Math.pow(2, 31)<y);
		
		
		System.out.print("Kết Quả x^y : " +Math.pow(x,y) );
		
		
	}
}
