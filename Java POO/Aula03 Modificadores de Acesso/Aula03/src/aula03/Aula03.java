/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Zack Bastos
 */
public class Aula03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Caneta 01");
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Preta";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true; 
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
