package rasa;

import postac.Istota;

public class Ork extends Rasa {
	public Ork(Istota postaæ) {
		super(postaæ);
	}
	
	{
		Postaæ.setZmiennaBudowy(2);
		Postaæ.setZmiennaKondycji(2);
		Postaæ.setZmiennaSily(2);
		Postaæ.setZmiennaZwinnosci(2.0);
		Postaæ.setZmiennaZrecznosci(2.0);
		Postaæ.setZmiennaHartu(2.0);
		Postaæ.setZmiennaUmyslu(2.0);
	}
	public void Bekaæ() {
		System.out.println("Beee");
	}
}
