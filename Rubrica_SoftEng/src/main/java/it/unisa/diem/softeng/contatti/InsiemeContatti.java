/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
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
    public ObservableList<Contatto> cerca(String text ){
       ObservableList<Contatto> risultato= FXCollections.observableArrayList();
       for(Contatto c:this.contatti){
           if(c.getNome().startsWith(text) || c.getCognome().startsWith(text))
               risultato.add(c);
       }
       return risultato;
    }

  /**
    * @brief Permette di esportare l'oggetto InsiemeContatti (observableArrayList) su un file in formato CSV (Comma Separated Values)
    * @post viene generato un file .csv con il nome corrispondente alla stringa passata, il quale esporrà il contenuto della lista. Il file sarà collocato nella directory del progetto.
    * @param filename[in]: nome del file su cui esportare i contatti
    * 
    * @throws IOException se si presenta un errore durante la scrittura del file
    */
    @Override
    public void scriviCSV(String filename)throws IOException{
         try(PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(filename+".csv")))){
            pw.println("COGNOME;NOME;NUMERO1;NUMERO2;NUMERO3;E-MAIL1;E-MAIL2;E-MAIL3");
            for(Contatto c:this.contatti){
                pw.print(c.getCognome());
                pw.append(";");
                pw.print(c.getNome());
                pw.append(";");
                pw.print(c.getNumero1Contatto());
                pw.append(";");
                pw.print(c.getNumero2Contatto());
                pw.append(";");
                pw.print(c.getNumero3Contatto());
                pw.append(";");
                pw.print(c.getEmail1Contatto());
                pw.append(";");
                pw.print(c.getEmail2Contatto());
                pw.append(";");
                pw.print(c.getEmail3Contatto());
                pw.println();
            }
        }

    }
    
  /**
    * @brief Permette di importare un oggetto InsiemeContatti (observableArrayList) da un file CSV (Comma Separated Values)
    * @param filename[in]: nome del file da cui importare i contatti
    * 
    * @return Restituisce un observableList con contenuto che rispecchia il contenuto del file
    * @throws IOException se si presenta un errore durante la lettura
    */
    @Override
    public ObservableList<Contatto> leggi(String filename){
        String nomi=filename.split("[.]")[0];
        ObservableList<Contatto> importato= FXCollections.observableArrayList();
        try(Scanner s=new Scanner(new BufferedReader(new FileReader(filename)))){
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
                if(!nome.isEmpty() || !cognome.isEmpty())
                    importato.add(new Contatto(nome,cognome,num,em));
            }
        }
        catch(Exception ex){
            
        }
    return importato;
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
}
