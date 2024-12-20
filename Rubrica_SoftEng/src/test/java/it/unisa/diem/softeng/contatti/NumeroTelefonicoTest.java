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
 *@brief Classe di test per la classe NumeroTelefonico
 * @author Gaeta Michela
 * @date 12-12-2024
 */
public class NumeroTelefonicoTest {
    private NumeroTelefonico numeri;
    
   
    
    @BeforeEach
    public void setUp() {
        String numero1= "1234567890";
        String numero2="9876543210";
        String numero3="5551234567";
        numeri=new NumeroTelefonico(numero1,numero2,numero3);
    }
    
    /**
   * @brief Test del metodo costruttore della classe NumeroTelefonico
   */
    void costruttoreNumeroTelefonicoTest(){
        this.setUp();
        assertEquals("1234567890",numeri.getNumero1());
        assertEquals("9876543210",numeri.getNumero2());
        assertEquals("5551234567",numeri.getNumero3());
        
    }
    
        /**
   * @brief Test del metodo costruttore della classe NumeroTelefonico - caso non valido
   */
    void costruttoreNumeroTelefonicoTestNonValido(){
        NumeroTelefonico numeri2= new NumeroTelefonico("abcd","123abc","errato0");
        assertTrue(numeri2.getNumero1().equals(""));
        assertTrue(numeri2.getNumero2().equals(""));
        assertTrue(numeri2.getNumero3().equals(""));
        
    }
    
 /**
   * @brief Test del metodo validazioneNumero della classe NumeroTelefonico caso valido
   */
    void validazioneNumeroTest(){
        this.setUp();
        assertTrue(numeri.validazioneNumero(numeri.getNumero1()));
        assertTrue(numeri.validazioneNumero(numeri.getNumero2()));
        assertTrue(numeri.validazioneNumero(numeri.getNumero3()));
    }
    
 /**
   * @brief Test del metodo validazioneNumero della classe NumeroTelefonico caso non valido
   */
    void validazioneNumeroTestNonValido(){
        NumeroTelefonico numeri2= new NumeroTelefonico(null,null,null);
        assertFalse(numeri2.validazioneNumero("abc"));
        assertFalse(numeri2.validazioneNumero("12345numero"));
    }
    

    /**
     * @brief Test del metodo toString method della classe NumeroTelefonico.
     */
    @Test
    public void testToString() {
        this.setUp();
        String risultatoAspettato="1234567890\n9876543210\n5551234567";
        assertEquals(risultatoAspettato,numeri.toString());
    }

    /**
     * @brief Test del metodo setNumero1 della classe NumeroTelefonico.
     */
    @Test
    public void testSetNumero1() {
        this.setUp();
        numeri.setNumero1("098765432");
        assertEquals("098765432",numeri.getNumero1());
    }
    
   /**
     * @brief Test del metodo setNumero1 della classe NumeroTelefonico - caso non valido
     */
    @Test
    public void testSetNumero1NonValido() {
        this.setUp();
        numeri.setNumero1("018374abn");
        assertNotEquals("018374abn",numeri.getNumero1());
    }
    
   

  /**
     * @brief Test del metodo setNumero2 della classe NumeroTelefonico.
     */
    @Test
    public void testSetNumero2() {
        this.setUp();
        numeri.setNumero2("1116716272");
        assertEquals("1116716272",numeri.getNumero2());
    }
    
   /**
     * @brief Test del metodo setNumero2 della classe NumeroTelefonico - caso non valido
     */
    @Test
    public void testSetNumero2NonValido() {
        this.setUp();
        numeri.setNumero1("abc");
        assertNotEquals("abc",numeri.getNumero1());
    }
    
  

   /**
     * @brief Test del metodo setNumero3 della classe NumeroTelefonico.
     */
    @Test
    public void testSetNumero3() {
        this.setUp();
        numeri.setNumero3("4567864356");
        assertEquals("4567864356",numeri.getNumero3());
    }
   
   /**
     * @brief Test del metodo setNumero3 della classe NumeroTelefonico - caso non valido
     */
    @Test
    public void testSetNumero3NonValido() {
        this.setUp();
        numeri.setNumero3("errore67");
        assertNotEquals("errore67",numeri.getNumero3());
    }
    
    /**
     * @brief Test per trattare un oggetto Email con valori nulla
     */
    @Test
    public void testNullNumeri(){
        NumeroTelefonico numeriNulli= new NumeroTelefonico(null,null,null);
        assertNull(numeriNulli.getNumero1());
        assertNull(numeriNulli.getNumero2());
        assertNull(numeriNulli.getNumero3());
    }
    
}

    

