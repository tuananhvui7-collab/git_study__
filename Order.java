package git_study;
import java.time.LocalDateTime;
import java.math.BigDecimal;

enum OrderStatus{
    PENDING,
    CONFIRMED, 
    SHIPPING;

}

public class Order {
    private String orderCode;
    private OrderStatus status;
    private BigDecimal totalAmount;
    private String note;
    private LocalDateTime createdAt;


    public void setOrderCode(String orderCode){ this.orderCode = orderCode;}
    public String getOrderCode(){ return orderCode;}

    public void setStatus(OrderStatus status){ this.status = status;}
    public OrderStatus getStatus(){ return status;}

    public void setTotalAmount(BigDecimal totalAmount){ this.totalAmount = totalAmount;}
    public BigDecimal getTotalAmount(){ return totalAmount;}

    public void setNote(String note){ this.note = note;}
    public String getNote(){ return note;}

    public void setCreatedAt(LocalDateTime createdAt){ this.createdAt = createdAt;}
    public LocalDateTime getCreatedAt(){ return createdAt;}

}    