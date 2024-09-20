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
public class Person {

    protected String name;
    protected String gender;
    protected String queQuan;
    protected int birthday;

    public void nhapThongTin(Scanner sc) {
        boolean flag = false;
        System.out.println("Nhap ten: ");
        this.name = String.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        this.gender = String.valueOf(sc.nextLine());
        System.out.println("Nhap que quan: ");
        this.queQuan = String.valueOf(sc.nextLine());
        while (flag == false) {
            try {
                System.out.println("Nhap nam sinh: ");
                this.birthday = Integer.parseInt(sc.nextLine());
                flag = true;
            } catch (Exception e) {
                System.out.println("Nam sinh khong hop le! Vui long nhap lai!");
                
            }
        }
    }
    
    public void hienThiThongTin(){
        System.out.println("Ho ten: " + name);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Nam sinh: " + birthday);
    }

    public Person(String name, String gender, String queQuan, int birthday) {
        this.name = name;
        this.gender = gender;
        this.queQuan = queQuan;
        this.birthday = birthday;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", queQuan=" + queQuan + ", birthday=" + birthday + '}';
    }

}
