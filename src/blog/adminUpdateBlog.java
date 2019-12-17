/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

/**
 *
 * @author Rasel
 */
abstract class adminUpdateBlog extends ItemsForBlog{
    
    public adminUpdateBlog(String name, String email, String password) {
        super(name, email, password);
    }
    abstract void updateuserBlogItems();
    
   
    
}
