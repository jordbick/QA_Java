package com.qa.conditional.flowchart;

public class FlowChart {

	public int values(int num1, int num2, boolean isAddition) {
		if (isAddition) {
			int sum = num1 + num2;
			return sum;
		} else {
			int product = num1 * num2;
			return product;
		}
	}
}
