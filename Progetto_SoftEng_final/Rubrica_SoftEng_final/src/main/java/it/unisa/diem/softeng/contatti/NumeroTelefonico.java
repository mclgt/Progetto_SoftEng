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
 * @author Autore
 * @date data
 * 
 */
public class NumeroTelefonico {
    private String[] numeri=new String[3];
    
    
 /**
    * @brief Costruttore del generico oggetto NumeroTelefonico con il quale si possono inizializzare il/i numero/i telefonico/i
    * @post L'array di Stringhe viene instanziato e inizializzato
    * @param numero1[in]
    * @param numero2[in]
    * @param numero3[in]
    * 
    */
    public NumeroTelefonico(String numero1, String numero2, String numero3){
       this.numeri[0]=numero1;
       this.numeri[1]=numero2;
       this.numeri[2]=numero3;
    }
}
