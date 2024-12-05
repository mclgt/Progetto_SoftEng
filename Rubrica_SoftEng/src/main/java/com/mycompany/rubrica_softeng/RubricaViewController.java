/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.rubrica_softeng;

import it.unisa.diem.softeng.contatti.Contatto;
import it.unisa.diem.softeng.contatti.Email;
import it.unisa.diem.softeng.contatti.InsiemeContatti;
import it.unisa.diem.softeng.contatti.NumeroTelefonico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * @file RubricaViewController.java
 * @brief Permette di eseguire le azioni relative ad un contatto o alla rubrica, collegate ai vari elementi interattivi inseriti nell'interfaccia
 * 
 * @author Autore
 * @date data
 * 
 */

public class RubricaViewController implements Initializable {

    @FXML
    private TextField campoCerca;
    @FXML
    private Button pulsanteCerca;
    @FXML
    private Button pulsanteImporta;
    @FXML
    private TextField campoImporta;
    @FXML
    private Button pulsanteEsporta;
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoCognome;
    @FXML
    private TextField campoPrimoNum;
    @FXML
    private TextField campoSecondoNum;
    @FXML
    private TextField campoTerzoNum;
    @FXML
    private TextField campoPrimaMail;
    @FXML
    private TextField campoSecondaMail;
    @FXML
    private TextField campoTerzaMail;
    @FXML
    private Button pulsanteAggiungi;
    @FXML
    private Button pulsanteModifica;
    @FXML
    private Button pulsanteRimuovi;
    @FXML
    private TableView<Contatto> tabellaContatti;
    @FXML
    private TableColumn<Contatto, String> colonnaCognome;
    @FXML
    private TableColumn<Contatto, String> colonnaNome;
    @FXML
    private TableColumn<Contatto, NumeroTelefonico> colonnaNum;
    @FXML
    private TableColumn<Contatto, Email> colonnaEmail;

   /**
     * Inizializza la classe del controller.
     */   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'cercaContatto' è possibile richiamare il metodo cerca presente nella classe InsiemeContatti
    * @pre è stata inserita nel campo di testo una sottostringa non nulla
    * @post La TableView mostrerà i risultati della ricerca, verrà richiamato il metodo della classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */
    @FXML
    private void cercaContatto(ActionEvent event) {
    }

  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'importaContatto' è possibile richiamare il metodo leggi presente nella classe InsiemeContatti
    * @pre Campo di testo non vuoto
    * @post Viene richiamato il metodo nella classe InsiemeContatti , i valori della TableView corrisponderanno con i valori contenuti nel file 
    * @invariant descrizione invarianti
    * @param
    *
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */
    @FXML
    private void importaContatto(ActionEvent event) {
    }

    
    /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'esportaContatto' è possibile richiamare il metodo scriviCSV presente nella classe InsiemeContatti
    * @pre descrizione precondizioni
    * @post Viene richiamato il metodo nella classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */
    @FXML
    private void esportaContatto(ActionEvent event) {
    }

    
 
  /**
    * @brief  Attraverso l'attivazione dell'evento corrispondente all'azione 'aggiungiContatto' è possibile richiamare il metodo aggiungi presente nella classe InsiemeContatti
    * @pre almeno uno dei campi relativi al nome e al cognome risulta essere riempito
    * @post Richiama il metodo nella classe InsiemeContatti, nella TableView verrà aggiunta una riga contenente i valori inseriti nei campi di testo
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */   
    @FXML
    private void aggiungiContatto(ActionEvent event) {
    }

  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'modificaContatto' è possibile richiamare il metodo modifica presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post La riga corrispondente al contatto sarà coerente con le modifiche passate- verrà richiamato il metodo di InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */ 
   
    @FXML
    private void modificaContatto(ActionEvent event) {
    }

    
 /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'rimuoviContatto' è possibile richiamare il metodo rimuovi presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post La riga corrispondente al contatto verrà rimossa dalla TableView, verrà richiamato il metodo della classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
    */
    @FXML
    private void rimuoviContatto(ActionEvent event) {
    }
    
}
