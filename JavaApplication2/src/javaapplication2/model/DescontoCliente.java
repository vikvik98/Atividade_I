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

    public DescontoCliente() {
    }
    
    
    
    public void descontoCliente(Cliente cliente){
        
        cliente.getCompra().setValorTotal(cliente.getCompra().getValorTotal() - (cliente.getCompra().getValorTotal()*5)/100);
        
    }
    
}
