/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.estoque;

import java.util.Objects;

/**
 *
 * @author Guilherme
 */
public class Produto {
    private final String nome;
    private double preco;
    private int qtde;
    
    public Produto(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    
    public int getQtde(){
        return this.qtde;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hash(this.nome);
        return hash;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            Produto outroProduto = (Produto) o;
            
            if(outroProduto.nome.equals(this.nome)){
                return true;
            }
        }
        
        return false;
    }   
    
    @Override
    public String toString(){
        return this.nome + " Qtde: "+ this.qtde + " - R$" + this.preco;
    }
}
