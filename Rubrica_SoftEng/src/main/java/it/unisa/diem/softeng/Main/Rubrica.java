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
    * @file nomefile
    * @brief Descrizione generale della classe.
    * Possono essere aggiunte informazioni generali che aiutano a comprendere lo scopo della classe
    * 
    * @author Autore
    * @date data
    * 
 */
public class Rubrica extends Application{
/**
    * @brief Breve descrizione della funzione
    * @pre descrizione precondizioni
    * @post descrizione post-condizioni 
    * @invariant descrizione invarianti
    * 
    * @param stage 
    * (va specificato se input/output o inout)
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
    

    /**
    * @brief Breve descrizione della funzione
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
