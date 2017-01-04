import java.util.ArrayList;

/**
 * Created by Ing Diana on 03/08/2016.
 */
public class Principal {
    public static void main(String [] args){
        System.out.println("-------------*Todas las películas*-------------");
        Pelicula pelicula = new Pelicula("IRON MAN", "Acción", "Jon Favreau", 2008, 126, true );
        Serie serie = new Serie("How I Met Your Mother", "Comedia", "Carter Bays", 26, true, 1);
        System.out.println(pelicula.toString());
        pelicula.marcarVisto();
        pelicula.esVisto();
        pelicula.isVisto();
        //Implementación del arreglo con todas las películas
        // crear arraylist
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Suicide Squad", "Crimen", "David Ayer", 2016, 123, true));
        peliculas.add(new Pelicula("Batman vs Superman: Dawn of Justice", "Sci-Fi ", "Zack Snyder", 2016, 151, true));
        peliculas.add(new Pelicula("Zootopia","Adventure", "Byron Howard", 2016, 108, false));
        peliculas.add(new Pelicula("X-Men: Apocalypse", "Sci-Fi", "Bryan Singer", 2016, 144, true));
        peliculas.add(new Pelicula("Deadpool","Tim Miller","Action", 2016, 108, true ));

        //Se utilizó un ciclo for para evitar más líneas de código innecesarias, muestra todas las películas
        for (int i = 0; i < peliculas.size(); i++){
            System.out.println(peliculas.get(i));
        }
        ArrayList<Serie> series = new ArrayList<>();
        System.out.println("-------------*Todas las Series*-------------");
        series.add(new Serie("Game of Thrones", "Drama", " David Benioff", 56, false, 6));
        series.add(new Serie("The Walking Dead ", "Sci Fi", "Frank Darabont", 44, false, 6));
        series.add(new Serie("Flash", "Action", "Greg Berlanti", 43, false, 2));
        series.add(new Serie("Grey's Anatomy", "Romance", "Shonda Rhimes", 41, false, 12));
        series.add(new Serie("Arrow ", "Crime", "Greg Berlanti", 42, true, 4));
        //Muestra todas las series
        for (int i = 0; i < series.size(); i++){
            System.out.println(series.get(i));
        }
        System.out.println("-------------*Películas Vistas*-------------");
        System.out.println(serie.toString());
        //Para hallar las películas vistas se hace uso de un if
        for (int i = 0; i < peliculas.size(); i++){
            if (peliculas.get(i).isVisto()) {
                System.out.println(peliculas.get(i));
            }
        }
        System.out.println("-------------*Series vistas*-------------");
        for (int i = 0; i < peliculas.size(); i++){
            if (series.get(i).isVisto()) {
                System.out.println(series.get(i));
            }
        }
        System.out.println("-------------*Película del año más actual*-------------");
        int añomasactual= peliculas.get(0).getAño();
        Pelicula p = peliculas.get(0);
        for (int i = 1; i<peliculas.size(); i++ ){
            if (añomasactual < peliculas.get(i).getAño()){
                añomasactual = peliculas.get(i).getAño();
                p = peliculas.get(i);
            }
        }
        System.out.println(p);
        System.out.println("-------------*Temporada más actual*-------------");
        int temporadamasactual = series.get(0).getTemporada();
        Serie s = series.get(0);
        for (int i = 1; i < series.size(); i++){
            if (temporadamasactual < series.get(i).getTemporada()){
                temporadamasactual = series.get(i).getTemporada();
                s = series.get(i);
            }
        }
        System.out.println(s);
    }
}
