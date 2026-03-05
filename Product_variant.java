package git_study;
import java.math.BigDecimal;

public class Product_variant {

    private String color;
    private int storageGB;
    private BigDecimal price;
    private int stockQty;
    private String sku;

    public void setColor(String color){ this.color = color;}

    public String getColor(){ return color;}   

    public void setStorageGB(int storageGB){ this.storageGB = storageGB;}

    public int getStorageGB(){ return storageGB;}    

    public void setPrice(BigDecimal price){ this.price = price;}

    public BigDecimal getPrice(){ return price;}    

    public void setStockQty(int stockQty){ this.stockQty = stockQty;}

    public int getStockQty(){ return stockQty;}    

    public void setSku(String sku){ this.sku = sku;}

    public String getSku(){ return sku;}    
    
    
}
