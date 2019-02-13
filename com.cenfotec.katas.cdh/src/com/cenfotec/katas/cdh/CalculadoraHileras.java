package com.cenfotec.katas.cdh;

public class CalculadoraHileras {
	
	public static int Add (String numbers) {
		String[] convertedNumbers;
		if(numbers.contains(",")) {
			convertedNumbers = numbers.split(",");
		} else {
			convertedNumbers = numbers.split(";");
		}
		//if(convertedNumbers.length >= 3) {
		//	return -1;
		//}
		int sumaTotal = 0;
		int tempNumber = -1;
		for(int i=0; i<convertedNumbers.length; i++) {
			try {
				tempNumber = Integer.parseInt(convertedNumbers[i]);
				sumaTotal += tempNumber;
			}
			catch(Exception e) {
				return -1;
			}
		}
		
		return sumaTotal;
	}

}
