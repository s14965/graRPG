package rasa;

import postac.Istota;

public class Człowiek extends Rasa {
	public Człowiek(Istota postać) {
		super(postać);
	}
	
	{
		Postać.setZmiennaBudowy(2);
		Postać.setZmiennaKondycji(2);
		Postać.setZmiennaSily(2);
		Postać.setZmiennaZwinnosci(2);
		Postać.setZmiennaZrecznosci(2);
		Postać.setZmiennaHartu(2);
		Postać.setZmiennaUmyslu(2);
		
		Postać.zwiększDoświadczenieAtrybutu("Budowa", 0);
		Postać.zwiększDoświadczenieAtrybutu("Kondycja", 0);
		Postać.zwiększDoświadczenieAtrybutu("Siła", 0);
		Postać.zwiększDoświadczenieAtrybutu("Zwinność", 0);
		Postać.zwiększDoświadczenieAtrybutu("Zręczność", 0);
		Postać.zwiększDoświadczenieAtrybutu("Hart", 0);
		Postać.zwiększDoświadczenieAtrybutu("Umysł", 0);
	}

	public static void Bekać() {
		System.out.println("Bek");
	}
	
}
