/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cases;

import java.util.ArrayList;
import java.util.List;
import javaapplication2.model.Cliente;
import javaapplication2.model.Compra;

/**
 *
 * @author ALUNO
 */
public class CompraUseCase {
    
    private List<Cliente> clientes;

    public CompraUseCase() {
        this.clientes = new ArrayList();
    }
    
    public void cadastrarCompra(int pontos, double valorTotal, int quantidade){
        Compra compra = new Compra(valorTotal,quantidade);
        Cliente cliente = new Cliente(pontos, compra);
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
}
