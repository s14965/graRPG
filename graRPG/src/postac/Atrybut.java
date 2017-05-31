package postac;

public class Atrybut {
	public Atrybut(String nazwa) {
		this.Nazwa = nazwa;
	}
	
	String Nazwa;
	double ZmiennaRasowa = 1;
	int Poziom = 1;
	int Do�wiadczenie = 0;
	int Do�wiadczenieDoAwansu; 
	
	protected int ObliczDdA() {
		double DDA = Poziom * 10 / ZmiennaRasowa;
		Do�wiadczenieDoAwansu = (int) DDA;
		return Do�wiadczenieDoAwansu; 
	}
	{
		ObliczDdA();
	}	
	
	public void wypisz() {
		System.out.println("Nazwa: " + Nazwa);
		System.out.println("Poziom: " + Poziom);
		System.out.println("Exp: " + Do�wiadczenie);
		System.out.println("Do�wiadczenieDoAwansu: " + Do�wiadczenieDoAwansu);
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
	
	protected int DodajDo�wiadczenie(int i) {
		Do�wiadczenie += i;
		while (Do�wiadczenie >= Do�wiadczenieDoAwansu ) {
			Awans();
			Do�wiadczenie -= Do�wiadczenieDoAwansu;
			ObliczDdA();
		}
		return Do�wiadczenie;
	}
}