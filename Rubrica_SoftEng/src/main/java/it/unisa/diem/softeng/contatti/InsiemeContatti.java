/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * @file InsiemeContatti.java
 * @brief Permetti di implementare una collezione di contatti mediante un ArrayList osservabile.
 * Per maggiori informazioni sul contatto consultare il file Contatto.java
 * 
 * @author Autore
 * @date data
 * 
 */
public class InsiemeContatti {
    private ObservableList<Contatto> contatti= FXCollections.observableArrayList(); 


/**
    * @brief Permette di aggiungere un contattoalla struttura (ArrayList)
    * @pre è stato istanziato un oggetto InsiemeContatti ed un Contatto da aggiungere
    * @post Alla lista è aggiunto il contatto passato come parametro
    * @invariant descrizione invarianti
    * @param contact [in] : rappresenta il contatto da aggiungere
    * 
    * @return  
 */
    public void add(Contatto contact){
        
    }

 /**
    * @brief Permette di rimuovere un contatto dalla struttura (ArrayList)
    * @pre è stato istanziato un oggetto InsiemeContatti, il contatto passato appartiene già all'insieme
    * @post L'elemento corrispondente al contatto passato è rimosso dalla lista
    * @invariant descrizione invarianti
    * @param contact[in]: rappresenta il contatto da rimuovere
    * 
    * @return  
 */
    public void remove(Contatto contact){
        
    }
    
  /**
    * @brief Permette la modifica di un contatto esistente nell'InsiemeContatti
    * @pre è statpo istanziato un oggetto InsiemeContatti, il contatto passato appartiene già all'insieme
    * @post i vecchi attributi del  contatto vengono sovrascritti con i nuovi
    * @invariant descrizione invarianti
    * @param c[in]: rappresenta il contatto da modificare
    * @param newName[in] 
    * @param newNumeri[in]
    * @param newMail[in]
    * @return 
 */
    public void modify(Contatto c, String newName, String newSurname, NumeroTelefonico newNumeri, Email newMail ){
        
    }
    
  /**
    * @brief Permette di cercare un contatto tramite sottostringa iniziale del nome/cognome
    * @pre La stringa usata per la ricerca non deve essere nulla
    * @post sarà possibile ricevere il sottoinsieme dei contatti che corrispondo al risultato della ricerca
    * @invariant descrizione invarianti
    * @param text[in]: stringa da ricercare
    * @param risultato[out]: sottoinsieme di contatti 
    * 
    * @return Il sottoinsieme di contatti risultanti dalla ricerca
    * @throws Exception 
 */
    
    public InsiemeContatti search(String text ){
        return null;
    }

  /**
    * @brief Permette di esportare l'oggetto InsiemeContatti  su un file in formato CSV (Comma Separated Values)
    * @pre la stringa passata è non nulla
    * @post viene generato un file .csv con il nome corrispondente alla stringa passata, il quale esporrà il contenuto della lista
    * @invariant descrizione invarianti
    * @param filename[in]
    * 
    * @return 
 */
    
    public void scriviCSV(String filename)throws IOException{
        
    }
    
  /**
    * @brief Permette di importare un oggetto InsiemeContatti da un file CSV (Comma Separated Values)
    * @pre descrizione precondizioni
    * @post descrizione post-condizioni 
    * @invariant descrizione invarianti
    * @param
    * (va specificato se input/output o inout)
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public InsiemeContatti leggi(String filename)throws IOException{
        return null;
    }
}
