package br.edu.univas.si4.tp4.lojaonline.view;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import br.edu.univas.si4.tp4.lojaonline.controller.SearchController;
import br.edu.univas.si4.tp4.lojaonline.model.Product;

public class ListProductFrame extends JFrame {

	private static final long serialVersionUID = 7630569269345975353L;
	
	private SearchController controller;

	private JScrollPane listProductsScrollPane;
	private JList<Product> listProductList;
	
	private DefaultListModel<Product> listProductslistModel;
	
	public ListProductFrame(SearchController controller) {

		this.controller = controller;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private JScrollPane getListProductsScrollPane() {
		if(listProductsScrollPane == null)
		{
			listProductsScrollPane = new JScrollPane();			
			listProductsScrollPane.setViewportView(getListProductList());
			listProductsScrollPane.setPreferredSize(new Dimension(300, 200));
		}
		return listProductsScrollPane;
	}

	private JList<Product> getListProductList() {
		if(listProductList == null)
		{
			listProductList = new JList<>();			
		}
		return listProductList;
	}

	private DefaultListModel<Product> getDefaultModel() {
		if(listProductslistModel == null)
		{
			listProductslistModel = new DefaultListModel<Product>();			
		}
		return listProductslistModel;
	}
	
	private void initialize() {
		// TODO Auto-generated method stub
		add(getListProductsScrollPane());
	}

	public void populateList(ArrayList<Product> products)
	{		
		for(Product product : products)
		{
			
			
		}
	}
}
