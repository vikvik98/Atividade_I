/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import javaapplication2.model.Cliente;

/**
 *
 * @author ALUNO
 */
public class Factores {
    
    private List<Cliente> clientes;

    public Factores(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void verificarDesconto(){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getCompra().getValor() > 1000){
                
            }
        }
    }
    
    
    
}
