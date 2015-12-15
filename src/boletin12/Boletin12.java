/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Garaxe coche = new Garaxe();
        Garaxe coche2 = new Garaxe();
        Garaxe coche3 = new Garaxe();
        coche.aparcar("1254");
        coche.pagar();
        
        coche2.aparcar("85528");
        coche3.aparcar("9863");
        
        coche2.pagar();
                
        coche3.pagar();
        
        
    }
}
    

