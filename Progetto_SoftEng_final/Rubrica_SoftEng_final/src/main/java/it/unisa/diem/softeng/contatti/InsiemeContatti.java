/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * @file InsiemeContatti.java
 * @brief Permette di implementare una collezione di contatti mediante un ArrayList osservabile.
 * Per maggiori informazioni sul contatto consultare il file Contatto.java. Utilizza e riscrive i metodi 
 * dell'interfaccia GestoreContatti.java
 * @invariant Se la struttura ArrayList contiene dei contatti, questi dovranno essere mostrati sempre in ordine alfabetico (per cognome, se due cognomi sono uguali, 
 * verranno confrontati i nomi).
 * 
 * @author Autore
 * @date data
 * 
 */
public class InsiemeContatti implements GestoreContatti, Serializable {
    private ObservableList<Contatto> contatti= FXCollections.observableArrayList(); 


  /**
    * @brief Permette di aggiungere un contatto alla struttura (ArrayList)
    * @pre è stato istanziato un oggetto InsiemeContatti ed un Contatto da aggiungere
    * @post Alla lista è aggiunto il contatto passato come parametro
    * @param contact [in] : rappresenta il contatto da aggiungere
    *  
    */
    @Override
    public void aggiungi(Contatto contact){
        contatti.add(contact);
    }

  /**
    * @brief Permette di rimuovere un contatto dalla struttura (ArrayList)
    * @pre è stato istanziato un oggetto InsiemeContatti, il contatto passato appartiene già all'insieme
    * @post L'elemento corrispondente al contatto passato è rimosso dalla lista
    * @param contact[in]: rappresenta il contatto da rimuovere
    * 
    */
    @Override
    public void rimuovi(Contatto contact){
        contatti.remove(contact);
    }
    
  /**
    * @brief Permette la modifica di un contatto esistente nell'InsiemeContatti
    * @pre è stato istanziato un oggetto InsiemeContatti, il contatto passato appartiene già all'insieme
    * @post i vecchi attributi del  contatto vengono sovrascritti con i nuovi
    * @param c[in]: rappresenta il contatto da modificare
    * @param newName[in] 
    * @param newSurname[in]
    * @param newNumeri[in] 
    * @param newMail[in]
    */
     @Override
    public void modifica(Contatto c, String newName, String newSurname, String[] newNumeri, String[] newMail ){
        c.setNome(newName);
        c.setCognome(newSurname);
        c.setNumero(new NumeroTelefonico(newNumeri[0],newNumeri[1],newNumeri[2]));
        c.setEmail(new Email(newMail[0],newMail[1],newMail[2]));
    }
    
  /**
    * @brief Permette di cercare un contatto tramite sottostringa iniziale del nome/cognome
    * @pre La stringa usata per la ricerca non deve essere nulla
    * @param text[in]: stringa da ricercare
    * @param risultato[out]: sottoinsieme di contatti 
    * 
    * @return Il sottoinsieme di contatti risultanti dalla ricerca 
    */
    @Override
    public ObservableList<Contatto> cerca(String text ){
       ObservableList<Contatto> risultato= FXCollections.observableArrayList();
       for(Contatto c:this.contatti){
           if(c.getNome().startsWith(text) || c.getCognome().startsWith(text))
               risultato.add(c);
       }
       return risultato;
    }

  /**
    * @brief Permette di esportare l'oggetto InsiemeContatti  su un file in formato CSV (Comma Separated Values)
    * @pre la stringa passata è non nulla
    * @post viene generato un file .csv con il nome corrispondente alla stringa passata, il quale esporrà il contenuto della lista. Il file sarà collocato nella directory del progetto.
    * @param filename[in]
    * 
    * @throws IOException
    */
    
    @Override
    public void scriviCSV(String filename)throws IOException{
        try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename+".csv")))){
            for(Contatto c:this.contatti){
                oos.writeObject(c);
            }
            oos.flush();
            oos.close();
        }
    }
    
  /**
    * @brief Permette di importare un oggetto InsiemeContatti da un file CSV (Comma Separated Values)
    * @pre è presente un file all'interno della directory del progetto che ha un nome corrispondente a quello indicato dalla stringa passata come parametro
    * @param filename[in]
    * @param importato[out]
    * 
    * @return Restituisce un InsiemeContatti con contenuto che rispecchia il contenuto del file
    * @throws IOException, FileNotFoundException
    */
    @Override
    public ObservableList<Contatto> leggi(String filename)throws IOException{
        ObservableList<Contatto> importato= FXCollections.observableArrayList();
        try(ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename+".csv")))){
           importato.add((Contatto)ois.readObject());
           ois.close();
        } catch (ClassNotFoundException ex) {
           return null;
        }
        return importato;
    }
}
