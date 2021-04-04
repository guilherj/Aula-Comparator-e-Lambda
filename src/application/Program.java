package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		/* CRIANDO UMA INSTANCIA DA CLASSE MyComparator PARA COMPARAR OS OBJETOS DO TIPO PRODUCT
		 * E ORGANIZANDO A LIST COM O DEFAULT METHODS "SORT" DA PROPRIA LIST */
		list.sort(new MyComparator()); 
		
		// PARA ESSE METODO FUNCIONAR DEVE-SE CRIAR UMA CLASSE QUE IMPLEMENTA A INFERFACE COMPARATOR 
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
