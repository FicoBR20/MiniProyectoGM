package Recursos;

import java.util.Random;

public class BasicasGeek {

    /*
    funcion que genera un arreglo de enteros con 7 campos.
    que representan los 7 dados de inicio del juego.
    los valores van del cero al 5 representando las 6 caras del dado
    
     */

    private static int[] lanzaSieteDados(){
        Random rand = new Random();
        int carasDados = 6; 
        int[] juegoInicial = new int[7];
        for (int i =0; i< juegoInicial.length; i++){
            juegoInicial[i]=rand.nextInt(carasDados);
            System.out.println(" El juego inicial es[ " + i + " ] = " + juegoInicial[i] );
        }
        return juegoInicial;
    }

    private static int lanzaUnDado(int caraInicial){
        Random rand = new Random();
        int carasDados = 6;
        int nuevaCara = rand.nextInt(carasDados);
        System.out.println(" La cara inicial era "+ caraInicial +"\n" +
                " La cara nueva es " + nuevaCara);
        return nuevaCara;
    }





    public static void main( String args[] ) {
        /*
        pruebas de funciones
         */

        lanzaSieteDados();
        lanzaUnDado(1);
        lanzaUnDado(1);
        lanzaUnDado(1);
        lanzaUnDado(3);
        lanzaUnDado(6);

    }

}
