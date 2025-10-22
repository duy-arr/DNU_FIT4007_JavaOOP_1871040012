package homework;

import java.util.Scanner;

public class NamSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tuổi
        System.out.print("Nhập tuổi của sinh viên (tính đến năm 2023): ");
        int tuoi = sc.nextInt();

        // Tính năm sinh
        int namSinh = 2023 - tuoi;

        // Xuất kết quả
        System.out.println("Năm sinh của sinh viên là: " + namSinh);

        sc.close();
    }
}
