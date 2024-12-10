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
    * @brief Permette di restiruire il numero in posizione 0 del vettore
    * @pre è stato istanziato un oggetto NumeroTelefonico
    * @param numeri1[out] 
    * @return Stringa rappresentante il numero in posizione 0
    * 
    */
    public String getNumero1Contatto(){
        return this.numero.getNumero1();
    }
    /**
    * @brief Permette di restiruire il numero in posizione 1 del vettore
    * @pre è stato istanziato un oggetto NumeroTelefonico
    * @param numeri2[out] 
    * @return Stringa rappresentante il numero in posizione 1
    * 
    */
    public String getNumero2Contatto(){
        return this.numero.getNumero2();
    }
    /**
    * @brief Permette di restiruire il numero posizione 2 del vettore
    * @pre è stato istanziato un oggetto NumeroTelefonico
    * @param numeri3[out] 
    * @return Stringa rappresentante il numero  in posizione 2
    * 
    */
    public String getNumero3Contatto(){
        return this.numero.getNumero3();
    }

}
