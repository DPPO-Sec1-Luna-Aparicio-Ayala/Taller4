package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import uniandes.dpoo.taller4.modelo.Tablero;

public class interfazLightsOut  extends JFrame implements ActionListener{

	private Tablero tablero;
	private PanelTablero panelTablero;
	private PanelSuperior panelSuperior;
	private PanelInferior panelInferior;
	private PanelDerecha panelDerecha;
	public int tamano = 4;
	//El tamaño por defecto del tablero es 4x4
	
	public interfazLightsOut() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image icono = pantalla.getImage("src/uniandes/dpoo/taller4/graficos/bulb.png");
		Image apagado = pantalla.getImage("src/uniandes/dpoo/taller4/graficos/bulbOff.png");
		setIconImage(icono);
		tablero = new Tablero(tamano);
		panelTablero = new PanelTablero(icono, this,tamano,apagado);
		panelSuperior = new PanelSuperior(this);
		panelInferior = new PanelInferior(this);
		panelDerecha = new PanelDerecha(this);
		
		setTitle( "LightsOut" );
		setSize( 900, 700 );
		setResizable( false );	
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.SOUTH);
		add(panelTablero, BorderLayout.CENTER);
		add(panelDerecha, BorderLayout.EAST);
		
		/*
		// Esto se usa para que al cerrar la ventana se salven los resultados
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
			salvarTop10();
			}
		});
		*/
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new interfazLightsOut();
	}
		
	public void reinit() {
			tablero.reiniciar();
			panelTablero.actualizarTablero();
	}
	
	//GETTERS
	
	public Tablero darTablero() {
		return this.tablero;
	}
	
	public PanelTablero darPanelTablero() {
		return this.panelTablero;
	}
	
	public PanelSuperior darPanelSuperior() {
		return this.panelSuperior;
	}
	
	
	//SETTERS
	public void setTablero(Tablero newTab) {
		tablero = newTab;
	}
	
	public void setTamano(int n) {
		tamano = n;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		reinit();
		
	}

}
