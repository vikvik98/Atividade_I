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
public class DescontoCompra {
    
    private Cliente cliente;

    public DescontoCompra(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    public double descontar(double valorTotal){
        
        valorTotal = valorTotal - ((valorTotal*10)/100);
        return valorTotal;
        
    }
    
}
