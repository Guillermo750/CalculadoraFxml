package dad.calculadora;

import dad.calculadora.controles.CalculadoraController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {

	private CalculadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CalculadoraController();
		
		Scene scene = new Scene(controller.getView());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
