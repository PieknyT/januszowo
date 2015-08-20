package Zadania;

public class Zadnaie32 {
	public static void main(String[] args){
		double x=1.0,
			  y = 0.0,
			  sumaXY = x+y,
			  yDo2 = y*y,
			  xDo2 = x*x,
			  yDo4 = yDo2*yDo2,
			  xDo4 = xDo2*xDo2,
			  kwSumyXY= sumaXY*sumaXY,
			  x2y2= yDo2*xDo2,
			  x4y4=yDo4*xDo4
			;
		     
		System.out.println("       x^4y^4 + x^2y^2                 x+y"
				+ '\n'+" ------------------------- + ---------------------" 
				+ '\n'+"            (x+y)^2               x^4 + y^4 + 1"
				+ '\n'+"-----------------------------------------------------  = " 
				+ ((x4y4+x2y2)/kwSumyXY+sumaXY/(xDo4+yDo4+1))/
				((kwSumyXY+2)/(x4y4+x2y2+1))
				                                                                                                                               
				+ '\n'+"                      (x+y)^2 + 2"
				+ '\n'+"          --------------------------------"
				+ '\n'+"                  x^4y^4 + x^2y^2 + 1"
				);
		
	}

}
