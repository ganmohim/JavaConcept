/**
 * A simple program to experiment with do-while loop
 */

package iteration;

import java.util.*;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class DoWhileTollRoad {
	
	public static void main(String[] args) {
		double tollFee;
		int count = 0;
		Scanner input;
		
		do {
			System.out.print("Trial# " + ++count + "--");
			System.out.println("Please drop $5 dollar bill for toll road: ");
			input = new Scanner (System.in);
			tollFee = input.nextDouble();
		} while (tollFee != 5);
		
		System.out.println("Access to toll road granted!");
		input.close();
	}
}
