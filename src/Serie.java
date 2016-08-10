/**
 * Created by Ing Diana on 03/08/2016.
 */
public class Serie extends Netflix{
    public Serie(String titulo, String genero, String creador, int duracion, boolean visto, int temporada) {
        super(titulo, genero, creador, duracion, visto);
        this.temporada = temporada;
    }

    private int temporada;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return  super.toString()+"Temporada: " + temporada+"\n";
    }
}
