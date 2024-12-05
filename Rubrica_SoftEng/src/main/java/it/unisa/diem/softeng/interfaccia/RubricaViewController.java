/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package it.unisa.diem.softeng.interfaccia;
import it.unisa.diem.softeng.contatti.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableSet;
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
    private TextField searchFIeld;
    @FXML
    private Button importButton;
    @FXML
    private Button exportButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField firstNumberField;
    @FXML
    private TextField secondNumberField;
    @FXML
    private TextField thirdNumberField;
    @FXML
    private TextField firstMailFIeld;
    @FXML
    private TextField secondMailField;
    @FXML
    private TextField thirdMailFIeld;
    @FXML
    private Button addButton;
    @FXML
    private Button modifyButton;
    @FXML
    private Button removeButton;
    @FXML
    private TableView<Contatto> contactTable;
    @FXML
    private TableColumn<Contatto, String> surnameClm;
    @FXML
    private TableColumn<Contatto, String> nameClm;
    @FXML
    private TableColumn<Contatto, NumeroTelefonico> numberClm;
    @FXML
    private TableColumn<Contatto, Email> emailClm;

    InsiemeContatti rubrica;
    
    @FXML
    private Button searchButton;
    
    /**
     * Inizializza la classe del controller.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'importContact' è possibile richiamare il metodo leggi presente nella classe InsiemeContatti
    * @pre Campo di testo non vuoto
    * @post Viene richiamato il metodo nella classe InsiemeContatti , i valori della TableView corrisponderanno con i valori contenuti nel file 
    * @invariant descrizione invarianti
    * @param
    *
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @FXML
    private void importContact(ActionEvent event) {
    }

  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'exportContact' è possibile richiamare il metodo scriviCSV presente nella classe InsiemeContatti
    * @pre descrizione precondizioni
    * @post Viene richiamato il metodo nella classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @FXML
    private void exportContact(ActionEvent event) {
    }

  /**
    * @brief  Attraverso l'attivazione dell'evento corrispondente all'azione 'addContact' è possibile richiamare il metodo aggiungi presente nella classe InsiemeContatti

    * @pre almeno uno dei campi relativi al nome e al cognome risulta essere riempito
    * @post Richiama il metodo nella classe InsiemeContatti, nella TableView verrà aggiunta una riga contenente i valori inseriti nei campi di testo
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @FXML
    private void addContact(ActionEvent event) {
       
    }

/**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'modifyContact' è possibile richiamare il metodo modifica presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post La riga corrispondente al contatto sarà coerente con le modifiche passate- verrà richiamato il metodo di InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */ 
    @FXML
    private void modifyContact(ActionEvent event) {
        
    }

/**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'removeContact' è possibile richiamare il metodo rimuovi presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post La riga corrispondente al contatto verrà rimossa dalla TableView, verrà richiamato il metodo della classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @FXML
    private void removeContact(ActionEvent event) {
    }

    
  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'searchContact' è possibile richiamare il metodo cerca presente nella classe InsiemeContatti
    * @pre è stata inserita nel campo di testo una sottostringa non nulla
    * @post La TableView mostrerà i risultati della ricerca, verrà richiamato il metodo della classe InsiemeContatti
    * @invariant descrizione invarianti
    * @param
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @FXML
    private void searchContact(ActionEvent event) {
    }
    
}
