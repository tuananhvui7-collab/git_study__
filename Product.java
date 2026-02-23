public class Product {

    private String id;
    private String name;
    private Double price;
    private int quantity;

    public Product(String id, String name, Double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public void setName(String name){
        if (name != null){
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }


}

