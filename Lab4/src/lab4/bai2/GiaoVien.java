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
public class GiaoVien extends Person {

    public int lopDangChuNhiem;
    public String tenBoMon;
    public String thoiKhoaBieuLichDay;

    @Override
    public void hienThiThongTin() {
        System.out.println("\n ==============  Thong tin giao vien:  ==============");
        super.hienThiThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Lop dang chu nhiem: " + lopDangChuNhiem + "\n" + "Tem bo mon: " + tenBoMon + "\n" + "Thoi khoa bieu lich day: " + thoiKhoaBieuLichDay);
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        System.out.println("\n ==  Nhap thong tin giao vien:  ==");
        super.nhapThongTin(sc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        boolean f = false;
        while (f == false) {
            System.out.println("Nhap vao lop dang chu nhiem: ");
            try {
                this.lopDangChuNhiem = Integer.parseInt(sc.nextLine());
                f = true;
            } catch (Exception e) {
                System.out.println("Lop dang chu nhiem khong hop le! Vui long nhap lai!");
            }
        }
        System.out.println("Nhap vao ten bo mon: ");
        this.tenBoMon = String.valueOf(sc.nextLine());
        System.out.println("Nhap vao thoi khoa bieu lich day: ");
        this.thoiKhoaBieuLichDay = String.valueOf(sc.nextLine());
    }

    public GiaoVien(int lopDangChuNhiem, String tenBoMon, String thoiKhoaBieuLichDay, String name, String gender, String queQuan, int birthday) {
        super(name, gender, queQuan, birthday);
        this.lopDangChuNhiem = lopDangChuNhiem;
        this.tenBoMon = tenBoMon;
        this.thoiKhoaBieuLichDay = thoiKhoaBieuLichDay;
    }

    public GiaoVien(int lopDangChuNhiem, String tenBoMon, String thoiKhoaBieuLichDay) {
        this.lopDangChuNhiem = lopDangChuNhiem;
        this.tenBoMon = tenBoMon;
        this.thoiKhoaBieuLichDay = thoiKhoaBieuLichDay;
    }

    public GiaoVien() {
    }

    public int getLopDangChuNhiem() {
        return lopDangChuNhiem;
    }

    public void setLopDangChuNhiem(int lopDangChuNhiem) {
        this.lopDangChuNhiem = lopDangChuNhiem;
    }

    public String getTenBoMon() {
        return tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    public String getThoiKhoaBieuLichDay() {
        return thoiKhoaBieuLichDay;
    }

    public void setThoiKhoaBieuLichDay(String thoiKhoaBieuLichDay) {
        this.thoiKhoaBieuLichDay = thoiKhoaBieuLichDay;
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
