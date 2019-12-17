
package blog;

import javax.swing.JOptionPane;


public class UpdateBlog extends adminUpdateBlog{

    public UpdateBlog(String name, String email, String password) {
        super(name, email, password);
    }
    
   
    
    void updateuserBlogItems(){
        System.out.println("Admin update Title"+"\t"+getDescription());
        System.out.println("Admin update Description"+"\t"+getDescription());
        System.out.println("Admin update Date"+"\t"+getDescription());
    }
    
    void message(){
        JOptionPane.showMessageDialog(null, "Update successfully");
    }
}
