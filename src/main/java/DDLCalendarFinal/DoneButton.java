package DDLCalendarFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class DoneButton implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Done Button Pressed");
		GUIFail.getFrame().dispatchEvent(new WindowEvent(GUIFail.getFrame(), WindowEvent.WINDOW_CLOSING));

		
	}
}
