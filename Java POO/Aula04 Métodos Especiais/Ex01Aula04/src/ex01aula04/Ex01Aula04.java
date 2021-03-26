/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01aula04;

import java.util.Scanner;

/**
 *
 * @author Zack Bastos
 */
public class Ex01Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner imput = new Scanner(System.in);
        Violao violao = new Violao("Eletrico");
        
        //Setando os valores com método setter
        System.out.println("--------Cadastre o violão-------");
        System.out.print("Nome: ");
        String nome = imput.nextLine();
        violao.setNome(nome);
        System.out.print("Corda: ");
        String corda = imput.nextLine();
        violao.setCorda(corda);
        System.out.print("Marca: ");
        String marca = imput.nextLine();
        violao.setMarca(marca);
        System.out.print("Peso: ");
        float peso = imput.nextFloat();
        violao.setPeso(peso);
        System.out.println("Violão cadastrado com sucesso!!! \n");
        
        //Pegando as informações com o método getter
        System.out.println("---Dados do Violão---");
        System.out.println("Nome: " + violao.getNome());
        System.out.println("Corda: " + violao.getCorda());
        System.out.println("Marca: " + violao.getMarca());
        System.out.println("Tipo: " + violao.getTipo());
        System.out.println("Peso: " + violao.getPeso());
    }
    
}
