package git_study;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product();
        String name = p1.name;
        ProductStatus status = p1.status;

        if (status == ProductStatus.IN_STOCK){
            System.out.println("CÒn hàng");
        }

        //Enum : .values() se dua cac gia tri enum thanh 1 mảng
        for (ProductStatus s : ProductStatus.values()){
            System.out.println(s);
            System.out.println(s.quantity);

        }


    }    
}
