/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Set.produto.Estoque;
import Set.produto.Produto;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto(1,"Arroz",12));
        estoque.adicionarProduto(new Produto(1,"Yorgute",2));
        estoque.adicionarProduto(new Produto(2,"Fubá",5));
        estoque.adicionarProduto(new Produto(3,"Feijão",7));
        estoque.adicionarProduto(new Produto(4,"Chiclete",2));
        estoque.adicionarProduto(new Produto(5,"Bala",3));
        
        System.out.println(estoque.ordenarPreco());
    }
}
