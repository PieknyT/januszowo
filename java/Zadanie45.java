import java.util.*;
	public class Zadanie45 {
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			System.out.println("Podaj rok:");
			int rok=sc.nextInt();
			if (rok>1582)
				if(rok%4==0 && rok%100!=0)
					System.out.println("Rok przestepny");
				else
					if(rok%400==0)
						System.out.println("Rok przestepny");
					else
						System.out.println("Rok nie jest przestepny");
			else
				System.out.println("Lata przed kalendarzem Gerorianskim");
		}

}
