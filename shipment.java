package git_study;
import java.time.LocalDateTime;

enum ShipmentStatus{
    DELIVERES,
    NOT;
}
public class shipment {
    private String carrier;
    private String trackingCode;
    private ShipmentStatus status;
    private LocalDateTime estimatedAt;

    public void setCarrier(String carrier){ this.carrier = carrier;}
    public String getCarrier(){ return carrier;}
    public void setTrackingCode(String trackingCode){ this.trackingCode = trackingCode;}
    public String getTrackingCode(){ return trackingCode;}
    public void setStatus(ShipmentStatus status){ this.status = status;}
    public ShipmentStatus getStatus(){ return status;}
    public void setEstimatedAt(LocalDateTime estimatedAt){ this.estimatedAt = estimatedAt;}
    public LocalDateTime getEstimatedAt(){ return estimatedAt;}
    
}
