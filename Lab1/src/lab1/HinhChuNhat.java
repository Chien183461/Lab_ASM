/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class HinhChuNhat {
    public int chieudai;
    public int chieurong;
    
    public int tinhChuVi() {
        return (this.chieudai + this.chieurong)*2;        
    }
    
    public int tinhDienTich(){
        return this.chieudai * this.chieurong;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        hinhchunhat.chieudai = sc.nextInt();
        System.out.println("Nhap vao chieu rong: ");
        hinhchunhat.chieurong = sc.nextInt();
        System.out.println("Chu vi hinh chu nhat la: " + hinhchunhat.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat la: " + hinhchunhat.tinhDienTich());
    }
    
}
