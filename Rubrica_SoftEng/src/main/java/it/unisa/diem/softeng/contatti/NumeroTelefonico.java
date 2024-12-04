/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class NumeroTelefonico {
    private String[] numeri=new String[3];
    
    
 /**
    * @brief Breve descrizione della funzione
    * @pre descrizione precondizioni
    * @post descrizione post-condizioni 
    * @invariant descrizione invarianti
    * @param numero1
    * @param numero2
    * @param numero3 
    * (va specificato se input/output o inout)
    * @return specifica cosa restituisce la funzione
    * @throws Exception 
 */
    public NumeroTelefonico(String numero1, String numero2, String numero3){
       this.numeri[0]=numero1;
       this.numeri[1]=numero2;
       this.numeri[2]=numero3;
    }
}
