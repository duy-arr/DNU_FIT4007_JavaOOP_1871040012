package homework;

import java.util.Scanner;

public class KyTuLienSau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một ký tự thường (a - y): ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'y') {
            char nextChar = (char) (ch + 1);
            System.out.println("Ký tự liền sau '" + ch + "' là: " + nextChar);
        } else if (ch == 'z') {
            System.out.println("Nhập 'z', không có ký tự liền sau trong bảng chữ cái thường!");
        } else {
            System.out.println("Nhập sai, vui lòng nhập ký tự từ 'a' đến 'y'.");
        }

        sc.close();
    }
}
