package bai3;

import java.util.Scanner;

public class nhapSo {

		public void thuatToan(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Vào 5 Số Nguyên Bất Kỳ (cách để nhập): ");
        int[] numbers = new int[5];
  
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > max1) {
                max2 = max1; 
                max1 = numbers[i]; 
            } else if (numbers[i] > max2) {
                max2 = numbers[i]; 
            }
        }

        System.out.println("Số lớn nhất là: " + max1);
        System.out.println("Số lớn thứ hai là: " + max2);

        sc.close();
    }
}