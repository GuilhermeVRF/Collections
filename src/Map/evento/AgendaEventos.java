/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map.evento;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Guilherme
 */
public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;
    
    public AgendaEventos(){
        this.eventos = new TreeMap<>();
    }
    
    public boolean adicionarEvento(LocalDate data, Evento novoEvento){
        return this.eventos.put(data, novoEvento) != null;
    }
    
    public boolean removerEvento(LocalDate data){
        return this.eventos.remove(data) != null;
    }
    
    public Evento proximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        
        for(Map.Entry<LocalDate,Evento> evento : this.eventos.entrySet()){
            if(evento.getKey().compareTo(dataAtual) >= 0){
                return evento.getValue();
            }
        }
        
        return null;
    }
    
    public Evento ultimoEventoOcorrido(){
        LocalDate dataAtual = LocalDate.now();
        Evento ultimoEventoOcorrido = null;
        
        for(Map.Entry<LocalDate,Evento> evento : this.eventos.entrySet()){
            if(dataAtual.isAfter(evento.getKey())){
                ultimoEventoOcorrido = evento.getValue();
            }else{
                break;
            }
        }
        
        return ultimoEventoOcorrido;
    }
    
    @Override
    public String toString(){
        String saida = "";
        
        for(Map.Entry<LocalDate, Evento> evento : this.eventos.entrySet()){
            saida += evento.getKey().toString() + " "+ evento.getValue().toString() + "\n";
        }
        
         return saida;
    }   
}
