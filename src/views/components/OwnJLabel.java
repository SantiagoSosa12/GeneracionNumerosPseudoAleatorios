package views.components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import constants.MyConstants;

public class OwnJLabel extends JLabel {

	public OwnJLabel(String text) {
		setText(text);
		setForeground(Color.WHITE);
		setFont(new Font(MyConstants.FONT_ARIAL, 1, 25));
		setHorizontalAlignment(JLabel.CENTER);
	}

	private static final long serialVersionUID = 1L;
}