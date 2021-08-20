package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import controller.ActionsE;
import views.components.OwnJButton;
import views.components.OwnJSpinner;

public class JDCuadradosMedios extends JDialog {

	private static final long serialVersionUID = 1L;
	private OwnJSpinner spSeed;
	private OwnJSpinner spMin;
	private OwnJSpinner spMax;
	private OwnJSpinner spNumToGenerate;
	private JButton button;

	public JDCuadradosMedios(PseudoRandomMainWindow pseudoRandomMainWindow, ActionListener listener) {

		setModal(true);
		setSize(399, 399);
		setTitle("datos para cuadrados medios");
		setLocationRelativeTo(pseudoRandomMainWindow);
		getContentPane().setBackground(Color.WHITE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		this.setResizable(false);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spSeed = new OwnJSpinner("Ingrese el valor de la semilla");
		add(spSeed);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spMin = new OwnJSpinner("Ingrese el valor minimo");
		add(spMin);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spMax = new OwnJSpinner("Ingrese el valor maximo");
		add(spMax);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spNumToGenerate = new OwnJSpinner("Cantidad de numeros a generar");
		add(spNumToGenerate);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		button = new OwnJButton(" Generar ", ActionsE.CALCULATE_CUADRADOS_MEDIOS, listener);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(button);
	}

	public Object[] cuadradosMediosInfo() {
		return new Object[] { 
				(Integer) spSeed.getValue(), 
				(Integer) spMin.getValue(), 
				(Integer) spMax.getValue(),
				(Integer) spNumToGenerate.getValue() 
			};
	}
}