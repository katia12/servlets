package webshop.model;

public class Beperkt extends DefaultProduct {

	public Beperkt(String naam, int prijspereenheid, String imageUrl, int eenheid) {
		super(naam, prijspereenheid, imageUrl, eenheid);
	}

	public Beperkt(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}

}
