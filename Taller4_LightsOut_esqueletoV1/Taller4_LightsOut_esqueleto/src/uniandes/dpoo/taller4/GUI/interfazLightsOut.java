package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;


import uniandes.dpoo.taller4.modelo.Tablero;

public class interfazLightsOut  extends JFrame{

	private Tablero tab;
	private PanelTablero panelTablero;
	private PanelSuperior panelSuperior;
	private PanelInferior panelInferior;
	private PanelDerecha panelDerecha;
	public int tamano;
	
	public interfazLightsOut() {
		
		
		tab = new Tablero(tamano);
		panelTablero = new PanelTablero();
		panelSuperior = new PanelSuperior();
		panelInferior = new PanelInferior();
		panelDerecha = new PanelDerecha();
		
		setTitle( "LightsOut" );
		setSize( 700, 700 );
		setResizable( false );	
		setLayout( new BorderLayout( ) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.SOUTH);
		add(panelTablero, BorderLayout.CENTER);
		add(panelDerecha, BorderLayout.EAST);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new interfazLightsOut();
	}

}
