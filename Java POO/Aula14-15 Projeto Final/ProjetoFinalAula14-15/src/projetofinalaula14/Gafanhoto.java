package projetofinalaula14;

/**
 *
 * @author Zack Bastos
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    //Construtor 
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //o super indica que estamos puxando os atributos da super classe Pessoa.
        this.login = login; //O login e uma variavél local da classe gafanhoto!
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    /*
    Neste caso o toString pega so as variaveis locais da classe gafanhoto emostra, 
    para adicionar as variaveis erdadas de pessoa temos que chamar a classe no retorno
    e endicar que para o metodo toString que estamos chamando os atributos da super classe
    com o metodo super
    */
    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
