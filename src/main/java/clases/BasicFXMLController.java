package clases;

import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BasicFXMLController {

	@FXML
	private Label label;
	private TextField texto;

	public void initialize() {
		// TODO
	}

//    @FXML
//  private void handleButtonAction(ActionEvent event) {
//      label.setText("Hello World!");

	@FXML
	private void muestraPopUp(ActionEvent event) {
		Stage popUp = new Stage();
		popUp.initModality(Modality.APPLICATION_MODAL);
		popUp.setTitle("Pop Up Window");

		Label popMsg = new Label(texto.getText());

		Scene popScene = new Scene(new StackPane(popMsg), 200, 200);

		popUp.setScene(popScene);
		popUp.show();
	}
}
