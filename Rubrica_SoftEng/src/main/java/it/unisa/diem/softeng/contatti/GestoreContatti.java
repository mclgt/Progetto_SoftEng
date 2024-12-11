/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.IOException;
import javafx.collections.ObservableList;

/**
 * @file GestoreContatti.java
 * @brief Racchiude i metodi per la gestione della rubrica. Include funzionalità come aggiunta, rimozione, modifica e 
 * ricerca dei contatti.
 * 
 * @author Gaeta Michela
 * @date 9-12-2024
 * 
 */
public interface GestoreContatti {
  /**
    * @brief Aggiunge un contatto alla struttura dati che rappresenta la rubrica.
    * @param contact [in] : il contatto da aggiungere alla rubrica
    *  
    */
     public void aggiungi(Contatto contact);
     
  /**
    * @brief Rimuove un contatto dalla struttura dati che rappresenta la rubrica.
    * @param contact[in]: il contatto da rimuovere
    * 
    */
     public void rimuovi(Contatto contact);
     
  /**
    * @brief Modifica un contatto esistente all'interno della rubrica
    * @pre il Contatto c deve essere un contatto appartenente alla struttura dati che rappresenta la rubrica
    * @param c[in]: il contatto da modificare
    * @param newName[in]: nuovo nome del contatto (può essere null se si vuole rimuovere il nome ma ciò è possibile solo se c'è un cognome definito)
    * @param newSurname[in]:  nuovo cognome del contatto (può essere null se si vuole rimuovere il cognome ma ciò è possibile solo se c'è un nome definito)
    * @param newNumeri[][in]: nuovo array di numeri di telefono( può contenere valori null se si vogliono rimuovere determinati numeri)
    * @param newMail[][in]: nuovo arrau di inidirizzi email( può contenere valori null se si vogliono rimuovere determinati indirizzi)
    */
     public void modifica(Contatto c, String newName, String newSurname, String[] newNumeri, String[] newMail );
     
  /**
    * @brief Cerca uno o più contatti tramite sottostringa iniziale del nome/cognome
    * @param text[in]: stringa da ricercare
    * @return la lista osservabile contenente i risultati della ricerca - se la ricerca non produce risultati verrà visualizzata una lista vuota.
    */
     public ObservableList<Contatto>  cerca(String text);
     
  /**
    * @brief Esporta la struttura dati che rappresenta la rubrica su un file in formato CSV (Comma Separated Values)
    * @param filename[in]: nome del file su cui esportare i contatti
    * 
    * @throws IOException se avviene un errore durante la scrittura su file
    */
     public void scriviCSV(String filename) throws IOException;
   
  /**
    * @brief Importa la struttura dati che rappresenta la rubrica da un file CSV (Comma Separated Values)
    * @param filename[in]: nome del file da cui importare i contatti
    * @return la lista osservabile coerente con il contenuto del file
    * 
    * @throws IOException se avviene un errore durante la lettura da file
    */
     public ObservableList<Contatto> leggi(String filename)throws IOException;
     
     
  /**
    * @brief Restituisce la struttura usata per contenere i contatti
    * @return lista osservabile che contiene gli elementi presenti nella struttura dati che rappresenta la rubrica.
    */
     public ObservableList<Contatto> getInsieme();
     
   /**
    * @brief Restituisce la struttura usata per contenere i contatti ordinata
    */
     public void sort(); 
   
   /**
    * @brief Resetta la rubrica, svuotandola da tutti i contatti.
    */
     public void reset();
     
  /**
    * @brief Imposta la lista osservabile rappresentante la rubrica.
    * @param list: l'ObservableList di contatti  da associare alla rubrica
    */
     public void setInsieme(ObservableList<Contatto> list);
    
}
