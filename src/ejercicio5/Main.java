package ejercicio5;

public class Main {
    public static void main(String[] args) {
        int numeroAzar = 0;
        int numeroUsuario = 0;
        String pedirNumero = "";
        boolean sonIguales = false;
        numeroAzar = Juego.generarNumeroAzar(); //El return de la función generarNumeroAzar se almacena en la variable numeroAzar.
        pedirNumero = "¿En qué número estoy pensando del 0 al 10?: ";

        //Hasta que el usuario no adivine (sonIguales=true) el número seguirá preguntando y dando pistas.
        do {
            numeroUsuario = Juego.pedirValor(pedirNumero);
            sonIguales = Juego.comprobarIguales(numeroAzar, numeroUsuario);
        } while (!sonIguales);

    }
}
