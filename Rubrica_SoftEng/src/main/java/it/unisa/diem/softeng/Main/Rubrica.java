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
    * @file Rubrica.java
    * @brief Classe Main che permette di collegare il Controller alla View
    * 
    * @author Autore
    * @date data
    * 
 */
public class Rubrica extends Application{
/**
    * @brief Metodo che permette di caricare il file .fxml (che definisce l'interfaccia grafica) , creare la scena e mostrarla in una finestta.
    * @pre Deve essere presente un file .fxml
    * @post Viene caricata e visualizzata l'interfaccia  grafica mediante una finestra
    * 
    * @param stage[in]
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
    * @brief Primo metodo lanciato, permette di inizializzare l'ambiente javaFX, avviando l'interfaccia grafica
    * 
    * @param args : argomenti della riga di comando che possono essere passati durante l'esecuzione del programma
    * 

 */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
