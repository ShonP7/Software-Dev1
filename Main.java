package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;


public class Main extends Application {
	Stage window;
	Scene meatScene, breadScene, fillScene;
	Button button, button2;
	ListView<String> meatChoice, breadChoice, fillingsChoice;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Valencia Sandwich Shop");
		button = new Button("Submit");
		button2 = new Button("Submit"); 	
		
		
		//MEATS
		
		Stage meatStage = new Stage();
		meatStage.setX(200);
		meatStage.setY(100);
		meatStage.setTitle("Select Your Choice of Meat(s)");
		
		meatChoice = new ListView<>();
		meatChoice.getItems().addAll("Tuna", "Chicken Salad", "Ham", "Turkey");
		meatChoice.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(meatChoice, button);
		
		meatScene = new Scene(layout, 350,350);
		meatStage.setScene(meatScene);
		meatStage.show();
		
		button.setOnAction(e -> buttonClicked());
		
		
		//BREADS
		
		Stage breadStage = new Stage();
		breadStage.setX(600);
		breadStage.setY(100);
		breadStage.setTitle("Select Your Choice of Bread");
		 
		
		breadChoice = new ListView<>();
		breadChoice.getItems().addAll("Wheat", "Texes Toast", "Sourdough", "Hogie");
		breadChoice.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			
		VBox layout2 = new VBox(10);
		layout2.setPadding(new Insets(20,20,20,20));
		layout2.getChildren().addAll(breadChoice);
		
		breadScene = new Scene(layout2, 350,350);
		breadStage.setScene(breadScene);
		breadStage.show();	
		
		
		
		//FILLINGS
		
		Stage fillStage = new Stage();
		fillStage.setX(1000);
		fillStage.setY(100);
		fillStage.setTitle("Select Your Choice of filling(s)");
		
		fillingsChoice = new ListView<>();
		fillingsChoice.getItems().addAll("Lettuce", "Tomato", "Mayo", "Mustard");
		fillingsChoice.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		VBox layout3 = new VBox(10);
		layout3.setPadding(new Insets(20,20,20,20));
		layout3.getChildren().addAll(fillingsChoice);
		
		fillScene = new Scene(layout3, 350,350);
		fillStage.setScene(fillScene);
		fillStage.show();
		
	}
	
	
	

	public static void main(String[] args) {
		launch(args);
	}
	
	private void buttonClicked() {
		String message = "";
		String message2 = "";
		String message3 = "";
		ObservableList<String> meats;
		ObservableList<String> breads;
		ObservableList<String> filling;
		meats = meatChoice.getSelectionModel().getSelectedItems();
		breads = breadChoice.getSelectionModel().getSelectedItems();
		filling = fillingsChoice.getSelectionModel().getSelectedItems();
		
		for(String m: meats) {
			message += m + "\n";
		}
		
		System.out.println("Select Choice of Meat: " + "\n" + message);
		
		for(String b: breads) {
			message2 += b + "\n";
		}
		
		System.out.println("Select Choice of Bread: " + "\n" + message2);		
	
	
		for(String f: filling) {
		 message3 += f + "\n";
	}
	
	System.out.println("Select Choice of Bread: " + "\n" + message3);
		}
}
