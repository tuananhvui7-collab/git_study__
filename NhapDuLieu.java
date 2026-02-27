import java.util.Scanner;

public class NhapDuLieu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập một chuỗi
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Xin chào, " + name + "!");

    }
}