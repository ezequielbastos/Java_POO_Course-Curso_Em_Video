package exherancapessoaaula10;

/**
 *
 * @author Zack Bastos
 */
public class ExHerancaPessoaAula10 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Gustavo");
        p2.setNome("Duda");
        p3.setNome("Luiz");
        p4.setNome("Mirian");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p4.setIdade(22);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.85f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
    }
    
}
