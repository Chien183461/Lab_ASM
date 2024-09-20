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
public class HocSinh extends Person {

    public String thoiKhoaBieuLichHoc;
    public String giaoVienChuNhiem;
    public int lopDangTheoHoc;

    @Override
    public String toString() {
        return "Thong tin hoc sinh: "
                + "\n" + "Ho Ten: " + name + ""
                + "\n" + "Gioi tinh: " + gender + ""
                + "\n" + "Que quan: " + queQuan + ""
                + "\n" + "Nam sinh: " + birthday + ""
                + "\n" + "Lop dang theo hoc: " + lopDangTheoHoc + ""
                + "\n" + "Giao vien chu nhiem: " + giaoVienChuNhiem + ""
                + "\n" + "Thoi khoa bieu lich hoc: " + thoiKhoaBieuLichHoc;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        System.out.println("\n ==  Nhap thong tin hoc sinh:  ==");
        super.nhapThongTin(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        boolean x = false;
        while (x == false) {
            System.out.println("Nhap lop dang theo hoc: ");
            try {
                this.lopDangTheoHoc = Integer.parseInt(sc.nextLine());
                x = true;
            } catch (Exception e) {
                System.out.println("Lop dang hoc khong hop le! Vui long nhap lai!");
            }
        }
        System.out.println("Nhap giao vien chu nhiem: ");
        this.giaoVienChuNhiem = String.valueOf(sc.nextLine());
        System.out.println("Nhap thoi khoa bieu lich hoc: ");
        this.thoiKhoaBieuLichHoc = String.valueOf(sc.nextLine());
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n ==============  Thong tin hoc sinh:  ==============");
        super.hienThiThongTin();
        System.out.println("Lop dang theo hoc: " + lopDangTheoHoc);
        System.out.println("Giao vien chu nhiem: " + giaoVienChuNhiem);
        System.out.println("Thoi khoa bieu lich hoc: " + thoiKhoaBieuLichHoc);
    }

    public HocSinh(String thoiKhoaBieuLichHoc, String giaoVienChuNhiem, int lopDangTheoHoc, String name, String gender, String queQuan, int birthday) {
        super(name, gender, queQuan, birthday);
        this.thoiKhoaBieuLichHoc = thoiKhoaBieuLichHoc;
        this.giaoVienChuNhiem = giaoVienChuNhiem;
        this.lopDangTheoHoc = lopDangTheoHoc;
    }

    public HocSinh(String thoiKhoaBieuLichHoc, String giaoVienChuNhiem, int lopDangTheoHoc) {
        this.thoiKhoaBieuLichHoc = thoiKhoaBieuLichHoc;
        this.giaoVienChuNhiem = giaoVienChuNhiem;
        this.lopDangTheoHoc = lopDangTheoHoc;
    }

    public HocSinh() {
    }

    public String getThoiKhoaBieuLichHoc() {
        return thoiKhoaBieuLichHoc;
    }

    public void setThoiKhoaBieuLichHoc(String thoiKhoaBieuLichHoc) {
        this.thoiKhoaBieuLichHoc = thoiKhoaBieuLichHoc;
    }

    public String getGiaoVienChuNhiem() {
        return giaoVienChuNhiem;
    }

    public void setGiaoVienChuNhiem(String giaoVienChuNhiem) {
        this.giaoVienChuNhiem = giaoVienChuNhiem;
    }

    public int getLopDangTheoHoc() {
        return lopDangTheoHoc;
    }

    public void setLopDangTheoHoc(int lopDangTheoHoc) {
        this.lopDangTheoHoc = lopDangTheoHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

}
