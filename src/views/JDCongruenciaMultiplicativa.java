package views;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;

import controller.ActionsE;
import views.components.OwnJButton;
import views.components.OwnJComboBox;
import views.components.OwnJSpinner;

public class JDCongruenciaMultiplicativa extends JDialog {

	private static final long serialVersionUID = 1L;

	private OwnJSpinner spSeed;
	private OwnJSpinner spMin;
	private OwnJSpinner spMax;
	private OwnJSpinner spNumToGenerate;
	private OwnJSpinner spT;
	private OwnJSpinner spG;
	private OwnJComboBox coboxIsClosed;
	private OwnJButton btnCongruenciaM;

	public JDCongruenciaMultiplicativa(PseudoRandomMainWindow pseudoRandomMainWindow, ActionListener actionListener) {
		super(pseudoRandomMainWindow);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setModal(true);
		setSize(500, 650);
		setTitle("Datos para congruencia multiplicativa");
		setLocationRelativeTo(pseudoRandomMainWindow);
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
		
		spT = new OwnJSpinner("Ingrese el valor de T");
		add(spT);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		spG = new OwnJSpinner("Ingrese el valor de G");
		add(spG);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		coboxIsClosed = new OwnJComboBox();
		add(coboxIsClosed);
		
		this.add(Box.createRigidArea(new Dimension(19, 19)));
		
		btnCongruenciaM = new OwnJButton("  Generar  ", ActionsE.CALCULATE_CONGRUENCIA_MULTIPLICATIVA, actionListener);
		btnCongruenciaM.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(btnCongruenciaM);
	}

	public Object[] congruenciaMultiplicativaInfo() {
		return new Object[] {
				(Integer) spSeed.getValue(),
				(Integer) spMin.getValue(),
				(Integer) spMax.getValue(),
				(Integer) spNumToGenerate.getValue(),
				(Integer) spT.getValue(),
				(Integer) spG.getValue(),
				coboxIsClosed.getSelectedIndex() == 0 ? true : false
				};
	}
}