public class Main {
    public static void main (String[] args){
    
        Product prod1 = new Product("S1","sanpham1",50000.00,7);
        Product prod2 = new Product("S2","sanpham2", 8000.00, 9);

        // thiếu hàm main.
            // làm sao để có thể gán cứng vào main.java?
            // gán kiểu prod1.name kia gọi là hardcode, khi dữ liệu chưa dc đóng gói. 
            // Đóng gói rồi chỉ dùng đc get set  va constructor.

        System.out.println(prod1.getName() + " " + prod2.getName());
    }
}
