package homework;

import java.util.Scanner;

public class DoDaiTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();

        // Lấy độ dài tên
        int doDai = ten.length();

        // Xuất kết quả
        System.out.println("Độ dài tên của bạn là: " + doDai);

        sc.close();
    }
}
