package git_study;
public class Category {
    private String name;
    private String slug;
    private boolean isActive;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSlug(String slug){
        this.slug = slug;
    }
    public String getSlug(){
        return slug;
    }

    public boolean isActive(){
        return isActive;
    }
    public void setActice(boolean isActive){
        this.isActive = isActive;

    }
    
}
