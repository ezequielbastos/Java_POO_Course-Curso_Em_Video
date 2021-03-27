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
public class ContaBanco {
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   
   public void estadoDaConta(){
       System.out.println("---------Estrato-------------");
       System.out.println("Conta: " + this.getNumConta());
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Status: " + this.isStatus());
   }
   
   public void abrirConta(String t){
     this.setTipo(t);
     this.setStatus(true);
       if (t.equals("CC")) {
         this.setSaldo(50);
       }else if(t.equals("CP")){
           this.setSaldo(150);
       }
       System.out.println("Conta cadastrada com sucesso!!!");
   }
   
   public void fecharConta(){
     if(this.getSaldo() > 0){
         System.out.println("Para fechar a conta saque o resto do dinheiro em saldo");
     }else if(this.getSaldo() <= 0 ){
         System.out.println("Não é possivel feichar a conta pois possui debitos");
     }else{
         this.setStatus(false);
         System.out.println("Conta fechada com sucesso!");
     }      
   }
   
   public void depositar(float v){
       if (this.isStatus()){
       //this.saldo = this.saldo + v;
       this.setSaldo(this.getSaldo() + v);
           System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
       }else{
           System.out.println("Impossével depositar pois a conta esta feichada!");
       }
   }
   public void sacar(float v){
      if (this.isStatus()){
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Proprietario: " + this.getDono());
            System.out.println("Saldo atual: " + this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente para saque!");
        }  
      }else{
          System.out.println("Impossivel sacar de uma conta fechada!");
      } 
   }
   
   public void pagarMensalidade(){
     int v = 0;
       if (this.getTipo() == "CC") {
           v = 12;
       } else if(this.getTipo() == "CP"){
           v = 20;
       }
       if (this.isStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade paga com sucesso por " + this.getDono());
       }else{
           System.out.println("Impossivel pagar uma conta fechada!");
       }
   }
   
   //Construtor
   public ContaBanco(){
     this.saldo = 0;
     this.status = false;
   }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
}
