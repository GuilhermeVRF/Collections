/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Map.evento.AgendaEventos;
import Map.evento.Evento;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();
        Evento ev1 = new Evento("EV1");
        ev1.adicionarAtracao("EV1ATR1", 8, 0);
        ev1.adicionarAtracao("EV1ATR2", 9, 0);
        ev1.adicionarAtracao("EV1ATR3", 10, 0);
        
        eventos.adicionarEvento(LocalDate.of(2024, 4,7), ev1);
        
        Evento ev2 = new Evento("EV2");
        ev2.adicionarAtracao("EV2ATR1", 8, 0);
        ev2.adicionarAtracao("EV2ATR2", 9, 0);
        ev2.adicionarAtracao("EV2ATR3", 10, 0);
        
        eventos.adicionarEvento(LocalDate.of(2024, 4,10), ev2);
        
        
        Evento ev3 = new Evento("EV3");
        ev3.adicionarAtracao("EV3ATR1", 8, 0);
        ev3.adicionarAtracao("EV3ATR2", 9, 0);
        ev3.adicionarAtracao("EV3ATR3", 10, 0);
        
        eventos.adicionarEvento(LocalDate.of(2024, 4,8), ev3);
        
        
        System.out.println(eventos.proximoEvento());
        System.out.println(eventos.ultimoEventoOcorrido());
    }
}
