/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.test;

import com.gitlab.rafaellabueno.model.Cliente;
import com.gitlab.rafaellabueno.model.Ingresso;

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
