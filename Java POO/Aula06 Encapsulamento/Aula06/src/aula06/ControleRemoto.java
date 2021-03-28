/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Zack Bastos
 */
public class ControleRemoto implements Controlador{
    //Quando se esta implementando interface todos os Atributos do objeto tem que se torna privado!
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    
    // Método Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Métodos getter e setter! No caso dos métodos de atributos logico ele e feito com is envez de get!
    // Como estamos criado uma interface para nosso objeto avera metodos abstratos que acessara os métodos get e set
    // Então podemos definilos como privados para dar mais segurança a nossa aplicação!
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos implementados pela interface Controlador

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() { 
        if (this.isLigado()) { //O netbeans faz o método logico com a sigla is
            this.setVolume(this.getVolume() +5);
        }else{
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume() -5);
        }else{
            System.out.println("Impossível diminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Impossivel ligar o Mudo!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else{
            System.out.println("Impossivel desligar o Mudo!");
        }
 
    }

    @Override
    public void play() {
        if (this.isLigado() && this.isTocando()){
            this.setTocando(true);
        }else{
            System.out.println("Não é possivel reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("Não é possivel pausar!");
        }
    }
}
