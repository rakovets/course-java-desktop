package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import sample.model.HandingService;

public class TicToeController {

	private static Button button;

	static {
		HandingService.initialize();
	}

	@FXML
	private Label gameEndField;
	@FXML
	private GridPane grid;
	@FXML
	private Pane stopGamePane;

	private void checkMatchResult() {
		if (HandingService.hasWinner()) {
			gameEndField.setText(button.getText() + " is winner!!!");
			endGame();
		} else if (HandingService.isGameEnded()) {
			gameEndField.setText("Draw");
			endGame();
		}
	}

	@FXML
	private void onMouseClick(MouseEvent event) {
		button = (Button) event.getSource();
		try {
			button.setText(HandingService.getChar(Integer.parseInt(button.getId().substring(1))));
			checkMatchResult();
		} catch (Exception e) {

		}
	}

	private void endGame() {
		gameEndField.setVisible(true);
		stopGamePane.setDisable(false);
	}

	@FXML
	private void restart() {
		gameEndField.setVisible(false);
		HandingService.initialize();
		grid.getChildren().stream()
				.filter(x -> x instanceof Button)
				.map(x -> (Button) x)
				.forEach(x -> x.setText(""));
		stopGamePane.setDisable(true);
	}
}