/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.Main;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *
 * @author Reb
 */


public class FinestraContattoNonTrovato extends Stage {
    public FinestraContattoNonTrovato() {
        Label testo = new Label("Contatto non trovato!");
        testo.setAlignment(Pos.CENTER);
        testo.setStyle("-fx-font-family: Arial; -fx-font-size: 16px; -fx-font-weight: bold;");
        Scene scene = new Scene(new BorderPane(testo), 200, 100);
        setTitle("Errore");
        setScene(scene);
    }
}