/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

/**
 * @file NumeroTelefonico.java
 * @brief Classe creata per gestire l'inserimento del/dei numero/i di telefono di un generico contatto. 
 * Possono essere inseriti da 0 a 3 numeri rappresentati tramite Stringa. Il generico elemento dell'array 
 * può non essere definito sfruttando il valore NULL.
 * 
 * @author Beatrice Rebecca
 * @date 8-12-2024
 * 
 */
public class NumeroTelefonico {
    private String[] numeri=new String[3];
    
    
 /**
    * @brief Costruttore del generico oggetto NumeroTelefonico con il quale si possono inizializzare il/i numero/i telefonico/i
    * @post L'array di Stringhe viene instanziato e inizializzato
    * @param numero1[in]: primo numero associato al contatto
    * @param numero2[in]: secondo numero associato al contatto
    * @param numero3[in]: terzo numero associato al contatto
    * 
    */
    public NumeroTelefonico(String numero1, String numero2, String numero3){
       this.numeri[0]=numero1;
       this.numeri[1]=numero2;
       this.numeri[2]=numero3;
    }

  /**
    * @brief Restituisce il primo numero (posizione 0) del vettore di numeri
    * @return la stringa rappresentante il numero in posizione 0, oppure null se non presente
    * 
    */
    public String getNumero1(){
        return this.numeri[0];
    }

    
  /**
    * @brief Restituisce il secondo numero (posizione 1) del vettore di numeri
    * @return la stringa rappresentante il numero in posizione 1, oppure null se non presente
    * 
    */
    public String getNumero2(){
        return this.numeri[1];
    }

  /**
    * @brief Restituisce il terzo numero (posizione 2) del vettore di numeri
    * @return la stringa rappresentante il numero in posizione 2, oppure null se non presente
    * 
    */
    public String getNumero3(){
        return this.numeri[2];
    }
    
   /**
    * @brief Modifica il primo numero (posizione 0) del vettore di numeri
    * @param numero1[in]: nuovo valore del numero da impostare in posizione 0
    * 
    */ 
    public void setNumero1(String numero1){
        this.numeri[0]=numero1;
    }
    
   /**
    * @brief Modifica il secondo numero (posizione 1) del vettore di numeri
    * @param numero2[in]: nuovo valore del numero da impostare in posizione 1
    * 
    */ 
    public void setNumero2(String numero2){
        this.numeri[1]=numero2;
    }
    
  /**
    * @brief Modifica il terzo numero (posizione 2) del vettore di numeri
    * @param numero3[in]: nuovo valore del numero da impostare in posizione 2
    * 
    */ 
    public void setNumero3(String numero3){
        this.numeri[2]=numero3;
    }
    
    @Override
    public String toString(){
        return this.getNumero1()+"\n"+this.getNumero2()+"\n"+this.getNumero3();
    }
    
}
