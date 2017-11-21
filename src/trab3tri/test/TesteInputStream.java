/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import trab3tri.model.Cliente;
import trab3tri.model.Ingresso;
import trab3tri.model.Festa;


/**
 *
 * @author developer
 */
public class TesteInputStream {

    public static void main(String... args) {

        try {
            FileInputStream fos = new FileInputStream("ingressos.dat");
            ObjectInputStream ois = new ObjectInputStream(fos);
            Cliente p = (Cliente) ois.readObject();
            System.out.println(p);
            
            fos.close();
            ois.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
