package Gerenciador_insumos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu implements ActionListener {
	private JFrame mainFrame;
	private JButton setupButton;
	private JButton playButton;
	private JButton pauseButton;
	private JButton optionsButton;
	private JButton describeButton;
	private JButton teardownButton;
	private JTextField textField;

	// Panel to place our push buttons
	private JPanel buttonPanel;

	// Panel to place our text field panel
	private JPanel textPanel;

	// Panel to place all of our objects in one
	private JPanel mainPanel;

	// Our Controller Object
	private Controller controller;

	private String hostName;
	private int portNumber;
	private String videoFile;
	
	public Menu() {
		mainFrame = new JFrame("RTSP Test");

		setupButton = new JButton("Setup");
		playButton = new JButton("Play");
		pauseButton = new JButton("Pause");
		optionsButton = new JButton("Options");
		describeButton = new JButton("Describe");
		teardownButton = new JButton("Teardown");
		textField = new JTextField("rtsp://192.168.27.108:2223/teste.ts");

		buttonPanel = new JPanel();
		textPanel = new JPanel();
		mainPanel = new JPanel();

		// Set up buttons
		buttonPanel.setLayout(new GridLayout(1,0));
		buttonPanel.add(describeButton);
		buttonPanel.add(optionsButton);
		buttonPanel.add(setupButton);
		buttonPanel.add(playButton);
		buttonPanel.add(pauseButton);
		buttonPanel.add(teardownButton);

		setupButton.addActionListener(this);
		playButton.addActionListener(this);
		pauseButton.addActionListener(this);
		optionsButton.addActionListener(this);
		describeButton.addActionListener(this);
		teardownButton.addActionListener(this);
		textField.addActionListener(this);

		// Set up text field
		textPanel.setLayout(new GridLayout(1,0));
		textPanel.add(textField);

		// Set main panel
		mainPanel.setLayout(null);
		mainPanel.add(textPanel);
		mainPanel.add(buttonPanel);
		textPanel.setBounds(0, 0, 450, 25);
		buttonPanel.setBounds(0, 25, 450, 50);

		// Add listener so that we quit we close the window
	    mainFrame.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	        	// Teardown the connection when we close the window
//	        	if (rtspControl != null) {
//	        		rtspControl.RTSPTeardown();
//	        		rtspControl.resetParameters(); // Just in case
//	        	}
	        	System.exit(0);
	        }
	     });

		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Menu();
	}
	
	

}
