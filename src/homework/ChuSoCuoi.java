package homework;

import java.util.Scanner;

public class ChuSoCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên N: ");
        int N = sc.nextInt();
        int chuSoCuoi = Math.abs(N % 10);
        System.out.println("Chữ số cuối cùng của " + N + " là: " + chuSoCuoi);

        sc.close();
    }
}
