/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.bai3;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Student {

    public String fullName;
    public String address;
    public String dob;
    public String gender;
    public float finalGrade;

    public void showList(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            int order = i + 1;
            System.out.println("============== Student " + order + ":");
            System.out.println("    -Full name: " + s.fullName);
            System.out.println("    -Address: " + s.address);
            System.out.println("    -DOB: " + s.dob);
            System.out.println("    -Gender: " + s.gender);
            System.out.println("    -Final grade: " + s.finalGrade);
            System.out.println("--> Hoc sinh " + s.fullName + " hoc luc " + showHocLuc(s.finalGrade));
        }
    }
    
    public void showAverageGrade(ArrayList<Student> list){
        float sum = 0;
        float average = 0;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            sum = sum + s.finalGrade;            
        }
        average = sum / list.size();
        System.out.println("Diem trung binh cua ca danh sach la: " + average);
    }

    public String showHocLuc(float grade) {
        if (grade < 4) {
            return "KEM";
        } else if (grade >= 4 && grade < 5) {
            return "YEU";
        } else if (grade >= 5 && grade < 5.5) {
            return "TRUNG BINH YEU";
        } else if (grade >= 5.5 && grade < 6.5) {
            return "TRUNG BINH";
        } else if (grade >= 6.5 && grade < 7) {
            return "TRUNG BINH KHA";
        } else if (grade >= 7 && grade < 8) {
            return "KHA";
        } else if (grade >= 8 && grade < 8.5) {
            return "KHA GIOI";
        } else if (grade >= 8.5 && grade <= 10) {
            return "GIOI";
        } else {
            return null;
        }
    }

    public Student() {
    }

    public Student(String fullName, String address, String dob, String gender, float finalGrade) {
        this.fullName = fullName;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.finalGrade = finalGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

}
