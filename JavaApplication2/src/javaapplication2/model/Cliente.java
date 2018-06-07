/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.model;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Cliente {
    
    private int pontos;
    private Compra compra;

    public Cliente(int pontos, Compra compra) {
        this.pontos = pontos;
        this.compra = compra;
    }
    
 

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    
    
}
