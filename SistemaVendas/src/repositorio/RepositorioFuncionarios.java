/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Walison Filipe
 */
public class RepositorioFuncionarios {
    
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    
    //metodos 
    public static void rotinaInserirFuncionarios(){
        Funcionario f1 = new Funcionario("FUNCIONÁRIO1", "9999999", "999.999.999-99", "12/12/12", "ENDEREÇO TESTE", "CARUARU", "BAIRRO TESTE", "PE", "55000.00", "TESTE@TESTE.COM.BR", "(81) 3737-3737", "(81) 99999-9999", "SETOR1", "VENDEDOR", 1.000, 2, "09/10/2015");
        listaFuncionarios.add(f1); 
    }
    
    
    public static void addFuncionario(Funcionario f){
        listaFuncionarios.add(f);
    }
    
    public static void excluirFuncionario(Funcionario f){
        listaFuncionarios.remove(f);
    }
    
    public static Funcionario pesquisarFuncionarioNome(String nome){
        Funcionario f = null; 
        for (Funcionario get : listaFuncionarios) {
            if (get != null && get.getNome().equals(nome)){
                f = get;
                break; 
            }
        }
        return f; 
    }
    
    public static Funcionario pesquisarFuncionarioCodigo(int cod){
        Funcionario f = null; 
        for (Funcionario get : listaFuncionarios) {
            if (get != null && get.getCodigo() == cod){
                f = get;
                break; 
            }
        }
        return f; 
    }
   
}
