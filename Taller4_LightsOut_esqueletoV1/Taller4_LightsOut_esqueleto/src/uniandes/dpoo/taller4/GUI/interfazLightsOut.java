package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.awt.*;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import uniandes.dpoo.taller4.modelo.Tablero;

public class interfazLightsOut  extends JFrame{

	private Tablero tab;
	private PanelTablero panelTablero;
	private PanelSuperior panelSuperior;
	private PanelInferior panelInferior;
	private PanelDerecha panelDerecha;
	public int tamano;
	
	public interfazLightsOut() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = pantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		Image icono = pantalla.getImage("src/uniandes/dpoo/taller4/graficos/bulb.png");
		setIconImage(icono);
		tab = new Tablero(tamano);
		panelTablero = new PanelTablero(5,icono);
		panelSuperior = new PanelSuperior();
		panelInferior = new PanelInferior();
		panelDerecha = new PanelDerecha();
	
		
		setTitle( "LightsOut" );
		setSize( 900, 700 );
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable( false );	
		//setIconImage();
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
