package postac;

public class Zasób {
	public Zasób(Atrybut a) {
		this.G³ówny = a.getMoc();
		this.MaxIloœæZasobu = G³ówny * 10;
	}
	public Zasób(Atrybut a, Atrybut b) {
		this.G³ówny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.MaxIloœæZasobu = Mnó¿(G³ówny, 10) + Mnó¿(Dodatkowy1,5);
	}
	public Zasób(Atrybut a, Atrybut b, Atrybut c) {
		this.G³ówny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.Dodatkowy2 = c.getMoc();
		this.MaxIloœæZasobu = Mnó¿(G³ówny, 10) + Mnó¿(Dodatkowy1,5) + Mnó¿(Dodatkowy2,5);
	}
	public Zasób(Atrybut a, Atrybut b, Atrybut c, Atrybut d) {
		this.G³ówny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.Dodatkowy2 = c.getMoc();
		this.Dodatkowy3 = d.getMoc();
		this.MaxIloœæZasobu = Mnó¿(G³ówny, 10) + Mnó¿(Dodatkowy1,5) + Mnó¿(Dodatkowy2,5) + Mnó¿(Dodatkowy2,5);
	}
	public Zasób(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e) {
		
	}
	public Zasób(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e, Atrybut f) {
		
	}
	public Zasób(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e, Atrybut f, Atrybut g) {
		
	}
	
	private int Mnó¿(int i, int j) {
		return i * j;
	}
	int MaxIloœæZasobu;
	int ObecnaIloœæZasobu;
	int G³ówny;
	int Dodatkowy1;
	int Dodatkowy2;
	int Dodatkowy3;
	int Dodatkowy4;
	int Dodatkowy5;
	int Dodatkowy6;
	protected int getMaxIloœæZasobu() {
		return MaxIloœæZasobu;
	}
	
	protected int Przelicz_2(Atrybut a, Atrybut b) {
		this.G³ówny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.MaxIloœæZasobu = Mnó¿(G³ówny, 10) + Mnó¿(Dodatkowy1,5);
		return MaxIloœæZasobu;
	}
	
}
