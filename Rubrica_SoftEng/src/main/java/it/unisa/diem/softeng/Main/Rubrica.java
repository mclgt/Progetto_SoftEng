/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.unisa.diem.softeng.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
    * @file Rubrica
    * @brief Classe Main che permette di collegare il Controller alla View
    * 
    * @author Autore
    * @date data
    * 
 */
public class Rubrica extends Application{
/**
    * @brief Metodo che permette di creare la scena e creare un collegamento tra View e Controller
    * @pre Deve essere instanziata una View
    * @post Viene visualizzata l'interfaccia 
    * @invariant descrizione invarianti
    * 
    * @param stage[in]
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    @Override 
    public void start(Stage stage) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("RubricaView.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
//da vedere
    /**
    * @brief Metodo che permette di lanciare gli elementi grafici
    * @pre descrizione precondizioni
    * @post descrizione post-condizioni 
    * @invariant descrizione invarianti
    * 
    * @param args 
    * (va specificato se input/output o inout)
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
