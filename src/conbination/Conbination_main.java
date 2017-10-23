package conbination;

import java.util.Scanner;

public class Conbination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("Input Number s>");
        int s = Integer.parseInt(scan.next());
        
        System.out.print("Input Number r>");
        int r = Integer.parseInt(scan.next());
        Conbination_lib clib = new Conbination_lib();
    	System.out.println(s+"!="+clib.getFactorial(s));
 
    	System.out.println(s+"C"+r+"="+clib.getFactorial(s)/(clib.getFactorial(r)*clib.getFactorial(s-r)));

	}

}
