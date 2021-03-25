/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02aula02;

/**
 *
 * @author Zack Batos
 */
public class Estudar {
    String tempo;
    String data;
    String materia;
    boolean prontoParaEstudos;
    
    void statusEstudos(){
        System.out.println("----Estudos de Hoje----");
        System.out.println("Materia: " + this.materia );
        System.out.println("Data: " + this.data);
        System.out.println("Tempo de Estudos: " + this.tempo);  
    }
    
    void estudando(){
        if(this.prontoParaEstudos == true){
            System.out.println("Prepare-se para os Estudos \n");
            this.statusEstudos();
        }else{
            System.out.println("Vc não se sente muito bem para estudar hoje tente amanhã!");
        }
    }
}
