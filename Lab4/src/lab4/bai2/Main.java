/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("==============MENU==============");
        System.out.println("1 - Nhap va hien thong tin lop hoc");
        System.out.println("2 - Nhap va hien thong tin hoc sinh");
        System.out.println("3 - Nhap va hien thong tin giao vien");
        System.out.println("4 - Nhap va hien thong tin nhan vien");
        while (flag == false) {
            System.out.println("Vui long chon chuc nang: \n");
            try {
                int n = Integer.parseInt(sc.nextLine());
                ArrayList a = new ArrayList();
                if (n > 0 && n < 5 && n == 1) {
                    LopHoc lh = new LopHoc();
                    lh.nhapThongTin(sc);
                    lh.hienThongTin();
                    flag = true;
                } else if (n > 0 && n < 5 && n == 2) {
                    Person h = new HocSinh();
                    h.nhapThongTin(sc);
                    h.hienThiThongTin();
                    flag = true;
                } else if (n > 0 && n < 5 && n == 3) {
                    Person g = new GiaoVien();
                    g.nhapThongTin(sc);
                    g.hienThiThongTin();
                    flag = true;
                } else if (n > 0 && n < 5 && n == 4) {
                    Person nv = new NhanVien();
                    nv.nhapThongTin(sc);
                    nv.hienThiThongTin();
                    flag = true;
                } else {
                    System.out.println("Lua chon khong hop le!!! \n");
                }
            } catch (Exception e) {
                if (e.toString().contains("NumberFormatException")) {
                    System.out.println("So nhap vao khong hop le!!!");
                } else {
                    System.out.println("LAB 4 ERROR!!! Msg: 17/6/2024 +" + e);
                }
            }
        }

    }
}
