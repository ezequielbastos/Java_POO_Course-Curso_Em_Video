/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex01aula02;

/**
 *
 * @author Zack Bastos
 */
public class Computador {
    String processador;
    String memoriaRam;
    String hdd_ssd;
    String fonte;
    String placaVideo;
    boolean ligado;
    int verificadorPC;
    
    void status(){
        System.out.println("-----------Dasos do PC----------");
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria Ram: " + this.memoriaRam);
        System.out.println("HD/SSD : " + this.hdd_ssd);
        System.out.println("Fonte: " + this.fonte);
        System.out.println("Placa de Video: " + this.placaVideo);
    }
    
    void usarPc(){
        if(this.ligado == true){
            System.out.println("Lingando PC \n");
            this.status();
        }else{
            System.out.println("Erro: Pc Desligado");
        }
    }
    
}
