/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Pedido;
import dados.Venda;
import java.util.ArrayList;

/**
 *
 * @author Walison Filipe
 */
public class RepositorioVendas {

    public static ArrayList<Venda> listaVendas = new ArrayList<>();

    //metodos 
    public static void addVenda(Venda v) {
        listaVendas.add(v);
    }

    public static String nomeProduto(ArrayList<Pedido> lista) {
        String nome = "";
        for (int i = 0; i < lista.size(); i++) {
            Pedido get = lista.get(i);
            if (lista.size() > 1) {
                nome += get.getQuantProdutos() + " x  " + get.getNomeProduto() + ",";
            } else { 
                nome += get.getQuantProdutos() + " x  " + get.getNomeProduto(); 
            }
        }
        return nome;
    }

}
