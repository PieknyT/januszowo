import java.util.*;

public class Test {
	public static void main(String[] args){
		String wyraz;
		int liczbaCalk;
		double liczbaRzecz;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Podaj wyraz: ");
		wyraz=sc.next();                                     // wczytywanie wyrazu
		
		System.out.println("Podaj liczbê ca³kowit¹: ");
		liczbaCalk = sc.nextInt();                          // wczytywanie liczby ca³kowicej
	
		System.out.println("Podaj liczbê rzeczywist¹: "); 
		liczbaRzecz = sc.nextDouble();                      //wczytywanie liczby rzeczywistej
		
		System.out.println("--- Co uda³o siê wczytaæ? ---");
		System.out.println("S³owo:"+ wyraz);
		System.out.println("Liczba ca³kowita: " + liczbaCalk);
		System.out.println("Liczba rzeczywista: " +liczbaRzecz);
	}

}
