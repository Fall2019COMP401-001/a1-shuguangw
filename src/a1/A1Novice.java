package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Your code follows here.
		int numPpl = sc.nextInt();
		for(int i = 0; i < numPpl; i++) {
			String first = sc.next();
			first.substring(0,1);
			String last = sc.next();
			int item = sc.nextInt();
			double sum = 0.0;
		    for(int j = 0; j < item; j++) {
		    	int qua = sc.nextInt();
		    	sc.next();
		    	double price = sc.nextDouble();
		    	sum += qua * price;
		    }
		    System.out.println(first + ". " + last + ": " + String.format("%.2f", sum));
		}
	}
}
