/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab32.baithuchanhDSNhanVien;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    public String maNhanVien;
    public String hoTen;
    public String gender;
    public int namSinh;
    public String queQuan;
    public String tenPhongBan;
    public double salary;
    
    public static void writeToExcel(ArrayList<NhanVien> l) {
        XSSFWorkbook z = new XSSFWorkbook();
        XSSFSheet sheet = z.createSheet("Employee Details");
        Row row1 = sheet.createRow(0);
        Cell cell = row1.createCell(0); 
        cell.setCellValue("Ma nhan vien");
        cell = row1.createCell(1);
        cell.setCellValue("Ho ten");
        cell = row1.createCell(2);
        cell.setCellValue("Gioi tinh");
        cell = row1.createCell(3);
        cell.setCellValue("Nam sinh");
        cell = row1.createCell(4);
        cell.setCellValue("Que quan");
        cell = row1.createCell(5);
        cell.setCellValue("Ten phong ban");
        cell = row1.createCell(6);
        cell.setCellValue("Luong");

        for (int i = 0; i < l.size(); i++) {
            NhanVien x = l.get(i);
            Row row2 = sheet.createRow(i + 1);
            Cell cell2 = row2.createCell(0);
            cell2.setCellValue(x.maNhanVien);
            cell2 = row2.createCell(1);
            cell2.setCellValue(x.hoTen);
            cell2 = row2.createCell(2);
            cell2.setCellValue(x.gender);
            cell2 = row2.createCell(3);
            cell2.setCellValue(x.namSinh);
            cell2 = row2.createCell(4);
            cell2.setCellValue(x.queQuan);
            cell2 = row2.createCell(5);
            cell2.setCellValue(x.tenPhongBan);
            cell2 = row2.createCell(6);
            cell2.setCellValue(x.salary);            
        }

        try {
            String path = "H:/Java/AutomationTesting/JavaGit-main/Lab3.2/DSNhanVien.xlsx";
            FileOutputStream out = new FileOutputStream(new File(path));
            z.write(out);
            out.close();
            System.out.println("File DSNhanVien da duoc luu xuong theo duong dan: '" + path + "'");
        } catch (Exception e) {
            System.out.println("LAB3.2 Some Thing Wrong! \n" + "StringMSG: " + e.toString());
        }

    }
    
    public boolean checkId(ArrayList<NhanVien> l, String id) {
        boolean flag = true;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).maNhanVien.equals(id)) {
                flag = false;
            }
        }
        return flag;
    }

    public NhanVien(String maNhanVien, String hoTen, String gender, int namSinh, String queQuan, String tenPhongBan, double salary) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.gender = gender;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.tenPhongBan = tenPhongBan;
        this.salary = salary;
    }

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
