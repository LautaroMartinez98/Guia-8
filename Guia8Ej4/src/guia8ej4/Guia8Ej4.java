

package guia8ej4;

//@author Usuario

import Entidad.Pelicula;
import Servicios.PeliculaService;
import java.util.Scanner;


public class Guia8Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        Pelicula p1 = new Pelicula();
        ps.crear();
        ps.mostrar();
        ps.mayorA60();  
        ps.MenorAMayor();
        ps.MayorAMenor();
        ps.Titulo();
        ps.Director();
    }
   
}
