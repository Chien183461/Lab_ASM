/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab31;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MaxElementInArray {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Nhap vao phan tu thu [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang co gia tri la: " +max);
    }
}
