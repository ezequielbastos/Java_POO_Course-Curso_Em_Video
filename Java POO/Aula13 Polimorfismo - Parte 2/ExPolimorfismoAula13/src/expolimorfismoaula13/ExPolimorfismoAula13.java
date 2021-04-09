package expolimorfismoaula13;

/**
 *
 * @author Zack Bastos
 */
public class ExPolimorfismoAula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro cachorro = new Cachorro();
        
        cachorro.emitirSom(); //Usando polimorfismo com sub-escrita
        
        //Testando polimofismo com sobre-carga nas reações ao interagir com o cachorro
        cachorro.reagir("Olá"); //Abanar e Latir
        cachorro.reagir("Vai apanhar"); //Rosnar
        cachorro.reagir(11, 45); //Abanar
        cachorro.reagir(21, 00); //Ignorar
        cachorro.reagir(true); //Abanar
        cachorro.reagir(false); //Rosnar e Latir
        cachorro.reagir(2, 12.5f); //Latir
        cachorro.reagir(17, 4.5f); //Rosnar
    }
    
}
