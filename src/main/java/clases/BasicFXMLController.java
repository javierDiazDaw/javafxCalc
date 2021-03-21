package clases;

import java.awt.Button;
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
	@FXML
	private TextField resultado;
	@FXML
	private TextField numero1;
	@FXML
	private TextField numero2;
	@FXML
	private Button suma;
	@FXML
	private Button resta;
	@FXML
	private Button multi;
	@FXML
	private Button division;
	

	public void initialize() {
		// TODO
	}

//    @FXML
//  private void handleButtonAction(ActionEvent event) {
//      label.setText("Hello World!");

	@FXML
	private void sumar(ActionEvent event) {
		
		int num1 = Integer.parseInt(this.numero1.getText());
		int num2 = Integer.parseInt(this.numero2.getText());
		
		
//		Stage popUp = new Stage();
//		popUp.initModality(Modality.APPLICATION_MODAL);
//		popUp.setTitle("Pop Up Window");
//
//		Label popMsg = new Label(texto.getText());
//
//		Scene popScene = new Scene(new StackPane(popMsg), 200, 200);
//
//		popUp.setScene(popScene);
//		popUp.show();
	}
}
