/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Pedido; 
import java.util.ArrayList;


/**
 *
 * @author Walison Filipe
 */
public class ListaPedidos {
    
    public static final ArrayList<Pedido> carrinhoCompras = new ArrayList<>();
    
    public static void addPedido(Pedido p){
        carrinhoCompras.add(p); 
    } 
    
    public static void removerPedido(Pedido p) {
        carrinhoCompras.remove(p); 
    }
    
    public static void limparCarrinho(){
        carrinhoCompras.clear();
    }

    public static double valorTotal(){
        double valorTotal = 0;
        valorTotal = carrinhoCompras.stream().map((carrinhoCompra) -> carrinhoCompra.getSubTotal()).map((get) -> get).reduce(valorTotal, (accumulator, _item) -> accumulator + _item);
        return valorTotal; 
    }

    public static double quantTotal(){
        double quant = 0; 
        quant = carrinhoCompras.stream().map((carrinhoCompra) -> carrinhoCompra.getQuantProdutos()).map((get) -> get).reduce(quant, (accumulator, _item) -> accumulator + _item);
        return quant; 
    }
    
    public static String nomeProdutoPedido(ArrayList<Pedido> listaP){
        String nomes = null; 
        for (int i = 0; i < listaP.size(); i++) {
            Pedido get = listaP.get(i);
            nomes += get.getNomeProduto()+", ";
        }
        return nomes;
    }
    
    
}
