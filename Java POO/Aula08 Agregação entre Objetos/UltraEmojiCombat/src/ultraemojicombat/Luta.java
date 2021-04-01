/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Zack Bastos
 */
public class Luta {
    //atributos que serão estanciados da classe Lutador
    private Lutador desafiado;
    private Lutador desafiante;
    //Atributos normais da classe Luta
    private int rounds;
    private boolean aprovada;
    
    //Métodos Públicos
    public void marcarLuta(Lutador lutador1, Lutador lutador2){ //recebendo 2 parametros da classe Lutador
        if (lutador1.getCategoria().equals(lutador2.getCategoria())
                && lutador1 != lutador2){ 
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("----- DESAFIADO -----");
            this.getDesafiado().apresentar();
            System.out.println("----- DESAFIANTE -----");
            this.getDesafiante().apresentar();
            
            //Uasndo Class Random para gerar o status da luta!
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("====== RESULTADO DO COMBATE ======");
            switch(vencedor){
                case 0: //empate
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitoria do lutador Desafiado " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vidoria do lutador Desafiante " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        } else {
            System.out.println("Ah luta não pode acontecer! Resvise o status e categoria do lutador!!!");
        }
        System.out.println("====================================");
    }
    
    //Métodos Especiais retornando não um tipo primitivo de dados mais um sim um tipo abstrato

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    //--------------------------------------------------------------------------------------------------
    //Percebes que acima pegamos o objeto Lutator ivesz do tipo primitivo para indicar o tipo de retorno
    //A baixo usamos getters e setters padrão pq não estamos estanciando-os de nenhuma classe!
    //--------------------------------------------------------------------------------------------------
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
