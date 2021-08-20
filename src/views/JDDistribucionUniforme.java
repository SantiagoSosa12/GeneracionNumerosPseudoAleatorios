package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;

import controller.ActionsE;
import views.components.OwnJButton;
import views.components.OwnJSpinner;

public class JDDistribucionUniforme extends JDialog {

	private OwnJSpinner spMinLimit;
	private OwnJSpinner spMaxLimit;
	private OwnJSpinner spNumToGenerate;
	private OwnJButton btnDistroUniforme;
	
	public JDDistribucionUniforme(JFrame pseudoRandomMainWindow, ActionListener actionListener) {
		super(pseudoRandomMainWindow);
		this.setBackground(Color.white);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setModal(true);
		setSize(500, 300);
		setTitle("Datos para distribucion uniforme");
		setLocationRelativeTo(pseudoRandomMainWindow);
		this.setResizable(false);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spMinLimit = new OwnJSpinner("Ingrese el valor minimo");
		add(spMinLimit);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spMaxLimit = new OwnJSpinner("Ingrese el valor maximo");
		add(spMaxLimit);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spNumToGenerate = new OwnJSpinner("Cantidad de numeros a generar");
		add(spNumToGenerate);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		btnDistroUniforme = new OwnJButton("Generar", ActionsE.CALCULATE_DISTRO_UNIFORME, actionListener);
		btnDistroUniforme.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(btnDistroUniforme);
	}
	
	public Object[] getDistroUniformeData() {
		return new Object[] {
				spMinLimit.getValue(),
				spMaxLimit.getValue(),
				spNumToGenerate.getValue()
		};
	}
	
	private static final long serialVersionUID = 1L;
}