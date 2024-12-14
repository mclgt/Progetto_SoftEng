/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *@brief Classe di test per verificare il corretto funzionamento delle interazioni tra classi
 * @author Gaeta Michela
 * @date 14-12-2024
 */
public class TestIntegrato {
    @Test
    public void testCompleto(){
   
        String[] numeri={"12345678","890134546","56789086549"};
        String[] emails={"email1@esempio.comn","email2@esempio.com","email3@esempio.com"};
        
        Contatto contatto= new Contatto("Mario","Rossi",numeri,emails); 
        InsiemeContatti rubrica= new InsiemeContatti();
        rubrica.aggiungi(contatto);        
        assertTrue(rubrica.getInsieme().contains(contatto),"Il contatto Mario Rossi dovrebbe essere presente nell'InsiemeContatti");
        
        Contatto contatto2= new Contatto("Jane","Dough",numeri,emails);
        rubrica.aggiungi(contatto2);
        rubrica.rimuovi(contatto);
        assertFalse(rubrica.getInsieme().contains(contatto),"Il contatto Jane Dough non dovrebbe  più essere presente nell'InsiemeContatti");
        
        Contatto contatto3= new Contatto("Maria","Bianchi",numeri,emails);
        rubrica.aggiungi(contatto3);
        rubrica.modifica(contatto3, "James","Dough", numeri, emails);
        assertFalse(rubrica.cerca("James").isEmpty(),"La ricerca per 'James' dovrebbe produrre risultato");
        assertTrue(rubrica.cerca("Pino").isEmpty(),"La ricerca per 'Pino'  non dovrebbe produrre risultato");
        
        rubrica.reset();
        assertTrue(rubrica.getInsieme().isEmpty(),"La rubrica dovrebbe essere vuota dopo il reset");
               
        Contatto contatto4=contatto;
        rubrica.aggiungi(contatto);
        rubrica.aggiungi(contatto4);
        assertTrue(rubrica.getInsieme().contains(contatto) && rubrica.getInsieme().contains(contatto4), "Due contatti uguali possono esistere nello stesso InsiemeContatti");
        
    }
    
}
