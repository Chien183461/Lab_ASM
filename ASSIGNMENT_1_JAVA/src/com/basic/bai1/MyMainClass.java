/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.bai1;

import java.util.Scanner;
import com.basic.bai1.CalculateUtil;

/**
 *
 * @author Administrator
 */
public class MyMainClass {

    public static void main(String[] args) {
        double x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        boolean checkX = false;
        System.out.println("Nhap so thu nhat x: ");
        while (checkX == false) {
            try {
                x = Double.parseDouble(sc.nextLine());
                checkX = true;
            } catch (Exception e) {
                System.out.println("So nhap vao khong hop le! Vui long nhap lai");
            }
        }

        boolean checkY = false;
        System.out.println("Nhap so thu hai y: ");
        while (checkY == false) {
            try {
                y = Double.parseDouble(sc.nextLine());
                checkY = true;
            } catch (Exception e) {
                System.out.println("So nhap vao khong hop le! Vui long nhap lai");
            }
        }

        System.out.println("\n === Nhap Action cho hai so tren:");
        String action = String.valueOf(sc.nextLine());
        if (action.equalsIgnoreCase("cong")) {
            System.out.println("Ket qua: " + String.valueOf(CalculateUtil.tinhCong(x, y)));
        } else if (action.equalsIgnoreCase("tru")) {
            System.out.println("Ket qua: " + String.valueOf(CalculateUtil.tinhTru(x, y)));
        } else if (action.equalsIgnoreCase("nhan")) {
            System.out.println("Ket qua: " + String.valueOf(CalculateUtil.tinhNhan(x, y)));
        } else if (action.equalsIgnoreCase("chia")) {
            if (y != 0) {
                System.out.println("Ket qua: " + String.valueOf(CalculateUtil.tinhChia(x, y)));
            } else {
                System.out.println("Phep chia khong hop le voi y = 0");
            }
        } else {
            System.out.println("Gia tri ACTION khong hop le!");
        }
    }
}
