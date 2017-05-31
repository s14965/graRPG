package rasa;

import postac.Istota;

public class Cz�owiek extends Rasa {
	public Cz�owiek(Istota posta�) {
		super(posta�);
	}
	
	{
		Posta�.setZmiennaBudowy(2);
		Posta�.setZmiennaKondycji(2);
		Posta�.setZmiennaSily(2);
		Posta�.setZmiennaZwinnosci(2);
		Posta�.setZmiennaZrecznosci(2);
		Posta�.setZmiennaHartu(2);
		Posta�.setZmiennaUmyslu(2);
		
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Budowa", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Kondycja", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Si�a", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Zwinno��", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Zr�czno��", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Hart", 0);
		Posta�.zwi�kszDo�wiadczenieAtrybutu("Umys�", 0);
	}

	public static void Beka�() {
		System.out.println("Bek");
	}
	
}
