import java.util.*;
public class Zadanie47 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int nrPola1, nrPola2, kwota1, kwota2;
		
		System.out.println("Podaj numer pierwszego pola kt�re chcesz obstawi�:");
		nrPola1 = sc.nextInt();
		System.out.println("Podaj kwot� za jak� chesz obstawi�: ");
		kwota1 = sc.nextInt();
		System.out.println("Podaj numer drugiego pola kt�re chcesz obstawi�:");
		nrPola2 = sc.nextInt();
		System.out.println("Podaj kwot� za jak� chesz obstawi�: ");
		kwota2 = sc.nextInt();
		
	
		
		if(nrPola1!=0)
			if(nrPola1%2==0)
				System.out.println("Obstawione "+ kwota1 +" zl pole jest czerwone");
			else
				System.out.println("Obstawione "+ kwota1 +" zl pole jest czarne");
		else 
			System.out.println("Obstawione "+ kwota1 +" zl pole jest zielone");
		
		if(nrPola2!=0)
			if(nrPola2%2==0)
				System.out.println("Obstawione za "+ kwota2 +" zl pole jest czerwone");
			else
				System.out.println("Obstawione za "+ kwota2 +" zl pole jest czarne");
		else 
			System.out.println("Obstawione za "+ kwota2 +" zl pole jest zielone");
		
		if(kwota1==kwota2)
			System.out.println("Stawki na obu polach s� r�wne");
		else
			if(kwota1>kwota2)
				System.out.println("Stawka na polu " + nrPola1+ " jest wi�ksza od skawki na polu " + nrPola2);
			else
				System.out.println("Stawka na polu " + nrPola1+ " jest mniejsza od skawki na polu " + nrPola2);
	}

}
