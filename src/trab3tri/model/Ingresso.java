/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab3tri.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rafaella Bueno
 */
public class Ingresso {

    private int codIngresso;
    private double valor;

    public int getCodIngresso() {
        return codIngresso;
    }

    public void setCodIngresso(int codIngresso) {
        this.codIngresso = codIngresso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int gerarCodigo() {
        int numero = 0;
        int[] num = new int[1000];
        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            numero = r.nextInt(1000) + 1;
            for (int j = 0; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(1000) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        return numero;
    }
    
    public static ArrayList<Ingresso> getAll() {
        return null;
        //getAll - arquivo
    }
}
