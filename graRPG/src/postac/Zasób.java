package postac;

public class Zas�b {
	public Zas�b(Atrybut a) {
		this.G��wny = a.getMoc();
		this.MaxIlo��Zasobu = G��wny * 10;
	}
	public Zas�b(Atrybut a, Atrybut b) {
		this.G��wny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.MaxIlo��Zasobu = Mn�(G��wny, 10) + Mn�(Dodatkowy1,5);
	}
	public Zas�b(Atrybut a, Atrybut b, Atrybut c) {
		this.G��wny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.Dodatkowy2 = c.getMoc();
		this.MaxIlo��Zasobu = Mn�(G��wny, 10) + Mn�(Dodatkowy1,5) + Mn�(Dodatkowy2,5);
	}
	public Zas�b(Atrybut a, Atrybut b, Atrybut c, Atrybut d) {
		this.G��wny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.Dodatkowy2 = c.getMoc();
		this.Dodatkowy3 = d.getMoc();
		this.MaxIlo��Zasobu = Mn�(G��wny, 10) + Mn�(Dodatkowy1,5) + Mn�(Dodatkowy2,5) + Mn�(Dodatkowy2,5);
	}
	public Zas�b(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e) {
		
	}
	public Zas�b(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e, Atrybut f) {
		
	}
	public Zas�b(Atrybut a, Atrybut b, Atrybut c, Atrybut d, Atrybut e, Atrybut f, Atrybut g) {
		
	}
	
	private int Mn�(int i, int j) {
		return i * j;
	}
	int MaxIlo��Zasobu;
	int ObecnaIlo��Zasobu;
	int G��wny;
	int Dodatkowy1;
	int Dodatkowy2;
	int Dodatkowy3;
	int Dodatkowy4;
	int Dodatkowy5;
	int Dodatkowy6;
	protected int getMaxIlo��Zasobu() {
		return MaxIlo��Zasobu;
	}
	
	protected int Przelicz_2(Atrybut a, Atrybut b) {
		this.G��wny = a.getMoc();
		this.Dodatkowy1 = b.getMoc();
		this.MaxIlo��Zasobu = Mn�(G��wny, 10) + Mn�(Dodatkowy1,5);
		return MaxIlo��Zasobu;
	}
	
}
