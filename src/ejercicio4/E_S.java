package ejercicio4;

import java.util.Scanner;

public class E_S {

    static Scanner entrada = new Scanner(System.in);

    public static String pedirDevolverTexto(String texto) {

        String respuesta = "";
        System.out.println(texto);
        respuesta = entrada.nextLine();
        return respuesta;
    }


    public static int pedirValor(String texto) {
        int respuesta= 0;
        System.out.println(texto);
        respuesta= entrada.nextInt();
        return respuesta;
    }

    public static void imprimirString(String texto) {
        System.out.println(texto);
    }
}
