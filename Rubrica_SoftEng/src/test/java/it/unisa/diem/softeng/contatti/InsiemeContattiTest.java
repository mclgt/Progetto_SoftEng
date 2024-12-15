/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.contatti;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *@brief Classe di test per la classe InsiemeContatti
 * @author Beatrice Rebecca
 * @date 12-12-2024
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
     * @brief Test del metodo aggiungi della InsiemeContatti
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
     * @brief Test del metodo rimuovi della InsiemeContatti
    */
    @Test
    public void testRimuovi() {
       this.setUp();
       insiemeContatti.aggiungi(contatto1);
       insiemeContatti.aggiungi(contatto2);
       assertEquals(2,insiemeContatti.getInsieme().size());
       insiemeContatti.rimuovi(contatto1);
       insiemeContatti.rimuovi(contatto2);
       assertFalse(insiemeContatti.getInsieme().contains(contatto1));
       assertFalse(insiemeContatti.getInsieme().contains(contatto2));
    }

    /**
     * @brief Test del metodo modifica della classe InsiemeContatti
    */
    @Test
    public void testModifica() {
        this.setUp();
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
     * @brief Test del metodo cerca della classe InsiemeContatti
    */
    @Test
    public void testCerca() {
        this.setUp();
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto4);
        ObservableList<Contatto> ris=insiemeContatti.cerca("Michela");
        assertEquals(1,ris.size());
        assertTrue(ris.contains(contatto1));
    }

    /**
     * @brief Test del metodo getInsieme della classe InsiemeContatti
    */
    @Test
    public void testGetInsieme() {
        this.setUp();
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
     * @brief Test del metodo sort della classe InsiemeContatti
    */
    @Test
    public void testSort() {
        this.setUp();
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.sort();
        assertEquals(contatto2,insiemeContatti.getInsieme().get(0));
        assertEquals(contatto3,insiemeContatti.getInsieme().get(1));
        
    }

    /**
     * @brief Test del metodo reset della classe InsiemeContatti
    */
    @Test
    public void testReset() {
        this.setUp();
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.aggiungi(contatto4);
        insiemeContatti.reset();
        assertTrue(insiemeContatti.getInsieme().isEmpty());
    }

    /**
     * @brief Test del metodo setInsieme della classe InsiemeContatti
    */
    @Test
    public void testSetInsieme() {
        this.setUp();
        ObservableList<Contatto> prova=FXCollections.observableArrayList();
        prova.add(contatto1);
        insiemeContatti.setInsieme(prova);
        for(Contatto c: prova){
            assertTrue(insiemeContatti.getInsieme().contains(c));
        }
    }
    
    
    /**
     * @brief Test del metodo esportaContatti della classe InsiemeContatto 
     */
    @Test
    public void testEsportaContatti() throws IOException {
        this.setUp();
        insiemeContatti.aggiungi(contatto1);
        insiemeContatti.aggiungi(contatto2);
        insiemeContatti.aggiungi(contatto3);
        insiemeContatti.aggiungi(contatto4);
        
        insiemeContatti.esportaContatti("temporaneo.csv");
        File file= new File("temporaneo.csv");
        assertTrue(file.exists(),"Il file CSV non è stato creato.");
        List<String> righe= new ArrayList<>();
        try(BufferedReader reader= new BufferedReader(new FileReader("temporaneo.csv"))){
           String riga;
           while((riga=reader.readLine()) != null){
               righe.add(riga);
           }
          assertEquals("COGNOME;NOME;NUMERO1;NUMERO2;NUMERO3;E-MAIL1;E-MAIL2;E-MAIL3", righe.get(0),"Intestazione errata");
          assertEquals("Beatrice;Rebecca;343;453;24243;rebeccabeatrice@gmail.com;reb@yahoo.it;beatricer@hotmail.it", righe.get(1),"Prima riga di dati errata");
          assertEquals("Caliendo;Antonio;7845;23423;675657;antoniocaliendo@gmail.com;antoc@yahoo.it;caliendoa@hotmail.it", righe.get(2),"Seconda riga di dati errata");
          assertEquals("Cambria;Jacopo;2341;687878;3242465;jacopocambria@gmail.com;jacocam@yahoo.it;cambriaj@hotmail.it", righe.get(3),"Terza riga di dati errata");
          assertEquals("Gaeta;Michela;123;456;789;michelagaeta@gmail.com;m.gaeta6@yahoo.it;micheg@hotmail.it", righe.get(4),"Quarta riga di dati errata");
        }
        file.delete();
    }
    
    
}
