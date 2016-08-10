/**
 * Created by Ing Diana on 02/08/2016.
 */
public class Pelicula extends Netflix  {

    public Pelicula(String titulo, String genero, String creador, int año, int duracion, boolean visto) {
        super(titulo, genero, creador, duracion, visto);
        this.año = año;
    }
    private int año;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    //Sobreescritura del método toString
    @Override
    public String toString() {
        return super.toString()+"Año:" + año+"\n";

    }

}
