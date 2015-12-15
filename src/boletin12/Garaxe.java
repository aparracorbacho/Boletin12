/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Garaxe {
    String matricula;
    int plazas;
    
    public void aparcar(String matricula) {
        if (plazas<5){
            System.out.println("Tu coche esta aparcado");
            this.matricula=matricula;
            plazas++;
        } else {
            System.out.println("El aparcamiento esta lleno");
        }
       
    }

   
    public void pagar(){
        System.out.println("Cuanto tiempo estuviste en el garaje?");
        Scanner tiempoTeclado = new Scanner(System.in);
        int tiempo = tiempoTeclado.nextInt();
        System.out.println("Ingresa el importe que vas a pagar");
        Scanner dineroTeclado = new Scanner(System.in);
        int dinero = dineroTeclado.nextInt();
        if (tiempo>=3){
            System.out.println("Factura\nMatricula coche: "+matricula +"\nTiempo: "+tiempo +"\nPrecio: "+ ((tiempo-3)*0.2+3) +"\nDinero recibido: "+dinero + "\nVuelta "+(dinero-((tiempo-3)*0.2+3)));
            plazas--;
        } else {
            System.out.println("Factura\nMatricula coche: "+matricula +"\nTiempo: "+tiempo +"\nPrecio: "+ (tiempo*0.2) +"\nDinero recibido: "+dinero + "\nVuelta "+(dinero-(tiempo*0.2)));
            plazas--;
        }
    } 

   

      
}
