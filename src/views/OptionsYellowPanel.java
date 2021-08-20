package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import constants.MyConstants;
import controller.ActionsE;
import views.components.OwnJButton;

public class OptionsYellowPanel extends JPanel {

	public OptionsYellowPanel(ActionListener actionListener) {
		setBackground(Color.decode(MyConstants.CLR_BLUE));
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 0));
		add(new OwnJButton(MyConstants.BTN_CUADRADOS_MED, ActionsE.CUADRADOS_MEDIOS, actionListener));
		add(new OwnJButton(MyConstants.BTN_CONGRUENCIA_L, ActionsE.CONGRUENCIA_LINEAL, actionListener));
		add(new OwnJButton(MyConstants.BTN_CONGRUENCIA_M, ActionsE.CONGRUENCIA_MULTIPLICATIVA, actionListener));
		add(new OwnJButton(MyConstants.BTN_DISTRO_UNIFOR, ActionsE.DISTRO_UNIFORME, actionListener));
		add(new OwnJButton(MyConstants.BTN_DISTRO_NORMAL, ActionsE.DISTRO_NORMAL_EST, actionListener));
		add(new OwnJButton(MyConstants.BTN_ACERCA_DE, ActionsE.ABOUT, actionListener));
	}

	/**
	 * Creates the grid for the GridBagLayout
	 * 
	 * @param c the layout columns
	 */
	public void createGrid(GridBagConstraints c) {
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.gridheight = 1;
		c.weighty = 0.01;

		for (int i = 0; i < 12; i++) {
			c.gridx = i;
			add(new JLabel(""), c);
		}
	}

	private static final long serialVersionUID = 1L;
}