package com.kizhyk.javafx.calculator.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComputingService {


	//TODO
	protected static String reverse(String text) {
		if (text.startsWith("-")) {
			text = text.substring(1);
		} else {
			text = "-" + text;
		}
		return text;
	}

	protected static String calculate(String text) {
		try {
			ProcessBuilder b = new ProcessBuilder("/bin/sh", "-c", "echo 'scale=6;" + text.trim() + "' | bc");
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(b.start().getInputStream()));

			text = reader.readLine();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return text;
	}
}