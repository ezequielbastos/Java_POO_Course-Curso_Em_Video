package projetofinalaula14;

/**
 *
 * @author Zack Bastos
 */
public class ProjetoFinalAula14 {

    public static void main(String[] args) {
        Video vetVideo[] = new Video[3];
        vetVideo[0] = new Video("Aula 01 de Java");
        vetVideo[1] = new Video("Aula 02 de Java");
        vetVideo[2] = new Video("Aula 03 de Java");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Juliana", 21, "F", "Juli");
        gafanhoto[1] = new Gafanhoto("Ramon", 27, "M", "Ramonzito");
        /*
        System.out.println("VIDEOS\n---------------------------");
        System.out.println(vetVideo[0].toString());
        System.out.println(vetVideo[1].toString());
        System.out.println(vetVideo[2].toString());
        
        System.out.println("\nGAFANHOTOS\n---------------------------");
        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());
        */
        
        //utilizando a classe Visualização com os objetos da classe de Video e Gafanhoto!
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(gafanhoto[0], vetVideo[2]);//Juliana assiste Aula 03
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(gafanhoto[0], vetVideo[1]);//Juliana assite Aula 02
        vis[0].avaliar(66.8f);
        System.out.println(vis[1].toString());
    }
    
}
