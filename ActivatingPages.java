package part2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.* ; // KeyEvent, KeyCode

public class ActivatingPages extends Application implements EventHandler<ActionEvent> {
	
	//Public controls (good practice)
	Stage window;
	//Gives us opportunity to access controls from all methods
	Button loginButton, closeButton, btnLamda1, btnLamda2;
	TextField fieldUserName;
	PasswordField fieldPassword;
	Label labelTitle;
	
	@Override
    public void start(Stage primarywindow) throws Exception {
		window=primarywindow;
		
		GridPane hb = new GridPane();
		 
		hb.setPadding(new Insets(15));
		hb.setHgap(10);
		hb.setVgap(10);
	    //hb.setGridLinesVisible(true);
	    
	    labelTitle = new Label("Please enter your credantials below");
	    labelTitle.setFont(new Font("Arial", 15));
	    labelTitle.setStyle("-fx-background-color: blue;");
	    
	    // Put on cell (0,0), span 2 column, 1 row.
	    hb.add(labelTitle, 0, 0, 2, 1);
	 
	    Label labelUserName = new Label("User Name : ");
	    fieldUserName = new TextField();
	    fieldUserName.setMinWidth(200);
	    fieldUserName.setPrefHeight(25);
	 
	    Label labelPassword = new Label("Password  : ");
	    fieldPassword = new PasswordField();
	 
	    loginButton = new Button("Login");
	    loginButton.setMinWidth(70);
	    //This class method will handle the button events
	    loginButton.setOnAction(this);
	       
	    closeButton = new Button("Close");
	    closeButton.setMinWidth(70);
	    closeButton.setOnAction(this);
	    
	    btnLamda1 = new Button("Scene1");
	    btnLamda1.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Event handled by the help of anonymous inner classes");
            }
	    });
	    
	    btnLamda2 = new Button("Scene2");
	    //btnLamda2.setOnAction(e -> System.out.println("Example of using lambda expressions ..."));
	    
	    GridPane.setHalignment(labelUserName, HPos.RIGHT);
	 
	    // Put on cell (0,1)
	    hb.add(labelUserName, 0, 1);
	 
	        
	    GridPane.setHalignment(labelPassword, HPos.RIGHT);
	    hb.add(labelPassword, 0, 2);
	     
	    // Horizontal alignment for User Name field.
	    GridPane.setHalignment(fieldUserName, HPos.LEFT);
	    hb.add(fieldUserName, 1, 1);
	 
	    // Horizontal alignment for Password field.
	    GridPane.setHalignment(fieldPassword, HPos.LEFT);
	    hb.add(fieldPassword, 1, 2);
	     
	    HBox vb = new HBox();
	    vb.setSpacing(7);
	    vb.setAlignment(Pos.BASELINE_RIGHT);
	    vb.getChildren().addAll(loginButton, closeButton);
	    
	    // Horizontal alignment for Login button.
	    //GridPane.setHalignment(loginButton, HPos.LEFT);
	    //hb.add(loginButton, 1, 3);
	       
	    //GridPane.setHalignment(closeButton, HPos.RIGHT);
	    //hb.add(closeButton, 1, 3);
	    GridPane.setHalignment(vb, HPos.CENTER);
	    hb.add(vb, 1, 3);
	    
	    Scene scene = new Scene(hb, 320, 150);
	    
	    scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
	    	@Override
            public void handle(KeyEvent event) {
                System.out.println("Key pressed is:"+event.getCode().toString());
            }
	    });
	    
	    // KeyCode.F1, KeyCode.UP, KeyCode.DOWN, KeyCode.A etc.,
	    // http://www.naturalprogramming.com/javagui/javafx/KeyboardInputDemoFX.java
	    
	    
	    //Add scene to the window (stage)    
	    window.setTitle("Layout Usage Sample Application");
	    //window.setResizable(false);
	    window.setScene(scene);
	    window.setResizable(false);
	    window.show();
	}
	
	//When button is clicked, handle() gets called
    //Button click is an ActionEvent (also MouseEvents, TouchEvents, etc...)
    @Override
    public void handle(ActionEvent event) {
    	//System.out.println("What is source:"+event.getSource());
        if (event.getSource() == loginButton) { 
        	if(fieldUserName.getText().equals("javafx") && fieldPassword.getText().equals("cool")){
        		labelTitle.setStyle("-fx-background-color: green;");
        		labelTitle.setText("Welcome BOSS to the system ...");
        	}
        	if(fieldUserName.getText().equals("") || fieldPassword.getText().equals("")) {
        		labelTitle.setStyle("-fx-background-color: red;");
        		labelTitle.setText("Enter username and password !!!");
        	}
        } else if (event.getSource() == closeButton) {
        	System.out.println("Close button clicked !!!");
        	window.close();
        }
    }
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
