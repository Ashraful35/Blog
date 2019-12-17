/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;


public class Admin {
    
     public String name;
    public String email;
    public String password;

    public Admin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

   
    
    
    public void show_PrintAdminInfor(){
        System.out.println("The Admin name is:"+"\t"+name);
       
    }
}
