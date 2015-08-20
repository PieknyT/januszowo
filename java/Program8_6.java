import java.util.*;
public class Program8_6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwszy wyraz: ");
		String wyraz1= sc.next();
		System.out.println("Podaj drugi wyraz: ");
		String wyraz2= sc.next();
		
		if (wyraz1.equals(wyraz2))
			System.out.println("Wyrazy sa takie same.");
		else 
			System.out.println("Wyraz sá rózne");
		
		if(wyraz1==wyraz2)
			System.out.println("To ten sam obiekt.");
		else
			System.out.println("Dwa rózne obiekty.");
		
		
	}

}
