package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDerecha extends JPanel implements ActionListener{
	
	private JButton btnNuevo;
	private JButton btnReiniciar;
	private JButton btnTop10;
	private JButton btnCambiarJugador;

	public PanelDerecha() {
		
		setPreferredSize(new Dimension(300, 200));
		FlowLayout bl = new FlowLayout(100, 100, 100);
		setLayout(bl);
		
		
		btnNuevo = new JButton("Nuevo"); //Que hace?
		//btnSuma.setActionCommand(SUMA);
		//btnSuma.addActionListener(this);
		
		btnReiniciar = new JButton("Reiniciar");
		//btnSuma.setActionCommand(SUMA);
		//btnSuma.addActionListener(this);
		
		btnTop10 = new JButton("Top 10");
		//btnSuma.setActionCommand(SUMA);
		//btnSuma.addActionListener(this);
		
		btnCambiarJugador = new JButton("Cambiar Jugador");
		//btnSuma.setActionCommand(SUMA);
		//btnSuma.addActionListener(this);
		
		
		//add(btnNuevo, BorderLayout.WEST);
		add(btnReiniciar);
		add(btnTop10);
		add(btnCambiarJugador);
		add(btnNuevo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
