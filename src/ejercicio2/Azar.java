package ejercicio2;

public class Azar {

    public static int elegirNumeroAzar(int primerValor, int segundoValor) {
        int numeroAleatorio=0;
        numeroAleatorio= (int) (Math.random()*(segundoValor-primerValor)+primerValor); //Esta es la sintaxis para que genere un número entre dos valores máximo y mínimo.
        return numeroAleatorio;
    }
}
