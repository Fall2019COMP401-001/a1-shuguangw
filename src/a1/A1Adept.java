package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  int a = scan.nextInt();
		  String[] objectname = new String[a];
		  double[] price = new double[a];
		  for(int i = 0; i < a; i++) {
		   objectname[i] = scan.next();
		   price[i] = scan.nextDouble();
		  }
		  //b is the number of ppl
		  int b = scan.nextInt();
		  String[] firstname = new String[b];
		  String[] lastname = new String[b];
		  double[] cost = new double[b];
		  for(int j = 0; j < b; j++) {
		   firstname[j] = scan.next();
		   lastname[j] = scan.next();
		   int items = scan.nextInt();
		   for(int k = 0; k < items; k++) {
		    int quantity = scan.nextInt();
		    String thisitem = scan.next();
		    for(int h = 0; h < a; h++) {
		     
		     if(thisitem.equals(objectname[h])) {
		      cost[j] += quantity * price[h];
		     }
		    }
		   }
		  }
		  int indexmax = 0;
		  double maxnumber = 0.0;
		  for (int x = 0; x < b; x++) {
		   if(cost[x]> maxnumber) {
		    indexmax = x;
		    maxnumber = cost[x];
		   }
		  }
		  int indexmin = 0;
		  double minnumber = cost[0];
		  for (int y = 0; y < b; y++) {
		   if(cost[y]< minnumber ) {
		    indexmin = y;
		    minnumber = cost[y];
		   }
		  }
		  double sum = 0;
		  for (int z = 0; z < b; z++) {
		   sum += cost[z];
		  }
		  double average = sum / b;
		  scan.close();
		  System.out.println("Biggest: "+ firstname[indexmax] + " " 
		  + lastname[indexmax] + " "+ "(" + String.format("%.2f", maxnumber) + ")");
		  System.out.println("Smallest: "+ firstname[indexmin] + " " 
		  + lastname[indexmin] + " "+ "(" + String.format("%.2f", minnumber) + ")");
		  System.out.println("Average" + ": " + String.format("%.2f", average));
		  // Your code follows here.
		  }
		 }