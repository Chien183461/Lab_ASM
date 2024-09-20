/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
    

public class HinhTamGiac {
    public int c1;
    public int c2;
    public int c3;
    
    public int tinhChuVi() { //hàm tính chu vi tam giác
        return this.c1 + this.c2 + this.c3; //tính và trả về chu vi theo công thức 
    }
    
    public float tinhDienTich(){ //hàm tính diện tích tam giác
        float p = 0; //khai bao p
        p = (this.c1 + this.c2 + this.c3)/2; //tinh p 
        return (float)Math.sqrt(p * (p-this.c1) * (p-this.c2) * (p-this.c3)); //tính và trả về diện tích theo công thức
    }
    public static void main(String[] args) {
        HinhTamGiac tg = new HinhTamGiac();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh 1: ");
        tg.c1 = sc.nextInt();
        System.out.println("Nhap vao canh 2: ");
        tg.c2 = sc.nextInt();
        System.out.println("Nhap vao canh 3: ");
        tg.c3 = sc.nextInt();
        System.out.println("Chu vi hinh tam giac la: " + tg.tinhChuVi());
        System.out.println("Dien tich hinh tam giac la: " + tg.tinhDienTich());
    }
}
