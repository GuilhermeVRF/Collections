/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.carrinho;

/**
 *
 * @author Guilherme
 */
public class Mercadoria {
    private final String nome;
    private final double preco;
    private int qtde;
    
    public Mercadoria(String nome, double preco,int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQtde(){
        return this.qtde;
    }
    
    public void setQtde(int qtde){
        this.qtde += qtde;
    }
    
    public double getSubTotal(){
        return this.preco * this.qtde;
    }
    
    @Override
    public String toString(){
        return "Mercadoria: "+ this.nome + "\n" +
                "Preço: "+ this.preco + "\n" +
                "Quantidade: "+ this.qtde;
    }
}
