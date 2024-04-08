/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.produto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Guilherme
 */
public class Estoque {
    private Set<Produto> produtos;
    
    public Estoque(){
        this.produtos = new HashSet<>();
    }
    
    public int qtdeProdutos(){
        return this.produtos.size();
    }
    
    public void adicionarProduto(Produto novoProduto){
        this.produtos.add(novoProduto);
    }
    
    public boolean removerProduto(int codigo){
        Produto produtoRemovido = new Produto(codigo);
        
        return this.produtos.remove(produtoRemovido);
    }
    
    public Produto get(int codigo){
        Iterator<Produto> itProduto = this.produtos.iterator();
        Produto produto;
        
        while(itProduto.hasNext()){
            produto = itProduto.next();
            if(produto.getCodigo() == codigo){
                return produto;
            }
        }
        
        return null;
    }
    
    public Set<Produto> ordernarNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(new ComparatorNomeProduto());
        produtosPorNome.addAll(this.produtos);
        
        return produtosPorNome;
    }
    
    public Set<Produto> ordenarPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPrecoProduto());
        produtosPorPreco.addAll(this.produtos);
        
        return produtosPorPreco;
    }
    
    @Override
    public String toString(){
        Iterator<Produto> itProduto = this.produtos.iterator();
        String saida = "";
        
        while(itProduto.hasNext()){
            saida += itProduto.next().toString() + "\n\n";           
        }
        
        return saida;
    }
}
