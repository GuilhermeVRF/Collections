/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.tarefa;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class ListaTarefa {
    private final List<Tarefa> listaTarefa;
    
    public ListaTarefa(){
        this.listaTarefa = new LinkedList<>();
    }
    
    public void adicionarTarefa(String titulo, String data, String descricao){
        this.listaTarefa.add(new Tarefa(titulo, data, descricao));
    }
    
    public void removerTarefa(String titulo){
        for(int posLista = 0; posLista < this.listaTarefa.size();posLista++){
            if(this.listaTarefa.get(posLista).getTitulo().equals(titulo)){
                this.listaTarefa.remove(posLista);
            }
        }
    }
    
    public void removerTarefa(String titulo, String data){
        for(int posLista = 0; posLista < this.listaTarefa.size();posLista++){
            Tarefa tarefa = this.listaTarefa.get(posLista);
            if(tarefa.getTitulo().equals(titulo) && tarefa.getData().equals(data)){
                this.listaTarefa.remove(posLista);
            }
        }
    }
    
    public int getTotalTarefas(){
        return this.listaTarefa.size();
    }
    
    public String getTarefas(){
        String tarefas = "---Tarefas---\n";
        
        for(Tarefa tarefa : this.listaTarefa){
            tarefas += tarefa.toString() +"\n\n";
        }
        
        return tarefas;
    }
}
