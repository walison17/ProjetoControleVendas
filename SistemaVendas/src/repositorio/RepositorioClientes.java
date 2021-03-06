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
        Cliente c1 = new Cliente("WALISON FILIPE TORRES MENDES", "9999999", "999.999.999-99", "15/11/1992", "RUA TESTE", "CARUARU", "BAIRRO TESTE", "PE", "55000-00", "TESTE@TESTE.COM.BR", "(81) 3737-3737", "(81) 99999-9999");
        Cliente c2 = new Cliente("CLIENTE2", "9999999", "999.999.999-99", "15/11/1992", "RUA TESTE", "CARUARU", "BAIRRO TESTE", "PE", "55000-00", "TESTE@TESTE.COM.BR", "(81) 3737-3737", "(81) 99999-9999");
        Cliente c3 = new Cliente("CLIENTE3", "9999999", "999.999.999-99", "15/11/1992", "RUA TESTE", "CARUARU", "BAIRRO TESTE", "PE", "55000-00", "TESTE@TESTE.COM.BR", "(81) 3737-3737", "(81) 99999-9999");
        Cliente c4 = new Cliente("CLIENTE4", "9999999", "999.999.999-99", "15/11/1992", "RUA TESTE", "CARUARU", "BAIRRO TESTE", "PE", "55000-00", "TESTE@TESTE.COM.BR", "(81) 3737-3737", "(81) 99999-9999");

        listaClientes.add(c1); 
        listaClientes.add(c2);
        listaClientes.add(c3);
        listaClientes.add(c4);
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
            if (get != null && get.getNome().equalsIgnoreCase(nome)) {
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
