/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Set.aluno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Guilherme
 */
public class ListaAluno {
    private final Set<Aluno> alunos;
    
    public ListaAluno(){
        this.alunos = new HashSet<>();
    }
    
    public int qtdeAlunos(){
        return this.alunos.size();
    }
    
    public boolean adicionarAluno(Aluno novoAluno){
        return this.alunos.add(novoAluno);
    }
    
    public boolean removerAluno(int matricula){
        Aluno alunoRemovido = new Aluno(matricula);
        
        return this.alunos.remove(alunoRemovido);
    }
    
    public Set<Aluno> getAlunoNome(String nome){
        Set<Aluno> alunosPorNome = new HashSet<>();
        
        for(Aluno aluno : this.alunos){
            if(aluno.getNome().startsWith(nome)){
                alunosPorNome.add(aluno);
            }
        }
        
        return alunosPorNome;
    }
    
    public Aluno getAluno(int matricula){
        for(Aluno aluno : this.alunos){
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        
        return null;
    }
    
    public Set<Aluno> ordenarNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorNome());
        alunosPorNome.addAll(this.alunos);
        
        return alunosPorNome;
    }
    
    public Set<Aluno> ordenarNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(this.alunos);
        
        return alunosPorNota;
    }
    
    @Override
    public String toString(){
        Iterator<Aluno> itAluno = this.alunos.iterator();
        String saida = "";
        
        while(itAluno.hasNext()){
            saida += itAluno.next().toString() + "\n";
        }
        
        return saida;
    }
}
