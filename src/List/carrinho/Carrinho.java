/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.carrinho;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Carrinho {
    private List<Mercadoria> carrinho;
    
    public Carrinho(){
        this.carrinho = new LinkedList<>();
    }
    
    public void adicionarItem(String nome, double preco, int qtde){
        Mercadoria mercadoria = this.buscarItem(nome); 
        if(mercadoria != null){
            mercadoria.setQtde(qtde);
        }else{
            this.carrinho.add(new Mercadoria(nome, preco, qtde));
        }
    }
    
    public void removerItem(String nome){
        for(Mercadoria mercadoriaRemovida : this.carrinho){
            if(mercadoriaRemovida.getNome().equals(nome)){
                this.carrinho.remove(mercadoriaRemovida);
                break;
            }
        }
    }
    
    public double calcularTotal(){
        double valorTotal = 0;
        
        for(Mercadoria mercadoria: this.carrinho){
            valorTotal += mercadoria.getSubTotal();
        }
        
        return valorTotal;
    }
    
    private Mercadoria buscarItem(String nome){
        Iterator<Mercadoria> percorrerLista = this.carrinho.iterator();
        Mercadoria item;
        
        while(percorrerLista.hasNext()){
            item = percorrerLista.next();
            
            if(item.getNome().equals(nome))
                return item;
        }
        
        return null;
    }
    
    @Override
    public String toString(){
        String saida = "---Carrinho---\n";
        
        for(Mercadoria mercadoria : this.carrinho){
            saida += mercadoria.toString() + "\n";
        }
        
        saida += "R$ Total: "+this.calcularTotal();
        return saida;
    }
}
