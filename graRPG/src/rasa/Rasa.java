package rasa;

import postac.Istota;

public abstract class Rasa implements Istota {
	protected Istota Posta�;
	public Rasa(Istota posta�) {
		this.Posta� = posta�;
	}
	
	public void Staty() {
		Posta�.Staty();
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
	public void zwi�kszDo�wiadczenieAtrybutu(String s, int i){
		Posta�.zwi�kszDo�wiadczenieAtrybutu(s, i);
	}
	
	public void Okrzyk() {
		
	}
}
