package rasa;

import postac.Istota;

public abstract class Rasa implements Istota {
	protected Istota Postać;
	public Rasa(Istota postać) {
		this.Postać = postać;
	}
	
	public void Staty() {
		Postać.Staty();
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
	public void zwiększDoświadczenieAtrybutu(String s, int i){
		Postać.zwiększDoświadczenieAtrybutu(s, i);
	}
	
	public void Okrzyk() {
		
	}
}
