/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

import java.util.Objects;

/**
    * @file Contatto.java
    * @brief Classe creata per gestire un contatto base. La classe è composta da vari attributi quali: nome(String), cognome(String), 
    * numero (NumeroTelefonico, vedi file NumeroTelefonico.java) e email(Email, vedi file Email.java).
    * @invariant gli attributi nome e cognome non possono mai essere entrambi vuoti, almeno uno dei due deve contenere un valore non nullo.
    * 
    * @author Caliendo Antonio - Gaeta Michela
    * @date 8-12-2024
    * 
    */

public class Contatto implements Comparable<Contatto>{
    private String nome;
    private String cognome;
    private NumeroTelefonico numero;
    private Email email;
    
 /**
    * @brief Costruttore del generico oggetto Contatto che consente di  inizializzare nome, cognome, numero e email
    * @pre Almeno uno tra  'nome' o 'cognome' dvee essere non vuoti
    * @post Viene generato un oggetto 'Contatto' con almeno un nome o un cognome, numeri di telefono e mail inizializzati solo se forniti
    * 
    * @param nome[in]: nome del contatto (può essere vuoto o null solo se il cognome non è vuoto o null)
    * @param cognome[in]:cognome del contatto (può essere vuoto o null solo se il cognome non è vuoto o null)
    * @param numero[in]:  array di stringhe che contiene fino a tre numeri di telefono
    * @param email[in]: array di stringhe che contiene fino a tre numeri di telefono
    * 
    */
    public Contatto(String nome, String cognome, String[] numero, String[] email){
     this.nome=nome;
     this.cognome=cognome;
     this.numero=new NumeroTelefonico(numero[0],numero[1],numero[2]);
     this.email=new Email(email[0],email[1],email[2]);

    }
    
    
 /**
    * @brief Restituisce l'attributo nome da un contatto
    * @pre Deve esistere un contatto
    * 
    * @return nome contatto
    */
    public String getNome(){
        return this.nome;
    }
    
  /**
    * @brief Restituisce l'attributo cognome da un contatto
    * @pre Deve esistere un contatto
    * 
    * @return cognome contatto
    */
    public String getCognome(){
        return this.cognome;
    }

    
  /**
    * @brief Modifica il nome del contatto
    * @param nome[in]: nuovo nome del contatto
    * 
    */
    public void setNome(String nome) {
     this.nome=nome;
    }

  /**
    * @brief Modifica il cognome del contatto
    * @param cognome[in]: nuovo cognome del contatto
    * 
    */
    public void setCognome(String cognome) {
     this.cognome=cognome;
    }

  /**
    * @brief Modifica il primo numero associato al contatto
    * @param numero[in]: nuovo 'primo numero' del contatto
    * 
    */
    public void setNumero1(String numero) {
     this.numero.setNumero1(numero);
    }
    
  /**
    * @brief Modifica il secondo numero associato al contatto
    * @param numero[in]: nuovo 'secondo numero' del contatto
    * 
    */
    public void setNumero2(String numero) {
     this.numero.setNumero2(numero);
    }
    
  /**
    * @brief Modifica il terzo numero associato al contatto
    * @param numero[in]: nuovo 'terzo numero' del contatto
    * 
    */
    public void setNumero3(String numero) {
     this.numero.setNumero3(numero);
    }

  /**
    * @brief Modifica il primo indirizzo e-mail associato al contatto
    * @param email[in]: nuovo 'primo indirizzo e-mail' del contatto
    * 
    */
    public void setEmail1(String email) {
     this.email.setEmail1(email);
    }
    
  /**
    * @brief Modifica il secondo indirizzo e-mail associato al contatto
    * @param email[in]: nuovo 'secondo indirizzo e-mail' del contatto
    * 
    */
    public void setEmail2(String email) {
     this.email.setEmail2(email);
    }
  
  /**
    * @brief Modifica il terzo indirizzo e-mail associato al contatto
    * @param email[in]: nuovo 'terzo indirizzo e-mail' del contatto
    * 
    */
    public void setEmail3(String email) {
     this.email.setEmail3(email);
    }
    
    
  /**
    * @brief Restituisce il primo numero associato al contatto
    * @return il 'primo numero' associato al contatto
    */
    public String getNumero1Contatto(){
        return this.numero.getNumero1();
    }

  /**
    * @brief Restituisce il secondo numero associato al contatto
    * @return il 'secondo numero' associato al contatto
    */
    public String getNumero2Contatto(){
        return this.numero.getNumero2();
    }

  /**
    * @brief Restituisce il terzo numero associato al contatto
    * @return il 'terzo numero' associato al contatto
    */
    public String getNumero3Contatto(){
        return this.numero.getNumero3();
    }

  /**
    * @brief Restituisce il primo indirizzo e-mail associato al contatto
    * @return il 'primo indirizzo e-mail' associato al contatto
    */
    public String getEmail1Contatto(){
        return this.email.getEmail1();
    }

    
    
  /**
    * @brief Restituisce il secondo indirizzo e-mail associato al contatto
    * @return il 'secondo indirizzo e-mail' associato al contatto
    */
    public String getEmail2Contatto(){
        return this.email.getEmail2();
    }
    

  /**
    * @brief Restituisce il terzo indirizzo e-mail associato al contatto
    * @return il 'terzo indirizzo e-mail' associato al contatto
    */
    public String getEmail3Contatto() {
        return this.email.getEmail3();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contatto other = (Contatto) obj;
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Contatto o) {
        if(o.getCognome().equalsIgnoreCase(this.getCognome())){
            return this.getNome().compareToIgnoreCase(o.getNome());
        }
        return this.getCognome().compareToIgnoreCase(o.getCognome());
    }
    
    
    
    
}
