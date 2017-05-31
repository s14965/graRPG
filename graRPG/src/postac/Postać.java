package postac;

public class Postaæ implements Istota {
	 	
		Atrybut atrybut1 = new Atrybut("Budowa");
		Atrybut atrybut2 = new Atrybut("Kondycja");
		Atrybut atrybut3 = new Atrybut("Si³a");
		Atrybut atrybut4 = new Atrybut("Zwinnoœæ");
		Atrybut atrybut5 = new Atrybut("Zrêcznoœæ");
		Atrybut atrybut6 = new Atrybut("Hart");
		Atrybut atrybut7 = new Atrybut("Umys³");
	
		Zasób ¯ycie = new Zasób(atrybut1,atrybut2);
	
	public void Staty() {
	
		System.out.println("Moje statystyki");
		System.out.println("");
		System.out.println("¯ycie: " + ¯ycie.getMaxIloœæZasobu());
		System.out.println("");
		atrybut1.wypisz();
		System.out.println("");
		atrybut2.wypisz();
		System.out.println("");
		atrybut3.wypisz();
		System.out.println("");
		atrybut4.wypisz();
		System.out.println("");
		atrybut5.wypisz();
		System.out.println("");
		atrybut6.wypisz();
		System.out.println("");
		atrybut7.wypisz();
		System.out.println("");;
	}

	public void setZmiennaBudowy(double zmiennaBudowy) {
		atrybut1.setZmiennaRasowa(zmiennaBudowy);
		atrybut1.ObliczDdA();
	}
	public void setZmiennaKondycji(double zmiennaKondycji) {
		atrybut2.setZmiennaRasowa(zmiennaKondycji);
		atrybut2.ObliczDdA();
	}
	public void setZmiennaSily(double zmiennaSily) {
		atrybut3.setZmiennaRasowa(zmiennaSily);
		atrybut3.ObliczDdA();
	}
	public void setZmiennaZwinnosci(double zmiennaZwinnosci) {
		atrybut4.setZmiennaRasowa(zmiennaZwinnosci);
		atrybut4.ObliczDdA();
	}
	public void setZmiennaZrecznosci(double zmiennaZrecznosci) {
		atrybut5.setZmiennaRasowa(zmiennaZrecznosci);
		atrybut5.ObliczDdA();
	}
	public void setZmiennaHartu(double zmiennaHartu) {
		atrybut6.setZmiennaRasowa(zmiennaHartu);
		atrybut6.ObliczDdA();
	}
	public void setZmiennaUmyslu(double zmiennaUmyslu) {
		atrybut7.setZmiennaRasowa(zmiennaUmyslu);
		atrybut7.ObliczDdA();
	}
	
	public void zwiêkszDoœwiadczenieAtrybutu(String s, int i) {
		switch(s){
		case "Budowa":{
			atrybut1.DodajDoœwiadczenie(i);
			¯ycie.Przelicz_2(atrybut1, atrybut2);
			break;
		}
		case "Kondycja":{
			atrybut2.DodajDoœwiadczenie(i);
			¯ycie.Przelicz_2(atrybut1, atrybut2);
			break;
		}
		case "Si³a":{
			atrybut3.DodajDoœwiadczenie(i);
			break;
		}
		case "Zwinnoœæ":{
			atrybut4.DodajDoœwiadczenie(i);
			break;
		}
		case "Zrêcznoœæ":{
			atrybut5.DodajDoœwiadczenie(i);
			break;
		}
		case "Hart":{
			atrybut6.DodajDoœwiadczenie(i);
			break;
		}
		case "Umys³":{
			atrybut7.DodajDoœwiadczenie(i);
			break;
		}
		default:	
			break;
		}
	}

}
