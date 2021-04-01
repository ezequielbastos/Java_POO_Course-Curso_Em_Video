/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Zack Bastos
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Atribuindo dados do lutador diretamente no construtor sem ser com Scanner 
        //Lutador lutador = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        //lutador.status();
        
        //Usando vetor para criar novos objetos invez de fazer l1, 12, l3 etc...
        Lutador lutador[] = new Lutador[6];
        
        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        //Criando o objeto da classe Luta
        Luta UEC01 = new Luta();
        
        UEC01.marcarLuta(lutador[4], lutador[5]);
        UEC01.lutar();
        lutador[4].status();
        lutador[5].status();
    }
    
}
