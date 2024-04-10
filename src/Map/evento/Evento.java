/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.evento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Guilherme
 */
public class Evento {
    private final String nomeEvento;
    private final Map<LocalTime, String> atracoes;
    
    public Evento(String nomeEvento){
        this.nomeEvento = nomeEvento;
        this.atracoes = new TreeMap<>();
    }
    
    public String getNomeEvento(){
        return this.nomeEvento;
    }
    
    public void adicionarAtracao(String nomeAtracao, int hora, int minuto){
        this.atracoes.put(LocalTime.of(hora, minuto), nomeAtracao);
    }
    
    public void removerAtracao(String nomeAtracao){
        for(Map.Entry<LocalTime, String> atracao : this.atracoes.entrySet()){
            if(atracao.getValue().equalsIgnoreCase(nomeAtracao)){
                this.atracoes.remove(atracao.getKey());
            }
        }
    }
    
    @Override
    public String toString(){
        String saida = this.nomeEvento + "\n";
        
        for(Map.Entry<LocalTime, String> atracao : this.atracoes.entrySet()){
            saida += atracao.getKey() + ": "+ atracao.getValue() + "\n";
        }
        
        return saida;
    }
}
