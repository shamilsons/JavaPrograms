/*
 * Name : Shahriar Shamiluulu
 * Email : shamilsons@gmail.com
 * Date : 14.05.2018
 * Description : Student subject grade checking program   
 */

package part2;

import java.util.Arrays;

import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.Group;

public class StudentCheckFinal extends Application {
	@Override
    public void start(final Stage window) throws Exception {
		
		//Declared GridPane to organize components
		GridPane hb = new GridPane();
		
		hb.setPadding(new Insets(15));
		hb.setHgap(10);
		hb.setVgap(10);
		
		//Declared Label and Textfield to get student info data
		Label studentInfoLbl = new Label("Student Info : ");
	    final TextField studentInfoTxt = new TextField();
	    studentInfoTxt.setMinWidth(200);
	    studentInfoTxt.setPrefHeight(25);
	    
	    //Declared Label and Textfield to get subject data
	    Label subjectLbl = new Label("Subject : ");
	    final TextField subjectTxt = new TextField();
	    subjectTxt.setMinWidth(200);
	    subjectTxt.setPrefHeight(25);
	    
	    //Declared Label and Textfield to get grade data
	    Label gradeLbl = new Label("Grade : ");
	    final TextField gradeTxt = new TextField();
	    gradeTxt.setMinWidth(200);
	    gradeTxt.setPrefHeight(25);
	    
	    //Codes to check student grade and display information
	    Button checkButton = new Button("Check");
	    checkButton.setMinWidth(70);
	    checkButton.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		if(studentInfoTxt.getText()==null || studentInfoTxt.getText().trim().isEmpty())
	    			MessageBox.display("Error Message", "Please enter Student Info");
	    		else if(subjectTxt.getText()==null || subjectTxt.getText().trim().isEmpty())
	    			MessageBox.display("Error Message", "Please enter Subject data");
	    		else if(gradeTxt.getText()==null || gradeTxt.getText().trim().isEmpty())
	    			MessageBox.display("Error Message", "Please enter Grade data");
	    		else
	    			checkGrade(Integer.parseInt(gradeTxt.getText()));
            }
	    });
	       
	    Button closeButton = new Button("Close");
	    closeButton.setMinWidth(70);
	    closeButton.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		byte result = ConfirmBox.display("Closing Program", "Are you sure to close program ?");
	            //System.out.println("Value returned from cb:"+result);
	            if(result == 1)
	            	window.close();
            }
	    });
	    
	    //Organizing components on the window with GridPane
	    GridPane.setHalignment(studentInfoLbl, HPos.RIGHT);
		 
	    hb.add(studentInfoLbl, 0, 1);
	 
	    GridPane.setHalignment(subjectLbl, HPos.RIGHT);
	    hb.add(subjectLbl, 0, 2);
	    
	    GridPane.setHalignment(gradeLbl, HPos.RIGHT);
	    hb.add(gradeLbl, 0, 3);
	    
	    GridPane.setHalignment(studentInfoTxt, HPos.LEFT);
	    hb.add(studentInfoTxt, 1, 1);
	 
	    GridPane.setHalignment(subjectTxt, HPos.LEFT);
	    hb.add(subjectTxt, 1, 2);
	    
	    GridPane.setHalignment(gradeTxt, HPos.LEFT);
	    hb.add(gradeTxt, 1, 3);
	    
	    HBox vb = new HBox();
	    vb.setSpacing(5);
	    vb.getChildren().addAll(checkButton, closeButton);
	    
	    GridPane.setHalignment(vb, HPos.CENTER);
	    hb.add(vb, 1, 4);
	    
	    Scene scene = new Scene(hb, 360, 190);
	    
	    //Add scene to the window (stage)    
	    window.setTitle("Final Exam Program");
	    window.setScene(scene);
	    window.setResizable(false);
	    window.show();
	}

	public static void main(String[] args) {
		//Start the application
		Application.launch(args);
	}
	
	//Method to check the student grade and display its outcome
	private void checkGrade(int stdGrade){
		if(stdGrade<0){
			MessageBox.display("Error", "Please enter positive grade");
		} else {
			if(stdGrade>=0 & stdGrade<50)
				MessageBox.display("Grade Outcome", "Your grade is LOW");
			else if(stdGrade>=50 & stdGrade<80)
				MessageBox.display("Grade Outcome", "Your grade is AVERAGE");
			else
				MessageBox.display("Grade Outcome", "Your grade is HIGH");
		}
	}
}
