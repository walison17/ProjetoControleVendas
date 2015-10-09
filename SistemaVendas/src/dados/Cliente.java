/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author alunofavip
 */
public class Cliente {
    
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
    private final int codigo;
    private static int contador = 1;

    @Override
    public String toString() {
        return  "\n nome: " + nome + "\n rg: " + rg + "\n cpf: " + cpf + "\n dataNascimento: " + dataNascimento + "\n endereco: " + endereco + "\n cidade: " + cidade + "\n bairro: " + bairro + "\n estado: " + estado + "\n cep: " + cep + "\n email: " + email + "\n telefone: " + telefone + "\n celular: " + celular + "\n codigo: " + codigo ;
    }

    public Cliente(String nome, String rg, String cpf, String dataNascimento, String endereco, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular) {
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
        this.codigo = contador; 
        contador++;
    }

    //metodos
    
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
        Cliente.contador = contador;
    }
    
   


}
