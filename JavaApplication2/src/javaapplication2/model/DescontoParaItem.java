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
public class DescontoParaItem {
    
    private List<Cliente> clientes;

    public DescontoParaItem(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void descontoParaItens(){
        for(int i = 0; i < clientes.size(); i++){            
            clientes.get(i).getCompra().setValor(clientes.get(i).getCompra().getValor() - (clientes.get(i).getCompra().getValor()*10)/100);            
        }
    }
    
}
