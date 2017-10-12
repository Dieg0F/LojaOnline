package br.edu.univas.si4.tp4.lojaonline.model;

import java.util.ArrayList;

public class ProductDAO {
	public ArrayList<Product> listByName(String name){		
		ArrayList<Product> result = new ArrayList<Product>();
		
		result.add(new Product("Arroz", 10));
		result.add(new Product("Feijão", 50));
		result.add(new Product("Farinha", 15));
		result.add(new Product("Macarrão", 5));
		
		
		
		
		return result;
		
	}
	
}
