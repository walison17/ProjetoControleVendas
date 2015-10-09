/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Pedido;
import dados.Produto;
import java.util.ArrayList;

/**
 *
 * @author Walison Filipe
 */
public class RepositorioProdutos {
  
    public static ArrayList<Produto> listaProdutos = new ArrayList<>(); 
    
    
    public static void rotinaAdicionarProdutos(){
        //criando
        Produto p1 = new Produto("Playstaion 4", "Video-game de última geração", 2000, 1200, 50, 200);
        Produto p2 = new Produto("Xbox one", "Video-game última geração", 1800, 1000, 50, 200);
        Produto p3 = new Produto("The Wither 3", "jogo ps4", 165, 80, 50, 500);
        Produto p4 = new Produto("Fifa 16","Jogo ps4", 200, 100, 100, 600);
    
        //adicionando 
        listaProdutos.add(p1);
        listaProdutos.add(p2); 
        listaProdutos.add(p3);
        listaProdutos.add(p4);
    }
    
    
    public static void addProdutos(Produto p){
        listaProdutos.add(p);
    }
    
    public static void removerProdutos(Produto p){
        listaProdutos.remove(p);
    }
 
    public static Produto pesquisarProdutoCod(int cod){
        Produto p = null; 
        for (Produto get : listaProdutos) {
            if (get != null && get.getCodigo() == cod){
                p = get; 
                break;
            }
        }
        return p; 
    }
    
    public static Produto pesquisarProdutoNome(String nome){
        Produto p = null; 
        for (Produto get : listaProdutos) {
            if (get != null && get.getNome().equals(nome)){
                p = get; 
                break;
            }
        }
        return p; 
    }
    
    public static void atualizarEstoque(ArrayList<Pedido> lista){
        for (int i = 0; i < lista.size(); i++) {
               Pedido get = lista.get(i);
               int codigoProduto = get.getCodigo(); 
               Produto p = RepositorioProdutos.pesquisarProdutoCod(codigoProduto);
               int quantAtual = p.getQuantidade() - (int)get.getQuantProdutos(); 
               p.setQuantidade(quantAtual);  
        }
    }  
    
    public static Produto controleEstoque(ArrayList<Produto> lista){
        Produto produto = null; 
        for (int i = 0; i < lista.size(); i++) {
            Produto get = lista.get(i);  
            if (get.getQuantidade() < get.getEstoqueMin()){
                produto = get; 
            }
        }
        return produto; 
    }
    
}
