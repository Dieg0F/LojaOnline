package br.edu.univas.si4.tp4.lojaonline.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.edu.univas.si4.tp4.lojaonline.controller.SearchController;

public class MainFrame extends JFrame{

	
	private static final long serialVersionUID = 5744386447340480536L;
	
	private SearchController controller;	
	
	private JTextField searchField;
	private JButton searchButton;
	
	
	public MainFrame(SearchController controller)
	{
		super("Main Window");
		this.controller = controller;
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize(); 
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initialize() {
		setLayout(new FlowLayout());
		
		add(getSearchField());
		add(getSearchButtom());
	}

	private JTextField getSearchField()
	{
		if(searchField == null){
			searchField = new JTextField();
			searchField.setColumns(20);
		}
		return searchField;		
	}
	
	private JButton getSearchButtom()
	{
		if(searchButton == null){
			searchButton = new JButton();
			searchButton.setText("Search");
		}
		return searchButton;		
	}
	
	private void searchClicked()
	{
		
	}
	
	
}
