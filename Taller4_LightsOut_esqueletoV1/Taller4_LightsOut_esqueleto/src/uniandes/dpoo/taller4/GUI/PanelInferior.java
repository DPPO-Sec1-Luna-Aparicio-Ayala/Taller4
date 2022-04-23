package uniandes.dpoo.taller4.GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInferior extends JPanel implements ActionListener{
    
    private JLabel labJugador;
    private JTextField labJugadorActual;
    private JLabel labJugadas;
    private JTextField labJugadasContadas;
    private interfazLightsOut interfaz;
    
    public PanelInferior(interfazLightsOut interf){
    	interfaz = interf;
        setPreferredSize(new Dimension(700, 100));
        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        labJugador = new JLabel("Jugador: ");
        labJugadorActual = new JTextField();
        labJugadorActual.setPreferredSize(new Dimension(150,30));
        labJugadorActual.setEditable(false);
        labJugadas = new JLabel("Jugadas: ");
        labJugadasContadas = new JTextField();
        labJugadasContadas.setPreferredSize(new Dimension(30,30));
        labJugadasContadas.setEditable(false);
        
        add(labJugador);
        add(labJugadorActual);
        add(labJugadas);
        add(labJugadasContadas);
    }
    
    public void actualizarContador(int n) {
    	String jugadas = String.valueOf(n);
    	labJugadasContadas.setText(jugadas);
    }
    
    public void actualizarJugador(String name) {
    	labJugadorActual.setText(name);
    }
    
    public String getJugador() {
    	return labJugadorActual.getText();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
