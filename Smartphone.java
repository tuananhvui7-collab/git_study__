public class Smartphone{
    // Khởi tạo biến: tuân thủ encapsulation
    private String id;
    private String name;
    private double price;
    private int stockQuantity;

    // Constructor
    public Smartphone(String id, String name, double price, int stockQuantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    //getter setter

    public void setName(String name){
        if (name != null){
            this.name = name;
        }
    }
    public void setID(String id){
        if (name != null){
            this.id = id;
        }
    }
    public void setPrice(double price){
        if (price >0){
            this.price = price;
        }
    }
    public void setStockQuantity(int stockQuantity){
        if (stockQuantity > 0){
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

}

