/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.estoque;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Guilherme
 */
public class Estoque {
    private Map<Integer, Produto> produtos;
    
    public Estoque(){
        this.produtos = new HashMap<>();
    }
    
    public void adicionarProduto(Integer codigo, Produto novoProduto){
        this.produtos.put(codigo, novoProduto);
    }
    
    public boolean removerProduto(Integer codigo){
        return this.produtos.remove(codigo) != null;
    }
    
    public Map<Integer, Produto> getProduto(String nome){
        Map<Integer, Produto> produtosNome = new HashMap<>();
        
        for(Map.Entry<Integer,Produto> produto : this.produtos.entrySet()){
            if(produto.getValue().getNome().startsWith(nome)){
                produtosNome.put(produto.getKey(), produto.getValue());
            }
        }
        
        return produtosNome;
    }
    
    public Produto getProdutoMaiorPreco(){
        Iterator<Produto> itProduto = this.produtos.values().iterator();
        Produto produtoMaisCaro = itProduto.next();
        
        while(itProduto.hasNext()){
            Produto proximoProduto = itProduto.next();
            if(proximoProduto.getPreco() > produtoMaisCaro.getPreco()){
                produtoMaisCaro = proximoProduto;
            }
        }
        
        return produtoMaisCaro;
    }
    
    public Produto getProdutoMenorPreco(){
        Iterator<Produto> itProduto = this.produtos.values().iterator();
        Produto produtoMaisBarato = itProduto.next();
        
        while(itProduto.hasNext()){
            Produto proximoProduto = itProduto.next();
            if(proximoProduto.getPreco() < produtoMaisBarato.getPreco()){
                produtoMaisBarato = proximoProduto;
            }
        }
        
        return produtoMaisBarato;
    }
    
    public double getValorTotalEstoque(){
        double valorTotal = 0.0;
        
        for(Produto produto : this.produtos.values()){
            valorTotal += produto.getPreco() * produto.getQtde();
        }
        
        return valorTotal;
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(Map.Entry<Integer, Produto> produto : this.produtos.entrySet()){
            saida += produto.getKey() + " - " + produto.toString() + "\n";
        }
        
        return saida;
    }
}
