package postac;

public class Atrybut {
	public Atrybut(String nazwa) {
		this.Nazwa = nazwa;
	}
	
	String Nazwa;
	double ZmiennaRasowa = 1;
	int Poziom = 1;
	int Doœwiadczenie = 0;
	int DoœwiadczenieDoAwansu; 
	
	protected int ObliczDdA() {
		double DDA = Poziom * 10 / ZmiennaRasowa;
		DoœwiadczenieDoAwansu = (int) DDA;
		return DoœwiadczenieDoAwansu; 
	}
	{
		ObliczDdA();
	}	
	
	public void wypisz() {
		System.out.println("Nazwa: " + Nazwa);
		System.out.println("Poziom: " + Poziom);
		System.out.println("Exp: " + Doœwiadczenie);
		System.out.println("DoœwiadczenieDoAwansu: " + DoœwiadczenieDoAwansu);
	}
	public int getMoc() {
		return Poziom;
	}
	protected void setZmiennaRasowa(double zmiennaRasowa) {
		ZmiennaRasowa = zmiennaRasowa;
	}
	private int Awans() {
		return ++Poziom;
	}
	
	protected int DodajDoœwiadczenie(int i) {
		Doœwiadczenie += i;
		while (Doœwiadczenie >= DoœwiadczenieDoAwansu ) {
			Awans();
			Doœwiadczenie -= DoœwiadczenieDoAwansu;
			ObliczDdA();
		}
		return Doœwiadczenie;
	}
}