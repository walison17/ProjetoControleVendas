/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import dados.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import repositorio.RepositorioClientes;

/**
 *
 * @author Walison Filipe
 */
public class ClientesTableModel extends AbstractTableModel {

    //CONSTANTES
    private final int CODIGO = 0;
    private final int NOME = 1;
    private final int RG = 2;
    private final int CPF = 3;
    private final int DATA = 4;
    private final int ENDERECO = 5;
    private final int CIDADE = 6;
    private final int BAIRRO = 7;
    private final int ESTADO = 8;
    private final int CEP = 9;
    private final int EMAIL = 10;
    private final int TELEFONE = 11;
    private final int CELULAR = 12;

    //variaveis 
    private final ArrayList<Cliente> listaClientes;
    private final String[] colunas = {"Cód.", "Nome", "RG", "CPF", "Data de nasc.", "Endereço", "Cidade", "Bairro", "Estado", "CEP", "Email", "Telefone", "Celular"};

   //construtores 
    
    public ClientesTableModel(){
        this.listaClientes = RepositorioClientes.listaClientes;
    }
   
    //metodos da tabela 
    public void atualizarTabela() {
        fireTableDataChanged();
    }

    public int getLinhaCliente(Cliente c) {   
        int linha = -1;
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente get = listaClientes.get(i);
            if (get != null && get == c) {
                linha = i;
                break;
            }
        }
        return linha;       
    }

    public Cliente getCliente(int rowIndex) {
        //inicia um objeto vazio 
        Cliente c;
        // se a linha for igual a -1(default getSelectedRow) o objeto retorna vazio
        if (rowIndex == -1) {
            c = null;
        } else {
            c = this.listaClientes.get(rowIndex);
        }
        return c;
    }

    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = this.listaClientes.get(rowIndex);

        switch (columnIndex) {
            case NOME:
                return cliente.getNome();
            case RG:
                return cliente.getRg();
            case CPF:
                return cliente.getCpf();
            case DATA:
                return cliente.getDataNascimento();
            case ENDERECO:
                return cliente.getEndereco();
            case CIDADE:
                return cliente.getCidade();
            case BAIRRO:
                return cliente.getBairro();
            case ESTADO:
                return cliente.getEstado();
            case CEP:
                return cliente.getCep();
            case EMAIL:
                return cliente.getEmail();
            case TELEFONE:
                return cliente.getTelefone();
            case CELULAR:
                return cliente.getCelular();
            case CODIGO:
                return cliente.getCodigo();
            default:
                return cliente;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }

}
