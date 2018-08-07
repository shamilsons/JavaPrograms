package part2;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SwitchingScenes extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //window.setOnCloseRequest(closeProgram());
        window.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
            	we.consume();
            	closeProgram();
            }
        }); 
        //Button 1
        Label label1 = new Label("This is a FIRST Scene ...");
        Button button1 = new Button("Go to scene 2");
        //button1.setOnAction(e -> window.setScene(scene2));
        //Inline implementation of action
        button1.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                window.setScene(scene2);
            }
	    });
        
        Button button3 = new Button("Call Message Box");
        button3.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		MessageBox.display("Title of the Message Window", "This is alert box called !!!");
            }
	    });
        
        Button button4 = new Button("Call Confirmation Box");
        button4.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		byte result = ConfirmBox.display("Lets get the value", "Are you sure do-not want to be a volunteer on Infomatrix-Asia 2018 ?");
	            System.out.println("Info returned from confirmation box:"+result);
            }
	    });
        
        Button btnClose = new Button("Close");
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		closeProgram();
            }
	    });
        
        //Input validation system
        final TextField inputVal = new TextField();
        inputVal.setTooltip(new Tooltip("Enter value here ..."));
        
         
        Button valButton = new Button("Validate input");
        valButton.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		isNumber(inputVal, inputVal.getText());
            }
	    });

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1, button3, button4, btnClose, inputVal, valButton);
        scene1 = new Scene(layout1, 400, 300);


        //Button 2
        Button button2 = new Button("I want go back to scene 1");
        //button2.setOnAction(e -> window.setScene(scene1));
        button2.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting the scene ONE ...");
                window.setScene(scene1);
            }
	    });
        
        
        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 650, 400);

        //Display scene 1 at first
        window.setScene(scene1);
        window.setTitle("Title Here");
        window.show();
    }
    
    private void closeProgram(){
    	byte response = ConfirmBox.display("Close Program", "Are you really want to close ?");
    	if(response==1) {
    		System.out.println("Information stored to the FILE ...");
    		window.close();
    	}
    }
    
    private boolean isNumber(TextField input, String value){
    	try{
    		int age = Integer.parseInt(input.getText());
    		MessageBox.display("User input", "Value entered:"+age);
    		input.setStyle("-fx-border-color: gray;");
    		return true;
    	} catch(NumberFormatException e){
    		System.out.println("There is a problem in entered value " + value);
    		input.setStyle("-fx-border-color: red;");
    		return false;
    	}
    }

}