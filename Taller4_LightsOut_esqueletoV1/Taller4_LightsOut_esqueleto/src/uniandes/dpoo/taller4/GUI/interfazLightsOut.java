package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class interfazLightsOut  extends JFrame{

	public interfazLightsOut() {
		
		setTitle( "LightsOut" );
		setSize( 700, 700 );
		setResizable( false );	
		setLayout( new BorderLayout( ) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new interfazLightsOut();
	}

}
