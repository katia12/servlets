package webshop.model;

public abstract class Product {

	protected static final int stuks = 0;
	protected static final int gram = 1;
	protected static final int kilo = 2;
	protected static final int liters = 3;
	protected static final int stuk = 4;
	protected static final int pak = 5;

	public Product(String naam, int prijspereenheid, String imageUrl, int eenheid) {}
	public Product(String naam, int prijspereenheid, String imageUrl) {}
	public abstract int getPrijs();
	public abstract String toString();
	
}
