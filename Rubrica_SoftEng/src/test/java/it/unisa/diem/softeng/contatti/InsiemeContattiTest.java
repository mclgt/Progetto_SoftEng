/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.contatti;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Reb
 */
public class InsiemeContattiTest {
    
    public InsiemeContattiTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of aggiungi method, of class InsiemeContatti.
     */
    @Test
    public void testAggiungi() {
        System.out.println("aggiungi");
        Contatto contact = null;
        InsiemeContatti instance = new InsiemeContatti();
        instance.aggiungi(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rimuovi method, of class InsiemeContatti.
     */
    @Test
    public void testRimuovi() {
        System.out.println("rimuovi");
        Contatto contact = null;
        InsiemeContatti instance = new InsiemeContatti();
        instance.rimuovi(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modifica method, of class InsiemeContatti.
     */
    @Test
    public void testModifica() {
        System.out.println("modifica");
        Contatto c = null;
        String newName = "";
        String newSurname = "";
        String[] newNumeri = null;
        String[] newMail = null;
        InsiemeContatti instance = new InsiemeContatti();
        instance.modifica(c, newName, newSurname, newNumeri, newMail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerca method, of class InsiemeContatti.
     */
    @Test
    public void testCerca() {
        System.out.println("cerca");
        String text = "";
        InsiemeContatti instance = new InsiemeContatti();
        ObservableList<Contatto> expResult = null;
        ObservableList<Contatto> result = instance.cerca(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsieme method, of class InsiemeContatti.
     */
    @Test
    public void testGetInsieme() {
        System.out.println("getInsieme");
        InsiemeContatti instance = new InsiemeContatti();
        ObservableList<Contatto> expResult = null;
        ObservableList<Contatto> result = instance.getInsieme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class InsiemeContatti.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        InsiemeContatti instance = new InsiemeContatti();
        instance.sort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class InsiemeContatti.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        InsiemeContatti instance = new InsiemeContatti();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
