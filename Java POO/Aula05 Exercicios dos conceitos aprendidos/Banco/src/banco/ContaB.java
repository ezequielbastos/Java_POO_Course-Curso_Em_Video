package banco;

/**
 *
 * @author Zack_BS
 */
public class ContaB {
    
    //Atributos privados para encapsulamento
    private String titular; 
    private Integer numero;
    private Double saldo;
    private Double limite ;
    private String senha;
    
    //Construtor, se nao for declarado ele sera instanciado implicitamente
    public ContaB (){
        this.saldo = 0.0;
        if (this.saldo <= 1000.00) {
            this.limite = 1000.00;
        } else {
            this.saldo = 5000.00;
        }
    }
    public void DadosBancarios (){
        this.LimpaTela();
        System.out.println("");
        System.out.println("--      Dados Bancarios      --");
        System.out.println(" Titular: " + this.titular);
        System.out.println(" Numero: " + this.numero);
        System.out.println(" Saldo: " + this.saldo);
        System.out.println(" Limite de saque Diario: " + this.limite);
        System.out.println(" Senha: " + this.senha);
        System.out.println("==================================");
    }
    
    //Metodo depositar recebe um novo atributo passado por parametro
    //pois não e nescessario declara-lo como private pois o cliente 
    //Vai usa-lo somente para informar o valor a ser depositado
    public void Deposito(double pValor){
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo anterior: " + this.saldo);
        this.saldo += pValor;
        System.out.println("Saldo atual: " + this.saldo);
        
    }
    
    //No metodo sacar tambem vamos passar um valor porem esta conta 
    //não pode ficar com saldo negativo. Por isso fazemos os testes 
    //Condicionais e retornamos um logico, onde se verdadeiro o cliete
    //saca se o retorno for false ele não saca.
    public void Sacar(double pValor) {
        System.out.println("==================================");
        System.out.println("Realizando Saque");
        System.out.println("Saldo Anterior: " + this.saldo);
        if(pValor <= this.saldo){// caso eu tenha saldo
           this.saldo -= pValor;
            System.out.println("Saldo posterior: " + this.saldo);
        }else{ System.out.println("Saldo insuficiente!");
        }
        System.out.println("======================================");
    }
    
    public void Transferir (double pValor){
      System.out.println("==================================");
        System.out.println("Realizando Saque");
        System.out.println("Saldo Anterior: " + this.saldo);
        if(pValor <= this.limite){// caso eu tenha saldo
           this.saldo -= pValor;
            System.out.println("Saldo posterior: " + this.saldo);
        }else{ System.out.println("o minimo para transferencia e de 1000RS!");
        }
        System.out.println("======================================");
    }  
    
    
    public void LimpaTela() { 
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    }
    
    //Metodos de emcapsulamento de atributos get e setter
    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public Double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
