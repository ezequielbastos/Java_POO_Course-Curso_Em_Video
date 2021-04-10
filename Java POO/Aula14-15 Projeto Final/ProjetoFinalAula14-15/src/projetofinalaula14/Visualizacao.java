package projetofinalaula14;

/**
 *
 * @author Zack Bastos
 */
public class Visualizacao {
    //Fazendo a agregação entre Video e Gafanhoto
    
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);//aumenta +1 no total assistido
        this.filme.setViews(this.filme.getViews() +1);//aumenta +1 no total de views
    }
    
    //Utilizando Polimorfismo com sobrecarga para fazer a avaliação do video
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if(porc <= 90){
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "\nVisualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
