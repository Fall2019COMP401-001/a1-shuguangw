package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		  int a = scan.nextInt();
		  String[] objectname = new String[a];
		  double[] price = new double[a];
		  int[]objectList = new int[a];
		  for(int i = 0; i < a; i++) {
		   objectname[i] = scan.next();
		   price[i] = scan.nextDouble();
		  }
		  int peoplenumber = scan.nextInt();
		  int[] ppl_buying = new int[a];
		  
		  //processing every people
		  for(int j = 0; j < peoplenumber; j++) {
		   scan.next();
		   scan.next();
		   int items = scan.nextInt();
		   boolean[] check = new boolean[a];
		   for (int k = 0; k < items; k++) {
		    int quantity = scan.nextInt();
		    String name = scan.next();
		    for (int l = 0; l < a; l++) {
		     if (name.equals(objectname[l])) {
		      objectList[l]+= quantity;
		      check[l] = true;
		     }
		    }
		    
		   } 
		   for(int m = 0; m < a; m++) {
		    if(check[m] == true) {
		     ppl_buying[m]++;
		    }
		  }
		  
		  
		  }
		  for(int i = 0; i < a; i++) {
		   if(ppl_buying[i] == 0) {
		    System.out.println("No customers bought " + objectname[i]);
		   } else {
		   System.out.println(ppl_buying[i] + " customers bought " + objectList[i] + " " + objectname[i]);
		  }
		 }
		}	
	}
