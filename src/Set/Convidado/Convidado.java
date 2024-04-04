/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.Convidado;

/**
 *
 * @author Guilherme
 */
public class Convidado {
    private int codigoConvite;
    private String nome;
    
    public Convidado(int codigoConvite, String nome){
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getCodigoConvite(){
        return this.codigoConvite;
    }
    
    @Override
    public int hashCode(){
        return this.codigoConvite;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Convidado outroConvidado = (Convidado) obj;
        
        if(outroConvidado.codigoConvite == this.codigoConvite){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return this.codigoConvite + " - " + this.nome;
    }
}
