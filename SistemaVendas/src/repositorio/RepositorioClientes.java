/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Cliente;
import java.util.ArrayList;



/**
 *
 * @author Walison Filipe
 */
public class RepositorioClientes {

    public static final ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void rotinaInserirClientes(){
        Cliente c = new Cliente("walison filipe", null, "999.999.999-99", "15/11/1992", null, null, null, null, null, null, null, null);
        listaClientes.add(c); 
    }
    
    
    public static void addCliente(Cliente c) {
        listaClientes.add(c);
        
    }

    public static void removerCliente(Cliente c) {
        listaClientes.remove(c);
    }

    public static Cliente pesquisarClienteCpf(String cpf) {
        Cliente c = null;
        for (Cliente get : listaClientes) {
            if (get != null && get.getCpf().equals(cpf)) {
                c = get;
                break; 
            }
        }
        return c;
    }

    public static Cliente pesquisarClienteNome(String nome) {
        Cliente c = null;
        for (Cliente get : listaClientes) {
            if (get != null && get.getNome().equals(nome)) {
                c = get;
                break;
            }
        }
        return c;
    }
    
    //pequisa por codigo 
    public static Cliente pesquisarClienteCodigo(int cod){
        Cliente c = null; 
        for (Cliente get : listaClientes) {
            if (get != null && get.getCodigo() == cod){
                c = get;
                break; 
            }
        }
        return c; 
    }
    
    public static int tamanhoListaClientes(){
       return listaClientes.size();
    }
    
}
