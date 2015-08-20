import java.util.*;

public class Program8_3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		int liczba= sc.nextInt();
		if (liczba%5==0)
			if(liczba%2==0)
				System.out.println("Liczba podzielna przez 5 i 2");
			else
				System.out.println("Liczba podzielna przez 5 i niepodzielna przez 2");
		else
			if(liczba%2==0)
				System.out.println("Liczba niepodzielna przez 5 i podzielna prze 2 ");
			else
				System.out.println("Liczba niepodzielna przez 5 i nie podzielna przez 2 ");
	}

	
}
