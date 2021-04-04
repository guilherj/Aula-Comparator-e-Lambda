package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/* CRIANDO UMA SINTAXE DE CLASSE ANÔNIMA DENTRO DE PROGRAM 
		 * PARA ORGANIZAR A LIST DE PRODUCT SEM CRIAR UMA CLASSE QUE IMPLEMENTA
		 * A INTERFACE COMPARATOR
		 */
		Comparator <Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		// CHAMANDO O OBJETO comp QUE É UMA INSTANCIA DA CLASSE ANÔNIMA E QUE TEM A FUNÇÃO 
		// COMPARE IMPLEMENTADA.
		list.sort(comp);

				
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
