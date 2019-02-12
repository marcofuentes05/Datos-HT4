
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Marco Fuentes
 * Clase Main, contiene el metodo main y se encarga de ejecutar el programa
 * 
 */
public class Main {
    public static void main (String args []){
        
        System.out.println("Bienvenido!\n¿Que implementacion deseas para Stack?");
        System.out.println("1. ArrayList\n2. Vector\n3. Lista Simplemente Encadenada \n4. Lista Doblemente Encadenada \n5. Lista Circular");
        Scanner sc  = new Scanner(System.in);
        
        String respuesta = sc.nextLine();
        if (respuesta.equals("3")){
            FactoryList maquina = new FactoryList();
            System.out.println("¿Que tipo de lista deseas usar?");
            System.out.println("1. Simplemente encadenada\n2. Doblemente encadenada\n3. Circular");
            Scanner sca = new Scanner(System.in);
            int tipoDeString = Integer.parseInt(sca.nextLine());
            List lista = maquina.factoryList(tipoDeString);
        }else{
            FactoryStack maquina = new FactoryStack();
            Stack lista = maquina.factoryStack(respuesta);
        }
    }
}
