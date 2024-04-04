/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.contato;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class AgendaContato {
    private final Set<Contato> contatos;
    
    public AgendaContato(){
        this.contatos = new HashSet<>();
    }
    
    public void adicionarContato(String nome, String numeroTelefone){
        this.contatos.add(new Contato(nome, numeroTelefone));
    }
    
    public void removerContato(String numeroTelefone){
        Contato contatoRemovido = new Contato(null, numeroTelefone);
        
        this.contatos.remove(contatoRemovido);
    }
    
    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPesquisados = new HashSet<>();
        
        for(Contato contato : this.contatos){
            if(contato.getNome().startsWith(nome)){
                contatosPesquisados.add(contato);
            } 
        }
        
        return contatosPesquisados;
    }
    
    public boolean atualizarNomeContato(String novoNome, String numeroTelefone){
        //Aproveitando O(1)
        Contato editarContato = new Contato(novoNome, numeroTelefone);
        
        if(this.contatos.contains(editarContato)){
            this.contatos.remove(editarContato);
            this.contatos.add(editarContato);
            
            return true;
        }
       
        return false;
    }
    
    public boolean atualizarNumeroContato(String nome, String novoNumero){
        Contato editarContato = new Contato(nome, novoNumero);
        
        if(!this.contatos.contains(editarContato)){
            for(Contato contato : this.contatos){
                if(contato.getNome().equals(nome)){
                    contato.setNumeroTelefone(novoNumero);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(Contato contato : this.contatos){
            saida += contato.toString() + " \n";
        }
        
        return saida;
    }
}
