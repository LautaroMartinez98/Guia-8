package guia8ej3;

//@author Usuario

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia8Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio as = new AlumnoServicio();
        Alumno a = new Alumno();
        ArrayList<Alumno> Estudiantes = new ArrayList();

        do {

            Estudiantes.add(as.crearAlumno());

            System.out.println("Quiere continuar creando alumnos? [Si] / [No]");
            if (leer.next().equalsIgnoreCase("no")) {
                break;
            }

        } while (true);

        System.out.println("Los alumnos son: ");
        for (Alumno aux : Estudiantes) {
            System.out.println(aux.toString());
        }

        System.out.println("Ingrese el nombre del alumno para calcular la nota final");

        String nombre = leer.next();
        int cont = 0;
        double notaF = 0;
        for (Alumno aux : Estudiantes) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                notaF = as.notaFinal(aux);
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontró el alumno");
        } else {
            System.out.println("La nota final de " + nombre + " es: " + notaF);
        }

    }

}



