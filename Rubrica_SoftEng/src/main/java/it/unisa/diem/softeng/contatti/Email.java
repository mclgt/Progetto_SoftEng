/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.contatti;

/**
 * @file Email.java
 * @brief Classe generata per contenere gli indirizzi di posta elettronica di un generico contatto
 * Può contenere al più tre indirizzi ciascuno rappresentato tramite Stringa. Il generico elemento dell'array 
 * può non essere definito, sfruttando il valore NULL.
 * 
 * @author Autore
 * @date data
 * 
 */
public class Email {
    private String email[]=new String[3];
  /**
    * @brief Costruttore del generico oggetto Email tramite il quale è possibile inizializzare 
    * gli indirizzi di posta elettronica di un contatto.
    * @pre Nessuna precondizione
    * @post L'array di Stringhe viene istanziato e inizializzato
    * @invariant descrizione invarianti
    * @param email1[in]
    * @param email2[in]
    * @param email3[in]
    * 
    * 
    * @return 
 */
    public Email(String email1, String email2, String email3){
        email[0]=email1;
        email[1]=email2;
        email[2]=email3;
    }
}
