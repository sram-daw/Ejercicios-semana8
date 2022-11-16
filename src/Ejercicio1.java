import java.util.Scanner;

public class Ejercicio1 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int cuantasPosicionesArray = 0; //Esta variable almacena cuántos índices tendrá el array y vendrá dado por el usuario.

        System.out.print("Inserte cuántos datos desea almacenar: ");
        cuantasPosicionesArray = entrada.nextInt();
        /*Se llama a la función de mostrarDatos pasando como parámetro la función insertarDatosArray, que a su vez tiene como parámetro la variable que determina el número de índices.
        Esto permite ejecutar primero la función insertarDatosArray, ya que su return (un array) va a ser utilizado posteriormente por la función mostrarDatos como parámetro.
        */
        mostrarDatos(insertarDatosArray(cuantasPosicionesArray));

    }


    public static int[] insertarDatosArray(int cuantosDatos) {

        //Indicamos que el array tendrá tantos índices como haya indicado previamente el usuario, de modo que en el bucle solicite la cantidad adecuada usando la función length.
        int[] datosUsuario = new int[cuantosDatos];
        for (int i = 0; i < datosUsuario.length; i++) {
            System.out.println("Introduzca el valor " + i + ": ");
            datosUsuario[i] = entrada.nextInt();
        }
        return datosUsuario;
    }

    public static void mostrarDatos(int[] array) {
        boolean salir = false;
        System.out.println("Pulse intro para avanzar en el índice del array y \"s\" para salir.");
        while (!salir) {
            for (int i = 0; i < array.length & !salir; i++) { //Se debe añadir además la condición de !salir porque si no sigue ejecutando el bucle hasta que no termine la condición de i<array.lenght.
                System.out.println("El índice " + i + " del array contiene: " + array[i]);
                Scanner entradaSalir = new Scanner(System.in);
                String entradaUsuarioIntro = entradaSalir.nextLine();
                if (entradaUsuarioIntro.equals("s")) {
                    salir = true; //Se para la ejecución del bucle while porque deja de cumplirse la condición (salir==false).
                    System.out.println("Impresión detenida.");
                }
            }


        }
    }

}
