package Programy;

public class Program6a {
	public static void main(String[] args){
		int x=2,y,z=4,t=5;
		y=3;
		System.out.println((x+y+z+t)/(x*x+1.0) + 
		                   (x+y+z+t)/(y*y+1.0) + 
		                   (x+y+z+t)/(z*z+1.0) +
		                   (x+y+z+t)/(t*t+1.0)
				            );
	}

}
