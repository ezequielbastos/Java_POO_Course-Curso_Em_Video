package expolimorfismoaula13;

/**
 *
 * @author Zack Bastos
 */
public class Mamifero extends Animal{
    protected String corPelo;
    
    @Override
    public void emitirSon() {
        System.out.println("Som de Mamífero");
    }
    
}
