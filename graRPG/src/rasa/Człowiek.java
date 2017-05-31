package rasa;

import postac.Istota;

public class Cz³owiek extends Rasa {
	public Cz³owiek(Istota postaæ) {
		super(postaæ);
	}
	
	{
		Postaæ.setZmiennaBudowy(2);
		Postaæ.setZmiennaKondycji(2);
		Postaæ.setZmiennaSily(2);
		Postaæ.setZmiennaZwinnosci(2);
		Postaæ.setZmiennaZrecznosci(2);
		Postaæ.setZmiennaHartu(2);
		Postaæ.setZmiennaUmyslu(2);
		
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Budowa", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Kondycja", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Si³a", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Zwinnoœæ", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Zrêcznoœæ", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Hart", 0);
		Postaæ.zwiêkszDoœwiadczenieAtrybutu("Umys³", 0);
	}

	public static void Bekaæ() {
		System.out.println("Bek");
	}
	
}
