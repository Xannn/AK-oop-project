/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artkhana;

import artkhana.LoginForm;
import java.awt.*;
import javax.swing.JFrame;
import artkhana.RegisterForm;
import artkhana.user_data;
import artkhana.data_list;
import artkhana.app;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dark Master
 */
//at start fill the containers from file (done) 
//at running deal with containers (keda keda)
//at end clear file and save the data from containers in file6+
public class Main
{
    public static void fillarray() throws IOException
    {

        BufferedReader reader;
        try{  
            reader = new BufferedReader(new FileReader("C:\\Users\\Dark Master\\Desktop\\Artkhana\\users.txt"));
            String line = reader.readLine();
               while(line != null)
                {

                    System.out.println(line);
                    line = reader.readLine();
                }
 
            reader.close();
        } catch (FileNotFoundException ex){
            
            System.out.println("catch fillaray function exception");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //----------------------------------------------------------------------------------------------------//
        
        
        
        Scanner read = new Scanner(new File("C:\\Users\\Dark Master\\Desktop\\Artkhana\\users.txt"));
        read.useDelimiter(",");
        
        while(read.hasNext()){
            
            user_data user = new user_data();
            
            String fn, ln, bd, un, ps, em, pn, t, p;
            fn=read.next();
            ln=read.next();
            bd=read.next();
            un=read.next();
            ps=read.next();
            em=read.next();
            pn=read.next();
            t=read.next();
            p=read.next();
            
            user.add_user(fn, ln, bd, un, ps, em, pn, t, p);
            data_list.list[user_data.num_of_users]=user;
            
        }
    }
    
    public static void showdata(){
        
        System.out.println(data_list.num_of_users);
        
        for(int i=1; i<user_data.num_of_users; i++){
            
            System.out.print(data_list.list[i].f_name);
            System.out.print(data_list.list[i].l_name);
            System.out.print(data_list.list[i].b_date);
            System.out.print(data_list.list[i].u_name);
            System.out.print(data_list.list[i].pass);
            System.out.print(data_list.list[i].email);
            System.out.print(data_list.list[i].phone);
            System.out.print(data_list.list[i].team);
            System.out.print(data_list.list[i].position);
            
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws IOException{
        
        System.out.print(user_data.num_of_users);
        
        //new LoginForm();
        fillarray();
        showdata();
        
        LoginForm lgnf = new LoginForm();
        lgnf.setVisible(true);
        lgnf.setLocationRelativeTo(null);
        lgnf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lgnf.pack();
                
    }
}
