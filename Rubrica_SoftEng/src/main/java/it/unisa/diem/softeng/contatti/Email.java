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
 * @author Beatrice Rebecca- Cambria Jacopo
 * @date 8-12-2024
 * 
 */
public class Email {
    private String email[]=new String[3];
  /**
    * @brief Costruttore del generico oggetto Email tramite il quale è possibile inizializzare 
    * gli indirizzi di posta elettronica di un contatto.
    * @post L'array di Stringhe viene istanziato e inizializzato
    * @param email1[in]: primo indirizzo e-mail associato al contatto
    * @param email2[in]: seocndo indirizzo e-mail associato al contatto
    * @param email3[in]: terzo indirizzo e-mail associato al contatto
    * 
    * 
    */
    public Email(String email1, String email2, String email3){
        email[0]=email1;
        email[1]=email2;
        email[2]=email3;
    }
    
    
    /**
    * @brief Restituisce il primo indirizzo e-mail (posizione 0) del vettore di indirizzi e-mail
    * @return la stringa rappresentante l'email in posizione 0, oppure null se non presente
    * 
    */
    public String getEmail1(){
        return this.email[0];
        
    }

  /**
    * @brief Restituisce il secondo indirizzo e-mail (posizione 1) del vettore di indirizzi e-mail
    * @return la stringa rappresentante l'email in posizione 1, oppure null se non presente
    * 
    */
    public String getEmail2(){
        return this.email[1];
    }
    
  /**
    * @brief Restituisce il terzo indirizzo e-mail (posizione 2) del vettore di indirizzi e-mail
    * @return la stringa rappresentante l'email in posizione 2, oppure null se non presente
    * 
    */
    public String getEmail3() {
        return this.email[2];
    }
    
     @Override
    public String toString(){
        return this.email[0]+"\n"+this.email[1]+"\n"+this.email[2];
    }
    
    
      
  /**
    * @brief Modifica il primo indirizzo e-mail (posizione 0) del vettore di indirizzi e-mail
    * @param email1[in]: nuovo valore dell'indirizzo e-mail da impostare in posizione 0
    * 
    */ 
    public void setEmail1(String email1){
        this.email[0]=email1;
    }
 
  /**
    * @brief Modifica il secondo indirizzo e-mail (posizione 1) del vettore di indirizzi e-mail
    * @param email2[in]: nuovo valore dell'indirizzo e-mail da impostare in posizione 1
    * 
    */ 
    public void setEmail2(String email2){
        this.email[1]=email2;
    }
    
  /**
    * @brief Modifica il terzo indirizzo e-mail (posizione 2) del vettore di indirizzi e-mail
    * @param email3[in]: nuovo valore dell'indirizzo e-mail da impostare in posizione 2
    * 
    */ 
    public void setEmail3(String email3){
        this.email[2]=email3;
    }
}
