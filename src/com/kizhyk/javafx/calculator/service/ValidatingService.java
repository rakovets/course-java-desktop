package com.kizhyk.javafx.calculator.service;

public class ValidatingService {
	private static String lastValue = null;

	//TODO
	private static boolean isPartiallyValid(String expression) {
		//return expression.matches("");
		return true;
	}

	//TODO
	private static boolean isValid(String expression) {
		//return expression.matches("");
		return true;
	}

	//TODO
	private static boolean isReverseValid(String expression) {
		//return expression.matches("");
		return true;
	}

	public static String completeAction(String element, String text) {
		String response = text;
		switch (element) {
			case "=":
			case "ENTER":
				if (isValid(text)) {
					response = ComputingService.calculate(text);
				}
				break;
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "0":
			case "-":
			case "+":
			case "/":
			case ".":
				if (isPartiallyValid(text + element)) {
					response = text + element;
				}
				break;
			case "DIGIT1":
			case "DIGIT2":
			case "DIGIT3":
			case "DIGIT4":
			case "DIGIT5":
			case "DIGIT6":
			case "DIGIT7":
			case "DIGIT9":
			case "DIGIT0":
				if (isPartiallyValid(text + element.charAt(5))) {
					response = text + element.charAt(5);
				}
				break;
			case "x":
				if (isPartiallyValid(text + "*")) {
					response = text + "*";
				}
				break;
			case "DIGIT8":
				if (lastValue.equals("SHIFT")) {
					if (isPartiallyValid(text + "*")) {
						response = text + "*";
					}
				} else if (isPartiallyValid(text + element.charAt(5))) {
					response = text + element.charAt(5);
				}
				break;
			case "SLASH":
				if (isPartiallyValid(text + "/")) {
					response = text + "/";
				}
				break;
			case "MINUS":
				if (isPartiallyValid(text + "-")) {
					response = text + "-";
				}
				break;
			case "EQUALS":
				if (lastValue.equals("SHIFT")) {
					if (isPartiallyValid(text + "+")) {
						response = text + "+";
					}
				} else if (isValid(text)) {
					response = ComputingService.calculate(text);
				}
				break;
			case "CE":
				response = "";
				break;
			case "+/-":
				response = isReverseValid(text) ? ComputingService.reverse(text) : response;
				break;
		}
		lastValue = element;
		return response;
	}
}