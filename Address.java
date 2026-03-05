package git_study;
public class Address {
    private String street;
    private String ward;
    private String district;
    private String city;
    private Boolean isDefault;

    public void setStreet(String street){ this.street = street;}
    public String getStreet(){ return street;}

    public void setWard(String ward){ this.ward = ward;}
    public String getWard(){ return ward;}

    public void setDistrict(String description){ this.district = district;}
    public String getDistrict(){ return district;}

    public void setCity(String city){ this.city = city;}
    public String getCity(){ return city;}

    public void setIsDefault(Boolean isDefault){ this.isDefault = isDefault;}
    public Boolean IsDefault(){ return isDefault;}
    
    
}
