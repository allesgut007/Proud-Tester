package com.tsys;

public class callCalc {

	int add1;
	double add2;

	public callCalc ( int addition1, double addition2) {

		this.add1 = addition1;
		this.add2 = addition2;	

	}


	public static void main(String[] args) {

		callCalc myCalc = new callCalc(555, 1.231);

		System.out.println( "Sum of add 1 and add2 is" + "  " + (myCalc.add1 + myCalc.add2));


	}

}
