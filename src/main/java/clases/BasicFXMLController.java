package clases;

<<<<<<< HEAD
import java.awt.Button;
import java.awt.TextField;
=======
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

>>>>>>> 9a2308d66939c7ed9435b5681fa37984e99c5b98

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.Scene;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;

public class BasicFXMLController {

	@FXML
	private Label label;
	@FXML
<<<<<<< HEAD
	private TextField resultado;
=======
	private TextField txtResultado;
>>>>>>> 9a2308d66939c7ed9435b5681fa37984e99c5b98
	@FXML
	private TextField numero1;
	@FXML
	private TextField numero2;
	@FXML
<<<<<<< HEAD
	private Button suma;
	@FXML
	private Button resta;
	@FXML
	private Button multi;
	@FXML
	private Button division;
	
=======
	private Button botonSuma;
	@FXML
	private Button botonResta;
	@FXML
	private Button botonMulti;
	@FXML
	private Button botonDivision;
>>>>>>> 9a2308d66939c7ed9435b5681fa37984e99c5b98

	public void initialize() {
		// TODO
	}

	@FXML
	private void sumar(ActionEvent event) {
<<<<<<< HEAD
		
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
=======

		try {

			int num1 = Integer.parseInt(this.numero1.getText());
			int num2 = Integer.parseInt(this.numero2.getText());
			
			Suma s = new Suma(num1, num2);
			
			int resultado = s.sumar();
			
			txtResultado.setText(resultado + "");

		} catch (NumberFormatException e) {

		}
	}

	public class Suma {
		private int a;
		private int b;

		public Suma(int a, int b) {

			this.a = a;
			this.b = b;

		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public int sumar() {
			return a + b;
		}
>>>>>>> 9a2308d66939c7ed9435b5681fa37984e99c5b98
	}

//	@FXML
//	private void handleButtonAction(ActionEvent event) {
//		label.setText("Hello World!");
//	}

//	@FXML
//	private void muestraPopUp(ActionEvent event) {
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
//	}
}
