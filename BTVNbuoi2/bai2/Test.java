package bai2;

import java.util.Scanner;


import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int n;
        
        System.out.print("Nhập vào n số phần tử của mảng : ");
         n = sc.nextInt();
        do {
        System.out.print("nhập vào số nguyên k là số lượng phần tử tối thiểu trong dãy con(k<n) : ");
         k = sc.nextInt();
        if(k>n) {
        	System.out.print("Số k bạn vừa nhập không hợp lệ!vui lòng nhập lại : ");
        }
        }while(k>n);
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.print("Nhập vào phần tử thứ " + i +" : ");
            arr[i] = sc.nextInt();
        }
        int maxSum = maxArrSum(arr, n, k);
        System.out.println("Tổng lớn nhất trong dãy có chứa k phần tử là : " + maxSum);
        
        sc.close();
    }
    public static int maxArrSum(int[] arr, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        int Sum = 0;

        for (int i = 0; i < k; i++) {
            Sum += arr[i];
        }
        maxSum = Sum;

        for (int i = k; i < n; i++) {
           Sum += arr[i] - arr[i - k];
            if (Sum > maxSum) {
                maxSum = Sum;
            }
        }
        for (int i = k; i < n; i++) {
            Sum += arr[i];
            if (Sum > maxSum) {
                maxSum = Sum;
            }
        }
     return maxSum;
    }
    
}
