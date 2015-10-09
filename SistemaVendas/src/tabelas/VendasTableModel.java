/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import dados.Venda;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import repositorio.RepositorioVendas;

/**
 *
 * @author Walison Filipe
 */
public class VendasTableModel extends AbstractTableModel {

    //constantes 
    private final int CODIGO = 0;
    private final int DATA = 1;
    private final int CLIENTE = 2;
    private final int VENDEDOR = 3;
    private final int PRODUTOS = 4;
    private final int FORMA_PAGAMENTO = 5;
    private final int VALOR = 6;

    private static ArrayList<Venda> listaVendas = new ArrayList<>();
    private final String[] colunas = {"Cód.", "Data", "Cliente", "Vendedor", "Produto(s)", "Forma de pagamento", "Valor"};

  
    //metodos 
    
    public VendasTableModel() {
        listaVendas = RepositorioVendas.listaVendas;
    }
   
    
    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venda v = listaVendas.get(rowIndex);

        switch (columnIndex) {
            case CODIGO:
                return v.getCodigo();
            case DATA:
                return v.getData();
            case CLIENTE:
                return v.getNomeCliente();
            case VENDEDOR:
                return v.getNomeVendedor();
            case PRODUTOS:
                return RepositorioVendas.nomeProduto(v.getPedido());
            case FORMA_PAGAMENTO:
                return v.getFormaPagamento();
            case VALOR:
                return v.getValorTotal();
            default: 
                return v;
        }
    }

}
