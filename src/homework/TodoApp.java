package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    static ArrayList<String> taskDescriptions = new ArrayList<>();
    static ArrayList<Boolean> taskStatuses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Vui lòng chọn một chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Cảm ơn đã sử dụng chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("1. Thêm công việc mới");
        System.out.println("2. Hiển thị danh sách công việc");
        System.out.println("3. Đánh dấu công việc đã hoàn thành");
        System.out.println("4. Xóa công việc");
        System.out.println("5. Thoát chương trình");
    }

    public static void addTask() {
        System.out.println("\n--- Thêm công việc mới ---");
        System.out.print("Nhập mô tả công việc: ");
        String description = scanner.nextLine();

        taskDescriptions.add(description);
        taskStatuses.add(false); // Mặc định công việc mới là "Chưa hoàn thành"

        System.out.println("Đã thêm công việc thành công!");
    }

    public static void displayTasks() {
        System.out.println("\n--- Danh sách công việc ---");
        if (taskDescriptions.isEmpty()) {
            System.out.println("Danh sách công việc trống!");
        } else {
            System.out.println("STT | Mô tả công việc | Trạng thái");
            for (int i = 0; i < taskDescriptions.size(); i++) {
                String description = taskDescriptions.get(i);
                boolean isCompleted = taskStatuses.get(i);
                String status = isCompleted ? "Đã hoàn thành" : "Chưa hoàn thành";
                System.out.printf("%-3d | %-16s | %s\n", (i + 1), description, status);
            }
        }
    }

    public static void markTaskAsCompleted() {
        System.out.println("\n--- Đánh dấu công việc đã hoàn thành ---");
        displayTasks();

        if (taskDescriptions.isEmpty()) {
            return;
        }

        System.out.print("Nhập số thứ tự công việc cần đánh dấu hoàn thành: ");
        int taskIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (taskIndex >= 0 && taskIndex < taskDescriptions.size()) {
            taskStatuses.set(taskIndex, true);
            System.out.println("Đã cập nhật trạng thái công việc thành \"Đã hoàn thành\".");
        } else {
            System.out.println("Số thứ tự không hợp lệ. Vui lòng thử lại.");
        }
    }

    public static void deleteTask() {
        System.out.println("\n--- Xóa công việc ---");
        displayTasks();

        if (taskDescriptions.isEmpty()) {
            return;
        }

        System.out.print("Nhập số thứ tự công việc cần xóa: ");
        int taskIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (taskIndex >= 0 && taskIndex < taskDescriptions.size()) {
            taskDescriptions.remove(taskIndex);
            taskStatuses.remove(taskIndex);
            System.out.println("Đã xóa công việc thành công.");
        } else {
            System.out.println("Số thứ tự không hợp lệ. Vui lòng thử lại.");
        }
    }
}