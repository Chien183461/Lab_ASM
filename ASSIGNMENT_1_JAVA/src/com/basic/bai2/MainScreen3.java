package com.basic.bai2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MainScreen3 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập vào một số nguyên dương N: ");
    int N = scanner.nextInt();

    if (N > 0) {
        int sumEven = IntStream.rangeClosed(0, N).filter(i -> i % 2 == 0).sum();
        int sumOdd = IntStream.rangeClosed(0, N).filter(i -> i % 2 != 0).sum();
        long countDivisibleBy3Not2 = IntStream.rangeClosed(0, N)
                .filter(i -> i % 3 == 0 && i % 2 != 0)
                .count();

        System.out.println("Tổng các số chẵn từ 0 đến " + N + " là: " + sumEven);
        System.out.println("Tổng các số lẻ từ 0 đến " + N + " là: " + sumOdd);
        System.out.println("Số lượng số chia hết cho 3 nhưng không chia hết cho 2 từ 0 đến " + N + " là: " + countDivisibleBy3Not2);
    } else {
        System.out.println("Vui lòng nhập một số nguyên dương lớn hơn 0.");
    }

    scanner.close();
}
}
