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
     this.nome=nome;
     this.cognome=cognome;
     this.numero=new NumeroTelefonico(numero[0],numero[1],numero[2]);
     this.email=new Email(email[0],email[1],email[2]);

    }
    
    
 /**
    * @brief Permette di ricavare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @param nome[out]
    * 
    * @return nome contatto
    */
    public String getNome(){
        return this.nome;
    }
    
  /**
    * @brief Permette di ricavare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @param cognome[out]
    * 
    * @return cognome contatto
    */
    public String getCognome(){
        return this.cognome;
    }

  /**
    * @brief Permette di ricavare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    *@param numeri[out]: oggetto che contiene al più tre numeri
    * 
    * @return numeri associati al contatto
    */
    public NumeroTelefonico getNumero() {
        return this.numero;
    }

  /**
    * @brief Permette di ricavare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @param email[out]: oggetto che contiene al più tre mail
    * 
    * @return email associate al contatto
    */
    public Email getEmail() {
        return this.email;
    }
    
  /**
    * @brief Permette di modificare l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il nome del contatto su cui viene chiamato il metodo
    * @param nome[in]
    * 
    */
    public void setNome(String nome) {
     this.nome=nome;
    }

  /**
    * @brief Permette di modificare l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il cognome del contatto su cui viene chiamato il metodo 
    * @param cognome[in]
    * 
    */
    public void setCognome(String cognome) {
     this.cognome=cognome;
    }

  /**
    * @brief Permette di modificare l'attributo numero da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica il/i numero/i del contatto su cui viene chiamato il metodo 
    * @param numero[][in]
    * 
    */
    public void setNumero(NumeroTelefonico numero) {
     this.numero=numero;
    }

  /**
    * @brief Permette di modificare l'attributo email da un contatto
    * @pre Deve esistere un contatto
    * @post Modifica la/le email del contatto su cui viene chiamato il metodo
    * @param email[][in]
    * 
    */
    public void setEmail(Email email) {
     this.email=email;
    }
    
    
  /**
    * @brief Permette di restituire i numeri mediante un'unica stringa
    * @pre Deve esistere un contatto
    * @param stringa[out]
    * 
    */
    public String getNumeriTelefoniciString(){
        return numero.toString();
    }
    
  /**
    * @brief Permette di restituire le e-mail mediante un'unica stringa
    * @pre Deve esistere un contatto
    * @param stringa[out]
    * 
    */
     public String getEmailString(){
        return email.toString();
    }
}
