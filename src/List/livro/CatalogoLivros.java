/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.livro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class CatalogoLivros {
    private final List<Livro> catalogoLivros;
    
    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro novoLivro){
        this.catalogoLivros.add(novoLivro);
    }
    
    public void removerLivro(int isbn){
        for(Livro livro : this.catalogoLivros){
            if(livro.getIsbn() == isbn){
                this.catalogoLivros.remove(livro);
                break;
            }
        }
    }
    
    public Livro pesquisarIsbn(int isbn){
        for(Livro livro : this.catalogoLivros){
            if(livro.getIsbn() == isbn){
                return livro;
            }
        }
        
        return null;
    }
    
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        
        for(Livro livro : this.catalogoLivros){
            if(livro.getAutor().equals(autor)){
                livrosAutor.add(livro);
            }
        }
        
        return livrosAutor;
    }
    
    public List<Livro> pesquisarTitulo(String titulo){
        List<Livro> livrosTitulo = new ArrayList<>();
        
        for(Livro livro : this.catalogoLivros){
            if(livro.getTitulo().equals(titulo)){
                livrosTitulo.add(livro);
            }
        }
        
        return livrosTitulo;
    }
    
    public List<Livro> pesquisarIntervalo_anoPublicacao(int anoInicial, int anoFinal){
        List<Livro> livrosAnoPublicacao = new ArrayList<>();
        
        for(Livro livro : this.catalogoLivros){
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosAnoPublicacao.add(livro);
            }
        }
        
        return livrosAnoPublicacao;
    }
    
    @Override
    public String toString(){
        String saida = "---Catálogo de Livros---\n";
        
        for(Livro livro : this.catalogoLivros){
            saida += livro.toString() +"\n\n";
        }
        
        return saida;
    }
}
