/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.app;

import cases.CompraUseCase;
import helper.Factores;

/**
 *
 * @author ALUNO
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CompraUseCase compraUseCase = new CompraUseCase();
        compraUseCase.cadastrarCompra(100, 100, 10);
        Factores factores = new Factores(compraUseCase.getClientes());
        factores.aplicarDesconto();
        
        System.out.println("Valor total da compra = " + compraUseCase.getClientes().get(0).getCompra().getValorTotal());
        
    }
    
}
