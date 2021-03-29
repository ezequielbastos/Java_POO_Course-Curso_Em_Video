/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Zack_BS
 */
public class Banco {

   public static void main(String[] args) {
        String nome, sen; 
        int opc, num; 
        double dep, valor;
        
        ContaB c1 = new ContaB();
        Scanner in = new Scanner (System.in);
        do{
        System.out.println("================================================");
        System.out.println("            Bem Vindo ao Banco java");
        System.out.println("================================================");
        System.out.println("            [1] Cadastrar Conta ");
        System.out.println("            [2] Deposito ");
        System.out.println("            [3] Saque ");
        System.out.println("            [4] Tranferencia ");
        System.out.println("            [0] Sair ");
        System.out.println("==================================================");
        System.out.print("Digite a opção desejada: ");
        opc = in.nextInt();
        in.nextLine(); //Para pegar o enter do teclado o tipo precisa ser String no input!
        switch(opc){
            case 1:
        c1.LimpaTela();
                System.out.println("----- Cadastro de Conta -----");
        System.out.print("Digite o titular da conta: ");
        nome = in.nextLine();
        c1.setTitular(nome);
        System.out.print("Digite o numero da conta: ");
        num = in.nextInt();
        c1.setNumero(num);
        System.out.print("Digite o valor do deposito inicial: ");
        dep = in.nextDouble();
        in.nextLine(); //Lixo de imput
        c1.setSaldo(dep);
        System.out.print("Digite uma senha: ");
        sen = in.nextLine();
        c1.setSenha(sen);
       
               c1.DadosBancarios();
            break;
                
            case 2:
                c1.LimpaTela();
                System.out.print("Digite o valor do deposito: ");
                valor = in.nextDouble();
               
                c1.Deposito(valor);
                
            break;
            
            case 3:
                c1.LimpaTela();
                System.out.print("Digite o valor do Saque: ");
                valor = in.nextDouble();
               
                c1.Sacar(valor);
            break;
            
            case 4:
                c1.LimpaTela();
                System.out.print("Digite o valor do deposito: ");
                valor = in.nextDouble();
               
                c1.Transferir(valor);
            break;
            
            default:
                if(opc != 0)
                System.out.println("OPÇÃO INVALIDA!");
            break;
            
            }
        }while(opc != 0);
    }
    
}