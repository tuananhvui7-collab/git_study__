package git_study;
enum Role{
    MANAGER, 
    EMPLOYEE,
    CUSTOMER;
}



public class User {
    private String email;
    private String username;
    private String passwordHash;
    private String phone;
    private String fullName;
    private Boolean isActive;
    private Role role;

    public void setEmail(String email){ this.email = email;}
    public String getEmail(){ return email;}

    public void setUsername(String username){ this.username = username;}
    public String getUsername(){ return username;}

    public void setPasswordHash(String passwordHash){ this.passwordHash = passwordHash;}
    public String getPasswordHash(){ return passwordHash;}

    public void setFullName(String fullName){ this.fullName = fullName;}
    public String getFullName(){ return fullName;}

    public void setIsActive(Boolean isActive){ this.isActive = isActive;}
    public Boolean isActive(){ return isActive;}

    public void setPhone(String phone){ this.phone = phone;}
    public String getPhone(){ return phone;}

    public void setRole(Role role){ this.role = role;}
    public Role getRole(){return role;}

}
