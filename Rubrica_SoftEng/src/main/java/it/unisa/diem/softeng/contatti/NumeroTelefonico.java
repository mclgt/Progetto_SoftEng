/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.softeng.contatti;

/**
 *
 * @author miche
 */
public class NumeroTelefonico {
    private String[] numeri=new String[3];
    
    public NumeroTelefonico(String numero1, String numero2, String numero3){
       this.numeri[0]=numero1;
       this.numeri[1]=numero2;
       this.numeri[2]=numero3;
    }
}
