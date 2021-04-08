package exherancaaula11;

/**
 *
 * @author Zack Bastos
 */
public class Tecnico extends Aluno{
    private String registroProfissional;
    
    public void praticar(){
        System.out.println("Eu " + this.getNome() + " Estou Praticando!!!!");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
