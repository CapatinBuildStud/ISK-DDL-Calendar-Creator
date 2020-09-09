package DDLCalendarFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class CalenderButtonAction implements ActionListener {

	private static String[] classes = new String[8];

	@Override
	public void actionPerformed(ActionEvent e) {

		classes[0] = GUI.getClass1Name().getText();
		classes[1] = GUI.getClass2Name().getText();
		classes[2] = GUI.getClass3Name().getText();
		classes[3] = GUI.getClass4Name().getText();
		classes[4] = GUI.getClass5Name().getText();
		classes[5] = GUI.getClass6Name().getText();
		classes[6] = GUI.getClass7Name().getText();
		classes[7] = GUI.getClass8Name().getText();

		GUI.getFrame().dispose();

		try {
			EventCreator maker = new EventCreator(classes, HSschedualList.serviceCalendar());
			maker.classEvents(HSschedualList.getHSSchedual());
		} catch (IOException e1) {
			System.out.println("Caught" + e1);
			e1.printStackTrace();
		} catch (GeneralSecurityException e1) {
			System.out.println("Caught" + e1);
			e1.printStackTrace();
		}

	}			


}
