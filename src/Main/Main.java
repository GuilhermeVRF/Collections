/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import List.Numero.Conjunto;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conjunto conjuntoRacional = new Conjunto();
        Random gerador = new Random();
        
        for(int i = 0;i < 5;i++){
            conjuntoRacional.adicionarNumero(gerador.nextDouble(0,20));
        }
        
        System.out.println(conjuntoRacional);
        System.out.println("Soma: "+conjuntoRacional.somarNumeros());
        System.out.println("Maior: "+ conjuntoRacional.encontrarMaior());
        System.out.println("Menor: "+ conjuntoRacional.encontrarMenor());
    }
    
}
