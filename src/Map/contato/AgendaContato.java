/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.contato;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guilherme
 */
public class AgendaContato {
    private HashMap<String, Integer> contatos;
    
    public AgendaContato(){
        this.contatos = new HashMap<>();
    }
    
    public int qtdeContatos(){
        return this.contatos.size();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        this.contatos.put(nome, telefone);
    }
    
    public void removerContato(String nome){
        this.contatos.remove(nome);
    }
    
    public Integer getNumero(String nome){
        return this.contatos.get(nome);
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(Map.Entry<String,Integer> contato : this.contatos.entrySet()){
            saida += "Nome: "+ contato.getKey() + "Telefone: "+ contato.getValue() + "\n";
        }
        
        return saida;
    }
}
