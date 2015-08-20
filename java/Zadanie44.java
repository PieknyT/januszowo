import java.util.*;
public class Zadanie44 {
	public static void main(String[] args){
	Scanner	sc= new Scanner(System.in);
	int miesiac, rok;
	
	System.out.println("Podaj miesiác:");
	miesiac = sc.nextInt();
	System.out.println("Podaj rok: ");
    rok = sc.nextInt();
    if (miesiac<10)
    	if(miesiac<7)
    		if(miesiac<4)
    	         System.out.println(miesiac+"."+rok+" to I kwartal "+rok+" roku");
    	    else 
    	    	System.out.println(miesiac+"."+rok+" to II kwartal "+rok+" roku");
    	else 
    	    System.out.println(miesiac+"."+rok+" to III kwartal "+rok+" roku");
	else 
    	System.out.println(miesiac+"."+rok+" to IV kwartal "+rok+" roku");
    	
	
	}

}
