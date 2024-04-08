/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.produto;

import java.util.Comparator;

/**
 *
 * @author Guilherme
 */
public class Produto {
    private final int codigo;
    private String nome;
    private double preco;
    
    public Produto(int codigo, String nome, double preco){
        this.codigo= codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(int codigo){
        this.codigo= codigo;
        this.nome = null;
        this.preco = 0.0;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
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
    
    @Override
    public int hashCode(){
        return this.codigo;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            Produto outroProduto = (Produto) o;
            
            if(outroProduto.codigo == this.codigo){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+ this.codigo +"\n"+
               "Nome: "+ this.nome + "\n"+
               "Preço: "+this.preco;        
    }
}

class ComparatorNomeProduto implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}

class ComparatorPrecoProduto implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        if(p1.getPreco() >= p2.getPreco()){
            return 1;
        }else{
            return -1;
        }
    }
}
