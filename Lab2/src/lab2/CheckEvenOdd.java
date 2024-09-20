/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        n = sc.nextInt();
        if (n%2==0) {
            System.out.println("So "+ n +" la so chan!");
        }else{
            System.out.println("So "+ n +" la so le!");
        }
    }
    
}
