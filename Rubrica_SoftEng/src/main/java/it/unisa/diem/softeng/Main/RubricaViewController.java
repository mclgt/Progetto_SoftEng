package it.unisa.diem.softeng.Main;
import it.unisa.diem.softeng.contatti.Contatto;
import it.unisa.diem.softeng.contatti.GestoreContatti;
import it.unisa.diem.softeng.contatti.InsiemeContatti;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;



/**
 * @file RubricaViewController
 * @brief Permette di eseguire le azioni relative ad un contatto o alla rubrica , collegate ai vari elementi interattivi inseriti 
 * nell'interfaccia
 * 
 * @author Gaeta Michela- Beatrice Rebecca
 * @date 9-12-2024
 */

public class RubricaViewController implements Initializable {

    @FXML
    private TextField campoCerca;
    @FXML
    private Button pulsanteCerca;
    @FXML
    private Button pulsanteImporta;
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
    private TableColumn<Contatto, String> colonnaNum1;
    @FXML
    private TableColumn<Contatto, String> colonnaNum2;
    @FXML
    private TableColumn<Contatto, String> colonnaNum3;
    @FXML
    private TableColumn<Contatto, String> colonnaEmail1;
    @FXML
    private TableColumn<Contatto, String> colonnaEmail2;
    @FXML
    private TableColumn<Contatto, String> colonnaEmail3;
    
      
    GestoreContatti gestore;
    @FXML
    private AnchorPane base;
    @FXML
    private Button pulsanteReset;

    
   /**
     *@brief  Inizializza la classe del controller, attivando/disattivando i vari pulsanti e creando le relazioni necessarie tra gli elementi grafici 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        gestore= new InsiemeContatti();
        tabellaContatti.setItems(gestore.getInsieme());
        colonnaNome.setCellValueFactory(c->{ return new SimpleStringProperty(c.getValue().getNome());});
        colonnaCognome.setCellValueFactory(c->{ return new SimpleStringProperty(c.getValue().getCognome());});
        colonnaNum1.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getNumero1Contatto());});
        colonnaNum2.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getNumero2Contatto());});
        colonnaNum3.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getNumero3Contatto());});
        colonnaEmail1.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getEmail1Contatto());});
        colonnaEmail2.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getEmail2Contatto());});
        colonnaEmail3.setCellValueFactory(c->{return new SimpleStringProperty(c.getValue().getEmail3Contatto());});
        pulsanteModifica.setDisable(true);
        pulsanteRimuovi.setDisable(true);
        
        BooleanBinding campiNonVuoti= Bindings.createBooleanBinding(()-> 
                !campoNome.getText().trim().isEmpty() || !campoCognome.getText().trim().isEmpty(), campoNome.textProperty(),campoCognome.textProperty());
        BooleanBinding contattoSelezionato= tabellaContatti.getSelectionModel().selectedItemProperty().isNull();
        BooleanBinding controlloNumero=Bindings.createBooleanBinding(()->(campoPrimoNum.getText().matches("\\d*\\s*\\d*\\s*\\d*") && campoSecondoNum.getText().matches("\\d*\\s*\\d*\\s*\\d*") && campoTerzoNum.getText().matches("\\d*\\s*\\d*\\s*\\d*")),campoPrimoNum.textProperty(),campoSecondoNum.textProperty(),campoTerzoNum.textProperty());
        BooleanBinding controlloEmail=Bindings.createBooleanBinding(()->(campoPrimaMail.getText().contains("@") || campoPrimaMail.getText().isEmpty()) && (campoSecondaMail.getText().contains("@") || campoSecondaMail.getText().isEmpty()) && (campoTerzaMail.getText().contains("@") || campoTerzaMail.getText().isEmpty()),campoPrimaMail.textProperty(),campoSecondaMail.textProperty(),campoTerzaMail.textProperty());
        pulsanteAggiungi.disableProperty().bind(controlloNumero.not().or((campiNonVuoti.not()).or(contattoSelezionato.not()).or(controlloEmail.not())));
        pulsanteRimuovi.disableProperty().bind(contattoSelezionato);
        pulsanteModifica.disableProperty().bind(campiNonVuoti.not().or(contattoSelezionato).or(controlloNumero.not()).or(controlloEmail.not()));
       
        tabellaContatti.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        if (newValue!= null) {
            Contatto contattoSelezionato1 = newValue;
            campoNome.setText(contattoSelezionato1.getNome());
            campoCognome.setText(contattoSelezionato1.getCognome());
            campoPrimoNum.setText(contattoSelezionato1.getNumero1Contatto());
            campoSecondoNum.setText(contattoSelezionato1.getNumero2Contatto());
            campoTerzoNum.setText(contattoSelezionato1.getNumero3Contatto());
            campoPrimaMail.setText(contattoSelezionato1.getEmail1Contatto());
            campoSecondaMail.setText(contattoSelezionato1.getEmail2Contatto());
            campoTerzaMail.setText(contattoSelezionato1.getEmail3Contatto());
        }
    });
        
     
        
        
    }
    
 
 
  /**
    * @brief Gestisce l'azione di ricerca di un contatto nella lista visualizzata. Quando l'utente attiva l'evento corrispondente all'azione
    * 'cercaContatto' verrà richiamato il metodo 'cerca' presente nell'interfaccia 'GestoreContatti' per ottenere i risultati della ricerca
    * @pre L'istanza `gestore` deve essere inizializzata.
    * @post se il campo di ricerca è vuoto, la TableView mostrerà tutti i contatti; altrimenti, mostrerà i contatti che trovano corrispondenza
    * con la sottostringa passata come parametro
    * @param event [in]: evento che attiva l'azione, un click sul pulsanteCerca 
    *  
    */
    @FXML
    private void cercaContatto(ActionEvent event) {
        if(campoCerca.getText().trim().isEmpty()){
           tabellaContatti.setItems(gestore.getInsieme());
        }
        else{
            ObservableList<Contatto> trovati=gestore.cerca(campoCerca.getText());
            if(trovati.isEmpty()){
               FinestraContattoNonTrovato finestraErrore = new FinestraContattoNonTrovato();
               finestraErrore.show();
            }
            else{
            tabellaContatti.setItems(trovati);
            }
        }
    }

