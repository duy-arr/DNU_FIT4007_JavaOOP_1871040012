package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    // Sử dụng hai ArrayList song song để lưu trữ dữ liệu công việc
    // taskDescriptions: lưu mô tả công việc
    // taskStatuses: lưu trạng thái (true = đã hoàn thành, false = chưa hoàn thành)
    static ArrayList<String> taskDescriptions = new ArrayList<>();
    static ArrayList<Boolean> taskStatuses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            System.out.print("Vui lòng chọn một chức năng: ");
            choice = Integer.parseInt(scanner.nextLine()); // Đọc số và cả ký tự xuống dòng

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
            System.out.println(); // Thêm một dòng trống để dễ nhìn
        } while (choice != 5);

        scanner.close();
    }

    /**
     * Phương thức hiển thị menu chính của ứng dụng
     */
    public static void displayMenu() {
        System.out.println("========== TODO APP MENU ==========");
        System.out.println("1. Thêm công việc mới");
        System.out.println("2. Hiển thị danh sách công việc");
        System.out.println("3. Đánh dấu công việc đã hoàn thành");
        System.out.println("4. Xóa công việc");
        System.out.println("5. Thoát chương trình");
        System.out.println("=================================");
    }

    /**
     * Phương thức thêm một công việc mới vào danh sách
     */
    public static void addTask() {
        System.out.println("\n--- Thêm công việc mới ---");
        System.out.print("Nhập mô tả công việc: ");
        String description = scanner.nextLine();

        taskDescriptions.add(description);
        taskStatuses.add(false); // Mặc định công việc mới là "Chưa hoàn thành"

        System.out.println("Đã thêm công việc thành công!");
    }

    /**
     * Phương thức hiển thị toàn bộ danh sách công việc
     */
    public static void displayTasks() {
        System.out.println("\n--- Danh sách công việc ---");
        if (taskDescriptions.isEmpty()) {
            System.out.println("Danh sách công việc trống!");
        } else {
            System.out.println("STT | Mô tả công việc | Trạng thái");
            System.out.println("-------------------------------------");
            for (int i = 0; i < taskDescriptions.size(); i++) {
                String description = taskDescriptions.get(i);
                boolean isCompleted = taskStatuses.get(i);
                String status = isCompleted ? "Đã hoàn thành" : "Chưa hoàn thành";
                // i + 1 để STT hiển thị cho người dùng bắt đầu từ 1
                System.out.printf("%-3d | %-16s | %s\n", (i + 1), description, status);
            }
        }
    }

    /**
     * Phương thức đánh dấu một công việc là đã hoàn thành
     */
    public static void markTaskAsCompleted() {
        System.out.println("\n--- Đánh dấu công việc đã hoàn thành ---");
        displayTasks(); // Hiển thị danh sách để người dùng chọn

        if (taskDescriptions.isEmpty()) {
            return; // Không làm gì nếu danh sách trống
        }

        System.out.print("Nhập số thứ tự công việc cần đánh dấu hoàn thành: ");
        int taskIndex = Integer.parseInt(scanner.nextLine()) - 1; // Trừ 1 để lấy index trong ArrayList

        // Xử lý lỗi nhập liệu cơ bản
        if (taskIndex >= 0 && taskIndex < taskDescriptions.size()) {
            taskStatuses.set(taskIndex, true);
            System.out.println("Đã cập nhật trạng thái công việc thành \"Đã hoàn thành\".");
        } else {
            System.out.println("Số thứ tự không hợp lệ. Vui lòng thử lại.");
        }
    }

    /**
     * Phương thức xóa một công việc khỏi danh sách
     */
    public static void deleteTask() {
        System.out.println("\n--- Xóa công việc ---");
        displayTasks(); // Hiển thị danh sách để người dùng chọn

        if (taskDescriptions.isEmpty()) {
            return; // Không làm gì nếu danh sách trống
        }

        System.out.print("Nhập số thứ tự công việc cần xóa: ");
        int taskIndex = Integer.parseInt(scanner.nextLine()) - 1; // Trừ 1 để lấy index

        // Xử lý lỗi nhập liệu cơ bản
        if (taskIndex >= 0 && taskIndex < taskDescriptions.size()) {
            taskDescriptions.remove(taskIndex);
            taskStatuses.remove(taskIndex);
            System.out.println("Đã xóa công việc thành công.");
        } else {
            System.out.println("Số thứ tự không hợp lệ. Vui lòng thử lại.");
        }
    }
}