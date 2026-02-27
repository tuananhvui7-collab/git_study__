public class Smartphone{
    // Khởi tạo biến: tuân thủ encapsulation
    private String id;
    private String name;
    private int price;
    private int stockQuantity;

    // Constructor
    public Smartphone(String id, String name, int price, int stockQuantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public Smartphone(){}

    //getter setter

    public void setName(String name){
        if ((name != null) && (name != "")) {
            this.name = name;
        }
    }
    public void setID(String id){
        if (id != null){
            this.id = id;
        }
    }
    public void setPrice(int price){
        double old_price = this.getPrice();
        if (price >= 0) {
            this.price = price;
            // log phải ghi sau khi validate, phải ghi sau khi cập nhật, k dc ghi trước.
            System.out.println("Giá đã  được cập nhật từ "+ old_price + " sang " +  this.getPrice());

        }
        
    }
    public void setStockQuantity(int stockQuantity){
        if (stockQuantity >= 0){ // kho phải lớn hơn hoặc bằng 0
            this.stockQuantity = stockQuantity;
        }
    }

    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int stockQuantity(){
        return stockQuantity;
    }
    // Ham check kho
    public boolean checkInventory(int quantity){
        if (stockQuantity < quantity){
            System.out.println("Kho hết hàng hoặc không đủ số lượng cần mua. ");
            return false;
        }
        return true;
        
    }
    // Ham tu dong tru kho

    public void reduceStock(int quantity){

        stockQuantity = stockQuantity - quantity;
        System.out.println("Cập nhật giá stockQuantity: " + stockQuantity);
        

    }
    

}

