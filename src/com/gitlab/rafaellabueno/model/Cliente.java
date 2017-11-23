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
public class Cliente implements Serializable {

    private String nome;
    private String sexo;
    private String email;
    private int pontos;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPontos(Cliente c, Festa f){
        this.pontos = pontos + f.getPontos();
    }
    
    public int getPontos() {
        pontos = 20 * ingressos.size();
        return pontos;

    }

    public void comprarIngresso(Ingresso i) {
        ingressos.add(i);
    }

}
