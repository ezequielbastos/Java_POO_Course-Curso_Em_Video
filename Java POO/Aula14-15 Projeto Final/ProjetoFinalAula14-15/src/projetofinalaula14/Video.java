package projetofinalaula14;

/**
 *
 * @author Zack Bastos
 */
public class Video implements AcoesVideos{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtida;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAval;
        novaAval = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = novaAval;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtida++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao 
                + ", views=" + views + ", curtida=" + curtida + ", reproduzindo=" 
                + reproduzindo + '}';
    }
    
    
    
}
