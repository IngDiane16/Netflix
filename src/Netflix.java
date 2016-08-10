/**
 * Created by Ing Diana on 03/08/2016.
 */
//ÉSTA ES LA CLASE PADRE
public class Netflix    implements Visualizable {
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto = false;

    public Netflix(String titulo, String genero, String creador, int duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return  "Título: " + titulo + "\n" +
                "Género: " + genero + "\n" +
                "Creador: " + creador + "\n" +
                "Duración: " + duracion +" minutos\n"+
                "Visto: " + visto+"\n";
    }
    @Override
    public void marcarVisto() {
        setVisto(true);
    }

    @Override
    public boolean esVisto() {
        return isVisto();
    }

    @Override
    public int tiempoVisto() {
        return getDuracion();
    }
}
