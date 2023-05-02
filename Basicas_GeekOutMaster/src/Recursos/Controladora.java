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

        frame1 = new Frame_Gira_El_Dado();
        basico1 = new BasicasGeek();


    }

    public static void frameInicial(){
        String aviso = "vamos llegando";

        System.out.print(aviso);
        JOptionPane.showMessageDialog(null, "esta bueno");
    }





    public static void main(String[] args) {

        frameInicial();


        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Controladora myGUI = new Controladora();
            }
        });
    }


}
