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
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    public void apresentar(){
        System.out.println("------------ Dados do Lutador ------------");
        System.out.println("Nome:       " + this.getNome());
        System.out.println("Localidade: " + this.getNacionalidade());
        System.out.println("Idade:      " + this.getIdade());
        System.out.println("Altura:     " + this.getAltura() + "cm");
        System.out.println("Peso:       " + this.getPeso() + "Kg");
        System.out.println("Vitórias:   " + this.getVitorias());
        System.out.println("Derrotas:   " + this.getDerrotas());
        System.out.println("Empates:    " + this.getEmpates());
        System.out.println("___________________________________________");
    }
    public void status(){
        System.out.println("------- Categoria do Lutador -------");
        System.out.println("Lutador:         " + this.getNome());
        System.out.println("Categoria:       " + this.getCategoria());
        System.out.println("------ Resultados de Combate ------");
        System.out.println("Lutas Ganhas:    " + this.getVitorias());
        System.out.println("Lutas Perdidas:  " + this.getDerrotas());
        System.out.println("Lutas Empatadas: " + this.getEmpates());
        System.out.println("_______________________________________");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
                        float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        /*Para fazer a condição do categoria ser executada temos que executar o 
        metodo em que ela esta no caso setPeso() se usar-mos o this.peso a alteração 
        sera apenas no atributo peso acarretando a não inicialização do método setPeso()
        então já que não temos uma condição funcionando por padrão e atribuido null
        ao atributo que não recebeu um valor*/
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas; 
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); //a categoria vai mudar altomaticamente apos o peso for alterado!
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() { //metodo interno chamando para uso internamente!
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.0){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido"; 
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
