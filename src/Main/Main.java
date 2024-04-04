/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Set.palavra.ConjuntoPalavra;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConjuntoPalavra palavras = new ConjuntoPalavra();
        
        palavras.adicionarPalavra("Guilherme");
        palavras.adicionarPalavra("Guilherme");
        palavras.adicionarPalavra("Luís Gustavo");
        palavras.adicionarPalavra("Wander");
        
        System.out.println(palavras.verificarPalavra("Wander"));
        
        System.out.println(palavras);
    }
}
