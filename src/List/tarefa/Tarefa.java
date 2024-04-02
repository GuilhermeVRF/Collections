package List.tarefa;

import java.util.Date;

public class Tarefa {
    
    private String titulo;
    private String data;
    private String descricao;

    public Tarefa (String titulo, String data, String descricao){
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setData(String data){
        this.data = data;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    @Override
    public String toString(){
        return "Titulo: "+ this.titulo + "\n" +
                "Data: "+ this.data + "\n" +
                "Descrição: "+ this.descricao;      
    }  
}
