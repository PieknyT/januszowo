package Zadania;
import java.util.*;

public class Zadanie40 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double  m1 ,m2, m3, m4, m5, sumaMetrazow, kosztOgrz;
		
		System.out.println("Podaj metraz pierwszego mieszkania: ");
		m1 = sc.nextDouble();
		System.out.println("Podaj metraz drugiego mieszkania: ");
		m2 = sc.nextDouble();
		System.out.println("Podaj metraz trzeciego mieszkania: ");
		m3 = sc.nextDouble();
		System.out.println("Podaj metraz czwartego mieszkania: ");
		m4 = sc.nextDouble();
		System.out.println("Podaj metraz piatego mieszkania: ");
		m5 = sc.nextDouble();
		System.out.println("Podaj koszt ogrzania budynku: ");
		kosztOgrz = sc.nextDouble();
		sumaMetrazow = m1+m2+m3+m4+m5;
		
		System.out.println("Lokator pierwszego mieszkania placi: "+ kosztOgrz/sumaMetrazow*m1+
				           '\n'+"Lokator drugiego mieszkania placi: "+ kosztOgrz/sumaMetrazow*m2+
				           '\n'+"Lokator trzeciego mieszkania placi: "+ kosztOgrz/sumaMetrazow*m3+
			               '\n'+"Lokator czwartego mieszkania placi: "+ kosztOgrz/sumaMetrazow*m4+
				           '\n'+"Lokator piatego mieszkania placi: "+ kosztOgrz/sumaMetrazow*m5
				
				
				);
		
		
	}

}
