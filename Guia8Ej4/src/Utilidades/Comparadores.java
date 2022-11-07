/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Comparadores {

    public static Comparator<Pelicula> duracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };

    public static Comparator<Pelicula> duracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordendarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().toLowerCase().compareTo(t2.getTitulo().toLowerCase());
        }
    };
    public static Comparator<Pelicula> ordendarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getDirector().toLowerCase().compareTo(t2.getDirector().toLowerCase());
        }
    };

}