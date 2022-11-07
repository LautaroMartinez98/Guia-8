/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


/**
 *
 * @author Usuario
 */
public class PaisService {
    TreeSet<String> Pais = new TreeSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crear(){
        do {
            System.out.println("ingrese un país: ");
            Pais.add(leer.next().toLowerCase());
            System.out.println("¿quiere seguir agregando paises? S / N");
            
        } while (!leer.next().equalsIgnoreCase("N"));
        
    }
    public void mostrar(){
        for (String aux : Pais) {
            System.out.println(aux);
        }
    }
    public void buscar(){
        System.out.println("ingrese un pais para eliminar: ");
        String opc= leer.next();
        int cont=0;
        Iterator<String> tuki = Pais.iterator();
        while (tuki.hasNext()) {
            if (opc.equalsIgnoreCase(tuki.next())) {
                tuki.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("el país no se encontró");
        }
        else  {
            System.out.println("se encontró el país y fue eliminado, la lista quedo asi: ");
            mostrar();
        }
    }
}
