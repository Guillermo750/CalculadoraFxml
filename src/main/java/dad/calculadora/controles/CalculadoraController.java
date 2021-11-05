package dad.calculadora.controles;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable {

	private Calculadora calculadora = new Calculadora();

	private StringProperty numeros = new SimpleStringProperty();

	@FXML
	private GridPane view;

	@FXML
	private TextField pantalla;

	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		numeros.bindBidirectional(pantalla.textProperty());
	}

	public GridPane getView() {
		return view;
	}

	@FXML
	private void sumar(ActionEvent e) {
		calculadora.operar(Calculadora.SUMAR);
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void restar(ActionEvent e) {
		calculadora.operar(Calculadora.RESTAR);
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void multiplicar(ActionEvent e) {
		calculadora.operar(Calculadora.MULTIPLICAR);
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void dividir(ActionEvent e) {
		calculadora.operar(Calculadora.DIVIDIR);
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void calcular(ActionEvent e) {
		calculadora.operar(Calculadora.IGUAL);
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void anadeComa(ActionEvent e) {
		calculadora.insertarComa();
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void botonC(ActionEvent e) {
		calculadora.borrar();
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	private void botonCE(ActionEvent e) {
		calculadora.borrarTodo();
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onCeroAction(ActionEvent event) {
		calculadora.insertar('0');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onCincoAction(ActionEvent event) {
		calculadora.insertar('5');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onCuatroAction(ActionEvent event) {
		calculadora.insertar('4');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onDosAction(ActionEvent event) {
		calculadora.insertar('2');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onNueveAction(ActionEvent event) {
		calculadora.insertar('9');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onOchoAction(ActionEvent event) {
		calculadora.insertar('8');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onSeisAction(ActionEvent event) {
		calculadora.insertar('6');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onSieteAction(ActionEvent event) {
		calculadora.insertar('7');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onTresAction(ActionEvent event) {
		calculadora.insertar('3');
		numeros.set(calculadora.getPantalla());
	}

	@FXML
	void onUnoAction(ActionEvent event) {
		calculadora.insertar('1');
		numeros.set(calculadora.getPantalla());
	}
}
