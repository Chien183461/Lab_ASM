/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class While {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen N: ");
        n = sc.nextInt();
        System.out.println("Day so giam dan la: ");
        while(n>=1){
            System.out.print(n + " ");
            n--;
        }
    }
}
