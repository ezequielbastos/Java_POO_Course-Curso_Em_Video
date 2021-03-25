/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Zack Bastos
 */
public class Aula02 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Caneta 01");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        System.out.println("\n");
        System.out.println("Caneta 02");
        Caneta c2 = new Caneta();
        c2.modelo = "static";
        c2.cor = "Vermelha";
        c2.carga = 70;
        c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
