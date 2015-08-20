import java.util.Scanner;

public class Zadanie46 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê: ");
		double a = sc.nextDouble();
		System.out.println("Podaj druga liczbê: ");
		double b = sc.nextDouble();
	
	
			System.out.println("Iloraz podanych liczb wynosi: " + (a/b));  
			
//Dzielenie prze zero w typie double jest dzieleniem prze bardzo ma³¹ liczbe dlatego wynik to nieskoñczonoœæ

    }
}