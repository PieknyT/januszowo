package Programy;

public class Program6_4 {
	public static void main(String[] args){
		int x=2,y=3,z=4,t=5;
		int sumaXYZT=x+y+z+t;
		System.out.println(sumaXYZT/(x*x+1.0) + 
		                   sumaXYZT/(y*y+1.0) + 
		                   sumaXYZT/(z*z+1.0) +
		                   sumaXYZT/(t*t+1.0));
	}

}
