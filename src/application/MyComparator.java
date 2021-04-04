package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator <Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	/*COMPARANDO O OBJETO P1 COM O OBJETO P2 PELO NOME, INDEPENDENTE DAS LETRAS MAISUCULAS OU MINUSCULAS
	 * COLOCANDO TODAS AS LETRAS EM MAIUSCULAS COM O toUpperCase. 
	 */

}
