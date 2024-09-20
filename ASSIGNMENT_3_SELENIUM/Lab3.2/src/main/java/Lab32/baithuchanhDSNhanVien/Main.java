/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab32.baithuchanhDSNhanVien;

import com.lab.lab32.User;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (flag == false) {
            try {
                System.out.println("Nhap vao so luong nhan vien: ");
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
        ArrayList<NhanVien> l = new ArrayList<NhanVien>();
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            NhanVien a = new NhanVien();
            System.out.println("\n ==== Thong tin nhan vien so " + x + " ====");
            boolean checkid = false;
            while (checkid == false) {
                System.out.println("Nhap vao ma nhan vien: ");
                a.maNhanVien = sc.nextLine();
                checkid = a.checkId(l, a.maNhanVien);
                if (checkid == false) {
                    System.out.println("ID da ton tai! Vui long nhap ID khac!");
                }
            }
            System.out.println("Ho va ten: ");
            a.hoTen = sc.nextLine();
            System.out.println("Gioi tinh: ");
            a.gender = sc.nextLine();
            System.out.println("Nam sinh: ");
            boolean ns = false;
            while (ns == false) {
                try {
                    a.namSinh = Integer.parseInt(sc.nextLine());
                    ns = true;
                } catch (Exception e) {
                    System.out.println("Nam sinh khong hop le! Vui long nhap lai");
                }
            }
            System.out.println("Que quan: ");
            a.queQuan = sc.nextLine();
            System.out.println("Ten phong ban: ");
            a.tenPhongBan = sc.nextLine();
            System.out.println("Luong: ");
            boolean slr = false;
            while (slr == false) {
                try {
                    a.salary = Double.parseDouble(sc.nextLine());

                    if (a.salary <= 0) {
                        System.out.println("So luong phai >0! Vui long nhap lai!");
                    } else {
                        slr = true;
                    }
                } catch (Exception e) {
                    System.out.println("So nhap vao khong hop le! Vui long nhap lai!");
                }
            }
            l.add(a);
        }

        //Show
        NhanVien x = new NhanVien();
        x.writeToExcel(l);

    }
}
