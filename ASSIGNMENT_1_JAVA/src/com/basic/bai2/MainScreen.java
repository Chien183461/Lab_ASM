/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MainScreen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        System.out.println("Nhap vao so N: ");
        while (check == false) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    check = true;
                } else {
                    System.out.println("So N phai > 0! Vui long nhap lai!");
                }
            } catch (Exception e) {
                System.out.println("So nhap vao khong hop le! Vui long nhap lai!");
            }
        }
        int schan = 0;
        int sle = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                count++;
            }
            if (i % 2 == 0) {
                schan = schan + i;
            } else {
                sle = sle + i;
            }
        }
        System.out.println("Tong cac so chan tu 0-" + n + " la: " + schan);
        System.out.println("Tong cac so le tu 0-" + n + " la: " + sle);
        System.out.println("Cac so chia het cho 3 nhung khong chia het cho 2 co: " + count);

    }
}
