/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
    *@brief Classe di test per la classe Email
    * @author Gaeta Michela
    * @date 12-12-2024
 */
public class EmailTest {
    private Email emails;
  
    @BeforeEach
    public void setUp() {
        String email1="tyrannosaurus.totk@instantletter.net";
        String email2="crude.warbler@instantletter.net";
        String email3="acceptable.silverfish@instantletter.net";
        emails= new Email(email1,email2,email3);
    }
    
    
  /**
   * @brief Test del metodo costruttore della classe Email
   */
    void costruttoreEmailTest(){
        this.setUp();
        assertEquals("tyrannosaurus.totk@instantletter.net",emails.getEmail1());
        assertEquals("crude.warbler@instantletter.net",emails.getEmail2());
        assertEquals("acceptable.silverfish@instantletter.net",emails.getEmail3());
        
    }


    /**
     * @brief Test del metodo toString method della classe Email.
     */
    @Test
    public void testToString() {
        this.setUp();
        String risultatoAspettato="tyrannosaurus.totk@instantletter.net\ncrude.warbler@instantletter.net\nacceptable.silverfish@instantletter.net";
        assertEquals(risultatoAspettato,emails.toString());
    }

    /**
     * @brief Test del metodo setEmail1 della classe Email.
     */
    @Test
    public void testSetEmail1() {
        this.setUp();
        emails.setEmail1("email1@esempio.com");
        assertEquals("email1@esempio.com",emails.getEmail1());
    }

    /**
     * @brief Test del metodo setEmail2 della classe Email.
     */
    @Test
    public void testSetEmail2() {
        this.setUp();
        emails.setEmail2("email2@esempio.com");
        assertEquals("email2@esempio.com",emails.getEmail2());
    }

    /**
     * @brief Test del metodo setEmail2 della classe Email.
     */
    @Test
    public void testSetEmail3() {
        this.setUp();
        emails.setEmail3("email3@esempio.com");
        assertEquals("email3@esempio.com",emails.getEmail3());
    }
    
    /**
     * @brief Test per trattare un oggetto Email con valori nulla
     */
    @Test
    public void testNullEmails(){
        Email emailNulle= new Email(null,null,null);
        assertNull(emailNulle.getEmail1());
        assertNull(emailNulle.getEmail2());
        assertNull(emailNulle.getEmail3());
    }
    
}
