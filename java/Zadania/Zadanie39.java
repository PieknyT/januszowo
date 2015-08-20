package Zadania;
import java.util.*;
public class Zadanie39 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double liczbaOsob, liczbaDzieci, liczbaDni, kosztHotelD, kosztPrzewodnik;
		
		System.out.println("Liczba osób jadacych na wycieczke: ");
		liczbaOsob = sc.nextDouble();
		System.out.println("                     w tym dzieci: ");
		liczbaDzieci = sc.nextDouble();
		System.out.println("     Liczba dni trwania wycieczki: ");
		liczbaDni = sc.nextDouble();
		System.out.println("      Koszt jednej doby hotelowej: ");
		kosztHotelD = sc.nextDouble();
		System.out.println("  Koszt dot. przewodnika(1 dzieñ): ");
		kosztPrzewodnik = sc.nextDouble();
		
		System.out.println("--------------------------------------------"+
	                       '\n'+ "    Koszty: "+
	                       '\n'+"--> za nocleg osob doroslych: "+ ((liczbaOsob-liczbaDzieci)*(liczbaDni-1)*kosztHotelD)+
	                       '\n'+"--> za nocleg dzieci: "+ ((liczbaDzieci*0.7*kosztHotelD)*(liczbaDni-1))+
	                       '\n'+"--> zw. z przewodnikiem: "+ ((kosztPrzewodnik)*(liczbaDni-2))+
	                       '\n'+"--------------------------------------------"+
	                       '\n'+"LACZNY KOSZT:" + (((liczbaOsob-liczbaDzieci)*(liczbaDni-1)*kosztHotelD)+
	                                              (liczbaDzieci*0.7*kosztHotelD)*(liczbaDni-1)+
	                                              (kosztPrzewodnik)*(liczbaDni-2))
	                       
	);
	
		
		
	}

}
