package blog;

public class ItemsForBlog extends Bloggers{

    private String title;
    private String description;
    private String date;

    public ItemsForBlog(String name, String email, String password) {
        super(name, email, password);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void blog_ItemsShow(){
        System.out.println("The user's"+"\t"+name);       
        System.out.println("Title is:"+"\t"+title);
        System.out.println("Description of blog"+"\t"+description);
        System.out.println("Date is:"+"\t"+date);
    }

}
