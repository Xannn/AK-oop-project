/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artkhana;

import java.util.Arrays;

/**
 *
 * @author Dark Master
 */
public class user_data
{
    static int num_of_users;
    
    String f_name, l_name, b_date, u_name, pass, email, phone, team, position;
    //a code to easen the access of the users
    
    //private int code;
    
    public void add_user(String f, String l, String b, String u, String pas, String e, String pn, String t, String p){
        
        this.f_name =f;
        this.l_name =l;
        this.b_date =b;
        this.u_name=u;
        this.pass=pas;
        this.email=e;
        this.phone=pn;
        this.team=t;
        this.position=p;
        
        num_of_users++;
        //code = num_of_users;
    } 
    
    /*int get_code(){
        return code;
    }*/
    
}

class data_list extends user_data{
 
    static user_data[] list = new user_data[400];
    
    
    public void add_user(user_data data){
        
        list[num_of_users]=data;
        num_of_users++;
    } 
    
    public void delete_user(int code){
        
        for(int i=code; i<num_of_users-1; i++)
            list[i]=list[++i];
        num_of_users--;
    }
    
    public void empty_data(){
        
        Arrays.fill(list, null);
        num_of_users=0;
    }
    
}

class Globals{
        
    public static int current_user=0;
    
}