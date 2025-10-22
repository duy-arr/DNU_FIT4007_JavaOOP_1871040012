package homework;

import java.util.Scanner;

public class ChuSoGanCuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một số nguyên N (|N| > 9): ");
        int N = sc.nextInt();

        if (Math.abs(N) > 9) {
            int N_abs = Math.abs(N); // lấy trị tuyệt đối
            int ganCuoi = (N_abs / 10) % 10; // lấy chữ số gần cuối

            System.out.println("Chữ số gần cuối của " + N + " là: " + ganCuoi);
        } else {
            System.out.println("Số bạn nhập chưa có 2 chữ số!");
        }

        sc.close();
    }
}
