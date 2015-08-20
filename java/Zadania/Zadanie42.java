package Zadania;
import java.util.*;

public class Zadanie42 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double kwotaKredytu, czescStala, oprocentowanieRoczne, odsetkiM1, odsetkiM2, odsetkiM3, odsetkiM4, odsetkiM5, odsetkiM6;
		
		System.out.println("Kwota Kredytu  (zl) :");
		kwotaKredytu = sc.nextDouble();
		System.out.println("Oprocentowanie roczne kredytu  (%): ");
		oprocentowanieRoczne = sc.nextDouble();
		czescStala = kwotaKredytu/6;
		odsetkiM1 =kwotaKredytu*oprocentowanieRoczne/1200 ;
		odsetkiM2 =(kwotaKredytu-czescStala)*oprocentowanieRoczne/1200 ;
		odsetkiM3 =(kwotaKredytu-2*czescStala)*oprocentowanieRoczne/1200 ;
		odsetkiM4 =(kwotaKredytu-3*czescStala)*oprocentowanieRoczne/1200 ;
		odsetkiM5 =(kwotaKredytu-4*czescStala)*oprocentowanieRoczne/1200 ;
		odsetkiM6 =(kwotaKredytu-5*czescStala)*oprocentowanieRoczne/1200 ;
		
		System.out.println("--------------------------------------------------"+
		                    '\n'+ "Scenariusz sp³aty kredytu "+
				            '\n'+ "                        KREDYT UDZIELANY NA 6 MIESIÊCY"+
		                    '\n'+"--------------------------------------------------"+
		                    '\n'+ "KWOTA:  "+kwotaKredytu+" zl"+
		                    '\n'+ "OPROCENTOWANIE ROCZNE: "+oprocentowanieRoczne+"%"+
		                    '\n'+ "CZEŒÆ STA£A RATY: "+czescStala+
		                    '\n'+"--------------------------------------------------"+
		                    '\n'+ "CzescStalaRaty +  Odsetki = Rata"+
		                    '\n'+"--------------------------------------------------"+
		                    '\n'+ "Scenariusz sp³aty kredytu "+
		                    '\n'+ "[1 rata]: "+czescStala+" + "+odsetkiM1+" = "+(czescStala+odsetkiM1)+" zl"+
		                    '\n'+ "[2 rata]: "+czescStala+" + "+odsetkiM2+" = "+(czescStala+odsetkiM2)+" zl"+
		                    '\n'+ "[3 rata]: "+czescStala+" + "+odsetkiM3+" = "+(czescStala+odsetkiM3)+" zl"+
		                    '\n'+ "[4 rata]: "+czescStala+" + "+odsetkiM4+" = "+(czescStala+odsetkiM4)+" zl"+
		                    '\n'+ "[5 rata]: "+czescStala+" + "+odsetkiM5+" = "+(czescStala+odsetkiM5)+" zl"+
		                    '\n'+ "[6 rata]: "+czescStala+" + "+odsetkiM6+" = "+(czescStala+odsetkiM6)+" zl"+
		                    '\n'+"--------------------------------------------------"+
		                    '\n'+"Koszt kredytu: "+ (odsetkiM1+odsetkiM2+odsetkiM3+odsetkiM4+odsetkiM5+odsetkiM6)+
		                    '\n'+"--------------------------------------------------"
				            );
		
	}

}
