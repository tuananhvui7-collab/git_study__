import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Smartphone> inventory = new ArrayList<>();

        inventory.add(new Smartphone("ip", "ip1", 1002, 1));// add là add object chứ k phải là add String , phải tạo object mới. 
        inventory.add(new Smartphone());
        inventory.set(0, (new Smartphone("io" , "pps", 10132, 1))); //Hay bị indexOutOfBounce
        inventory.size();
        inventory.get(1);
        inventory.remove(1); // 
        inventory.remove("đt việt nam"); // hàm này trả false. vì k tìm thấy nen kệ?


        for (Smartphone elements: inventory){
            System.out.println(elements.getName()); // in luôn element thì lại ra địa chỉ??? Sửa thành getName xem sao
            

        }

        }
        


    }
