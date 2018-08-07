package part2;

import javafx.application.Application; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.Group; 
import javafx.scene.shape.*; 
import javafx.scene.paint.Color;
import javafx.scene.PerspectiveCamera;


public class WorkWith2DShapes extends Application {

   public static void main(String args[]){ 
	      launch(args); 
   } 
	
   @Override
   public void start(Stage stage) {
	   
      //Creating a line object
      Line line = new Line(); 
      line.setStyle("-fx-stroke: green;");
      
      //Drawing a Box 
      Box box = new Box();  
      
      //Setting the properties of the Box 
      box.setWidth(180.0); 
      box.setHeight(150.0);   
      box.setDepth(200.0);
      
      box.setTranslateX(110);
      box.setTranslateY(100);
      box.setTranslateZ(130);
      
      //Creating a Group object  
      Group root = new Group(box);
      
      //Setting the drawing mode of the box 
      //box1.setDrawMode(DrawMode.LINE); 
      
      //Creating a Scene 
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting camera 
      PerspectiveCamera camera = new PerspectiveCamera(false); 
      camera.setTranslateX(20); 
      camera.setTranslateY(30); 
      camera.setTranslateZ(50); 
      //scene.setCamera(camera);
         
      //Setting title to the scene 
      stage.setTitle("Working with 2D Shapes"); 
         
      //Adding the scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of a scene 
      stage.show(); 
   }   

}
