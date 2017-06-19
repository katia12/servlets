package webshop.model;

public class KwantumKorting extends DefaultProduct {
	
	public KwantumKorting(String naam, int prijspereenheid, String imageUrl, int eenheid) {
		super(naam, prijspereenheid, imageUrl, eenheid);
	}

	public KwantumKorting(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}
	
	public int getPrijs(int hoeveelheid) {
		if (hoeveelheid > 4) {
			return getPrijs() - 1;
		}
		
		return getPrijs();
	}

}
