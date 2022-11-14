package ejercicio6;

import ejercicio5.Juego;

public class Main {
    public static void main(String[] args) {
        int numeroAzar = 0;
        int numeroUsuario = 0;
        String pedirNumero = "";
        boolean sonIguales = false;
        numeroAzar = Juego100.generarNumeroAzar(); //El return de la función generarNumeroAzar se almacena en la variable numeroAzar.
        pedirNumero = "Tienes 5 intentos para averiguar en qué número estoy pensando del 1 al 100: ";

        //En este bucle for hay dos condiciones que deben cumplirse (&): que i<=5 y que el booleano sonIguales debe ser false (si el usuario acierta, deja de ofrecer intentos porque es true).
        for (int i = 1; i <= 5 & !sonIguales; i++) {
            numeroUsuario = Juego100.pedirValor(pedirNumero);
            pedirNumero = "Tienes " +(5-i) + " intentos restantes: ";
            sonIguales = Juego100.comprobarIguales(numeroAzar, numeroUsuario, i);
            //Si se llega al último intento sin éxito, este será el mensaje que aparezca.
            if(i==5){
                System.out.println("Has perdido. El número era "+numeroAzar+".");
            }
        }

    }
}
