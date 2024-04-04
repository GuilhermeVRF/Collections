/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Set.contato.AgendaContato;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("Guilherme", "1");
        agenda.adicionarContato("Luís", "2");
        agenda.adicionarContato("Wander", "3"); 
        agenda.adicionarContato("Wander Luís", "4");
        
        System.out.println(agenda.pesquisarContato("Wander"));
        System.out.println(agenda);
    }
}
