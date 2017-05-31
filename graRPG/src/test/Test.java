package test;

import postac.Istota;
import postac.Postaæ;
import rasa.Cz³owiek;
import rasa.Ork;
import rasa.Rasa;
import profesja.Wojownik;
import profesja.Zabójca;
import profesja.Mag;

public class Test {
	public static void main(String[] args) {
		
		Istota Avatar = new Postaæ();
		System.out.println(Avatar.getClass());
		Avatar = new Cz³owiek(Avatar);
		System.out.println(Avatar.getClass());
		Avatar.Bekaæ();
		
		
	}
}