/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01aula05;

/**
 *
 * @author Zack Bastos
 */
public class Ex01Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Zack");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Luiza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.sacar(50);
        p2.sacar(100);
        
        p1.estadoDaConta();
        p2.estadoDaConta();
        
    }
    
}
