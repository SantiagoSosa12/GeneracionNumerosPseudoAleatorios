package views;

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

public class JDNormalEstandar extends JDialog {

	private OwnJSpinner spMinLimit;
	private OwnJSpinner spMaxLimit;
	private OwnJSpinner spNumToGenerate;
	private OwnJButton btnDistroUniforme;
	
	public JDNormalEstandar(JFrame pseudoRandomMainWindow, ActionListener actionListener) {
		super(pseudoRandomMainWindow);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setModal(true);
		setSize(500, 315);
		setTitle("Datos para distribucion Normal estandar");
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
		
		btnDistroUniforme = new OwnJButton("Generar numeros", ActionsE.CALCULATE_DISTRO_NORMAL, actionListener);
		btnDistroUniforme.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(btnDistroUniforme);
	}
	
	public Object[] getDistroNormalData() {
		return new Object[] {
				spMinLimit.getValue(),
				spMaxLimit.getValue(),
				spNumToGenerate.getValue()
		};
	}
	
	private static final long serialVersionUID = 1L;
}