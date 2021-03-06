package postac;

public class Atrybut {
	public Atrybut(String nazwa) {
		this.Nazwa = nazwa;
	}
	
	String Nazwa;
	double ZmiennaRasowa = 1;
	int Poziom = 1;
	int Doświadczenie = 0;
	int DoświadczenieDoAwansu; 
	
	protected int ObliczDdA() {
		double DDA = Poziom * 10 / ZmiennaRasowa;
		DoświadczenieDoAwansu = (int) DDA;
		return DoświadczenieDoAwansu; 
	}
	{
		ObliczDdA();
	}	
	
	public void wypisz() {
		System.out.println("Nazwa: " + Nazwa);
		System.out.println("Poziom: " + Poziom);
		System.out.println("Exp: " + Doświadczenie);
		System.out.println("DoświadczenieDoAwansu: " + DoświadczenieDoAwansu);
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
	
	protected int DodajDoświadczenie(int i) {
		Doświadczenie += i;
		while (Doświadczenie >= DoświadczenieDoAwansu ) {
			Awans();
			Doświadczenie -= DoświadczenieDoAwansu;
			ObliczDdA();
		}
		return Doświadczenie;
	}
}