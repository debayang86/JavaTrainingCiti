package com.citibank.main;

import com.citibank.main.domain.CalculationsInterface;

public class CalculationsMain {

	public static void main(String[] args) {
		
		CalculationsInterface calcAdd = (number1, number2) -> (number1 + number2);
		System.out.println(calcAdd.doCalculations(10.45, 98.23));
		
		CalculationsInterface calcSub = (number1, number2) -> (number1 - number2);
		System.out.println(calcSub.doCalculations(107.45, 98.23));
		
		CalculationsInterface calcMult = (number1, number2) -> (number1 * number2);
		System.out.println(calcMult.doCalculations(87.45, 11.267));
		
		CalculationsInterface calcDiv = (number1, number2) -> (number1 / number2);
		System.out.println(calcDiv.doCalculations(180.45, 98.23));

	}

}
