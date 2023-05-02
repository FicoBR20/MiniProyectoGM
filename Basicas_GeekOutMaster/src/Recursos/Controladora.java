package Recursos;

import javax.swing.*;
import java.awt.*;

/*
La clase Controladora mediará entre varias clases a fin de
permitir una actualizacion de la GUI y demás funcionalidades y
datos en una manera eficiente y correcta en sus salidas.

 */

public class Controladora {

    private Frame_Gira_El_Dado frame1; // Frame de prueba
    private BasicasGeek basico1; // Clase con funciones de logica

    public Controladora(){

    }




    public static void main(String[] args) {


        Frame_Gira_El_Dado miFrame = new Frame_Gira_El_Dado();
        BasicasGeek miBasica = new BasicasGeek();

        /*
        Se logra que el buttom cambie de imagen
        realizando el llamado desde la clase Controladora
        que invoca los metodos apropiados en las clases involuctradas.
         */

        miFrame.asignarCara(miBasica.lanzarUnDado());


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Controladora myGUI = new Controladora();
            }
        });
    }


}
