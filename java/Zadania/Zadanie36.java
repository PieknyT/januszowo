package Zadania;
import java.util.*;
public class Zadanie36 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String imie, nazwisko, ulica, nrDomu, nrMieszkania, kod, miasto;
		
		System.out.println("Podaj imié adresata: ");
		imie= sc.next();
		System.out.println("Podaj nazwisko adresata: ");
		nazwisko = sc.next();
		System.out.println("Podaj ulicé: ");
		ulica= sc.next();
		System.out.println("Podaj numer domu: ");
		nrDomu = sc.next();
		System.out.println("Podaj numer mieszkania: ");
		nrMieszkania = sc.next();
		System.out.println("Podaj kod pocztowy: ");
		kod = sc.next();
		System.out.println("Podaj miejscowosc: ");
		miasto= sc.next();
		
		System.out.println("-------------------------------------------"
				            +'\n'+"  NADAWCA:"
				            +'\n'+ "  Jan Kowalski"
				            +'\n'+ "  ul. Kosciuszki 51/21"
				            +'\n'+ "  32-017 Pcim"
				            +'\n'+'\t'+'\t'+'\t'+ "Sz. P."
				            +'\n'+'\t'+'\t'+'\t'+'\t'+ imie+" "+nazwisko
				            +'\n'+'\t'+'\t'+'\t'+'\t'+"ul."+ ulica+" "+nrDomu+"/"+nrMieszkania
				            +'\n'+'\t'+'\t'+'\t'+'\t'+ kod+" "+ miasto
				            
				            );
		
		
		
		
		
		
		
	}

}


