package com.sc.numbers;

import java.math.BigDecimal; 

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Total pkg weight :: "+getFullValue(new String[] { "0.00000567", "0.00000569", "0.00000989" }));
		//new BigDecimal("7.88E-5")
	}

	public static BigDecimal getFullValue(String[] pkgsWeight) {
		BigDecimal totalPkgValue = BigDecimal.ZERO;
		for (String weight : pkgsWeight) {
			BigDecimal pkgValue = new BigDecimal(weight);
			totalPkgValue = totalPkgValue.add(pkgValue);
		}
		return totalPkgValue;
	}

}
