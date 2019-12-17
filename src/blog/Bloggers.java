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
public class Bloggers {
    
    public String name;
    public String password;
      public String email;
    public Bloggers(String name, String password,String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

   
    
    
    public void show_PrintBloggersInfor(){
        System.out.println("The blogger's name is:"+"\t"+name);
        System.out.println("The blogger's email"+"\t"+email);
       
    }
    
}
