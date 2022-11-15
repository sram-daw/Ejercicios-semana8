package ejercicio6;

import java.util.Scanner;

public class Juego100 {

    static Scanner entrada = new Scanner(System.in);

    public static int generarNumeroAzar() {
        int numeroAleatorio = 0;
        numeroAleatorio = (int) (Math.random() * (100 - 1 + 1) + 1); //Genera un número aleatorio del 1 al 100
        return numeroAleatorio;

    }

    public static int pedirValor(String texto) {
        int respuesta = 0;
        System.out.println(texto);
        respuesta = entrada.nextInt();
        return respuesta;
    }

    public static boolean comprobarIguales(int numeroAleatorio, int numeroUsuario, int i) {
        boolean sonIguales = false;

        if (numeroAleatorio == numeroUsuario) {
            sonIguales = true;
            System.out.println("¡Lo has adivinado!");
        } else {
            sonIguales = false;
            //El siguiente if hace que solo dé la pista hasta el penúltimo intento.
            if (i<5) {
                //Si no coincide pueden ocurrir dos cosas en función de si es mayor o menor que el aleatorio.
                if (numeroUsuario > numeroAleatorio) {
                    System.out.println("Es menor.");
                }
                if (numeroAleatorio > numeroUsuario) {
                    System.out.println("Es mayor.");
                }
            }
        }
        return sonIguales;
    }
}
