package homework;

import java.util.Scanner;

public class HoanDoiKhongBienPhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị a và b
        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        // In giá trị ban đầu
        System.out.println("Trước khi hoán đổi: a = " + a + ", b = " + b);

        // Hoán đổi không dùng biến phụ
        a = a + b; // a = tổng của a và b
        b = a - b; // b = (a + b) - b = a ban đầu
        a = a - b; // a = (a + b) - a ban đầu = b ban đầu

        // In kết quả sau khi hoán đổi
        System.out.println("Sau khi hoán đổi: a = " + a + ", b = " + b);

        sc.close();
    }
}
