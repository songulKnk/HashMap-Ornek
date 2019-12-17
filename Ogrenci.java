
public class Ogrenci {

	public Ogrenci(String isim, int ogrNo, int sinif, Cinsiyetler cinsiyet) {
		super();
		this.isim = isim;
		this.ogrNo = ogrNo;
		this.sinif = sinif;
		this.cinsiyet = cinsiyet;
	}


	String isim;
	int ogrNo;
	int sinif;

	Cinsiyetler cinsiyet;

	
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ogrNo=" + ogrNo + ", sinif=" + sinif + ", cinsiyet=" + cinsiyet + "]";
	}


	public enum Cinsiyetler {
		ERKEK ('E'),
		KIZ ('K');
		
		char value;
		Cinsiyetler(char val){
			
			value=val;
		}
		
	}
	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getOgrNo() {
		return ogrNo;
	}


	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}


	public int getSinif() {
		return sinif;
	}


	public void setSinif(int sinif) {
		this.sinif = sinif;
	}


	public Cinsiyetler getCinsiyet() {
		return cinsiyet;
	}


	public void setCinsiyet(Cinsiyetler cinsiyet) {
		this.cinsiyet = cinsiyet;
	}




}
