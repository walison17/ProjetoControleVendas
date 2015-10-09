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
public class Pedido {
    int codigo; 
    String nomeProduto; 
    double quantProdutos; 
    double precoUnitario; 
    double SubTotal;
    int contador = 1; 
    
    
    //metodos 
    /*@Override
    public String toString() {
    return "Pedido{" + "codigo=" + codigo + ", nomeProduto=" + nomeProduto + ", quantProdutos=" + quantProdutos + ", precoUnitario=" + precoUnitario + ", SubTotal=" + SubTotal + '}';
    }*/
    
    @Override
    public String toString() {
        return nomeProduto +"";
    }
   
    
    public Pedido(int codigo, String nomeProduto, double quantProdutos, double precoUnitario, double SubTotal) {
        this.codigo = contador;
        contador++; 
        this.nomeProduto = nomeProduto;
        this.quantProdutos = quantProdutos;
        this.precoUnitario = precoUnitario;
        this.SubTotal = SubTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getQuantProdutos() {
        return quantProdutos;
    }

    public void setQuantProdutos(double quantProdutos) {
        this.quantProdutos = quantProdutos;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }
    
    
    
    
}
