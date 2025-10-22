package homework;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 cạnh của tam giác
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        // Kiểm tra điều kiện tam giác
        if (a + b > c && a + c > b && b + c > a) {
            // Tính chu vi
            double chuVi = a + b + c;

            // Tính nửa chu vi
            double p = chuVi / 2;

            // Áp dụng công thức Heron để tính diện tích
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // Xuất kết quả
            System.out.println("Chu vi tam giác = " + chuVi);
            System.out.println("Diện tích tam giác = " + dienTich);
        } else {
            System.out.println("Ba cạnh nhập vào không tạo thành tam giác!");
        }

        sc.close();
    }
}
