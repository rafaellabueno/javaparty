/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.gitlab.rafaellabueno.model.Cliente;
import com.gitlab.rafaellabueno.model.Festa;

/**
 *
 * @author Rafael
 */
public class ArquivinhosUtil {
    public static List <Festa> CarregaFesta() {
         
        List f;
        
        try {
            FileInputStream fos = new FileInputStream("Festa.txt");
            ObjectInputStream ois = new ObjectInputStream(fos);
            f = (List <Festa>) ois.readObject();
            System.out.println(f);
            
            fos.close();
            ois.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return f;
    }
    
    public static boolean SalvaFesta(List<Festa> f) {
        
        try{
            FileOutputStream fos = new FileOutputStream("Festa.txt", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(f);
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    
    public static List <Cliente> CarregaCliente () {
         
        List c;
        
        try {
            FileInputStream fos = new FileInputStream("Cliente.txt");
            ObjectInputStream ois = new ObjectInputStream(fos);
            c = (List <Cliente>) ois.readObject();
            System.out.println(c);
            
            fos.close();
            ois.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return c;
    }
    
    public static boolean SalvaCliente(List<Cliente> f) {
        
        try{
            FileOutputStream fos = new FileOutputStream("Cliente.txt", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(f);
            oos.close();
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        return true;
    }    
}

