/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.contatti;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Reb
 */
public class InsiemeContattiTest {
   
    private InsiemeContatti insiemeContatti;
    private Contatto contatto1,contatto2,contatto3,contatto4;
    
    
    @BeforeEach
    public void setUp() {
        insiemeContatti=new InsiemeContatti();
        contatto1=new Contatto("Michela","Gaeta",new String[]{"123","456","789"},new String[]{"michelagaeta@gmail.com","m.gaeta6@yahoo.it","micheg@hotmail.it"});
        contatto2=new Contatto("Rebecca","Beatrice",new String[]{"343","453","24243"},new String[]{"rebeccabeatrice@gmail.com","reb@yahoo.it","beatricer@hotmail.it"});
        contatto3=new Contatto("Jacopo","Cambria",new String[]{"2341","687878","3242465"},new String[]{"jacopocambria@gmail.com","jacocam@yahoo.it","cambriaj@hotmail.it"});
        contatto4=new Contatto("Antonio","Caliendo",new String[]{"7845","23423","675657"},new String[]{"antoniocaliendo@gmail.com","antoc@yahoo.it","caliendoa@hotmail.it"});
    }
    

    /**
     * Test of aggiungi method, of class InsiemeContatti.
     */
    @Test
    public void testAggiungi() {
        this.setUp();
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.aggiungi(contatto4);
        assertEquals(4,insiemeContatti.getInsieme().size());
        assertTrue(insiemeContatti.getInsieme().contains(contatto1));
        assertTrue(insiemeContatti.getInsieme().contains(contatto2));
        assertTrue(insiemeContatti.getInsieme().contains(contatto3));
        assertTrue(insiemeContatti.getInsieme().contains(contatto4));
    }

    /**
     * Test of rimuovi method, of class InsiemeContatti.
     */
    @Test
    public void testRimuovi() {
       this.setUp();
       insiemeContatti.aggiungi(contatto1);
       insiemeContatti.aggiungi(contatto2);
       insiemeContatti.rimuovi(contatto1);
       insiemeContatti.rimuovi(contatto2);
       assertEquals(2,insiemeContatti.getInsieme().size());
       assertFalse(insiemeContatti.getInsieme().contains(contatto1));
       assertFalse(insiemeContatti.getInsieme().contains(contatto2));
    }

    /**
     * Test of modifica method, of class InsiemeContatti.
     */
    @Test
    public void testModifica() {
       insiemeContatti.aggiungi(contatto3);
       insiemeContatti.aggiungi(contatto4);
       insiemeContatti.modifica(contatto3, "Biagio", "Zanioli",new String[]{"2341","687878","3242465"},new String[]{"email1@esempio.com","biagiooo@gmail.com","zanioli@yahoo.it"});
       insiemeContatti.modifica(contatto4, "Antonio", "Zuppa", new String[]{"7845","23423","675657"}, new String[]{"antonioz@gmail.com","zuppaa@gmail.com","esempioemail3@yahoo.it"});
       assertEquals("Biagio",contatto3.getNome());
       assertEquals("Zanioli",contatto3.getCognome());
       assertArrayEquals(new String[]{"email1@esempio.com","biagiooo@gmail.com","zanioli@yahoo.it"},new String[]{contatto3.getEmail1Contatto(),contatto3.getEmail2Contatto(),contatto3.getEmail3Contatto()});
       assertEquals("Zuppa",contatto4.getCognome());
       assertArrayEquals(new String[]{"antonioz@gmail.com","zuppaa@gmail.com","esempioemail3@yahoo.it"},new String[]{contatto4.getEmail1Contatto(),contatto4.getEmail2Contatto(),contatto4.getEmail3Contatto()});
    }

    /**
     * Test of cerca method, of class InsiemeContatti.
     */
    @Test
    public void testCerca() {
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto4);
        ObservableList<Contatto> ris=insiemeContatti.cerca("Michela");
        assertEquals(1,ris.size());
        assertTrue(ris.contains(contatto1));
    }

    /**
     * Test of getInsieme method, of class InsiemeContatti.
     */
    @Test
    public void testGetInsieme() {
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.aggiungi(contatto4);
        ObservableList<Contatto> insieme=insiemeContatti.getInsieme();
        assertEquals(4,insieme.size());
        assertTrue(insieme.contains(contatto1));
        assertTrue(insieme.contains(contatto2));
        assertTrue(insieme.contains(contatto3));
        assertTrue(insieme.contains(contatto4));
    }

    /**
     * Test of sort method, of class InsiemeContatti.
     */
    @Test
    public void testSort() {
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.sort();
        assertEquals(contatto2,insiemeContatti.getInsieme().get(0));
        assertEquals(contatto3,insiemeContatti.getInsieme().get(1));
        
    }

    /**
     * Test of reset method, of class InsiemeContatti.
     */
    @Test
    public void testReset() {
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.aggiungi(contatto4);
        insiemeContatti.reset();
        assertTrue(insiemeContatti.getInsieme().isEmpty());
    }

    /**
     * Test of setInsieme method, of class InsiemeContatti.
     */
    @Test
    public void testSetInsieme() {
        System.out.println("setInsieme");
        ObservableList<Contatto> list = null;
        InsiemeContatti instance = new InsiemeContatti();
        instance.setInsieme(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
