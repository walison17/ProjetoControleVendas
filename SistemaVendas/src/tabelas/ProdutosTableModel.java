/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import dados.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import repositorio.RepositorioProdutos;

/**
 *
 * @author Walison Filipe
 */
public class ProdutosTableModel extends AbstractTableModel {

    //constantes
    private final int CODIGO = 0; 
    private final int NOME = 1; 
    private final int DESCRICAO = 2; 
    private final int PRECO_CUSTO = 3; 
    private final int PRECO_VENDA = 4; 
    private final int ESTOQUE_ATUAL = 5; 
    private final int ESTOQUE_MIN = 6;
    
    private ArrayList<Produto> listaProdutos = new ArrayList<>(); 
    private final String[] colunas = {"Cód.", "Nome", "Descrição", "Preço de custo", "Preço de venda", "Estoque atual", "Estoque mínimo"}; 
    
    //metodos 
    public ProdutosTableModel() {
        this.listaProdutos = RepositorioProdutos.listaProdutos;
    }
     
    public void atualizarTabela(){
        fireTableDataChanged();
    }
    
    //pegar objeto funcionario da tabela 
    public Produto getProduto(int linha) {
        Produto p;
        if (linha == -1){
            p = null;        
        }else{
            p = this.listaProdutos.get(linha); 
        }
        return p; 
    }
    
    //pegar linha do funcionario na tabela 
    public int getLinhaProduto(Produto p){
        int linha = -1; 
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto get = listaProdutos.get(i);
            if(get != null && get == p){
                linha = i; 
                break;
            }
        }
        return linha; 
    }
    
    
    @Override
    public int getRowCount() {
        return this.listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex,int columnIndex) {
        Produto p = this.listaProdutos.get(rowIndex);
        
        switch (columnIndex){
            case CODIGO:
                return p.getCodigo(); 
            case NOME:
                return p.getNome(); 
            case DESCRICAO:
                return p.getDesc();
            case PRECO_CUSTO:
                return p.getPrecoCusto(); 
            case PRECO_VENDA:
                return p.getPrecoVenda();
            case ESTOQUE_ATUAL:
                return p.getQuantidade(); //lembrar de somar com valor get antigo
            case ESTOQUE_MIN:
                return p.getEstoqueMin(); 
            default:
                return p;
        }
        
    }
    
}
