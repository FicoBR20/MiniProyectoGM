package Recursos;

import java.util.Random;

public class BasicasGeek {

    private int valorSimple;
    private int[] valorListado;

    public void setValorListado(int[] valorListado) {
        this.valorListado = valorListado;
    }

    public void setValorSimple(int valorSimple) {
        this.valorSimple = valorSimple;
    }

    public int getValorSimple() {
        return valorSimple;
    }

    public int[] getValorListado() {
        return valorListado;
    }

    public BasicasGeek(int valor){// constructor con parametro entero.
        valorSimple = valor;

    }
    public BasicasGeek(){// constructor vacio

    }


    /*
    funcion que genera el entero representativo de la cara del dado
    en un lanzamiento de un solo dado.
     */

    public int lanzarUnDado(){
        Random rand = new Random();
        int carasDados = 6;
        int caraInicial = rand.nextInt(carasDados);
        System.out.println(" La cara inicial es "+ caraInicial );
        return caraInicial;
    }

    /*
    funcion que genera un arreglo de enteros con 7 campos.
    cada campo represnta un dado. el valor asignado a cada campo
    representa la cara del dado, configurandose asi ek inicio del juego.
    los valores van del cero al 5 representando las 6 caras del dado

     */

    public int[] lanzaSieteDados(){
        Random rand = new Random();
        int carasDados = 6;
        int[] juegoInicial = new int[7];
        for (int i =0; i< juegoInicial.length; i++){
            juegoInicial[i]=rand.nextInt(carasDados);
            System.out.println(" El juego inicial es[ " + i + " ] = " + juegoInicial[i] );
        }
        return juegoInicial;
    }




    /*

    funcion que actualiza el entero representativo de la cara del dado
    en un lanzamiento de un solo dado.
     */

    public int cambiaCara(int caraInicial){
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

  public int voltearCaraDeDado(int caraActual){
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
        BasicasGeek probador = new BasicasGeek();

        probador.lanzarUnDado();
        probador.lanzarUnDado();
        probador.lanzarUnDado();

        probador.lanzaSieteDados();
        probador.cambiaCara(1);
        probador.cambiaCara(1);
        probador.cambiaCara(1);
        probador.cambiaCara(3);
        probador.cambiaCara(6);

        probador.voltearCaraDeDado(0);
        probador.voltearCaraDeDado(1);
        probador.voltearCaraDeDado(2);
        probador.voltearCaraDeDado(3);
        probador.voltearCaraDeDado(4);
        probador.voltearCaraDeDado(5);
        probador.voltearCaraDeDado(5);
        probador.voltearCaraDeDado(3);


    }

}
