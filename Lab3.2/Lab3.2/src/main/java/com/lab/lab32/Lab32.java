/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.lab.lab32;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab32 {

    public static void main(String[] args) {
        boolean flag = false;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (flag == false) {
            try {
                System.out.println("Nhap vao so User: ");
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    flag = true;
                } else {
                    System.out.println("So nhap vao phai > 0 !!! Vui long nhap lai");
                }
            } catch (Exception e) {
                System.out.println("So nhap vao khong hop le");
            }
        }
        ArrayList<User> l = new ArrayList<User>();
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            User a = new User();
            System.out.println("\n ==== Thong tin User so " + x + " ====");
            boolean checkid = false;
            while (checkid == false) {
                System.out.println("Nhap vao ID: ");
                a.id = sc.nextLine();
                checkid = a.checkId(l, a.id);
                if (checkid == false) {
                    System.out.println("ID da ton tai! Vui long nhap ID khac!");
                }
            }
            System.out.println("First Name: ");
            a.firstName = sc.nextLine();
            System.out.println("Last Name: ");
            a.lastName = sc.nextLine();
            l.add(a);
        }
        
        //Show
        User x = new User();
        x.writeToExcel(l);
        
    }
}
