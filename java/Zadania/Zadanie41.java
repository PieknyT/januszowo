package Zadania;
import java.util.*;
public class Zadanie41 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double ksiazka,wino,pieczywo,ser,karty,maslo,plyta,kwota0vat, kwota7vat,kwota22vat, vat7, vat22;
		System.out.println("ile zap³aci³es za ksi¹zkê?       (VAT 0%): ");
		ksiazka= sc.nextDouble();
		System.out.println("ile zap³aci³es za butelke wina ? (VAT 22%): ");
		wino= sc.nextDouble();
		System.out.println("ile zap³aci³es za pieczywo ?      (VAT 7%): ");
		pieczywo= sc.nextDouble();
		System.out.println("ile zap³aci³es za ser ?           (VAT 7%): ");
		ser= sc.nextDouble();
		System.out.println("ile zap³aci³es za talie kart ?   (VAT 22%): ");
		karty= sc.nextDouble();
		System.out.println("ile zap³aci³es za mas³o ?         (VAT 7%): ");
		maslo= sc.nextDouble();
		System.out.println("ile zap³aci³es za dobra plyte ?  (VAT 22%): ");
		plyta= sc.nextDouble();
		kwota22vat=wino+karty+plyta;
		kwota7vat=pieczywo+maslo+ser;
		vat22=kwota22vat-(kwota22vat/1.22);
		vat7=kwota7vat-(kwota7vat/1.07);
		
		System.out.println("-------------------------------------------------------------"+
		                   '\n' +"ILE CIE TO KOSZTOWA£O...               ...by³o warto?"+
		                   '\n'+ "-------------------------------------------------------------"+
		                   '\n' +"A (VAT 22%)  razem: "+ kwota22vat+" zl"+"w tym VAT 22%: "+ vat22+" zl"+
		                   '\n' +"B (VAT 7%)  razem: "+ kwota7vat+" zl"+"w tym VAT 7%: "+ vat7+" zl"+
		                   '\n' +"C (VAT 0%)  razem: "+ ksiazka+" zl"+
		                   '\n'+ "-------------------------------------------------------------"+
		                   '\n'+ "RAZEM: "+(kwota22vat+kwota7vat+ksiazka)+"    w tym VAT: "+(vat7+vat22)+
		                   '\n'+ "-------------------------------------------------------------"
				             );
	}

}


