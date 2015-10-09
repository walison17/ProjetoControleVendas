/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;

/**
 *
 * @author Walison Filipe
 */
public class Venda {
    
    private final int codigo; 
    private String data; 
    private String formaPagamento; 
    private double valorTotal; 
    private double desconto; 
    private String nomeCliente; 
    private String nomeVendedor; 
    private  ArrayList<Pedido> listaPedidos = new ArrayList<>();  
    private static int contador = 1; 
    
    
    //metodos 

    public Venda(String data, String formaPagamento, double valorTotal, double desconto, String nomeCliente, String nomeVendedor, ArrayList<Pedido> pedido) {
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.nomeCliente = nomeCliente;
        this.nomeVendedor = nomeVendedor;
        this.codigo = contador; 
        contador ++; 
        listaPedidos = pedido; 
        
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", data=" + data + ", formaPagamento=" + formaPagamento + ", valorTotal=" + valorTotal + ", desconto=" + desconto + ", nomeCliente=" + nomeCliente + ", nomeVendedor=" + nomeVendedor + ", pedido=" + listaPedidos  + '}';
    }
    
 
    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public ArrayList<Pedido> getPedido() {
        return this.listaPedidos;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.listaPedidos = pedido;
    }

   
    
    
    
    
}
