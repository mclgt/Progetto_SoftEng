/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.contatti;

/**
 * @file nomefile
 * @brief Descrizione generale della classe.
 * Possono essere aggiunte informazioni generali che aiutano a comprendere lo scopo della classe
 * 
 * @author Autore
 * @date data
 * 
 */
public class Email {
    private String email[]=new String[3];
  /**
    * @brief Breve descrizione della funzione
    * @pre descrizione precondizioni
    * @post descrizione post-condizioni 
    * @invariant descrizione invarianti
    * @param
    * (va specificato se input/output o inout)
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public Email(String email1, String email2, String email3){
        email[0]=email1;
        email[1]=email2;
        email[2]=email3;
    }
}
