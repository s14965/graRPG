package rasa;

import postac.Istota;

public class Ork extends Rasa {
	public Ork(Istota posta�) {
		super(posta�);
	}
	
	{
		Posta�.setZmiennaBudowy(2);
		Posta�.setZmiennaKondycji(2);
		Posta�.setZmiennaSily(2);
		Posta�.setZmiennaZwinnosci(2.0);
		Posta�.setZmiennaZrecznosci(2.0);
		Posta�.setZmiennaHartu(2.0);
		Posta�.setZmiennaUmyslu(2.0);
	}
	public void Beka�() {
		System.out.println("Beee");
	}
}
