/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {

    ArrayList<Pelicula> Peliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula p1 = new Pelicula();

    public Pelicula crear() {
        String opc;
        do {
            Pelicula p1 = new Pelicula();
            System.out.println("ingrese titulo de la pelicula: ");
            p1.setTitulo(leer.next());
            System.out.println("ingrese el director: ");
            p1.setDirector(leer.next());
            System.out.println("ingrese la duracion en minutos: ");
            p1.setDuracion(leer.nextInt());

            Peliculas.add(p1);

            System.out.println("¿desea seguir agregando peliculas? S / N ");
            opc = leer.next();

        } while ("S".equalsIgnoreCase(opc));
        return new Pelicula();
    }

    public void mostrar() {
        for (Pelicula aux : Peliculas) {
            System.out.println(aux);
        }
    }

    public void mayorA60() {
        for (Pelicula aux : Peliculas) {
            if (aux.getDuracion() > 60) {
                System.out.println("las peliculas con una duracion mayor a una hora son: " + aux);
            }
        }
    }
    public void MayorAMenor(){
        Collections.sort(Peliculas, Comparadores.duracionDescendente);
        mostrar();
    }
    public void MenorAMayor(){
        Collections.sort(Peliculas, Comparadores.duracionAscendente);
        mostrar();
    }
    public void Director(){
        Collections.sort(Peliculas, Comparadores.ordendarPorDirector);
        mostrar();
    }
    public void Titulo(){
        Collections.sort(Peliculas, Comparadores.ordendarPorTitulo);
        mostrar();
    }
}
