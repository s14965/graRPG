package test;

import postac.Istota;
import postac.Posta�;
import rasa.Cz�owiek;
import rasa.Ork;
import rasa.Rasa;
import profesja.Wojownik;
import profesja.Zab�jca;
import profesja.Mag;

public class Test {
	public static void main(String[] args) {
		
		Istota Avatar = new Posta�();
		System.out.println(Avatar.getClass());
		Avatar = new Cz�owiek(Avatar);
		System.out.println(Avatar.getClass());
		Avatar.Beka�();
		
		
	}
}