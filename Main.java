import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Task Menu cơ bản: Xem kho, Nạp tiền ví, Mua hàng
        // Đầu tiên phải khởi tạo người dùng.
        // Giả sử có người dùng sẵn/

        Customer cus1 = new Customer(100000); // Tạo khách hàng để thực hiện được chức năng 2.

        // Tạo kho sản phẩm:

        Smartphone smart1 = new Smartphone("id1", "iphone", 100, 2);
        Smartphone smart2 = new Smartphone("id2", "samsung gập", 80, 5);

        //ArrayList<Smartphone> inventory = new ArrayList<>(); Nâng trình lên
        Inventory inventory = new Inventory();
        inventory.addSmartphone(smart1);
        inventory.addSmartphone(smart2);
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Tạo chương trình menu cơ bản
            System.out.println("Menu cơ bản");
            System.out.println("Nhập 1 để xem kho");
            System.out.println("Nhập 2 để nạp tiền");
            System.out.println("Nhập 3 để mua hàng");

            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                // Xem kho
                inventory.showAll();
                
            } else if (choice == 2) {
                System.out.println("Nhập số tiền muón nạp");
                int amount = Integer.parseInt(sc.nextLine());

                cus1.topUp(amount);
                cus1.getBalance();


            } else if (choice == 3) { // 1. Khách hàng chọn chức năng mua hàng

                // Quy trình mua hàng
                System.out.println("Chọn mua hàng bằng tên hay index nhỉ?");
                System.out.println("Chọn mua bằng tên: 1");
                System.out.println("CHọn mua băng số : 0 ");

                int choose = Integer.parseInt(sc.nextLine());

                if (choose == 0) {
                    System.out.println("Bạn mua đơn nào ?");
                    int index = Integer.parseInt(sc.nextLine());

                    Smartphone element = inventory.getByIndex(index);
                    if (element == null) {
                        System.out.println("Vị trí sản phẩm không tồn tại!");
                        continue;
                    }

                    System.out.println("Bạn mua mấy đơn?");
                    int num_purchase = Integer.parseInt(sc.nextLine());

                    // check kho xem mua do duoc khong
                    if (element.checkInventory(num_purchase) == false) {
                        continue;
                    } else {
                        int total = (int) element.getPrice() * num_purchase; 
                        if (cus1.getBalance() < total) {
                            System.out.println("Số dư của bạn không đủ để mua hàng");
                            continue;
                        }
                        // 2. Console xác nhận mua hàng bằng cách trừ tiền. (dundj vào ví của người
                        // dùng. )

                        cus1.pay(total);

                        // 3. Console cập nhật kho
                        element.reduceStock(num_purchase);// thừa lệnh trong hàm. đã sửa.

                        // 4. Console xác nhận mua hàng thành công.
                        System.out.println("Đặt hàng bằng số thành công.");
                    }
                } else if (choose == 1) {
                    System.out.println("Nhập tên: ");
                    String name_input = sc.nextLine();
                    Smartphone found_phone = inventory.findByName(name_input);

                    // vòng lặp check tên
                    
                    if (found_phone != null) {
                        System.out.println("Tiến hành các bước mua hàng bình thường.");
                        // đã biết hàng gì.
                        // chỉ cần check số lượng. check giá, thanh toán.
                        System.out.println("Nhập số lượng muốn mua: ");
                        int num_purchase = Integer.parseInt(sc.nextLine());

                        if (found_phone.checkInventory(num_purchase) == false) {
                            continue;
                        } else {
                            int total = (int) found_phone.getPrice() * num_purchase;
                            // 2. Console xác nhận mua hàng bằng cách trừ tiền. (dundj vào ví của người
                            // dùng. )

                            cus1.pay(total);

                            // 3. Console cập nhật kho
                            found_phone.reduceStock(num_purchase);// thừa lệnh trong hàm. đã sửa.

                            // 4. Console xác nhận mua hàng thành công.
                            System.out.println("Đặt hàng bằng tên thành công.");
                        }
                    } else {
                        System.out.println("Không tìm thấy tên này!");
                    }
                    // Nos cung la tu ten ve index ma thoi. Phai co bien nhap ten va bien true/false
                    // check dung hay sai.
                }
            } else {
                throw new Exception("Số không đúng những gì yêu cầu nhập");
            }

        }
    }

}