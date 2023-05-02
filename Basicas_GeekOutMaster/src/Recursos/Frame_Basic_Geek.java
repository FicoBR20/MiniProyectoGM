package Recursos;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame_Basic_Geek extends JFrame {
    private GiraDado giraDado; // Mouse Listener
    private JButton jbdadp1;
    private JLabel jldado2;
    private JPanel container1;
    private Container principal;


    public Frame_Basic_Geek() {// Jframe general setup; include initGUI method with initials values
        initGUI();
        this.setTitle("Plantilla 1 - GOM");
        this.setSize(189, 189 );
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method INITGUI -> ASSIGN INITIALS VALUES TO ALL ATTRIBUTES, RUN INTO CONSTRUCTOR
    private void initGUI() {

        ImageIcon caraPuntuadora = new ImageIcon(getClass().getResource("/images/cara42.png"));

        giraDado = new GiraDado();

        jbdadp1 = new JButton("con imagen");
        jbdadp1.setIcon(caraPuntuadora);

        jldado2 = new JLabel();

        jldado2.setIcon(caraPuntuadora);
        
        container1 = new JPanel();

        container1.setLayout(new BorderLayout());


        container1.setBorder(BorderFactory.createTitledBorder(null, "Dado cambia cara opuesta.",
                TitledBorder.CENTER, TitledBorder.DEFAULT_JUSTIFICATION,
                new Font(Font.MONOSPACED, Font.BOLD, 12), Color.BLACK));

       // container1.add(new Button("Prueba"), BorderLayout.SOUTH);

        container1.add(jbdadp1);


//        LayoutManager BorderLayout = null;

        jbdadp1.addMouseListener(giraDado);
        jldado2.addMouseListener(giraDado);





        //this refers a JFrame setup

        this.add(container1);

       // pack();

        //validate();



    }

    // MAIN --> FUNCTION TO LAUNCH THE APP.


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame_Basic_Geek myGUI = new Frame_Basic_Geek();
            }
        });
    }

    private class GiraDado implements ActionListener, MouseListener{

        private ImageIcon cara42;


        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getSource()==jbdadp1){
                this.cara42 = new ImageIcon(getClass().getResource("/images/caraCohete.png"));
                jldado2.setIcon(cara42);
                repaint();
            }


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

