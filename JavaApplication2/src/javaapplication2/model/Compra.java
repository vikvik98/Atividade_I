/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.model;

/**
 *
 * @author ALUNO
 */
public class Compra {
    
    private double valor;
    private int quantidade;

    public Compra(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
       
    
}
