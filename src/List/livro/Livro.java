/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List.livro;

/**
 *
 * @author Guilherme
 */
public class Livro {
    private final int isbn;
    private final String titulo;
    private final String autor;
    private final String editora;
    private final int anoPublicacao;
    
    public Livro(int isbn, String titulo, String autor, String editora, int anoPublicacao){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public int getIsbn(){
        return this.isbn;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getEditora(){
        return this.editora;
    }
    
    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }
    
    @Override
    public String toString(){
        return "ISBN: "+ this.isbn + "\n"+
                "Título: "+ this.titulo + "\n"+
                "Autor: "+this.autor + "\n"+
                "Editora: "+ this.editora + "\n" +
                "Ano de publicação: " + this.anoPublicacao;
    }
    
}
