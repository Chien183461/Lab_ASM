/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.bai2;

import java.util.Scanner;

/**
 *
 * @author St
 */
public class NhanVien extends Person{
    public String phongBan;
    public String chucVu;

    @Override
    public void hienThiThongTin() {
        System.out.println("\n ==============  Thong tin nhan vien:  ==============");
        super.hienThiThongTin();
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        System.out.println("\n ==  Nhap thong tin nhan vien:  ==");
        super.nhapThongTin(sc);
        System.out.println("Nhap phong ban: ");
        this.phongBan = String.valueOf(sc.nextLine());
        System.out.println("Nhap chuc vu: ");
        this.chucVu = String.valueOf(sc.nextLine());
    }
    
    

    public NhanVien() {
    }

    public NhanVien(String phongBan, String chucVu, String name, String gender, String queQuan, int birthday) {
        super(name, gender, queQuan, birthday);
        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }

    public NhanVien(String phongBan, String chucVu) {
        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
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
