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
public class DescontoCliente {
    
    private Cliente cliente;

    public DescontoCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public double descontoCliente(Cliente cliente){
        
        valorTotal = valorTotal - ((valorTotal*5)/100);
        return valorTotal;
        
    }
    
}
