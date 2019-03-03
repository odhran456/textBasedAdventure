import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class gameGUI{
	
	JFrame window;
	Container con;
	JPanel titleNamePanel,startButtonPanel,mainTextPanel,choiceButtonPanel,playerPanel;
	JLabel titleNameLabel,hpLabel,hpLabelNumber,AllyHPLabel,AllyHPNumber;
	Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
	Font normalFont = new Font("Times New Roman",Font.PLAIN,30);
	JButton startButton,choice1,choice2,choice3,choice4,fight;
	JTextArea mainTextArea;
	
	titleScreenHandler tsHandler = new titleScreenHandler();
	
	public gameGUI() {
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100,100,600,150);
		titleNamePanel.setBackground(Color.black);
		
		titleNameLabel = new JLabel("Adventure");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,400,200,100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("S T A R T");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		startButtonPanel.add(startButton);
		titleNamePanel.add(titleNameLabel);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		window.setVisible(true);

	}
	
	public class titleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}
	
	public void createGameScreen(hpLabelModel health2) {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100,15,600,50);
		playerPanel.setBackground(Color.red);
		playerPanel.setLayout(new GridLayout(1,5));
		con.add(playerPanel);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100,100,600,250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text area. This game is going to be great, I'm sure of it");
		mainTextArea.setBounds(100,100,600,250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false); 
		

		
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250,350,300,150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choiceButtonPanel.add(choice1);
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choiceButtonPanel.add(choice4);
		
		hpLabel = new JLabel("HP: ");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelNumber = new JLabel();
		hpLabelNumber.setText("" + health2);
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		
		
		AllyHPLabel = new JLabel("Ally's HP: ");
		AllyHPLabel.setFont(normalFont);
		AllyHPLabel.setForeground(Color.white);
		playerPanel.add(AllyHPLabel);
		
		AllyHPNumber = new JLabel();
		AllyHPNumber.setFont(normalFont);
		AllyHPNumber.setForeground(Color.white);
		playerPanel.add(AllyHPNumber);
		
		fight = new JButton("-1 hp");
		fight.setForeground(Color.white);
		playerPanel.add(fight);
		
		
		
	}
	
	public void addSetListener(ActionListener al) {
		fight.addActionListener(al);
	}

}
