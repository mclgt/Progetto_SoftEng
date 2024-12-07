/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.IOException;
import javafx.collections.ObservableList;

/**
 *
 * @author miche
 */
public interface GestoreContatti {
     public void aggiungi(Contatto contact);
     public void rimuovi(Contatto contact);
     public void modifica(Contatto c, String newName, String newSurname, String[] newNumeri, String[] newMail );
     public ObservableList<Contatto>  cerca(String text);
     public void scriviCSV(String filename) throws IOException;
     public ObservableList<Contatto> leggi(String filename)throws IOException;
    
        
    
}
