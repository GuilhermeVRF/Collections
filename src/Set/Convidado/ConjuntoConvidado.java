/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.Convidado;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class ConjuntoConvidado {
    private final Set<Convidado> convidados;
    
    public ConjuntoConvidado(){
        this.convidados = new HashSet<>();
    }
    
    public void convidar(String nome){
        convidados.add(new Convidado(convidados.size() + 1, nome));
    }
    
    public void desconvidar(int codigoConvite){
        convidados.remove(new Convidado(codigoConvite, null));
    }
    
    public String getConvidado(int codigoConvite){
        for(Convidado convidado : this.convidados){
            if(convidado.getCodigoConvite() == codigoConvite){
                return convidado.getNome();
            }
        } 
        
        return null;
    }
    @Override
    public String toString(){
        String saida = "";
        for(Convidado convidado : this.convidados){
            saida += convidado.toString() +"\n";
        }
        
        return saida;
    }
}
