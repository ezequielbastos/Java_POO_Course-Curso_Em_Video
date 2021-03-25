/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * (Desafio nº 2 da aula 02 Curso em Video);
 * Crie 1 classe abstrata e de um obejeto real da sua casa!
*/
package ex02aula02;

import java.util.Scanner;

/**
 *
 * @author Zack Batos
 */
public class Ex02Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner imput = new Scanner(System.in);
        Estudar estudo = new Estudar();
        
        System.out.println("Registe o dados para estudos");
        System.out.print("Materia: ");
        estudo.materia = imput.nextLine();
        System.out.print("Data: ");
        estudo.data = imput.nextLine();
        System.out.print("Tempo de Estudos: ");
        estudo.tempo = imput.nextLine();
        System.out.println("Esta preparado para os estudos");
        System.out.print("[1]Sim / [2]Não ");
        int verificadorEstudos = imput.nextInt();
        if(verificadorEstudos == 1){
            estudo.prontoParaEstudos = true;
        }else{
            estudo.prontoParaEstudos = false;
        }
        
        estudo.estudando();
    }
    
}
