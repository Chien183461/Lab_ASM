/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ExceptionHandler {
    
    public int phepchia(int a,int b){        
        return (int) (a/b);        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao so thuc a: ");
            int a = (int)sc.nextFloat();
            System.out.println("Nhap vao so thuc b: ");
            int b = (int)sc.nextFloat();
            ExceptionHandler x = new ExceptionHandler();
            int ketqua = x.phepchia(a, b);
            
            System.out.println("Ket qua: " + ketqua);
            
        } catch (java.lang.Exception e) {
            if (e.toString().contains("InputMismatchException")) {
                System.out.println("Du lieu nhap vao khong phai la so thuc!");
            }
            if (e.toString().contains("/ by zero")) {
                System.out.println("Phep chia khong hop le!");
            }
        }

    }

}
