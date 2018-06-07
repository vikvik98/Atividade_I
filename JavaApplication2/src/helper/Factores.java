/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import javaapplication2.model.Cliente;
import javaapplication2.model.DescontoCliente;
import javaapplication2.model.DescontoCompra;
import javaapplication2.model.DescontoParaItem;

/**
 *
 * @author ALUNO
 */
public class Factores {
    
    private List<Cliente> clientes;
    private DescontoCliente descontoCliente;
    private DescontoCompra descontoCompra;
    private DescontoParaItem descontoParaItem;

    public Factores(List<Cliente> clientes) {
        this.clientes = clientes;
        descontoCliente = new DescontoCliente();
        descontoCompra = new DescontoCompra();
        descontoParaItem = new DescontoParaItem();
    }

    public void aplicarDesconto(){
        for(int i = 0; i < clientes.size(); i++){
            //Desconto de compra
            if(clientes.get(i).getCompra().getValorTotal() > 1000){
                descontoCompra.descontarCompra(clientes.get(i));
                break;
            }
            //Desconto de cliente
            if(clientes.get(i).getPontos() >= 1000){
                descontoCliente.descontoCliente(clientes.get(i));
                break;
            }
            //Desconto para item
            if(clientes.get(i).getCompra().getQuantidade() >= 20){
                descontoParaItem.descontoParaItens(clientes.get(i));
                break;
            }
        }
    }
    
    
    
}
