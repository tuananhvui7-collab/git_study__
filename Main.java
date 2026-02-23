public class Main {
    public static void main (String[] args){

    
    Product prod1 = new Product();
    Product prod2 = new Product();

    prod1.id = "s1";
    prod2.id = "s2";
    // thiếu hàm main.
        // làm sao để có thể gán cứng vào main.java?
        // gán kiểu prod1.name kia gọi là hardcode, khi dữ liệu chưa dc đóng gói. 
        // Đóng gói rồi chỉ dùng đc get set  va constructor.

        System.out.println(prod1.id + " " + prod2.id);
    }
}
