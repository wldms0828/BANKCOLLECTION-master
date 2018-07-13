package view;


import javax.swing.*;


public class CreateLabel {
	JLabel idLab;
	JPanel idPane;
	public void create() {
		idLab = new JLabel("ID", JLabel.CENTER);
		idPane = new JPanel();
		idPane.add(idLab);
		
	}
}
	

