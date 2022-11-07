//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
package guia8ej1;

//@author Usuario
import java.util.Scanner;
import service.RazasPerros;

public class Guia8Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RazasPerros rp = new RazasPerros();
        String opc;
        do {
            rp.Raza();
            System.out.println("¿Desea seguir agregando perros? \n S / N");
            opc = leer.next(); 
            if (!"n".equals(opc)) {
                System.out.println("opcion invalida");
            }
        } while ("s".equals(opc) || !"n".equals(opc));
        rp.Mostrar();
        rp.Agregar();
    }

}
