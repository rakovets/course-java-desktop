package com.kizhyk.javafx.calculator.controller;

import com.kizhyk.javafx.calculator.service.ValidatingService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class CalculatorController {
	String element;

	@FXML
	private TextField textField;

	@FXML
	public void onKeyPressed(KeyEvent event) {
		element = event.getCode().toString();
		completeAction(element);
	}

	@FXML
	public void onMouseClick(MouseEvent event) {
		element = event.getSource().toString().split("'")[1];
		completeAction(element);
	}

	private void completeAction(String element) {
		System.out.printf("Button \"%s\" pressed.\n", element);
		textField.setText(ValidatingService.completeAction(element, textField.getText()));

	}
}