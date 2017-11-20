/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.test;

import trab3tri.model.Cliente;
import trab3tri.model.Ingresso;

/**
 *
 * @author Rafaella Bueno
 */
public class Teste {
    public static void main(String[] args)  {
        Cliente c = new Cliente();
        c.setEmail("rafaellasbueno@gmail.com");
        c.setNome("Rafaella Santana Bueno");
        c.setSexo("Feminino");
        
        
        Ingresso i = new Ingresso();
        i.gerarCodigo();
        
        c.comprarIngresso(i);
    }
    
}
