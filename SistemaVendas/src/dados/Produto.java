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
public class Produto {
    private final int codigo;
    private String nome;
    private String desc;
    private double precoVenda;
    private double precoCusto;
    private int estoqueMin; 
    private int quantidade;  
    private static int contador = 1; 

    public Produto(String nome, String desc, double precoVenda, double precoCusto, int estoqueMin, int quantidade) {
        this.nome = nome;
        this.desc = desc;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.estoqueMin = estoqueMin;
        this.quantidade = quantidade;
        this.codigo = contador; 
        contador ++; 
    }

    @Override
    public String toString() {
        return "Produto1{" + "codigo=" + codigo + ", nome=" + nome + ", desc=" + desc + ", precoVenda=" + precoVenda + ", precoCusto=" + precoCusto + ", estoqueMin=" + estoqueMin + ", quantidade=" + quantidade + ", contador=" + contador + '}';
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
