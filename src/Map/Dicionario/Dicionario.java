/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.Dicionario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guilherme
 */
public class Dicionario {
    private Map<String, String> dicionario;
    
    public Dicionario(){
        this.dicionario = new HashMap<>();
    }
    
    public int qtdePalavras(){
        return this.dicionario.size();
    }
    
    public void adicionarPalavra(String palavra, String significado){
        this.dicionario.put(palavra, significado);
    }
    
    public void removerPalavra(String palavra){
        this.dicionario.remove(palavra);
    }
    
    public String getSignificado(String palavra){
        return this.dicionario.get(palavra);
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(Map.Entry<String, String> palavra : this.dicionario.entrySet()){
            saida += palavra.getKey() + ": " + palavra.getValue() + "\n";
        }
        
        return saida;
    }
}
