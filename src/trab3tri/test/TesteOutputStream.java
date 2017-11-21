/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import trab3tri.model.Cliente;
import trab3tri.model.Ingresso;
import trab3tri.model.Festa;

/**
 *
 * @author developer
 */
public class TesteOutputStream {
    public static void main(String ... args){
        //Magia pocaoDeVida = new Magia();
        //pocaoDeVida.setTitulo("Poção da vida");
        //pocaoDeVida.setDataCriacao(new Date());
        //pocaoDeVida.addIngrediente(new Ingrediente("Batata", 10));
        
        try{
            FileOutputStream fos = new FileOutputStream("pocoes.dat",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //oos.writeObject(pocaoDeVida);
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
