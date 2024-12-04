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
 * FXML Controller class
 *
 * @author miche
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
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void importContact(ActionEvent event) {
    }

    @FXML
    private void exportContact(ActionEvent event) {
    }

    @FXML
    private void addContact(ActionEvent event) {
       
    }

    @FXML
    private void modifyContact(ActionEvent event) {
        
    }

    @FXML
    private void removeContact(ActionEvent event) {
    }

    @FXML
    private void searchContact(ActionEvent event) {
    }
    
}
