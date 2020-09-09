package DDLCalendarFinal;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIFail {

	private static JFrame frame;
	private JPanel panel;
	private JButton done;
	private JLabel fail;
	
	public GUIFail() {
		
		panel = new JPanel();
		
		setFrame(new JFrame());
		getFrame().setSize(375,200);
		getFrame().setTitle("Error");
		
		getFrame().setDefaultCloseOperation(3);

		panel.setLayout(null);
		getFrame().add(panel);
		
		fail = new JLabel("You do not have access to 'HS Schedule for Students'");
		panel.add(fail);
		fail.setBounds(22, 40, 400, 50);
		fail.setFont(new Font("TimesRoman", Font.PLAIN, 15));

		
		done = new JButton("Done");
		done.setBounds(150, 100, 80, 25);
		panel.add(done);
		done.addActionListener(new DoneButton());

		
		getFrame().setVisible(true);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		GUIFail.frame = frame;
	}
	

}
