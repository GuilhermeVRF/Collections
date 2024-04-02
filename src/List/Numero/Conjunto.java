/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.Numero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Conjunto{
    private List<Double> conjunto;
    
    public Conjunto(){
        this.conjunto = new ArrayList<>();
    }
    
    public void adicionarNumero(Double numero){
        this.conjunto.add(numero);
    }
    
    public void removerNumero(Double numero){
        for(Double numConjunto : this.conjunto){
            if(numConjunto.equals(numero)){
                this.conjunto.remove(numConjunto);
                break;
            }
        }
    }
    
    public Double somarNumeros(){
        Double soma = 0.0;
        
        for(int posConjunto = 0; posConjunto < this.conjunto.size();posConjunto++){
            soma += this.conjunto.get(posConjunto);
        }
        
        return soma;
    }
    
    public Double encontrarMaior(){        
        if(!this.conjunto.isEmpty()){
            return this.encontrarMaior(this.conjunto.get(0), 1);
        }
        
        return null;
    }
    
    private Double encontrarMaior(Double maior, int posLista){
        if(posLista == this.conjunto.size()){
            return maior;
        }
        
        if(this.conjunto.get(posLista) > maior){
            maior = this.conjunto.get(posLista);
        }
        
        return this.encontrarMaior(maior, posLista + 1);
    }
    
    public Double encontrarMenor(){
        if(!this.conjunto.isEmpty()){
            return this.encontrarMenor(this.conjunto.get(0), 1);
        }
        
        return null;
    }
    
    
    private Double encontrarMenor(Double menor, int posLista){
        if(posLista == this.conjunto.size()){
            return menor;
        }
        
        if(this.conjunto.get(posLista) < menor){
            menor = this.conjunto.get(posLista);
        }
        
        return this.encontrarMenor(menor, posLista + 1);
    }
    
    @Override
    public String toString(){
        return this.conjunto.toString();
    }
}
