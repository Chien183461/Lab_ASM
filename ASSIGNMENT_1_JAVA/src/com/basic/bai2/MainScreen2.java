package com.basic.bai2;

import java.util.Scanner;

public class MainScreen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N > 0) {
            int sumEven = calculateSumEven(N);
            int sumOdd = calculateSumOdd(N);
            int countDivisibleBy3Not2 = countSpecialNumbers(N);

            System.out.println("Tổng các số chẵn từ 0 đến " + N + " là: " + sumEven);
            System.out.println("Tổng các số lẻ từ 0 đến " + N + " là: " + sumOdd);
            System.out.println("Số lượng số chia hết cho 3 nhưng không chia hết cho 2 từ 0 đến " + N + " là: " + countDivisibleBy3Not2);
        } else {
            System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
        }

        scanner.close();
    }

    private static int calculateSumEven(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int calculateSumOdd(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int countSpecialNumbers(int N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
