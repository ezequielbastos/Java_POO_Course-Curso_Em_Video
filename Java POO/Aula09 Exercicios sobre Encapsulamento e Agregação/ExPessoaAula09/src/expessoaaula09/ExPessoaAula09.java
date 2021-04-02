/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expessoaaula09;

/**
 *
 * @author Zack Bastos
 */
public class ExPessoaAula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criando os vetores de objetos
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Julia", 25, "F");
        
        l[0] = new Livro("Java é Vida", "Carlos Ribeiro", 450, p[0]);
        l[1] = new Livro("POO para iniciantes", "Hugo Vasconcelos", 200, p[1]);
        l[2] = new Livro("Java Expert", "Luana Ribeiro", 150, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        //Para mostrar as informações do metodo detalhesLivro temos que chamalo dentro de uma saida String
        System.out.println(l[0].detalhesLivro());
    }
    
}
