    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavenda;

import telas.TelaPrincipal;
import repositorio.RepositorioClientes; 
import repositorio.RepositorioFuncionarios;
import repositorio.RepositorioProdutos;
/**
 *
 * @author Walison Filipe
 */
public class SistemaVenda {

    
    public static void main(String[] args) {
             
        //rotinas
        RepositorioFuncionarios.rotinaInserirFuncionarios();
        RepositorioClientes.rotinaInserirClientes();
        RepositorioProdutos.rotinaAdicionarProdutos();
        
        //tela principal 
        TelaPrincipal tela = new TelaPrincipal();
        
    }  
}
