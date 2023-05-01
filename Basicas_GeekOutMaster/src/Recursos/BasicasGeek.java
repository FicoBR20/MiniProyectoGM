package Recursos;

import java.util.ArrayList;
import java.util.Random;

public class BasicasGeek {

    /*
    funcion que genera un arreglo de enteros con 7 campos.
    cada campo represnta un dado. el valor asignado a cada campo
    representa la cara del dado, configurandose asi ek inicio del juego.
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

//    private static ArrayList <int> juegoInicial(){
//
//        Random rand = new Random();
//        int carasDados = 6;
//        ArrayList <int> juego = new ArrayList<int>(carasDados);
//        for (int i = 0; i<juego.size(); i++;){
//            juego[i]=
//        }
//
//
//
//    }

    /*

    funcion que actualiza el entero representativo de la cara del dado
    en un lanzamiento de un solo dado.
     */

    private static int lanzaUnDado(int caraInicial){
        Random rand = new Random();
        int carasDados = 6;
        int nuevaCara = rand.nextInt(carasDados);
        System.out.println(" La cara inicial era "+ caraInicial +"\n" +
                " La cara nueva es " + nuevaCara);
        return nuevaCara;
    }

    /*
    funcion que actualiza el entero represntativo de la cara de un dado
    al voltearlo.
    Rango de los valores [ 0 -> 5 ]
     */

    private  static int voltearCaraDeDado(int caraActual){
        int caraOpuesta;

        switch (caraActual){
            case 0:
                caraOpuesta = 5;
                break;

            case 1:
                caraOpuesta = 4;
                break;

            case 2:
                caraOpuesta = 3;
                break;

            case 3:
                caraOpuesta = 2;
                break;

            case 4:
                caraOpuesta = 1;
                break;

            case 5:
                caraOpuesta = 0;
                break;

            default:
                caraOpuesta = 99;

        }

        System.out.println( " La cara opuesta a " + caraActual + " es " + caraOpuesta);

        return caraOpuesta;

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

        voltearCaraDeDado(0);
        voltearCaraDeDado(1);
        voltearCaraDeDado(2);
        voltearCaraDeDado(3);
        voltearCaraDeDado(4);
        voltearCaraDeDado(5);
        voltearCaraDeDado(5);
        voltearCaraDeDado(3);


    }

}
