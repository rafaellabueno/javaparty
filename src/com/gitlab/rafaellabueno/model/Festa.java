/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gitlab.rafaellabueno.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rafaella Bueno
 */
public class Festa implements Serializable{
    private int qtdIng;
    private String nomeDeFesta;
    private String tipoDeFesta;
    private String data;
    private String descricao;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();
    
    public int getQtdIng() {
        return ingressos.size();
    }

    public void setQtdIng(int i){
    ingressos = new ArrayList<>(i);
    }
    
    public String getTipoDeFesta() {
        return tipoDeFesta;
    }

    public void setTipoDeFesta(String tipoDeFesta) {
        this.tipoDeFesta = tipoDeFesta;
    }
    
    public String getnomeDeFesta() {
        return nomeDeFesta;
    }

    public void setnomeDeFesta(String nomeDeFesta) {
        this.nomeDeFesta = nomeDeFesta;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void addIngresso(Ingresso i){
        
     
        
            ingressos.add(i);
            
    }
    
    
    
}
