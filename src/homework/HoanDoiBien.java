package homework;

import java.util.Scanner;

public class HoanDoiBien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị a và b
        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        // In giá trị ban đầu
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Sử dụng biến trung gian c để hoán đổi
        int c = a;
        a = b;
        b = c;

        // In giá trị sau khi hoán đổi
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
