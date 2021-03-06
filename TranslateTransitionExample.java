package part2;

import javafx.animation.TranslateTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
         
public class TranslateTransitionExample extends Application { 
   @Override 
   public void start(Stage stage) {  
      //Drawing a Circle 
      Circle circle = new Circle(); 
      
      //Setting the position of the circle 
      circle.setCenterX(70.0f); 
      circle.setCenterY(80.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(30.0f); 
      
      //Setting the color of the circle 
      circle.setFill(Color.BROWN); 
      
      //Setting the stroke width of the circle 
      circle.setStrokeWidth(10); 
       
      //Creating Translate Transition 
      TranslateTransition translateTransition = new TranslateTransition(); 
      
      //Setting the duration of the transition  
      translateTransition.setDuration(Duration.millis(500)); 
      
      //Setting the node for the transition 
      translateTransition.setNode(circle); 
      
      //Setting the value of the transition along the x,y axis.  
      translateTransition.setToX(380);
      //translateTransition.setToY(150);
      
      //Setting the cycle count for the transition 
      translateTransition.setCycleCount(2); 
      
      //Setting auto reverse value to false 
      translateTransition.setAutoReverse(true); 
      
      //Playing the animation 
      translateTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 700, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Circle object translate transition example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}