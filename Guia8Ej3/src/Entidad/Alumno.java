/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
//

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombre;
    private int[] notas;

    public Alumno() {
    }

    public Alumno(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre= " + nombre + ", notas= " + notas + '}';
    }

    
}
