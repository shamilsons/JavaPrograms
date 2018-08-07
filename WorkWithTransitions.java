package part2;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition; 
import javafx.animation.Timeline;
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.*; 
import javafx.stage.Stage; 
import javafx.util.Duration; 

public class WorkWithTransitions extends Application {
	
	@Override 
	public void start(Stage stage) {
	    //1. Fade transition code	
		final Rectangle rect = new Rectangle(10, 10, 100, 100);
		rect.setArcHeight(20);
		rect.setArcWidth(20);
		rect.setFill(Color.RED);
		
		FadeTransition ft = new FadeTransition(Duration.millis(2000), rect);
		ft.setFromValue(1.0);
		ft.setToValue(0.2);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		////////////////////////////////////////////////////////////
		//2. Path transition
		final Rectangle rectPath = new Rectangle (0, 0, 40, 40);
		rectPath.setArcHeight(10);
		rectPath.setArcWidth(10);
		rectPath.setFill(Color.ORANGE);
		
		//Creating the transitional path with particular parameters
		Path path = new Path();
		path.getElements().add(new MoveTo(30,30));
		path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
		path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
		
		PathTransition pathTransition = new PathTransition();
		pathTransition.setDuration(Duration.millis(3000));
		pathTransition.setPath(path);
		pathTransition.setNode(rectPath);
		pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathTransition.setCycleCount(Timeline.INDEFINITE);
		pathTransition.setAutoReverse(true);
		pathTransition.play();
		
		//////////////////////////////////////////////////////////////////
		
		final Rectangle rectBasicTimeline = new Rectangle(100, 50, 100, 50);
		rectBasicTimeline.setFill(Color.RED);
		
		final Timeline timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(false);
		final KeyValue kv = new KeyValue(rectBasicTimeline.xProperty(), 300);
		final KeyFrame kf = new KeyFrame(Duration.millis(500), kv);
		timeline.getKeyFrames().add(kf);
		timeline.play();
		
		//Creating a Group object  
        Group root = new Group(path,rectPath); 
         
        //Creating a scene object  
        Scene scene = new Scene(root, 600, 300); 
      
        //Setting title to the Stage 
        stage.setTitle("Scale transition example"); 
         
        //Adding scene to the stage 
        stage.setScene(scene); 
         
        //Displaying the contents of the stage 
        stage.show();
	}
	
	public static void main(String args[]){ 
	      launch(args); 
	} 

}
