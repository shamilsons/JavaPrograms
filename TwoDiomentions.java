package part2;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.paint.Color; 
import javafx.util.Duration;

public class TwoDiomentions extends Application {
	
	Circle circleOne, circleTwo;
	TextField radiousParam, angleParam;
	ScaleTransition scaleTransition;
	
	public static void main(String args[]){ 
	      launch(args); 
	} 
	
	@Override 
	public void start(Stage stage) {
		BorderPane mainpane= new BorderPane();
		mainpane.setPadding(new Insets(10, 20, 10, 20));
		
		circleOne = new Circle();
		circleOne.setFill(Color.RED);
		circleOne.setCenterX(80);
		circleOne.setCenterY(150);
		circleOne.setRadius(35);
		
		circleTwo = new Circle();
		circleTwo.setFill(Color.BLUE);
		circleTwo.setCenterX(160);
		circleTwo.setCenterY(150);
		circleTwo.setRadius(35);
		
		radiousParam = new TextField();
		//radiousParam.setTooltip(new Tooltip("Enter radious"));
		radiousParam.setPromptText("Enter radious");
		
		angleParam = new TextField();
		
		Button btnAction1 = new Button("Change color circle 1");
		
		btnAction1.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Change the color of Circle-1");
                circleOne.setFill(Color.BROWN);
                if(!radiousParam.getText().isEmpty())
                	circleOne.setRadius(Integer.parseInt(radiousParam.getText()));
                else
                	System.out.println("Please enter the radious for the circle ...");
                
                circleTwo.setRadius(0);
                circleTwo.setFill(Color.LIGHTGRAY);
                //Playing the animation 
                scaleTransition.play(); 
            }
	    });
		
		Button btnAction2 = new Button("Change color circle 2");
		
		btnAction2.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Change the color of Circle-2");
                circleTwo.setFill(Color.CHARTREUSE);
                circleTwo.setRadius(45);  
                circleTwo.setCenterX(250);
        		circleTwo.setCenterY(150);
        		scaleTransition.stop();
            }
	    });
		
		HBox hb_btm = new HBox(10);
		hb_btm.getChildren().addAll(btnAction1, btnAction2);
		hb_btm.setAlignment(Pos.CENTER);
		hb_btm.setPadding(new Insets(10));
		
		HBox hb_center = new HBox(10);
		
		HBox hb_up = new HBox(10);
		hb_up.getChildren().addAll(radiousParam, angleParam);
		hb_up.setAlignment(Pos.CENTER);
		hb_up.setPadding(new Insets(10));
		
		Group circle_group = new Group(circleOne, circleTwo);
		
		hb_center.getChildren().add(circle_group);
		mainpane.setTop(hb_up);
		mainpane.setCenter(circle_group);
		mainpane.setBottom(hb_btm);
		
		//Creating scale Transition 
	    scaleTransition = new ScaleTransition(); 
	      
	    //Setting the duration for the transition 
	    scaleTransition.setDuration(Duration.millis(1000)); 
	      
	    //Setting the node for the transition 
	    scaleTransition.setNode(circleOne); 
	      
	    //Setting the dimensions for scaling 
	    scaleTransition.setByY(1.5); 
	    scaleTransition.setByX(1.5); 
	      
	    //Setting the cycle count for the translation 
	    scaleTransition.setCycleCount(5); 
	      
	    //Setting auto reverse value to true 
	    scaleTransition.setAutoReverse(true);
		
		//Creating a scene object  
        Scene scene = new Scene(mainpane, 600, 350); 
      
        //Setting title to the Stage 
        stage.setTitle("Scale transition example"); 
         
        //Adding scene to the stage 
        stage.setScene(scene); 
         
        //Displaying the contents of the stage 
        stage.show();
	}
}
