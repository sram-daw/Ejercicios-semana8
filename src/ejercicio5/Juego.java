package ejercicio5;

import java.util.Scanner;

public class Juego {
    static Scanner entrada = new Scanner(System.in);

    public static int generarNumeroAzar() {
        int numeroAleatorio = 0;
        numeroAleatorio =  (int) (Math.random() * (10)); //Genera un número aleatorio del 1 al 10
        return numeroAleatorio;

    }

    public static int pedirValor(String texto) {
        int respuesta = 0;
        System.out.println(texto);
        respuesta = entrada.nextInt();
        return respuesta;
    }


    public static boolean comprobarIguales(int numeroAleatorio, int numeroUsuario) {
        boolean sonIguales = false;

        if (numeroAleatorio == numeroUsuario) { //Si el número coincide esto será lo que ocurra
            sonIguales = true;
            System.out.println("¡Lo has adivinado!");
        } else { //Si no coincide pueden ocurrir dos cosas en función de si es mayor o menor que el aleatorio.
            sonIguales = false;
            if (numeroUsuario > numeroAleatorio) {
                System.out.println("Es menor.");
            }
            if (numeroAleatorio > numeroUsuario) {
                System.out.println("Es mayor.");
            }
        }
        return sonIguales;
    }
}
