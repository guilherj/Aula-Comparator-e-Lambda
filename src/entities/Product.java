package entities;

public class Product{
	
	// AGORA IREI COMPARAR OS OBJETOS UTILIZANDO O DEFAULT METHODS "SORT" DA PROPRIA LIST EM PROGRAM,
	// E DESSA FORMA A CLASSE PRODUCT FICAR? FECHADA POIS O CRIT?RIO DE COMPARA??O N?O FICA MAIS PRESO A MESMA.
	
	private String name;
	private Double price;
	
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
		
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}


		
	
	

}
