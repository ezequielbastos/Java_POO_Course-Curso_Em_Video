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
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //O método contrutor possui o msm nome da clase
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("---Dados da Caneta---");
        //pegando o resultados dos atributo diretamente
        /*
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        */
        //Mas o recomendado e usar os métodos acessores getters
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
