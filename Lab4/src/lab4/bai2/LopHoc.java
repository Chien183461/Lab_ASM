/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LopHoc {

    public String tenLop;
    public int siSo;
    public int khoi;

    public void nhapThongTin(Scanner sc) {
        System.out.println("\n ==  Nhap thong tin lop hoc:  ==");
        System.out.println("Nhap ten lop: ");
        this.tenLop = String.valueOf(sc.nextLine());
        boolean flag1 = false;
        while (flag1 == false) {
            try {
                System.out.println("Nhap si so: ");
                this.siSo = Integer.parseInt(sc.nextLine());
                flag1 = true;
            } catch (Exception e) {
                System.out.println("Si so khong hop le! Vui long nhap lai!");
            }
        }
        boolean flag2 = false;
        while (flag2 == false) {
            try {
                System.out.println("Nhap so khoi: ");
                this.khoi = Integer.parseInt(sc.nextLine());
                flag2 = true;
            } catch (Exception e) {
                System.out.println("So khoi khong hop le! Vui long nhap lai!");
            }
        }
    }
    
    public void hienThongTin(){
        System.out.println("\n ==============  Thong tin lop hoc:  ==============");
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Si so: " + siSo);
        System.out.println("Khoi: " + khoi);
    }

    @Override
    public String toString() {
        return "LopHoc{" + "tenLop=" + tenLop + ", siSo=" + siSo + ", khoi=" + khoi + '}';
    }

    public LopHoc() {
    }

    public LopHoc(String tenLop, int siSo, int khoi) {
        this.tenLop = tenLop;
        this.siSo = siSo;
        this.khoi = khoi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public int getKhoi() {
        return khoi;
    }

    public void setKhoi(int khoi) {
        this.khoi = khoi;
    }

}
