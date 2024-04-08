/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.aluno;

import java.util.Comparator;

/**
 *
 * @author Guilherme
 */
public class Aluno {
    private final int matricula;
    private final String nome;
    private double nota;
    
    public Aluno(int matricula, String nome, double nota){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    
    public Aluno(int matricula){
        this.matricula = matricula;
        this.nome = null;
        this.nota = 0.0;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNota(double nota){
        this.nota += nota;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    @Override
    public int hashCode(){
        return this.matricula;
    }
    
    public boolean equals(Object o){
        if(o instanceof Aluno){
            Aluno outroAluno = (Aluno) o;
            
            if(this.matricula == outroAluno.matricula){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return "Matrícula: "+ this.matricula + "\n"+
               "Nome: "+ this.nome + "\n"+
               "Nota: "+ this.nota + "\n";
    }  
}

class ComparatorNome implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        return a1.getNome().compareTo(a2.getNome());
    }
}

class ComparatorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        if(a1.getNota() >= a2.getNota()){
            return 1;
        }else{
            return -1;
        }
    }
}
