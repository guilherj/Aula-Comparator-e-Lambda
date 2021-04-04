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

		// COLOCANDO A EXPRESS�O LAMBDA COMO ARGUMENTO DIRETO DO METHODS SORT
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		/*
		 * O C�DIGO ACIMA � UMA IMPLEMENTA��O DA INFERFADE COMPARATOR UTILIZANDO UMA EXPRESS�O LAMBDA 
		 * E COMO A IMPLEMENTA��O DA EXPRESS�O TEM APENAS UMA LINHA
		 * PODE-SE COLOCAR A EXPRESS�O COMO ARGUMENTO DENTRO DO METODO SORT
		 * SIMPLIFICANDO AINDA MAIS O C�DIGO.  
		 */

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
