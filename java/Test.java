import java.util.*;

public class Test {
	public static void main(String[] args){
		String wyraz;
		int liczbaCalk;
		double liczbaRzecz;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Podaj wyraz: ");
		wyraz=sc.next();                                     // wczytywanie wyrazu
		
		System.out.println("Podaj liczb� ca�kowit�: ");
		liczbaCalk = sc.nextInt();                          // wczytywanie liczby ca�kowicej
	
		System.out.println("Podaj liczb� rzeczywist�: "); 
		liczbaRzecz = sc.nextDouble();                      //wczytywanie liczby rzeczywistej
		
		System.out.println("--- Co uda�o si� wczyta�? ---");
		System.out.println("S�owo:"+ wyraz);
		System.out.println("Liczba ca�kowita: " + liczbaCalk);
		System.out.println("Liczba rzeczywista: " +liczbaRzecz);
	}

}
