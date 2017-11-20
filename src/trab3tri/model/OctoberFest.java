/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.model;

import java.util.ArrayList;

/**
 *
 * @author Rafaella Bueno
 */
public class OctoberFest extends Festa{
    
    private ArrayList<Ingresso> ingressoOctober = new ArrayList<>();
    
    public void comprarIng(Ingresso i){
         ArrayList<Ingresso> r  = Ingresso.getAll();
     
        for(Ingresso x : r){
            ingressoOctober.add(i);
            
        }
        System.out.println(ingressoOctober);
    }
}