  /**
    * @brief Gestisce l'importazione di una lista di contatti da un file .csv alla lista visualizzata. Quando l'utente attiva l'evento corrispondente 
    * all'azione 'importaContatto', potrà scegliere mediante una finestra il file da importare, una volta scelto
    * verrà importata la struttura dati che rappresenta la rubrica da un file CSV (Comma Separated Values)
    * 
    * @post i valori nella TableView corrispondono con i valori contenuti nel file
    * @param event [in]: evento che attiva l'azione, un click sul pulsanteImporta 
    * @throws IOException se si verifica un errore durante la lettura del file
    */
    @FXML
    private void importaContatto(ActionEvent event) throws IOException {
        FileChooser fc=new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("File CSV", "*.csv"));
        File file=fc.showOpenDialog(null);
        if(file!=null){
        try(Scanner s=new Scanner(new BufferedReader(new FileReader(file.getAbsolutePath())))){
            String nomi=file.getAbsolutePath().split("[.]")[0];
            s.nextLine();
            s.useDelimiter("[;\n]");
            s.useLocale(Locale.US);
            while(s.hasNext()){
                String cognome=s.next();
                String nome=s.next();
                String num[]=new String[3];
                num[0]=s.next();
                num[1]=s.next();
                num[2]=s.next();
                String em[]=new String[3];
                em[0]=s.next();
                em[1]=s.next();
                em[2]=s.next();
                if((!nome.isEmpty() || !cognome.isEmpty()) && (num[0].matches("\\d*\\s*\\d*\\s*\\d*") || num[0].trim().isEmpty())&& (num[1].matches("\\d*\\s*\\d*\\s*\\d*") || num[1].trim().isEmpty()) && (num[2].matches("\\d*\\s*\\d*\\s*\\d*") || num[2].trim().isEmpty()) && (em[0].contains("@") || em[0].trim().isEmpty()) && (em[1].contains("@") || em[1].trim().isEmpty()) && (em[2].contains("@") || em[2].trim().isEmpty())){
                    gestore.aggiungi(new Contatto(nome,cognome,num,em));
                }
            }
        }
        }
        else{
            System.out.println("Nessun file selezionato");
        }
    }
    
  /**
    * @brief Gestisce l'esportazione di una lista di contatti dalla lista visualizzata nella TableView ad un file.csv. Quando l'utente attiva l'evento
    * corrispondente all'azione 'esportaContatto' verrà esportata la struttura dati che rappresenta la rubrica su un file in formato CSV (Comma Separated Values)
    * 
    * @post i valori nel file .csv selezionato corrispondono a quelli contenuti nella TableView.
    * @param event [in]: evento che attiva l'azione, un click sul pulsanteEsporta
    * @throws IOException se si verifica un errore durante la scrittura del file
    */
    @FXML
    private void esportaContatto(ActionEvent event) throws IOException {
        FileChooser fc=new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("File CSV", "*.csv"));
        File file=fc.showSaveDialog(null);
        if(file!=null){try(PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(file.getAbsolutePath())))){
            pw.println("COGNOME;NOME;NUMERO1;NUMERO2;NUMERO3;E-MAIL1;E-MAIL2;E-MAIL3");
            for(Contatto c:this.gestore.getInsieme()){
                pw.print(getOrDefault(c.getCognome()));
                pw.append(';');
                pw.print(getOrDefault(c.getNome()));
                pw.append(';');
                pw.print(getOrDefault(c.getNumero1Contatto()));
                pw.append(';');
                pw.print(getOrDefault(c.getNumero2Contatto()));
                pw.append(';');
                pw.print(getOrDefault(c.getNumero3Contatto()));
                pw.append(';');
                pw.print(getOrDefault(c.getEmail1Contatto()));
                pw.append(';');
                pw.print(getOrDefault(c.getEmail2Contatto()));
                pw.append(';');
                pw.print(getOrDefault(c.getEmail3Contatto()));
                pw.println();
            }
        }
        }
    }
    /**
    * @brief Gestisce l'assegnazione del valore alla variabile passata come parametro.
    * 
    * @return ritorna uno spazio vuoto nel caso in cui la variabile passata sia nulla o il campo non sia compilato, in caso contrario ritorna il valore
    * @param value [in]
    */
    private String getOrDefault(String value){
        return (value == null || value.isEmpty())? " " : value;
    }
  /**
    * @brief Gestisce l'aggiunta di un contatto alla lista visualizzata nella TableView.Quando l'utente attiva l'evento corrispondente
    * all'azione 'aggiungiContatto' è possibile richiamare il metodo 'aggiungi' presente nell'interfaccia 'GestoreContatti' per aggiungere un contatto
    * alla lista.
    * @pre almeno uno dei campi relativo al nome o al cognome risulta essere riempito.
    * @pre L'istanza `gestore` deve essere inizializzata.
    * @post nella TableView verrà inserita una riga contenente i valori inseriti nei campi di testo
    *  @param event [in]: evento che attiva l'azione, un click sul pulsanteAggiungi
    *  
    */
    @FXML
    private void aggiungiContatto(ActionEvent event) {
        String numero[]=new String[]{campoPrimoNum.getText(),campoSecondoNum.getText(),campoTerzoNum.getText()};
        String email[]=new String[]{campoPrimaMail.getText(),campoSecondaMail.getText(),campoTerzaMail.getText()};
        gestore.aggiungi(new Contatto(campoNome.getText(),campoCognome.getText(),numero,email));
        campoNome.clear();
        campoCognome.clear();
        campoPrimoNum.clear();
        campoSecondoNum.clear();
        campoTerzoNum.clear();
        campoPrimaMail.clear();
        campoSecondaMail.clear();
        campoTerzaMail.clear();
    }
    
  /**
    * @brief Gestisce la modifica di un contatto nella lista visualizzata nella TableView.Quando l'utente attiva l'evento corrispondente
    * all'azione 'modificaContatto' è possibile richiamare il metodo 'modifica' presente nell'interfaccia 'GestoreContatti'
    * @pre almeno uno dei campi relativo al nome o al cognome risulta essere riempit ed è stato selezionato almeno un contatto dalla tableView. 
    * @pre L'istanza `gestore` deve essere inizializzata.
    * @post nella TableView verrà modificata la riga corrispondente al contatto selezionato con i valori inseriti nei campi di testo
    *  @param event [in]: evento che attiva l'azione, un click sul pulsanteModifica
    *  
    */
    @FXML
    private void modificaContatto(ActionEvent event) {
        Contatto selezionato= tabellaContatti.getSelectionModel().getSelectedItem();
        if(selezionato!=null){
            String[] numeri= new String[]{campoPrimoNum.getText(), campoSecondoNum.getText(),campoTerzoNum.getText()};
            String[] mail= new String[]{campoPrimaMail.getText(),campoSecondaMail.getText(),campoTerzaMail.getText()};
            gestore.modifica(selezionato, campoNome.getText(),campoCognome.getText(),numeri,mail);
            ObservableList<Contatto> contatti= tabellaContatti.getItems();
            contatti.remove(selezionato);
            contatti.add(selezionato);
            tabellaContatti.refresh();  
            campoNome.clear();
            campoCognome.clear();
            campoPrimoNum.clear();
            campoSecondoNum.clear();
            campoTerzoNum.clear();
            campoPrimaMail.clear();
            campoSecondaMail.clear();
            campoTerzaMail.clear();
            
        }
    }
    

  /**
    * @brief Gestisce la rimozione di un contatto nella lista visualizzata nella TableView. Quando l'utente attiva l'evento corrispondente
    * all'azione 'rimuoviContatto' è possibile richiamare il metodo 'rimuovi' presente nell'interfaccia 'GestoreContatti'
    * @pre è stato selezionato almeno un contatto dalla tableView. 
    * @pre L'istanza `gestore` deve essere inizializzata.
    * @post nella TableView verrà eliminata la riga corrispondente al contatto selezionato 
    *  @param event [in]: evento che attiva l'azione, un click sul pulsanteRimuovi
    *  
    */
    @FXML
    private void rimuoviContatto(ActionEvent event) {
        Contatto selezionato= tabellaContatti.getSelectionModel().getSelectedItem();
        if(selezionato!=null){
            gestore.rimuovi(selezionato);
        }
     }

  /**
    * @brief Gestisce la rimozione di tutti i contatti presenti nella lista visualizzata nella TableView.Quando l'utente attiva l'evento corrispondente
    * all'azione 'resetRubrica' è possibile richiamare il metodo 'reset' presente nell'interfaccia 'GestoreContatti' 
    * @pre L'istanza `gestore` deve essere inizializzata.
    * @post nella TableView verranno eliminate tutte le righe-la TableView apparirà vuota.
    *  @param event [in]: evento che attiva l'azione, un click sul pulsanteReset
    *  
    */
    @FXML
    private void resetRubrica(ActionEvent event) {
        gestore.reset();
        tabellaContatti.setItems(gestore.getInsieme());
    }
}
  

