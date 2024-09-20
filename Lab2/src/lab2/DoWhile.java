/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DoWhile {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so nguyen N: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("N = " +n);
    }
}
