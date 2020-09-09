package DDLCalendarFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CancelButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		GUI.getFrame().dispatchEvent(new WindowEvent(GUI.getFrame(), WindowEvent.WINDOW_CLOSING));

	}

}
