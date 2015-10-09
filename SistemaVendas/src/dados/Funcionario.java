/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Walison Filipe
 */
public class Funcionario {
    
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;
    private String email; 
    private String telefone; 
    private String celular;
    private String setor; 
    private String funcao; 
    private double salario; 
    private int comissao; 
    private String dataAdmissao; 
    private final int codigo;
    private static int contador = 1;
    
    
    //metodos 

    @Override
    public String toString() {
        return "\n nome: " + nome + "\n rg: " + rg + "\n cpf: " + cpf + "\n dataNascimento: " + dataNascimento + "\n endereco: " + endereco + "\n cidade: " + cidade + "\n bairro: " + bairro + "\n estado: " + estado + "\n cep: " + cep + "\n email: " + email + "\n telefone: " + telefone + "\n celular: " + celular + "\n codigo: " + codigo + "\n setor: " + setor + "\n funcao: " + funcao + "salario : " + salario + "\n comissao: " + comissao + "\n dataAdmissao: " + dataAdmissao ;
    }

    public Funcionario(String nome, String rg, String cpf, String dataNascimento, String endereco, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular, String setor, String funcao, double salario, int comissao, String dataAdmissao) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
        this.comissao = comissao;
        this.dataAdmissao = dataAdmissao;
        this.codigo = contador; 
        contador ++; 
        
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }
    
    
    
    
    
    
}