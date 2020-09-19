package DDLCalendarFinal;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	private static JFrame frame;
	private JPanel panel;
	private JLabel mainLabel;
	private String message = "Input Your 8 Classes:";
	private JLabel class1;
	private JLabel class2;
	private JLabel class3;
	private JLabel class4;
	private JLabel class5;
	private JLabel class6;
	private JLabel class7;
	private JLabel class8;
	private static JTextField class1Name;
	private static JTextField class2Name;
	private static JTextField class3Name;
	private static JTextField class4Name;
	private static JTextField class5Name;
	private static JTextField class6Name;
	private static JTextField class7Name;
	private static JTextField class8Name;
	private JButton cancel;
	private JButton createEvents;

	public GUI() {

		panel = new JPanel();

		setFrame(new JFrame());
		getFrame().setSize(400, 385);
		getFrame().setTitle("Google Calender Class Creator");
		getFrame().setDefaultCloseOperation(3);

		panel.setLayout(null);
		getFrame().add(panel);

		mainLabel = new JLabel(message);
		panel.add(mainLabel);
		mainLabel.setBounds(20, 1, 250, 50);

		class1 = new JLabel("Block 1:");
		class2 = new JLabel("Block 2:");
		class3 = new JLabel("Block 3:");
		class4 = new JLabel("Block 4:");
		class5 = new JLabel("Block 5:");
		class6 = new JLabel("Block 6:");
		class7 = new JLabel("Block 7:");
		class8 = new JLabel("Block 8:");

		class1.setBounds(50, 75, 100, 25);
		panel.add(class1);
		class2.setBounds(50, 100, 100, 25);
		panel.add(class2);
		class3.setBounds(50, 125, 100, 25);
		panel.add(class3);
		class4.setBounds(50, 150, 100, 25);
		panel.add(class4);
		class5.setBounds(50, 175, 100, 25);
		panel.add(class5);
		class6.setBounds(50, 200, 100, 25);
		panel.add(class6);
		class7.setBounds(50, 225, 100, 25);
		panel.add(class7);
		class8.setBounds(50, 250, 100, 25);
		panel.add(class8);
		mainLabel.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class1.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class2.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class3.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class4.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class5.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class6.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class7.setFont(new Font("TimesRoman", Font.PLAIN, 15));
		class8.setFont(new Font("TimesRoman", Font.PLAIN, 15));

		setClass1Name(new JTextField(20));
		getClass1Name().setBounds(125, 75, 165, 25);
		panel.add(getClass1Name());
		setClass2Name(new JTextField(10));
		getClass2Name().setBounds(125, 100, 165, 25);
		panel.add(getClass2Name());
		setClass3Name(new JTextField(10));
		getClass3Name().setBounds(125, 125, 165, 25);
		panel.add(getClass3Name());
		setClass4Name(new JTextField(10));
		getClass4Name().setBounds(125, 150, 165, 25);
		panel.add(getClass4Name());
		setClass5Name(new JTextField(10));
		getClass5Name().setBounds(125, 175, 165, 25);
		panel.add(getClass5Name());
		setClass6Name(new JTextField(10));
		getClass6Name().setBounds(125, 200, 165, 25);
		panel.add(getClass6Name());
		setClass7Name(new JTextField(10));
		getClass7Name().setBounds(125, 225, 165, 25);
		panel.add(getClass7Name());
		setClass8Name(new JTextField(10));
		getClass8Name().setBounds(125, 250, 165, 25);
		panel.add(getClass8Name());

		cancel = new JButton("Cancel");
		cancel.setBounds(75, 310, 80, 25);
		panel.add(cancel);
		createEvents = new JButton("Create Calander!");
		createEvents.setBounds(215, 310, 140, 25);
		panel.add(createEvents);
		cancel.addActionListener(new CancelButtonAction());
		createEvents.addActionListener(new CalenderButtonAction());
		
		getFrame().setVisible(true);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		GUI.frame = frame;
	}

	public static JTextField getClass1Name() {
		return class1Name;
	}

	public void setClass1Name(JTextField class1Name) {
		GUI.class1Name = class1Name;
	}

	public static JTextField getClass2Name() {
		return class2Name;
	}

	public void setClass2Name(JTextField class2Name) {
		GUI.class2Name = class2Name;
	}

	public static JTextField getClass3Name() {
		return class3Name;
	}

	public void setClass3Name(JTextField class3Name) {
		GUI.class3Name = class3Name;
	}

	public static JTextField getClass4Name() {
		return class4Name;
	}

	public void setClass4Name(JTextField class4Name) {
		GUI.class4Name = class4Name;
	}

	public static JTextField getClass5Name() {
		return class5Name;
	}

	public void setClass5Name(JTextField class5Name) {
		GUI.class5Name = class5Name;
	}

	public static JTextField getClass6Name() {
		return class6Name;
	}

	public void setClass6Name(JTextField class6Name) {
		GUI.class6Name = class6Name;
	}

	public static JTextField getClass7Name() {
		return class7Name;
	}

	public void setClass7Name(JTextField class7Name) {
		GUI.class7Name = class7Name;
	}

	public static JTextField getClass8Name() {
		return class8Name;
	}

	public void setClass8Name(JTextField class8Name) {
		GUI.class8Name = class8Name;
	}

}
