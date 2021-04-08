 package exherancaaula11;

/**
 *
 * @author Zack Bastos
 */
public class ExHerancaAula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Não e posivel intanciar uma classe abstrata
        
        //Instanciando a classe Visitante que esta herdando os atrinutos de pessoa
        /*
        Visitantes v1 = new Visitantes();
        v1.setNome("Rair");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */
        
        //Instanciando a "subclasse aluno" da classe Pessoa!
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setIdade(33);
        a1.setSexo("M");
        a1.setMatricula(77475);
        a1.setCurso("Engenharia da Computação");
        a1.pagarMensalidade();
        //System.out.println(a1.toString());
        
        //Instanciando a "subclasse  bolsista" da subclasse aluno!
        Bolsista b1 = new Bolsista();
        b1.setMatricula(41423);
        b1.setNome("Ruan");
        b1.setSexo("M");
        b1.setBolsa(15.7f);
        b1.pagarMensalidade();
        
        //Instanciando a "subclasse  Técnico" da subclasse aluno!
        Tecnico t1 = new Tecnico();
        t1.setMatricula(87442);
        t1.setNome("Amanda");
        t1.setSexo("F");
        t1.setCurso("Engenharia de Software");
        t1.setIdade(25);
        t1.setRegistroProfissional("Engenheira de software");
        t1.praticar();
        
        //Instanciando a "subclasse  Professor" da subclasse aluno!
        Professor p1 = new Professor();
        p1.setNome("Tiaguera");
        p1.setIdade(39);
        p1.setSexo("M");
        p1.setEspecialidade("Matématico");
        p1.setSalario(3500.0f);
        p1.receberAumento(150.50f);
    }
    
}
