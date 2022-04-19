package uniandes.dpoo.taller4.GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInferior extends JPanel{
    
    private JLabel labJugador;
    private JLabel labJugadorActual;
    private JLabel labJugadas;
    private JLabel labJugadasContadas;
    
    public PanelInferior(){

        setPreferredSize(new Dimension(700, 100));
        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        labJugador = new JLabel("Jugador: ");
        labJugadorActual = new JLabel(""); //funcion llenar con nombre
        labJugadas = new JLabel("Jugadas: ");
        labJugadasContadas = new JLabel(""); //funcion contar juagadas

        add(labJugador);
        add(labJugadorActual);
        add(labJugadas);
        add(labJugadasContadas);


    }
}
