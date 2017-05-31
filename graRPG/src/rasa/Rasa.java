package rasa;

import postac.Istota;

public abstract class Rasa implements Istota {
	protected Istota Postaæ;
	public Rasa(Istota postaæ) {
		this.Postaæ = postaæ;
	}
	
	public void Staty() {
		Postaæ.Staty();
	}
	
	@Override
	public void setZmiennaBudowy(double d) {
				
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
	public void zwiêkszDoœwiadczenieAtrybutu(String s, int i){
		Postaæ.zwiêkszDoœwiadczenieAtrybutu(s, i);
	}
	
	public void Okrzyk() {
		
	}
}
