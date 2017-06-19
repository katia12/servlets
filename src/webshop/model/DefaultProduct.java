package webshop.model;

public class DefaultProduct extends Product {
	
	private String naam;
	private int prijs;
	private String imageURL;
	private int eenheid;

	public DefaultProduct(String naam, int prijspereenheid, String imageUrl, int eenheid) {
		super(naam, prijspereenheid, imageUrl);

		this.naam = naam;
		this.prijs = prijspereenheid;
		this.imageURL = imageUrl;
		this.eenheid = eenheid;
	}

	public DefaultProduct(String naam, int prijspereenheid, String imageUrl) {
		this(naam, prijspereenheid, imageUrl, 0);
	}
	
	public String getNaam() {
		return naam;
	}

	@Override
	public int getPrijs() {
		return prijs;
	}
	
	public int getPrijs(int hoeveelheid) {
		return prijs * hoeveelheid;
	}
	
	public int getEenheid() {
		return eenheid;
	}
	
	public String getImageURL() {
		return imageURL;
	}
	
	public String getEenheidNaam() {
		String eenheidNaam = "";
		
		switch (eenheid) {
		case Product.stuks:
			eenheidNaam = "stuks";
			break;
		case Product.gram:
			eenheidNaam = "gram";
			break;
		case Product.kilo:
			eenheidNaam = "kilo";
			break;
		case Product.liters:
			eenheidNaam = "liters";
			break;
		case Product.stuk:
			eenheidNaam = "stuk";
			break;
		case Product.pak:
			eenheidNaam = "pak";
			break;
		default:
			eenheidNaam = "stuks";
			break;
		}
		
		return eenheidNaam;
	}

	@Override
	public String toString() {
		return "Naam: " + naam + "\nPrijs: " + prijs + "\nEenheid: " + eenheid;
	}

}
