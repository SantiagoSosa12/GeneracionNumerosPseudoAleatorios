package views.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import constants.MyConstants;
import controller.ActionsE;

/**
 * A class for create multiple buttons objects with similar characteristics
 */
public class OwnJButton extends JButton {

	private static final long serialVersionUID = 1L;

	public OwnJButton(String text, ActionsE actionCommand, ActionListener actionListener) {
		setText(text);
		setForeground(Color.WHITE);
		setBackground(Color.decode(MyConstants.CLR_BLUE));
		setBorder(new RoundedBorder(11));
		setFont(new Font(MyConstants.FONT_ROBOTO, 1, 15));
		setActionCommand(actionCommand.toString());
		addActionListener(actionListener);
	}
}