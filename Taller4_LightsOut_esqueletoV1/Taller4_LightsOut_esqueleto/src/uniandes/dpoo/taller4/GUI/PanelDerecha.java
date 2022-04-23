package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Top10;

public class PanelDerecha extends JPanel implements ActionListener{
	
	private JButton btnNuevoJuego;
	private JButton btnReiniciar;
	private JButton btnTop10;
	private JButton btnCambiarJugador;
	private interfazLightsOut interfaz;


	public PanelDerecha(interfazLightsOut inter) {
		interfaz = inter;
		
		setPreferredSize(new Dimension(300, 200));
		FlowLayout bl = new FlowLayout(100, 100, 100);
		setLayout(bl);

		btnNuevoJuego = new JButton("Nuevo Juego");
		btnNuevoJuego.addActionListener(interfaz);
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(interfaz);
			
		btnTop10 = new JButton("Top 10");
		btnTop10.addActionListener(interfaz);
		
		btnCambiarJugador = new JButton("Cambiar Jugador");
		btnCambiarJugador.addActionListener(interfaz);

		add(btnNuevoJuego);
		add(btnReiniciar);
		add(btnCambiarJugador);
		add(btnTop10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	public JButton getBtnReiniciar() {
		return btnReiniciar;
	}

	public void setBtnReiniciar(JButton btnReiniciar) {
		this.btnReiniciar = btnReiniciar;
	}

	public JButton getBtnNuevoJuego() {
		return btnNuevoJuego;
	}

	public void setBtnNuevoJuego(JButton btnNuevoJuego) {
		this.btnNuevoJuego = btnNuevoJuego;
	}
	
	public JButton getBtnCambiarJugador() {
		return btnCambiarJugador;
	}

	public void setBtnCambiarJugador(JButton btnCambiarJugador) {
		this.btnCambiarJugador = btnCambiarJugador;
	}
	
	public JButton getBtnTop10() {
		return btnTop10;
	}
}
