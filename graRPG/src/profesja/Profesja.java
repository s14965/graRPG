package profesja;

import postac.Istota;
import rasa.Rasa;

public abstract class Profesja implements Istota {
	protected Istota Postać;
	public Profesja(Istota postać) {
		this.Postać = postać;
	}
	public void Staty() {
		Postać.Staty();
	}
	
	@Override
	public void setZmiennaBudowy(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaKondycji(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaSily(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaZwinnosci(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaZrecznosci(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaHartu(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setZmiennaUmyslu(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zwiększDoświadczenieAtrybutu(String s, int i) {
		// TODO Auto-generated method stub
		
	}
}
