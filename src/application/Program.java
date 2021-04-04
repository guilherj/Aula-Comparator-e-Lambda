package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// ORDENANDO A LISTA COM O COLLECTIONS.SORT
		// PORÉM CASO O CRITERIO DE COMPARAÇÃO MUDE É 
		// NECESSÁRIO MEXER DENTRO DA CLASSE PRODUCT, ISSO EM TERMOS DE
		// MANUTENÇÕES É INDESEJÁVEL.
		
		Collections.sort(list);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
