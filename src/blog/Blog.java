/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Blog {

    
   
    public static void main(String[] args) {
        
        
        
      
        Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter the Bloggers name,Password,Email");
        Bloggers bloggers = new Bloggers(scanner.next(),scanner.next(),scanner.next());
       
        bloggers.show_PrintBloggersInfor();
    
        
        ItemsForBlog items = new ItemsForBlog(bloggers.name,"","");
        System.out.println("Please enter the Title"+"\n");
        items.setTitle(scanner.next());
        System.out.println("Please enter the Description"+"\n");
        items.setDescription(scanner.next());
        System.out.println("Please enter the Date"+"\n");
        items.setDate(scanner.next());
        items.blog_ItemsShow();
        
        Admin admin = new Admin("rasel","124334","11313");
   
        admin.show_PrintAdminInfor();
        
        UpdateBlog update = new UpdateBlog("","","");
        System.out.println("Please enter 1 for admin updates");
       
        if(scanner.nextInt()==1){
            System.out.println("Please enter the Title"+"\n");
            update.setTitle(scanner.next());
            System.out.println("Please enter the Description"+"\n");
            update.setDescription(scanner.next());
            System.out.println("Please enter the Date"+"\n");
            update.setDate(scanner.next());
            System.out.println("Do you want to show admin Update Press 2");
           if(scanner.nextInt()==2){
              update.updateuserBlogItems();
        }
           
            
        }
       
       
       
    }
    
}
