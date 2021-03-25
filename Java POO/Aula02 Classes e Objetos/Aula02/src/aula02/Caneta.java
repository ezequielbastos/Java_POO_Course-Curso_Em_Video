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
public class Caneta {
    
    //Declaração dos atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Declaração dos metodos
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Tipo de Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! caneta tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    } 
}
