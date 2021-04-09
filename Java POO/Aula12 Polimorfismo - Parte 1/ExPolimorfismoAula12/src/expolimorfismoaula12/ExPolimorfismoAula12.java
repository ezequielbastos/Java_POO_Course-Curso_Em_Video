
package expolimorfismoaula12;

import java.util.Scanner;

/**
 *
 * @author Zack Bastos
 */
public class ExPolimorfismoAula12 {
    
    public static void main(String[] args) {
        //Aninal a1 = new Animal(); Animal é uma classe abstrata
        
        //Instanciando o objtos das classes
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cobra cobra = new Cobra();
        Cachorro cachorro = new Cachorro();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        
        Scanner input = new Scanner(System.in);
        
        //Polimofismo por sobre escrita
        /*
        mamifero.locomover(); //primeiro metodo chamando 
        reptil.locomover(); //sobre-escrevendo
        peixe.locomover(); //sobre-escrevendo
        ave.locomover(); //sobre-escrevendo
        */
        int opc;
        
        do{
        System.out.println("============================================");
        System.out.println("        --- BEM VINDO A SELVA ---           ");
        System.out.println("============================================");
        System.out.println("[1] Mamiferos");
        System.out.println("[2] Reptil");
        System.out.println("[3] Aquaticos");
        System.out.println("[4] Aéreos");
        System.out.println("[0] SAIR");
        System.out.println("=============================================");
        System.out.print("Escolha um opção: ");
        opc = input.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("============================================");
                System.out.println("[1] Canguru");
                System.out.println("[2] Cachorro");
                System.out.println("=============================================");
                System.out.print("Escolha um opção: ");
                opc = input.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("[] Canguru");
                        System.out.println("============================================");
                        System.out.println("[1] Saltar");
                        System.out.println("[2] Alimentar");
                        System.out.println("[3] Ouvir-ló");
                        System.out.println("[4] Cor");
                        System.out.println("[5] Usar Bolsa");
                        System.out.println("=============================================");
                        System.out.print("Escolha um opção: ");
                        opc = input.nextInt();
                        if (opc == 1) {
                            canguru.locomover();
                        }else if(opc == 2){
                            canguru.alimentar();
                        }else if(opc == 3){
                            canguru.emitirSom();
                        }else if(opc == 4){
                            canguru.getCorPelo();
                        }else if(opc == 5){
                            canguru.usarBolsa();
                        }else{
                            System.out.println("Opcção Invalida!");
                        }
                        break;
                    case 2:
                        System.out.println("============================================");
                        System.out.println("[1] Canguru");
                        System.out.println("[2] Cachorro");
                        System.out.println("=============================================");
                        System.out.print("Escolha um opção: ");
                        opc = input.nextInt();
                        break;
                }
                break;
            case 2:
                System.out.println("Modulo Reptil Não esta funcionando Ainda!!!");
                break;
            case 3:
                System.out.println("Modulo Aquaticos Não esta funcionando Ainda!!!");
                break;
            case 4:
                System.out.println("Modulo Aéreos Não esta funcionando Ainda!!!");
                break;
            default:
                if(opc != 0){
                    System.out.println("Opcção Invalida!");
                }
                break;
        }
        
        }while(opc != 0);
    }
    
}
