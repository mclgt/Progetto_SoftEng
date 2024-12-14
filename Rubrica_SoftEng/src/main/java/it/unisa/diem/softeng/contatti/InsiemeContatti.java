/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * @file InsiemeContatti.java
 * @brief Permette di implementare una collezione di contatti mediante un ArrayList osservabile.
 * Per maggiori informazioni sul contatto consultare il file Contatto.java.
 * Utilizza e riscrive i metodi 
 * dell'interfaccia GestoreContatti.java
 * @invariant Se la struttura ArrayList contiene dei contatti, questi dovranno essere mostrati sempre in ordine alfabetico (per cognome, se due cognomi sono uguali, 
 * verranno confrontati i nomi).
 * 
 * @author Beatrice Rebecca- Gaeta Michela
 * @date 8-12-2024
 * 
 */
public class InsiemeContatti implements GestoreContatti {
    private ObservableList<Contatto> contatti; 
    
    public InsiemeContatti(){
        contatti=FXCollections.observableArrayList();
    }

  /**
    * @brief Aggiunge un contatto alla struttura (observableArrayList) rappresentante la rubrica
    * @pre sono stati correttamente istanziati un oggetto 'InsiemeContatti' ed un 'Contatto' da aggiungere
    * @post Alla lista è aggiunto il contatto passato come parametro
    * @param contact [in] :il contatto da aggiungere
    *  
    */
    @Override
    public void aggiungi(Contatto contact){
       contatti.add(contact);
       this.sort();
    }

  /**
    * @brief Rimuove un contatto dalla struttura (ArrayList) rappresentante la rubrica
    * @pre sono stati correttamente istanziati un oggetto 'InsiemeContatti' ed un 'Contatto' da aggiungere
    * @post L'elemento corrispondente al contatto passato è rimosso dalla lista
    * @param contact[in]: il contatto da rimuovere
    * 
    */
    @Override
    public void rimuovi(Contatto contact){
        contatti.remove(contact);
    }
    
  /**
    * @brief Modifica un contatto esistente nella struttura (observableArrayList) rappresentante la rubrica
    * @pre sono stati correttamente istanziati un oggetto 'InsiemeContatti' ed un 'Contatto' da aggiungere
    * @pre il contatto passato appartiene già alla struttura dati
    * @post i vecchi attributi del  contatto vengono sovrascritti con i nuovi
    * @param c[in]: il contatto da modificare
    * @param newName[in]: nuovo nome del contatto (può essere null se si vuole rimuovere il nome ma ciò è possibile solo se c'è un cognome definito)
    * @param newSurname[in]:  nuovo cognome del contatto (può essere null se si vuole rimuovere il cognome ma ciò è possibile solo se c'è un nome definito)
    * @param newNumeri[][in]: nuovo array di numeri di telefono( può contenere valori null se si vogliono rimuovere determinati numeri)
    * @param newMail[][in]: nuovo arrau di inidirizzi email( può contenere valori null se si vogliono rimuovere determinati indirizzi)
    */
     @Override
    public void modifica(Contatto c, String newName, String newSurname, String[] newNumeri, String[] newMail ){
        c.setNome(newName);
        c.setCognome(newSurname);
        c.setNumero1(newNumeri[0]);
        c.setNumero2(newNumeri[1]);
        c.setNumero3(newNumeri[2]);
        c.setEmail1(newMail[0]);
        c.setEmail2(newMail[1]);
        c.setEmail3(newMail[2]);
        this.sort();  
    }
    
   
    @Override
    public ObservableList<Contatto> cerca(String text){
        ObservableList<Contatto> risultato= FXCollections.observableArrayList();
        for(Contatto c:this.contatti){
            if(c.getNome().startsWith(text) || c.getCognome().startsWith(text))
               risultato.add(c);
        }
       return risultato;
    }
     
    @Override
    public ObservableList<Contatto> getInsieme() {
        return this.contatti;
    }

    @Override
    public void sort() {
        contatti.sort(null);
    }

    @Override
    public void reset() {
        this.getInsieme().clear();
    }

    @Override
    public void setInsieme(ObservableList<Contatto> list) {
        this.contatti=list;
    }

    @Override
    public void esportaContatti(String nomeFile) {
        try(PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(nomeFile)))){
            pw.println("COGNOME;NOME;NUMERO1;NUMERO2;NUMERO3;E-MAIL1;E-MAIL2;E-MAIL3");
            for(Contatto c:contatti){
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
        } catch (IOException ex) {
           return;
        }
    }
    private String getOrDefault(String value){
        return (value == null || value.isEmpty())? " " : value;
    }
    @Override
    public ObservableList<Contatto> importaContatti(String nomeFile) {
        ObservableList<Contatto> importati=FXCollections.observableArrayList();
        try(Scanner s=new Scanner(new BufferedReader(new FileReader(nomeFile)))){
            String nomi=nomeFile.split("[.]")[0];
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
                if((!nome.isEmpty() || !cognome.isEmpty()) && (num[0].matches("[\\d\\s]*") || num[0].isEmpty())&& (num[1].matches("[\\d\\s]*") || num[1].isEmpty()) && (num[2].matches("[\\d\\s]*") || num[2].isEmpty()) && (em[0].contains("@") || em[0].trim().isEmpty()) && (em[1].contains("@") || em[1].trim().isEmpty()) && (em[2].contains("@") || em[2].trim().isEmpty())){
                   importati.add(new Contatto(nome,cognome,num,em));
                }
                 
            }
            Collections.sort(importati);
        } catch (FileNotFoundException ex) {
            
        }
       
        return importati;
    }
}
