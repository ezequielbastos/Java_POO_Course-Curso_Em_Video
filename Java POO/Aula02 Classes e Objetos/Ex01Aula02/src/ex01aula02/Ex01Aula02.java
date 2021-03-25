/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * (Desafio nº1 da aula 02 Curso em Video);
 * Crie 1 classe concreta e de um obejeto real da sua casa!
*/
package ex01aula02;

import java.util.Scanner;

/**
 *
 * @author Zack Bastos
 */
public class Ex01Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner imput = new Scanner(System.in);
        
        Computador pc = new Computador();
        
        //Pegando os dados dos atributos com Scanner;
        
        System.out.println("Dados do PC");
        System.out.print("Processador: ");
        pc.processador = imput.nextLine();
        System.out.print("Memoria Ram: ");
        pc.memoriaRam = imput.nextLine();
        System.out.print("HD/SSD: ");
        pc.hdd_ssd = imput.nextLine();
        System.out.print("Fonte: ");
        pc.fonte = imput.nextLine();
        System.out.print("Placa de Video: ");
        pc.placaVideo = imput.nextLine();
        System.out.print("[1]Ligado / [2]Desligado: ");
        pc.verificadorPC = imput.nextInt();
        if(pc.verificadorPC == 1){
            pc.ligado = true;
        }else{
            pc.ligado = false;
        }
        
        pc.usarPc();
    }
    
}
