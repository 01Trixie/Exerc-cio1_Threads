package view;

import controller.ThreadCalc;

public class Principal {
	
	public static void main(String [] args) {
		
		int a = 10;
		int b = 2;
		for (int op = 0; op < 5; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
		
	}
}