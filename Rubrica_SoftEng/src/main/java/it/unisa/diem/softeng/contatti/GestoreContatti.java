/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.IOException;
import javafx.collections.ObservableList;

/**
 * @file GestoreContatti.java
 * @brief Racchiude i metodi per la gestione della rubrica.

 * 
 * @author Autore
 * @date data
 * 
 */
public interface GestoreContatti {
    /**
    * @brief Permette di aggiungere un contatto alla struttura
    * @param contact [in] : rappresenta il contatto da aggiungere
    *  
    */
     public void aggiungi(Contatto contact);
    /**
    * @brief Permette di rimuovere un contatto dalla struttura 
    * @param contact[in]: rappresenta il contatto da rimuovere
    * 
    */
     public void rimuovi(Contatto contact);
    /**
    * @brief Permette la modifica di un contatto esistente
    * @param c[in]: rappresenta il contatto da modificare
    * @param newName[in] 
    * @param newSurname[in]
    * @param newNumeri[in] 
    * @param newMail[in]
    */
     public void modifica(Contatto c, String newName, String newSurname, String[] newNumeri, String[] newMail );
    /**
    * @brief Permette di cercare un contatto tramite sottostringa iniziale del nome/cognome
    * @param text[in]: stringa da ricercare
    * @param risultato[out]: sottoinsieme di contatti 
    */
     public ObservableList<Contatto>  cerca(String text);
    /**
    * @brief Permette di esportare la struttura su un file in formato CSV (Comma Separated Values)
    * @param filename[in]
    * 
    * @throws IOException
    */
     public void scriviCSV(String filename) throws IOException;
    /**
    * @brief Permette di importare un oggetto da un file CSV (Comma Separated Values)
    * @param filename[in]
    * @param importato[out]
    * 
    * @throws IOException, FileNotFoundException
    */
     public ObservableList<Contatto> leggi(String filename)throws IOException;
    /**
    * @brief Permette di restituire la struttura usata per contenere i contatti
    * @param insieme[out]: collezione usata per contenere gli oggetti (osservabile)
    */
     public ObservableList<Contatto> getInsieme();
        
    
}
