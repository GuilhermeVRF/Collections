/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.palavra;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Guilherme
 */
public class Texto {
    private String conteudo;
    private Map<String, Integer> palavras;
    
    public Texto(){
        this.conteudo = "";
        this.palavras = new HashMap<>();
    }
    
    public void escrever(String periodo){
        if(!periodo.isBlank()){
            this.conteudo += periodo;
            
            
        }
    }
    
    private String[] separarPalavras(String periodo){
        char[] periodoChar = periodo.toLowerCase().toCharArray();
        
    }
}
