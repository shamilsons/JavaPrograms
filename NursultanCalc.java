package part2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NursultanCalc extends Application {

	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("Simple Calculator");
		window.setResizable(false);
		
		VBox box = new VBox();
		box.setSpacing(3);
		box.setPadding(new Insets(5,5,5,5));
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(2.5);
		pane.setVgap(2.5);
		
		pane.add(new Button("7"), 0, 0);
		pane.add(new Button("8"), 1, 0);
		pane.add(new Button("9"), 2, 0);
		pane.add(new Button("4"), 0, 1);
		pane.add(new Button("5"), 1, 1);
		pane.add(new Button("6"), 2, 1);
		pane.add(new Button("1"), 0, 2);
		pane.add(new Button("2"), 1, 2);
		pane.add(new Button("3"), 2, 2);
		pane.add(new Button("0"), 0, 3);
		pane.add(new Button("."), 1, 3);
		pane.add(new Button("="), 2, 3);
		pane.add(new Button("+"), 3, 0);
		pane.add(new Button("-"), 3, 1);
		pane.add(new Button("*"), 3, 2);
		pane.add(new Button("/"), 3, 3);
		
		pane.setId("pane");
		
		GridPane area = new GridPane();
		area.setAlignment(Pos.CENTER);
		TextArea ta = new TextArea();
		area.add(ta, 0, 0);
		area.setId("textarea");
		area.setAlignment(Pos.TOP_RIGHT);
		
		GridPane title = new GridPane();
		Label name = new Label("Simple Calculator");
		title.setAlignment(Pos.CENTER);
		title.add(name,0,0);
		
		box.getChildren().addAll(title,area,pane);
		
		Scene scene = new Scene(box,200,300);
		window.setScene(scene);
		
		scene.getStylesheets().add((getClass().getResource("calc.css")).toExternalForm());
		window.show();
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}
