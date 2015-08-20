import java.util.*;

public class Program8_1 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê: ");
		int a = sc.nextInt();
		System.out.println("Podaj druga liczbê: ");
		int b = sc.nextInt();
		System.out.println("Suma podanych liczb wynosi: "+ (a+b));
		System.out.println("Ró¿nica podanych liczb wynosi: "+ (a-b));
		System.out.println("Iloczyn podanych liczb wynosi: "+ (a*b));
		if (b!=0)
			System.out.println("Iloraz podanych liczb wynosi: " + (a/b));
		else
			{System.out.println("Nie dzielimy przez 0");
			}
	}

}
