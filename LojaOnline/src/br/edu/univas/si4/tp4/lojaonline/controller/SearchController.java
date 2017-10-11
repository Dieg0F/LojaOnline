package br.edu.univas.si4.tp4.lojaonline.controller;

import br.edu.univas.si4.tp4.lojaonline.model.ProductDAO;
import br.edu.univas.si4.tp4.lojaonline.view.ListProductFrame;
import br.edu.univas.si4.tp4.lojaonline.view.MainFrame;

public class SearchController {
	
	private MainFrame mainFrame;
	private ListProductFrame listProductsFrame;
	private ProductDAO productDAO;
	
	public SearchController()
	{
		mainFrame = new MainFrame(this);
		listProductsFrame = new ListProductFrame(this);
		productDAO = new ProductDAO();
	}
	
	public void search(String productName){
				
	}
	
	public void initialize(){
		mainFrame.setVisible(true);		
	}
	
	
	
	
	
}
