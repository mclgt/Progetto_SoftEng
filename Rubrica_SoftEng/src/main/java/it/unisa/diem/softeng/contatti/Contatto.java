/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

/**
    * @file Contatto.java
    * @brief Classe creata per gestire un contatto base. La classe è composta da vari attributi quali: nome(String), cognome(String), 
    * numero (NumeroTelefonico, vedi file NumeroTelefonico.java) e email(Email, vedi file Email.java).
    * 
    * @author Autore
    * @date data
    * 
 */

public class Contatto {
    private String nome;
    private String cognome;
    private NumeroTelefonico numero;
    private Email email;
    
 /**
    * @brief Costruttore del generico oggetto Contatto con il quale si possono inizializzare nome, cognome, numero e email
    * @pre Bisogna aggiungere almeno un nome o un cognome
    * @post Viene generato un contatto con almeno un nome o un cognome 
    * @invariant descrizione invarianti
    * 
    * @param nome[in]
    * @param cognome[in]
    * @param numero[in]: oggetto contenente al più tre numeri
    * @param email[in]: oggetto contenete al più tre email
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public Contatto(String nome, String cognome, NumeroTelefonico numero, Email email){
    }
    
    
 /**
    * @brief Permette di ricavare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @post Ritorna il nome del contatto su cui viene richiamato il metodo
    * @invariant descrizione invarianti
    * @param nome[out]
    * 
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public String getNome(){
        return null;
    }
    
  /**
    * @brief Permette di ricavare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @post Ritorna il cognome del contatto su cui viene richiamato il metodo
    * @invariant descrizione invarianti
    * @param cognome[out]
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public String getCognome(){
        return null;
    }

  /**
    * @brief Permette di ricavare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    * @post Ritorna il/i numero/i del contatto su cui viene richiamato il metodo
    * @invariant descrizione invarianti
    *@param numeri[out]: oggetto che contiene al più tre numeri
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public NumeroTelefonico getNumero() {
        return null;
    }

  /**
    * @brief Permette di ricavare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @post Ritorna la/le email del contatto su cui viene richiamato il metodo
    * @invariant descrizione invarianti
    * @param email[out]: oggetto che contiene al più tre mail
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public Email getEmail() {
        return null;
    }
    
  /**
    * @brief Permette di modificare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il nome del contatto su cui viene chiamato il metodo
    * @invariant descrizione invarianti
    * @param nome[in]
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public void setNome(String nome) {
    }

/**
    * @brief Permette di modificare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il cognome del contatto su cui viene chiamato il metodo 
    * @invariant descrizione invarianti
    * @param cognome[in]
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public void setCognome(String cognome) {
    }

 /**
    * @brief Permette di modificare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il/i numero/i del contatto su cui viene chiamato il metodo 
    * @invariant descrizione invarianti
    * @param numero[][in]
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public void setNumero(NumeroTelefonico numero) {
    }

  /**
    * @brief Permette di modificare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica la/le email del contatto su cui viene chiamato il metodo
    * @invariant descrizione invarianti
    * @param email[][in]
    * 
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public void setEmail(Email email) {
    }
    
    
}
