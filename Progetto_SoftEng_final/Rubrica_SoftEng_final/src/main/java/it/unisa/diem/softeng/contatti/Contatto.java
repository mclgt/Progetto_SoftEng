/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

/**
    * @file Contatto.java
    * @brief Classe creata per gestire un contatto base. La classe è composta da vari attributi quali: nome(String), cognome(String), 
    * numero (NumeroTelefonico, vedi file NumeroTelefonico.java) e email(Email, vedi file Email.java).
    * @invariant gli attributi nome e cognome non possono mai essere entrambi vuoti, almeno uno dei due deve contenere un valore non nullo.
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
    * 
    * @param nome[in]
    * @param cognome[in]
    * @param numero[in]: oggetto contenente al più tre numeri
    * @param email[in]: oggetto contenete al più tre email
    * 
    */
    public Contatto(String nome, String cognome, String[] numero, String[] email){
      
    }
    
    
 /**
    * @brief Permette di ricavare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @param nome[out]
    * 
    * @return nome contatto
    */
    public String getNome(){
        return null;
    }
    
  /**
    * @brief Permette di ricavare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @param cognome[out]
    * 
    * @return cognome contatto
    */
    public String getCognome(){
        return null;
    }

  /**
    * @brief Permette di ricavare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    *@param numeri[out]: oggetto che contiene al più tre numeri
    * 
    * @return numeri associati al contatto
    */
    public NumeroTelefonico getNumero() {
        return null;
    }

  /**
    * @brief Permette di ricavare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @param email[out]: oggetto che contiene al più tre mail
    * 
    * @return email associate al contatto
    */
    public Email getEmail() {
        return null;
    }
    
  /**
    * @brief Permette di modificare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il nome del contatto su cui viene chiamato il metodo
    * @param nome[in]
    * 
    */
    public void setNome(String nome) {
    }

  /**
    * @brief Permette di modificare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il cognome del contatto su cui viene chiamato il metodo 
    * @param cognome[in]
    * 
    */
    public void setCognome(String cognome) {
    }

  /**
    * @brief Permette di modificare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il/i numero/i del contatto su cui viene chiamato il metodo 
    * @param numero[][in]
    * 
    */
    public void setNumero(NumeroTelefonico numero) {
    }

  /**
    * @brief Permette di modificare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica la/le email del contatto su cui viene chiamato il metodo
    * @param email[][in]
    * 
    */
    public void setEmail(Email email) {
    }
    
    
}
