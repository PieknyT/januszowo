public class ZnizkaBilet {
	public static void main(String[] args){
		int cena=100, wiekStudent=23;
		double sredniaOcen=4.5;
		
		if (wiekStudent>26){
			if(sredniaOcen>4.5)
				cena-=30;
	     	}
		else
			cena-=20;
		System.out.println(cena);
		
		}

}
