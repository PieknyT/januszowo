package Zadania;
import java.util.*;

public class Zadanie37 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double kvat0, kvat7, kvat22;
		
		System.out.println("Podaj kwoté opodatkowania stawka 0%: ");
		kvat0=sc.nextDouble();
		System.out.println("Podaj kwoté opodatkowania stawka 7%: ");
		kvat7=sc.nextDouble();
		System.out.println("Podaj kwoté opodatkowania stawka 22%: ");
		kvat22=sc.nextDouble();
		
		System.out.println("--------------------------------------------"
				            +'\n'+ "    RACHUNEK"
				            +'\n'+"--------------------------------------------"
				            +'\n'+'\t'+"VAT 7%:  " + (kvat7*0.07)
				            +'\n'+'\t'+"VAT 22%: " + (kvat22*0.22)
				            +'\n'
				            +'\n'+'\t'+"DO ZAPLATY:  " + (kvat7+kvat0+kvat22+kvat7*0.07+kvat22*0.22)
				);
	}

}
