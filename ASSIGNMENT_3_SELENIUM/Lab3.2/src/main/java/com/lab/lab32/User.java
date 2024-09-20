/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.lab32;

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
public class User {

    public String id;
    public String firstName;
    public String lastName;

    public static void writeToExcel(ArrayList<User> l) {
        XSSFWorkbook z = new XSSFWorkbook();
        XSSFSheet sheet = z.createSheet("User Details");
        Row row1 = sheet.createRow(0);
        Cell cell = row1.createCell(0);
        cell.setCellValue("User ID");
        cell = row1.createCell(1);
        cell.setCellValue("First Name");
        cell = row1.createCell(2);
        cell.setCellValue("Last Name");

        for (int i = 0; i < l.size(); i++) {
            User x = l.get(i);
            Row row2 = sheet.createRow(i + 1);
            Cell cell2 = row2.createCell(0);
            cell2.setCellValue(x.id);
            cell2 = row2.createCell(1);
            cell2.setCellValue(x.firstName);
            cell2 = row2.createCell(2);
            cell2.setCellValue(x.lastName);
        }

        try {
            String path = "H:/Java/AutomationTesting/JavaGit-main/Lab3.2/UserDetail.xlsx";
            FileOutputStream out = new FileOutputStream(new File(path));
            z.write(out);
            out.close();
            System.out.println("User Detail da duoc luu xuong theo duong dan: '" + path + "'");
        } catch (Exception e) {
            System.out.println("LAB3.2 Some Thing go wrong! \n" + "StringMSG: " + e.toString());
        }

    }

    public boolean checkId(ArrayList<User> l, String id) {
        boolean flag = true;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).id.equals(id)) {
                flag = false;
            }
        }
        return flag;
    }

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
