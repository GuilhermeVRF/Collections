package Set.palavra;


import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
public class ConjuntoPalavra {
    private HashSet<String> palavras;
    
    public ConjuntoPalavra(){
        this.palavras = new HashSet<>();
    }
    
    public void adicionarPalavra(String palavra){
        this.palavras.add(palavra);
    }
    
    public void removerPalavra(String palavra){
        this.palavras.remove(palavra);
    }
    
    public boolean verificarPalavra(String palavra){
        return this.palavras.contains(palavra);
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(String palavra : this.palavras){
            saida += palavra.hashCode() +" - "+ palavra +"\n";
        }
        
        return saida;
    }
}
