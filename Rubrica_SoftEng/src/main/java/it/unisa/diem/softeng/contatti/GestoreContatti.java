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
    * @param list[in]: l'ObservableList di contatti  da associare alla rubrica
    */
     public void setInsieme(ObservableList<Contatto> list);
    
  /**
    * @brief Esporta la lista osservabile rappresentante la rubrica su un file .csv (Comma-Separated-Values). Questa funzione salva i dati della lista osservabile,
    * che rappresenta i contatti delòla rubrica, in un file CSV specificato dal nome del file fornito.
    * @param nomeFile[in]: il nome del file su cui verrà esportata la lista contatti
    */
     public void esportaContatti(String nomeFile);
     
     
  /**
    * @brief Importa la lista osservabile rappresentante la rubrica su un file .csv (Comma-Separated-Values). Questo metodo 
    * legge un file CSV e converte le informazioni in una lista osservabile di oggetti di tipo 'Contatto', che rappresentano i contatti 
    * della rubrica.
    * @param nomeFile[in]: il nome del file su cui verrà importata la lista contatti
    * @return Una 'ObservableList' formata da Contatti contenente tutti gli elementi importati dal file
    * 
    */
     public ObservableList<Contatto> importaContatti(String nomeFile);
     
}
