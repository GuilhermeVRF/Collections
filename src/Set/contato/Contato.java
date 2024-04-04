/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.contato;

/**
 *
 * @author Guilherme
 */
public class Contato implements Comparable<Contato>{
    private String nome;
    private String numeroTelefone;
    
    public Contato(String nome, String numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNumeroTelefone(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNumeroTelefone(){
        return this.numeroTelefone;
    }
    
    @Override
    public int compareTo(Contato outroContato){
        return outroContato.getNome().compareTo(this.getNome());
    }
    
    @Override
    public int hashCode(){
        return this.numeroTelefone.hashCode();
    }
    
    @Override
    public boolean equals(Object o){
        if(o.getClass() != this.getClass()){
            return false;
        }
        
        Contato outroContato = (Contato) o;
        return outroContato.hashCode() == this.hashCode();
    }
    
    @Override
    public String toString(){
        return this.nome + " - " + this.numeroTelefone;
    }
}
