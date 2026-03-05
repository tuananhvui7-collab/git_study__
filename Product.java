package git_study;
enum ProductStatus{
    IN_STOCK,
    OUT_OF_STOCK;

}

public class Product {
    private String name; 
    private String brand;
    private String description;
    private ProductStatus status;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }


    public String getBrand(){
        return brand;

    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getDescription(){
        return description;

    }
    public void setDescription(String description){
        this.description = description;
        
    }
    public ProductStatus getStatus(){
        return status;

    }
    public void setStatus(ProductStatus status){
        this.status = status;
        
    }



}
