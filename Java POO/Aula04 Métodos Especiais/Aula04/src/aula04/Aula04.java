/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Zack Bastos
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta caneta = new Caneta("NIC", "Azul", 0.7f);
        //caneta.setModelo("BIC"); //Usando método acessor para setar valor no atributo com visibilidade publica
        // caneta.modelo = "BIC2"; //Setar valor diretamente no atributo só é possivel quando o atributo esta como publico
        // caneta.ponta = 0.5f; //Não e permitido pois um atributo privado so da permissão de alteração aos metodos acessores
        //caneta.setPonta(0.5f); //Só é possivel modificar o atributo ponta com método acessor pois ele esta como privated
        
        caneta.status(); //Método para mostrar o estatus do objeto
        
        //Mostrando o estatus do objeto com metodos acessores
        /*
        System.out.println("---Dados da Caneta---");
        System.out.println("Modelo: " + caneta.getModelo());
        System.out.println("Ponta: " + caneta.getPonta());
        */
        
        //Criando a segunda caneta com os mesmos atributos usando construtor
        Caneta caneta2 = new Caneta("BIC", "Preta", 0.5f);
        caneta2.status(); 
    }
    
}
