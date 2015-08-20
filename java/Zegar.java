
public class Zegar {
	public static void main(String[] args){
		int godzina=19;
		int kolejnaGsys24=(godzina+1)%24;
		int kolejnaGsys12=(godzina+1)%12;
		System.out.println(kolejnaGsys24);
		System.out.println(kolejnaGsys12);
	}

}
