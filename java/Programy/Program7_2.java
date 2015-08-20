package Programy;
import java.util.*;

public class Program7_2 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int x,y,z,t;
		
		
		System.out.println("Podaj wartosc x: ");
		x = sc.nextInt();
		
		System.out.println("Podaj wartosc y: ");
		y = sc.nextInt();
		
		System.out.println("Podaj wartosc z: ");
		z = sc.nextInt();
		
		System.out.println("Podaj wartosc t: ");
		t = sc.nextInt();
		
		int sumaXYZT= x+y+z+t;
		System.out.println(sumaXYZT/(x*x+1.0) + 
                sumaXYZT/(y*y+1.0) + 
                sumaXYZT/(z*z+1.0) +
                sumaXYZT/(t*t+1.0));
	}
	

}
