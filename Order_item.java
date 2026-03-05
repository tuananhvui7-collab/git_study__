package git_study;

import java.math.BigDecimal;

public class Order_item {
    private int quantity;
    private BigDecimal unit_price;

    public void setQuantity(int quantity){ this.quantity = quantity;}
    public BigDecimal getUnitPrice(){ return unit_price;}

    public void setUnitPrice(BigDecimal unit_price){ this.unit_price = unit_price;}
    public int getquantity(){ return quantity;}
    
}
