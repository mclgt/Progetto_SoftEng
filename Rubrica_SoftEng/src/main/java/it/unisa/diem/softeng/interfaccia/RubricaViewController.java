/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package it.unisa.diem.softeng.interfaccia;

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
 * FXML Controller class
 *
 * @author miche
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
    private TableView<?> tabellaContatti;
    @FXML
    private TableColumn<?, ?> colonnaCognome;
    @FXML
    private TableColumn<?, ?> colonnaNome;
    @FXML
    private TableColumn<?, ?> colonnaNum;
    @FXML
    private TableColumn<?, ?> colonnaEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cercaContatto(ActionEvent event) {
    }

    @FXML
    private void importaContatto(ActionEvent event) {
    }

    @FXML
    private void esportaContatto(ActionEvent event) {
    }

    @FXML
    private void aggiungiContatto(ActionEvent event) {
    }

    @FXML
    private void modificaContatto(ActionEvent event) {
    }

    @FXML
    private void rimuoviContatto(ActionEvent event) {
    }
    
}
