package Zadania;
import java.util.*;
public class Zadanie35 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String smak1, smak2, smak3;
		
		System.out.println("Podaj smak pierwszej ga³ki: ");
		smak1 = sc.next();
		System.out.println("Podaj smak drugiej galki: ");
		smak2 = sc.next();
		System.out.println("Podaj smak trzeciej ga³ki: ");
		smak3 = sc.next();
		
		System.out.println("REALIZACJA ZAMÓWIENIA: "
		                   +'\n'+'\t'+'\t'+'\t'+'\t'+smak3 
		                   +'\n'+'\t'+'\t'+'\t'+"       "+smak2
		                   +'\n'+'\t'+'\t'+'\t'+'\t'+smak1
		                   +'\n'+'\t'+'\t'+'\t'+"      VVVVVVVVVVVVV"
		                   +'\n'+'\t'+'\t'+'\t'+"       VVVVVVVVVVV"
		                   +'\n'+'\t'+'\t'+'\t'+"        VVVVVVVVV"
		                   +'\n'+'\t'+'\t'+'\t'+"         VVVVVVV"
		                   +'\n'+'\t'+'\t'+'\t'+"          VVVVV"
		                   +'\n'+'\t'+'\t'+'\t'+"           VVV"
		                   +'\n'+'\t'+'\t'+'\t'+"            V"         );
	}

}
