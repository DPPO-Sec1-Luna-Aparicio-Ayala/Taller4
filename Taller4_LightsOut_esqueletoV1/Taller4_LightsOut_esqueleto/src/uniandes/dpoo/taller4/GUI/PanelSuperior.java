package uniandes.dpoo.taller4.GUI;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.*;

public class PanelSuperior extends JPanel{
		private JComboBox<String> combo1;
		public PanelSuperior(){
		combo1=new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        combo1.addItem("4x4");
        combo1.addItem("5x5");
        combo1.addItem("6x6");
        combo1.addItem("7x7");
        add(combo1);
        combo1.addItemListener(this);
		}
	
}
