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
 *@brief Classe di test per la classe Contatto
 * @author Gaeta Michela
 * @date 12-12-2024
 */
public class ContattoTest {
    private Contatto contatto;

    @BeforeEach
    public void setUp(){
        String[] numeri={"1234567890","0987654321","345678965"};
        String[] emails={"email1@esempio.com","email2@esempio.com","email3@esempio.com"};
        contatto= new Contatto("Michela","Gaeta",numeri,emails);
    }

   /**
     * @brief Test del metodo costruttore della classe Contatto
     */
    @Test
    void costruttoreContattoTest() {
        this.setUp();
        assertNotNull(contatto);
        assertEquals("Michela",contatto.getNome());
        assertEquals("Gaeta",contatto.getCognome());
        assertEquals("1234567890",contatto.getNumero1Contatto());
        assertEquals("0987654321",contatto.getNumero2Contatto());
        assertEquals("345678965",contatto.getNumero3Contatto());
        assertEquals("email1@esempio.com",contatto.getEmail1Contatto());
        assertEquals("email2@esempio.com",contatto.getEmail2Contatto());
        assertEquals("email3@esempio.com",contatto.getEmail3Contatto());
        
    }
   

    /**
     * @brief Test del metodo setNome della classe Contatto.
     */
    @Test
    public void testSetNome() {
        this.setUp();
        contatto.setNome("Rebecca");
        assertEquals("Rebecca",contatto.getNome());
    }

    /**
     * @brief Test del metodo setCognome della classe Contatto.
     */
    @Test
    public void testSetCognome() {
        this.setUp();
        contatto.setCognome("Beatrice");
        assertEquals("Beatrice",contatto.getCognome());
    }

    /**
     * @brief Test del metodo setNumero1 della classe Contatto.
     */
    @Test
    public void testSetNumero1() {
            this.setUp();
           contatto.setNumero1("082500000");
           assertEquals("082500000",contatto.getNumero1Contatto());
    }

    /**
     * @brief Test del metodo setNumero2 della classse Contatto.
     */
    @Test
    public void testSetNumero2() {
           this.setUp();
           contatto.setNumero2("4354488525");
           assertEquals("4354488525",contatto.getNumero2Contatto());
    }

   /**
     * @brief Test del metodo setNumero3 della classse Contatto.
     */
    @Test
    public void testSetNumero3() {
           this.setUp();
           contatto.setNumero3("37165206583");
           assertEquals("37165206583",contatto.getNumero3Contatto());
    }

    /**
     * @brief Test del metodo setEmail1 della classe Contatto.
     */
    @Test
    public void testSetEmail1() {
        this.setUp();
        contatto.setEmail1("tyrannosaurus.totk@instantletter.net");
        assertEquals("tyrannosaurus.totk@instantletter.net",contatto.getEmail1Contatto());
    }

   /**
     * @brief Test del metodo setEmail2 della classe Contatto.
     */
    @Test
    public void testSetEmail2() {
        this.setUp();
        contatto.setEmail2("crude.warbler@instantletter.net");
        assertEquals("crude.warbler@instantletter.net",contatto.getEmail2Contatto());
    }

   /**
     * @brief Test del metodo setEmail3 della classe Contatto.
     */
    @Test
    public void testSetEmail3() {
        this.setUp();
        contatto.setEmail3("acceptable.silverfish@instantletter.net");
        assertEquals("acceptable.silverfish@instantletter.net",contatto.getEmail3Contatto());
    }

    
    /**
     * @brief Test del metodo equals della classe Contatto.
     */
    @Test
    public void testEquals() {
        this.setUp();
        String[] numeri={"1234567890","0987654321","345678965"};
        String[] emails={"email1@esempio.com","email2@esempio.com","email3@esempio.com"};
        Contatto uguale= new Contatto("Michela","Gaeta",numeri,emails);
       
        
        Contatto diverso= new Contatto("Rebecca","Beatrice",numeri,emails);
        assertFalse(contatto.equals(diverso));
        assertTrue(contatto.equals(uguale));
    }

    /**
     * @brief Test del metodo compareTo della classe Contatto.
     */
    @Test
    public void testCompareTo() {
        this.setUp();
        String[] numeri={"1234567890","0987654321","345678965"};
        String[] emails={"email1@esempio.com","email2@esempio.com","email3@esempio.com"};
        Contatto contatto1= new Contatto("Antonio","Caliendo",numeri,emails);
        Contatto contatto2= new Contatto("Jacopo","Gaeta",numeri, emails);
        
        assertTrue(contatto.compareTo(contatto1)>0);
        assertTrue(contatto2.compareTo(contatto)<0);
    }

   
}
