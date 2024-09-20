/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HinhTron {
    public float bankinh;
    public float pi = (float) 3.14;
    
    public float tinhChuVi() { //hàm tính chu vi tam giác
        return 2*pi*this.bankinh; //tính và trả về chu vi theo công thức 
    }
    
    public float tinhDienTich(){ //hàm tính diện tích tam giác
        return pi * this.bankinh * this.bankinh; //tính và trả về diện tích theo công thức
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron: ");
        ht.bankinh = sc.nextInt();
        System.out.println("Chu vi hinh tron la: " + ht.tinhChuVi());
        System.out.println("Dien tich hinh tron la: " + ht.tinhDienTich());
    }
}
