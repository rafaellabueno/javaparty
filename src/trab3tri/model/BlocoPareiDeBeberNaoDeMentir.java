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
public class BlocoPareiDeBeberNaoDeMentir extends Festa{
 
    private ArrayList<Ingresso> ingressoBloco = new ArrayList<>();
    
    public void comprarIng(Ingresso i){
         ArrayList<Ingresso> r  = Ingresso.getAll();
     
        for(Ingresso x : r){
            ingressoBloco.add(i);
            
        }
        System.out.println(ingressoBloco);
    }
}
