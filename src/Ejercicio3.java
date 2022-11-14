import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cuantosDatos = 0; //Esta variable almacena cuántos índices tendrá el array y vendrá dado por el usuario.
        int numeroMin = 0;
        int numeroMax = 0;
        Scanner entradaCuantasPosiciones = new Scanner(System.in);
        System.out.print("Inserte cuántos datos desea almacenar: ");
        cuantosDatos = entradaCuantasPosiciones.nextInt();
        System.out.print("Inserte el mínimo: ");
        numeroMin = entradaCuantasPosiciones.nextInt();
        System.out.print("Inserte el máximo: ");
        numeroMax = entradaCuantasPosiciones.nextInt();
         /*Se llama a la función de mostrarDatos pasando como parámetro la función insertarDatosArray, que a su vez tiene como parámetros las variables que determinan el número de índices y el máximo y el mínimo que usará la función random.
        Esto permite ejecutar primero la función insertarDatosArray, ya que su return (un array) va a ser utilizado posteriormente por la función mostrarDatos como parámetro.
        */
        mostrarDatos(insertarDatosArray(cuantosDatos, numeroMin, numeroMax));
    }

    public static int elegirNumeroAzar(int valorMinimo, int valorMaximo) {
        int numeroAleatorio = 0;
        numeroAleatorio = (int) (Math.floor(Math.random() * (valorMaximo - valorMinimo+1) + valorMinimo)); //Esta es la sintaxis para que genere un número entre dos valores máximo y mínimo.
        return numeroAleatorio;
    }

    //En este caso, pasamos por parámetro también el mínimo y el máximo para que esta función pueda hacer uso de elegirNumeroAzar y, a su vez, pasarle por parámetros esos mismos valores.
    public static int[] insertarDatosArray(int cuantosDatos, int minimo, int maximo) {
        //Indicamos que el array tendrá tantos índices como haya indicado previamente el usuario, de modo que en el bucle solicite la cantidad adecuada usando la función length.
        int[] datosAleatorios = new int[cuantosDatos];
        for (int i = 0; i < datosAleatorios.length; i++) {
            datosAleatorios[i] = elegirNumeroAzar(minimo, maximo);
        }
        return datosAleatorios;
    }

    public static void mostrarDatos(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("El índice " + i + " del array contiene: " + array[i]);
        }
    }
}


