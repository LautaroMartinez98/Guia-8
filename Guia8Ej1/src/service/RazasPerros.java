//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
package service;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RazasPerros {
    ArrayList <Perros> Razas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void Raza(){
        Perros pr = new Perros();
        System.out.println("ingrese el nombre del perro: ");
        pr.setNombre(leer.next());
        System.out.println("ingrese la raza: ");
        pr.setRaza(leer.next());
        
        
        Razas.add(pr);
    }
    public void Mostrar() {
        System.out.println("los perros de la lista son: ");
        Razas.forEach((aux) -> {
            System.out.println(aux.toString());
        });
    }
    public void Agregar () {
        System.out.println("ingrese un perro para buscar: ");
        String perrito = leer.next();
        Iterator <Perros> it = Razas.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(perrito)) {
                it.remove();
                cont = 1;
            }
        }
            if (cont == 0){
                System.out.println("no se encuentra el perro. ");
            }
        Mostrar();
    }
    
    
    
}
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.