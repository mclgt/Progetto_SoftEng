package it.unisa.diem.softeng.Main;

import it.unisa.diem.softeng.Main.*;
import it.unisa.diem.softeng.contatti.Contatto;
import it.unisa.diem.softeng.contatti.GestoreContatti;
import it.unisa.diem.softeng.contatti.InsiemeContatti;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * @file RubricaViewController
 * @brief Permette di eseguire le azioni relative ad un contatto o alla rubrica , collegate ai vari elementi interattivi inseriti 
 * nell'interfaccia
 * 
 * @author Autore
 * @date data
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
    private TableColumn<Contatto, String> colonnaNum;
    @FXML
    private TableColumn<Contatto, String> colonnaEmail;
    
    GestoreContatti gestore;
    
   /**
     * Inizializza la classe del controller
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        gestore= new InsiemeContatti();
        tabellaContatti.setItems(gestore.getInsieme());
        colonnaNome.setCellValueFactory(c->{ return new SimpleStringProperty(c.getValue().getNome());});
        colonnaCognome.setCellValueFactory(c->{ return new SimpleStringProperty(c.getValue().getCognome());});
        colonnaNum.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getNumeriTelefoniciString());});
        colonnaEmail.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getEmailString());});  
    }
  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'cercaContatto' è possibile richiamare il metodo cerca presente nella classe InsiemeContatti
    * @pre è stata inserita nel campo di testo una sottostringa non nulla
    * @post la TableView mostrerà i risultati della ricerca, verrà richiamato il metodo della classe InsiemeContatti
    * @param pressOnButton(pulsanteCerca) [in]
    *  
    */
    @FXML
    private void cercaContatto(ActionEvent event) {
    }

  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'importaContatto' è possibile richiamare il metodo leggi presente nella classe InsiemeContatti
    * @pre è stata inserita nel campo di testo una stringa non nulla
    * @post i valori nella TableView corrispondono con i valori contenuti nel file, verrà richiamato il metodo della classe InsiemeContatti
    * @param pressOnButton(pulsanteImporta) [in]
    *  
    */
    @FXML
    private void importaContatto(ActionEvent event) {
    }
    
  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'esportaContatto' è possibile richiamare il metodo scriviCSV presente nella classe InsiemeContatti
    * @post Viene richiamato il metodo nella classe InsiemeContatti
    * @param pressOnButton(pulsanteEsporta) [in]
    *  
    */
    @FXML
    private void esportaContatto(ActionEvent event) {
    }

  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'aggiungiContatto' è possibile richiamare il metodo aggiungi presente nella classe InsiemeContatti
    * @pre almeno uno dei campi relativo al nome o al cognome risulta essere riempito
    * @post nella TableView verrà inserita una riga contenente i valori inseriti nei campi di testo, verrà richiamato il metodo della classe InsiemeContatti
    * @param pressOnButton(pulsanteAggiungi) [in]
    *  
    */
    @FXML
    private void aggiungiContatto(ActionEvent event) {
        String numero[]=new String[]{campoPrimoNum.getText(),campoSecondoNum.getText(),campoTerzoNum.getText()};
        String email[]=new String[]{campoPrimaMail.getText(),campoSecondaMail.getText(),campoTerzaMail.getText()};
        gestore.aggiungi(new Contatto(campoNome.getText(),campoCognome.getText(),numero,email));
    }

   /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'modificaContatto' è possibile richiamare il metodo modifica presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post la riga corrispondente al contatto sarà coerente con le modifiche passate, verrà richiamato il metodo della classe InsiemeContatti
    * @param pressOnButton(pulsanteModifica) [in]
    *  
    */
    @FXML
    private void modificaContatto(ActionEvent event) {
        
    }
    
  /**
    * @brief Attraverso l'attivazione dell'evento corrispondente all'azione 'rimuoviContatto' è possibile richiamare il metodo rimuovi presente nella classe InsiemeContatti
    * @pre è stato selezionato dalla TableView un contatto
    * @post la riga corrispondente al contatto verrà rimossa dalla TableView, verrà richiamato il metodo della classe InsiemeContatti
    * @param pressOnButton(pulsanteRimuovi) [in]
    *  
    */
    @FXML
    private void rimuoviContatto(ActionEvent event) {
    }
}
