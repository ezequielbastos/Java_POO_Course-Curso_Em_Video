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
        
        //Alterando valores atraves dos metodos setter criados
        //Vamos supor que precisamos atualizar os dados do lutador 3 Dead Code!
        lutador[3].setNome("Code Dead");
        lutador[3].setNacionalidade("Brasil");
        lutador[3].setIdade(31);
        lutador[3].setAltura(1.81f);
        lutador[3].setPeso(70.3f);
        lutador[3].setVitorias(14);
        lutador[3].setDerrotas(0);
        lutador[3].setEmpates(3);
                
        //Apresentando o lutador e mostrando o status da sua categoria
        lutador[3].apresentar();
        lutador[3].status();
        
        //Utilizando os métodos para alterar o status de lutas
        lutador[3].ganharLuta();
        lutador[3].perderLuta();
        lutador[3].empatarLuta();
        
        lutador[3].status();
        
        
    }
    
}
