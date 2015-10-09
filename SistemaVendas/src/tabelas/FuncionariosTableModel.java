/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import javax.swing.table.AbstractTableModel;
import dados.Funcionario;
import java.util.ArrayList;
import repositorio.RepositorioFuncionarios;

/**
 *
 * @author Walison Filipe
 */
public class FuncionariosTableModel extends AbstractTableModel {

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
    private final int SETOR = 13; 
    private final int FUNCAO = 14; 
    private final int SALARIO = 15; 
    private final int COMISSAO = 16; 
    private final int DATA_ADMISSAO = 17; 

    private  ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    private final String[] colunas = {"Cód.", "Nome", "RG", "CPF", "Data de nasc.", "Endereço", "Cidade", "Bairro", "Estado", "CEP", "Email", "Telefone", "Celular", "setor", "função", "salário", "comissão (%)", "data de admissão"};


    public FuncionariosTableModel() {
        this.listaFuncionarios = RepositorioFuncionarios.listaFuncionarios;
    }
    
    public void atualizarTabela(){
        fireTableDataChanged();
    }

    public void addFuncionario(Funcionario f) {
        listaFuncionarios.add(f);
        fireTableDataChanged();
    }

    public void excluirFuncionario(Funcionario f) {
        listaFuncionarios.remove(f);
        fireTableDataChanged();
    }

    //pegar objeto funcionario da tabela 
    public Funcionario getFuncionario(int linha) {
        Funcionario f;
        if (linha == -1){
            f = null;        
        }else{
            f = this.listaFuncionarios.get(linha); 
        }
        return f; 
    }
   
    //pegar linha do funcionario na tabela 
    public int getLinhaFuncionario(Funcionario f){
        int linha = -1; 
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionario get = listaFuncionarios.get(i);
            if(get != null && get == f){
                linha = i; 
                break;
            }
        }
        return linha; 
    }
       
    @Override
    public int getRowCount() {
        return this.listaFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario f = this.listaFuncionarios.get(rowIndex);

        switch (columnIndex) {
            case NOME:
                return f.getNome();
            case RG:
                return f.getRg();
            case CPF:
                return f.getCpf();
            case DATA:
                return f.getDataNascimento();
            case ENDERECO:
                return f.getEndereco();
            case CIDADE:
                return f.getCidade();
            case BAIRRO:
                return f.getBairro();
            case ESTADO:
                return f.getEstado();
            case CEP:
                return f.getCep();
            case EMAIL:
                return f.getEmail();
            case TELEFONE:
                return f.getTelefone();
            case CELULAR:
                return f.getCelular();
            case CODIGO:
                return f.getCodigo();
            case SETOR: 
                return f.getSetor(); 
            case FUNCAO:
                return f.getFuncao(); 
            case SALARIO: 
                return f.getSalario();
            case COMISSAO:
                return f.getComissao(); 
            case DATA_ADMISSAO:
                return f.getDataAdmissao();
            default:
                return f;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }

}
