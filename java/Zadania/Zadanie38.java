package Zadania;
import java.util.*;
public class Zadanie38 {
	public static void main(String[] args){
		
	    Scanner sc= new Scanner(System.in);
	    double l1,l2;
	    
		System.out.println("Podaj piersza liczbe: ");
		l1= sc.nextDouble();
		System.out.println("Podaj druga liczbe: ");
		l2= sc.nextDouble();
		
		System.out.println("Suma podanych liczb wynosi: "+ (l1+l2)+
				            '\n'+"Roznica podanych liczb wynosi: "+ (l1-l2)+
			                '\n'+"Suma odwrotnosci podanych liczb wynosi: "+ (1/l1+1/l2)
				
				);
	}

}
