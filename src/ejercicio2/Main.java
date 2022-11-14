package ejercicio2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int valorMinimo= 0;
        int valorMaximo= 0;
        Scanner entradaUsuario= new Scanner(System.in);
        System.out.print("Introduzca el valor mínimo: ");
        valorMinimo= entradaUsuario.nextInt();
        System.out.print("Introduzca el valor máximo: ");
        valorMaximo= entradaUsuario.nextInt();
        System.out.println("El número aleatorio es: "+Azar.elegirNumeroAzar(valorMinimo, valorMaximo));
    }
}
