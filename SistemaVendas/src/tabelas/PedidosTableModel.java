/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import dados.Pedido;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import repositorio.ListaPedidos; 

/**
 *
 * @author Walison Filipe
 */
public class PedidosTableModel extends AbstractTableModel{

    //Constantes 
    private final int CODIGO = 0; 
    private final int NOME_PRODUTO = 1; 
    private final int PRECO_UNIT = 2; 
    private final int QUANTIDADE = 3; 
    private final int SUB_TOTAL = 4; 
    
    //vetores 
    private final ArrayList<Pedido> CarrinhoCompras ;
    private final String[] colunas = {"Cód." , "Nome do produto" , "Preço unitário" , "Quantidade" , "Sub-total" };

    //metodos 

    public int getLinhaPedido(Pedido p){
        int linha = -1;
        for (int i = 0; i < CarrinhoCompras.size(); i++) {
            Pedido get = CarrinhoCompras.get(i);
            if (get != null && get == p){
                linha = i; 
                break; 
            } 
        }
        return linha;
    }
    
    public Pedido getPedido(int linha){
        Pedido p ; 
        if (linha == -1){
            p = null; 
        } else {
            p = CarrinhoCompras.get(linha); 
        }
        return p; 
    }
    
    public double quantTotal(){
        double quant = 0; 
        for (Pedido CarrinhoCompra : CarrinhoCompras) {
            double get = CarrinhoCompra.getQuantProdutos();
            quant += get; 
        }
        return quant; 
    }
    
    public double quantTotalAtualizado(Pedido p){
        double q = 0; 
        for (Pedido CarrinhoCompra : CarrinhoCompras) {
            double get = CarrinhoCompra.getSubTotal();
            q += get;   
        }
        return q - p.getSubTotal(); 
    }
    
    
    public PedidosTableModel() {
    CarrinhoCompras = ListaPedidos.carrinhoCompras;
    }
      
    public  void atualizarTabela(){
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.CarrinhoCompras.size();
    }   

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido p = this.CarrinhoCompras.get(rowIndex); 
        
        switch (columnIndex){
            case CODIGO: 
                return p.getCodigo();
            case NOME_PRODUTO: 
                return p.getNomeProduto(); 
            case PRECO_UNIT: 
                return p.getPrecoUnitario(); 
            case QUANTIDADE: 
                return p.getQuantProdutos();
            case SUB_TOTAL: 
                return p.getSubTotal(); 
            default: 
                return p; 
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
}
