package homework;

import java.util.Scanner;

public class PhepToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        if (b != 0) {
            int thuongNguyen = a / b;
            double thuongThuc = (double)a / b;

            System.out.println("Tổng = " + tong);
            System.out.println("Hiệu = " + hieu);
            System.out.println("Tích = " + tich);
            System.out.println("Thương (số nguyên) = " + thuongNguyen);
            System.out.println("Thương (số thực) = " + thuongThuc);
        } else {
            System.out.println("Không thể chia cho 0!");
        }
        sc.close();
    }
}
