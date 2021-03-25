package gui.viewsandcontrollers.main;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Label label;

	@FXML
	private TextField num1;

	@FXML
	private TextField num2;
	
	@FXML
	private Label resul;
	
		

	public void initialize() {
		// TODO
	}

	@FXML
	private void sumar(ActionEvent event) throws IOException {

		try {
		
		double op1 = Double.parseDouble(this.num1.getText());
		double op2 = Double.parseDouble(this.num2.getText());

		Suma s = new Suma(op1, op2);

		double resultado = s.suma();

		this.resul.setText(resultado + "");
		
		}catch (NumberFormatException e) {
			System.out.println("Solo se puede introducir valores numéricos");
			this.resul.setText("ERROR");
			
			Stage dialog = new Stage();
			Node source =(Node) event.getSource();
			Stage parent = (Stage) source.getScene().getWindow();
			
			dialog.initOwner(parent);
			dialog.initModality(Modality.APPLICATION_MODAL);
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label =(Label)root.getChildrenUnmodifiable().get(0);
			label.setText("Introduzca solo valores numericos");
			dialog.setScene(scene);
			dialog.show();
			

		}
		
		
			
			
			
		
		
	}

	@FXML
	private void restar(ActionEvent event2) throws IOException {

		double op1 = Double.parseDouble(this.num2.getText());
		double op2 = Double.parseDouble(this.num2.getText());

		Resta r = new Resta(op1, op2);

		double resultado = r.resta();

		this.resul.setText(resultado + "");

	}
	
	@FXML
	private void multi(ActionEvent event) throws IOException {

		double op1 = Double.parseDouble(this.num1.getText());
		double op2 = Double.parseDouble(this.num2.getText());

		Multi m = new Multi(op1, op2);

		double resultado = m.multi();

		this.resul.setText(resultado + "");
	}

	@FXML
	private void division(ActionEvent event) throws IOException {

		double op1 = Double.parseDouble(this.num1.getText());
		double op2 = Double.parseDouble(this.num2.getText());

		Division d = new Division(op1, op2);

		double resultado = d.division();

		this.resul.setText(resultado + "");
	}
	
	

	public class Suma {

		private double a;
		private double b;

		public Suma(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double suma() {
			return a + b;
		}

	}

	public class Resta {

		private double a;
		private double b;

		public Resta(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double resta() {
			return a - b;
		}

	}
	
	public class Multi {

		private double a;
		private double b;

		public Multi(double op1, double op2) {
			this.a = op1;
			this.b = op2;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double multi() {
			return a * b;
		}

	}
	
	public class Division {

		private double a;
		private double b;

		public Division(double a, double b) {
			this.a = a;
			this.b = b;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double division() {
			return a / b;
		}
	}
}
