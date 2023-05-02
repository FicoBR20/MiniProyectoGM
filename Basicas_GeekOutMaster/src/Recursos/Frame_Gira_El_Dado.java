package Recursos;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
Clase a manera de prueba para un frame que cambia  a la imagen
 opuesta un buttom mediante un event mouselisterer.
 */

public class Frame_Gira_El_Dado extends JFrame {
    private GiraDado giraDado; // Mouse Listener
    private JButton jbdadp1;
  // private JLabel jldado2;
    private JPanel container1;
  //  private Container principal;


    public Frame_Gira_El_Dado() {// Jframe general setup; include initGUI method with initials values
        initGUI();
        this.setTitle("Plantilla 1 - GOM");
        this.setSize(189, 189 );
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method INITGUI -> ASSIGN INITIALS VALUES TO ALL ATTRIBUTES, RUN INTO CONSTRUCTOR
    private void initGUI() {

        ImageIcon caraPuntuadora = new ImageIcon(getClass().getResource("/Images/5-cara42.png"));

        giraDado = new GiraDado();

        jbdadp1 = new JButton();

//        jldado2 = new JLabel();
//
//        jldado2.setIcon(caraPuntuadora);
        
        container1 = new JPanel();

        container1.setLayout(new BorderLayout());


        container1.setBorder(BorderFactory.createTitledBorder(null, "Cara inicial del dado",
                TitledBorder.CENTER, TitledBorder.DEFAULT_JUSTIFICATION,
                new Font(Font.MONOSPACED, Font.BOLD, 12), Color.BLACK));

       // container1.add(new Button("Prueba"), BorderLayout.SOUTH);

        container1.add(jbdadp1);


//        LayoutManager BorderLayout = null;

        jbdadp1.addMouseListener(giraDado);
        //jldado2.addMouseListener(giraDado);





        //this refers a JFrame setup

        this.add(container1);

        pack();

        validate();



    }

    /*
    funcion que asigna un imageIcon a un buttom según un numero entero del 0 al 5
     */

    public void asignarCara(int numeroDeLaCara){

        ImageIcon cara_42 = new ImageIcon(getClass().getResource("/Images/5-cara42.png"));
        ImageIcon meeplet = new ImageIcon(getClass().getResource("/Images/4-caraMepplet.png"));
        ImageIcon superHeroe = new ImageIcon(getClass().getResource("/Images/3-caraSuperHeroe.png"));
        ImageIcon dragon = new ImageIcon(getClass().getResource("/Images/2-caraDragon.png"));
        ImageIcon cohete = new ImageIcon(getClass().getResource("/Images/1-caraCohete.png"));
        ImageIcon corazon = new ImageIcon(getClass().getResource("/Images/0-caraCorazon.png"));
        ImageIcon preguntaCara = new ImageIcon(getClass().getResource("/Images/99-caraPregunta.png"));



        switch (numeroDeLaCara){
            case 0:
                jbdadp1.setIcon(corazon);
                break;

            case 1:
                jbdadp1.setIcon(cohete);
                break;

            case 2:
                jbdadp1.setIcon(dragon);
                break;

            case 3:
                jbdadp1.setIcon(superHeroe);
                break;

            case 4:
                jbdadp1.setIcon(meeplet);
                break;

            case 5:
                jbdadp1.setIcon(cara_42);
                break;

            default:
                jbdadp1.setIcon(preguntaCara);

        }

    }

    // MAIN --> FUNCTION TO LAUNCH THE APP.


//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                Frame_Gira_El_Dado myGUI = new Frame_Gira_El_Dado();
//            }
//        });
//    }

    private class GiraDado implements ActionListener, MouseListener{

        private ImageIcon cara42;
        private BasicasGeek basica;


        @Override
        public void actionPerformed(ActionEvent e) {

            basica = new BasicasGeek();
           // basica.lanzaUnDado();

        }

        @Override
        public void mouseClicked(MouseEvent e) {

//            if (e.getSource()==jbdadp1){
//                this.cara42 = new ImageIcon(getClass().getResource("/Images/0-caraCorazon.png"));
//                jbdadp1.setIcon(cara42);
//                repaint();
//            }


        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


}

