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
        //Implementación del areglo con todas las películas
        Pelicula peliculas[] = new Pelicula[5];
        Serie series[] = new Serie[5];
        peliculas[0] = new Pelicula("Suicide Squad", "Crimen", "David Ayer", 2016, 123, true);
        peliculas[1] = new Pelicula("Batman vs Superman: Dawn of Justice", "Sci-Fi ", "Zack Snyder", 2016, 151, true);
        peliculas[2] = new Pelicula("Zootopia","Adventure", "Byron Howard", 2016, 108, false);
        peliculas[3] = new Pelicula("X-Men: Apocalypse", "Sci-Fi", "Bryan Singer", 2016, 144, true);
        peliculas[4] = new Pelicula("Deadpool","Tim Miller","Action", 2016, 108, true );
        //Se utilizó un ciclo for para evitar más líneas de código innecesarias, muestra todas las películas
        for (int i = 0; i < peliculas.length; i++){
            System.out.println(peliculas[i]);
        }
        System.out.println("-------------*Todas las Series*-------------");
        series[0] = new Serie("Game of Thrones", "Drama", " David Benioff", 56, false, 6);
        series[1] = new Serie("The Walking Dead ", "Sci Fi", "Frank Darabont", 44, false, 6);
        series[2] = new Serie("Flash", "Action", "Greg Berlanti", 43, false, 2);
        series[3] = new Serie("Grey's Anatomy", "Romance", "Shonda Rhimes", 41, false, 12);
        series[4] = new Serie("Arrow ", "Crime", "Greg Berlanti", 42, true, 4);
        //Muestra todas las series
        for (int i = 0; i < series.length; i++){
            System.out.println(series[i]);
        }
        System.out.println("-------------*Películas Vistas*-------------");
        System.out.println(serie.toString());
        //Para hallar las películas vistas se hace uso de un if
        for (int i = 0; i < peliculas.length; i++){
            if (peliculas[i].isVisto()) {
                System.out.println(peliculas[i]);
            }
        }
        System.out.println("-------------*Series vistas*-------------");
        for (int i = 0; i < peliculas.length; i++){
            if (series[i].isVisto()) {
                System.out.println(series[i]);
            }
        }
        System.out.println("-------------*Película del año más actual*-------------");
        int añomasactual= peliculas[0].getAño();
        Pelicula p = peliculas[0];
        for (int i = 1; i<peliculas.length; i++ ){
            if (añomasactual < peliculas[i].getAño()){
                añomasactual = peliculas[i].getAño();
                p = peliculas[i];
            }
        }
        System.out.println(p);
        System.out.println("-------------*Temporada más actual*-------------");
        int temporadamasactual = series[0].getTemporada();
        Serie s = series[0];
        for (int i = 1; i < series.length; i++){
            if (temporadamasactual < series[i].getTemporada()){
                temporadamasactual = series[i].getTemporada();
                s = series[i];
            }
        }
        System.out.println(s);
    }
}
