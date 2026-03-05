package git_study;
import java.time.LocalDateTime;

enum PaymentMethod{
    COD, 
    VN_PAY,
    MOMO;

}
enum PaymentStatus{
    PENDING,
    SUCCESS, 
    FAILED;

}

public class payment {
    private PaymentMethod method;
    private PaymentStatus status;
    private String transactionRef;
    private LocalDateTime paidAt;


    public void setPaymentMethod(PaymentMethod method){ this.method = method;}
    public PaymentMethod getPaymentMethod(){ return method;}

    public void setPaymentStatus(PaymentStatus status){ this.status = status;}
    public PaymentStatus getPaymentStatus(){ return status;}

    public void setTransactionRef(String transactionRef){ this.transactionRef = transactionRef;}
    public String getTransactionRef(){ return transactionRef;}

    public void setPaidAt(LocalDateTime paidAt){ this.paidAt = paidAt;}
    public LocalDateTime getPaidAt(){ return paidAt;}

    
}
