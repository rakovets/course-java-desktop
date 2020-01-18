package com.rakovets.javafx.caclulator.TaskFiles;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class CalculatorController {

    @FXML
    public TextField usersText;

    boolean isOperationUsed = true;

    public void onMouseClicked(MouseEvent event) {
        usersText.textProperty().setValue("");
    }

    public void onKeyPressed(KeyEvent event) {
        switch (event.getText()) {
            case "0":
                onSymbolPressed("0");
                break;
            case "1":
                onSymbolPressed("1");
                break;
            case "2":
                onSymbolPressed("2");
                break;
            case "3":
                onSymbolPressed("3");
                break;
            case "4":
                onSymbolPressed("4");
                break;
            case "5":
                onSymbolPressed("5");
                break;
            case "6":
                onSymbolPressed("6");
                break;
            case "7":
                onSymbolPressed("7");
                break;
            case "8":
                onSymbolPressed("8");
                break;
            case "9":
                onSymbolPressed("9");
                break;

            case "+":
                onOperationPressed("+");
                break;
            case "-":
                onOperationPressed("-");
                break;
            case "/":
                onOperationPressed("/");
                break;
            case "*":
                onOperationPressed("*");
                break;

            case "=":
                resultCalculating();
        }
    }

    public void onNumberOneClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 1);
        isOperationUsed = false;
    }

    public void onNumberTwoClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 2);
        isOperationUsed = false;
    }

    public void onNumberThreeClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 3);
        isOperationUsed = false;
    }

    public void onNumberFourClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 4);
        isOperationUsed = false;
    }

    public void onNumberFiveClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 5);
        isOperationUsed = false;
    }

    public void onNumberSixClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 6);
        isOperationUsed = false;
    }

    public void onNumberSevenClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 7);
        isOperationUsed = false;
    }

    public void onNumberEightClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 8);
        isOperationUsed = false;
    }

    public void onNumberNineClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 9);
        isOperationUsed = false;
    }

    public void onNumberZeroClicked(Event onMouseClicked) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + 0);
        isOperationUsed = false;
    }

    public void onOperationMinusPressed(Event onMouseClicked) {
        if (!isOperationUsed) {
            usersText.textProperty().setValue(usersText.textProperty().getValue() + "-");
            isOperationUsed = true;
        }
    }

    public void onOperationPlusPressed(Event onMouseClicked) {
        if (!isOperationUsed) {
            usersText.textProperty().setValue(usersText.textProperty().getValue() + "+");
            isOperationUsed = true;
        }
    }

    public void onOperationSplitPressed(Event onMouseClicked) {
        if (!isOperationUsed) {
            usersText.textProperty().setValue(usersText.textProperty().getValue() + "/");
            isOperationUsed = true;
        }
    }

    public void onOperationMultiplyPressed(Event onMouseClicked) {
        if (!isOperationUsed) {
            usersText.textProperty().setValue(usersText.textProperty().getValue() + "*");
            isOperationUsed = true;
        }
    }

    private void onSymbolPressed(String symbol) {
        usersText.textProperty().setValue(usersText.textProperty().getValue() + symbol);
        isOperationUsed = false;
    }

    private void onOperationPressed(String operation) {
        if (!isOperationUsed) {
            usersText.textProperty().setValue(usersText.textProperty().getValue() + operation);
            isOperationUsed = true;
        }
    }

    public void onOperationResultPressed(Event onMouseClicked) {
        char[] usersTextInChar = usersText.getText().toCharArray();
        int firstNumber;
        int secondNumber;
        int result;
        String usersTextInString;
        usersTextInString = new String(usersTextInChar);

        for (int i = 0; i < usersText.getLength() - 1; i++) {
            switch (usersTextInChar[i]) {
                default:
                    break;
                case '-':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('-')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('-') + 1, usersTextInString.length()));
                    result = firstNumber - secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '+':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('+')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('+') + 1, usersTextInString.length()));
                    result = firstNumber + secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '*':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('*')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('*') + 1, usersTextInString.length()));
                    result = firstNumber * secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '/':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('/')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('/') + 1, usersTextInString.length()));
                    result = firstNumber / secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
            }
        }
    }

    private void resultCalculating() {
        char[] usersTextInChar = usersText.getText().toCharArray();
        int firstNumber;
        int secondNumber;
        int result;
        String usersTextInString;
        usersTextInString = new String(usersTextInChar);

        for (int i = 0; i < usersText.getLength() - 1; i++) {
            switch (usersTextInChar[i]) {
                default:
                    break;
                case '-':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('-')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('-') + 1, usersTextInString.length()));
                    result = firstNumber - secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '+':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('+')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('+') + 1, usersTextInString.length()));
                    result = firstNumber + secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '*':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('*')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('*') + 1, usersTextInString.length()));
                    result = firstNumber * secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
                case '/':
                    firstNumber = Integer.parseInt(usersTextInString.substring(0, usersTextInString.indexOf('/')));
                    secondNumber = Integer.parseInt(usersTextInString.substring(usersTextInString.indexOf('/') + 1, usersTextInString.length()));
                    result = firstNumber / secondNumber;
                    usersText.textProperty().setValue(String.valueOf(result));
                    break;
            }
        }
    }
}
