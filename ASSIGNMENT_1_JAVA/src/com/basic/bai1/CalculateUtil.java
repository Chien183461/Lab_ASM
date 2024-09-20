/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.bai1;

/**
 *
 * @author Administrator
 */
public class CalculateUtil {

    double x;
    double y;

    public CalculateUtil(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public CalculateUtil() {
    }

    public static double tinhCong(double x, double y) {
        return x + y;
    }

    public static double tinhTru(double x, double y) {
        return x - y;
    }

    public static double tinhChia(double x, double y) {
        double rs = 0;
        try {
            return x / y;
        } catch (Exception e) {
            System.out.println("Phep chia khong hop le!! MSG: " + e.toString());
        }
        return rs;
    }

    public static double tinhNhan(double x, double y) {
        return x * y;
    }
}
