package homework;

import java.util.Scanner;

public class ChuSoCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập một số nguyên N: ");
        int N = sc.nextInt();

        // Lấy chữ số cuối cùng (dùng trị tuyệt đối để tránh âm)
        int chuSoCuoi = Math.abs(N % 10);

        // Xuất kết quả
        System.out.println("Chữ số cuối cùng của " + N + " là: " + chuSoCuoi);

        sc.close();
    }
}
