/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.bai3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class MainScreen {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$"
                + "", Pattern.CASE_INSENSITIVE);

        String action = "y";
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        Student s;
        while (action.equalsIgnoreCase("y")) {
            s = new Student();
            System.out.println("=== Input Student Info ===");
            System.out.println("Full name: ");
            s.fullName = sc.nextLine();
            System.out.println("Address: ");
            s.address = sc.nextLine();
            boolean checkdob = false;
            System.out.println("Day of Birth: ");
            while (checkdob == false) {
                s.dob = sc.nextLine();
                Matcher matcher = pattern.matcher(s.dob);
                checkdob = matcher.find();
                if (checkdob == false) {
                    System.out.println("Day of birth invalid !!! Please input again!!!");
                }
            }

            System.out.println("Gender: ");
            s.gender = sc.nextLine();
            System.out.println("Final grade: ");
            boolean checkgrade = false;
            while (checkgrade == false) {
                try {
                    s.finalGrade = Float.parseFloat(sc.nextLine());
                    if (s.finalGrade > 10 || s.finalGrade < 0) {
                        System.out.println("Final Grade must be 0-10 !!! Please input again!");
                    } else {
                        checkgrade = true;
                    }
                } catch (Exception e) {
                    System.out.println("Final Grade invalid !!! Please input again!");
                }
            }
            list.add(s);
            System.out.println("Do you want to continue (Y/N)?");
            boolean conti = true;
            while (conti) {
                action = sc.nextLine();
                if (!action.equalsIgnoreCase("y") && !action.equalsIgnoreCase("n")) {
                    System.out.println("Your input is invalid!!! Please input Y / N !!!");
                } else if (action.equalsIgnoreCase("n")) {
                    action = "n";
                    conti = false;
                    s.showList(list);
                    s.showAverageGrade(list);
                    //System.exit(0);
                } else if (action.equalsIgnoreCase("y")) {
                    conti = false;
                }
            }

        }

    }
}
