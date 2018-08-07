package part2;

import java.util.Arrays;

import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.Group;

//installing packages for lambda expressions
//https://wiki.eclipse.org/JDT/Eclipse_Java_8_Support_For_Kepler

public class GUIExample1 extends Application{
	@Override
    public void start(Stage window) throws Exception {
	    /*
		//Creating a label node    
        Label label = new Label("Hello World with JavaFX !!!");
        Button signIn = new Button("Sign In");
        Button signUp = new Button("Sign Up");
        
        VBox mainlayout = new VBox();
        mainlayout.getChildren().addAll(label, signIn, signUp);
        mainlayout.setSpacing(10);
        
        // preferred width allows for two columns
		//flow.setPrefWrapLength(200); 
		
        
		
		HBox hb = new HBox();
		FlowPane flow = new FlowPane(Orientation.VERTICAL);
		//Insets top, right, bottom, left					
		flow.setPadding(new Insets(5, 6, 5, 6));
		flow.setVgap(4);
		flow.setHgap(4);
		//setting the stype of the layout
		flow.setStyle("-fx-background-color: DAE6F3;");
		 
		Button b1 = new Button("Button One");
		Button b2 = new Button("Button Two");
		Button b3 = new Button("Button Three");
		Button b4 = new Button("Button Four");
		Button b5 = new Button("Button Five");
		Button b6 = new Button("Button Six");
		Button b7 = new Button("Button Seven");

		flow.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
		hb.getChildren().addAll(flow);
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		Button button5 = new Button("Button 5");
		Button button6 = new Button("Button 6");

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		gridPane.add(button1, 0, 0);
		gridPane.add(button2, 1, 0);
		gridPane.add(button3, 2, 0);
		gridPane.add(button4, 0, 1);
		gridPane.add(button5, 1, 1);
		gridPane.add(button6, 2, 1);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		
		BorderPane bp = new BorderPane();
	    bp.setPadding(new Insets(10, 20, 10, 20));

	    Button btnTop = new Button("Top");
	    bp.setTop(btnTop);

	    Button btnLeft = new Button("Left");
	    bp.setLeft(btnLeft);

	    Button btnCenter = new Button("Center");
	    bp.setCenter(btnCenter);

	    Button btnRight = new Button("Right");
	    bp.setRight(btnRight);

	    Button btnBottom = new Button("Bottom");
	    bp.setBottom(btnBottom);
		
		//Creating a label node    
        Label label = new Label("GUI Programming with JavaFX !!!");
        label.setFont(new Font("Arial", 20));
        TextField textfield = new TextField();
        TextArea textarea = new TextArea();
        PasswordField passwordfield = new PasswordField();
        Button signIn = new Button("Sign In");
		
		ComboBox comboBox = new ComboBox();
		comboBox.getItems().add("Choice 1");
		comboBox.getItems().add("Choice 2");
		comboBox.getItems().add("Choice 3");
		
		CheckBox checkBox1 = new CheckBox("Green");
		CheckBox checkBox2 = new CheckBox("Blue");
		
		ToggleGroup group = new ToggleGroup();
	    RadioButton button1 = new RadioButton("First radio choice");
	    button1.setToggleGroup(group);
	    button1.setSelected(true);
	    RadioButton button2 = new RadioButton("Second radio choice");
	    button2.setToggleGroup(group);
		
		
		// Create MenuBar
        MenuBar menuBar = new MenuBar();
        
        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        
        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");
        
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        
        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);
        
        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        
        BorderPane hb = new BorderPane();
        hb.setTop(menuBar);
        
        //------------------------CHARTS ------------------------
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Programming Language");
 
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Percent");
 
        // Create a BarChart
        BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
 
        // Series 1 - Data of 2014
        XYChart.Series<String, Number> dataSeries1 = new XYChart.Series<String, Number>();
        dataSeries1.setName("2014");
 
        dataSeries1.getData().add(new XYChart.Data<String, Number>("Java", 20.973));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("C#", 4.429));
        dataSeries1.getData().add(new XYChart.Data<String, Number>("PHP", 2.792));
 
        // Series 2 - Data of 2015
        XYChart.Series<String, Number> dataSeries2 = new XYChart.Series<String, Number>();
        dataSeries2.setName("2015");
 
        dataSeries2.getData().add(new XYChart.Data<String, Number>("Java", 26.983));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("C#", 6.569));
        dataSeries2.getData().add(new XYChart.Data<String, Number>("PHP", 6.619));
 
        // Add Series to BarChart.
        barChart.getData().add(dataSeries1);
        barChart.getData().add(dataSeries2);
 
        barChart.setTitle("Some Programming Languages");
 
        VBox hb = new VBox(barChart);
	 
        
        ------------------------------------------------------
         
		
		//Add control(node) with width, height parameters	
        */
		// Create MenuBar
        MenuBar menuBar = new MenuBar();
        
        // Create menus
        Menu fileMenu = new Menu("_File");
        Menu editMenu = new Menu("_Edit");
        Menu helpMenu = new Menu("_Help");
        
        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        newItem.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Item selected get the scene");
            }
	    });
        
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");
        
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        
        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);
        
        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        
        HBox hb101 = new HBox();
        hb101.getChildren().add(menuBar);
		
		GridPane hb = new GridPane();
		 
		hb.setPadding(new Insets(15));
		hb.setHgap(10);
		hb.setVgap(10);
	    //hb.setGridLinesVisible(true);
	    
	    Label labelTitle = new Label("Please enter your credantials below");
	    labelTitle.setFont(new Font("Arial", 15));
	    labelTitle.setStyle("-fx-background-color: red;");
	    
	    // Put on cell (0,0), span 2 column, 1 row.
	    //hb.add(labelTitle, 0, 0, 2, 1);
	    hb.add(hb101, 0, 0, 2, 1);
	    
	    Label labelUserName = new Label("User Name : ");
	    TextField fieldUserName = new TextField();
	    fieldUserName.setMinWidth(200);
	    fieldUserName.setPrefHeight(25);
	 
	    Label labelPassword = new Label("Password  : ");
	    PasswordField fieldPassword = new PasswordField();
	 
	    Button loginButton = new Button("Login");
	    loginButton.setMinWidth(70);
	       
	    Button closeButton = new Button("Close");
	    closeButton.setMinWidth(70);
	    
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
	    vb.setSpacing(5);
	    vb.getChildren().addAll(loginButton, closeButton);
	    
	    // Horizontal alignment for Login button.
	    //GridPane.setHalignment(loginButton, HPos.LEFT);
	    //hb.add(loginButton, 1, 3);
	       
	    //GridPane.setHalignment(closeButton, HPos.RIGHT);
	    //hb.add(closeButton, 1, 3);
	    GridPane.setHalignment(vb, HPos.CENTER);
	    hb.add(vb, 1, 3);
	    
	    Scene scene = new Scene(hb, 320, 150);
	    
	    //Add scene to the window (stage)    
	    window.setTitle("Layout Usage Sample Application");
	    //window.setResizable(false);
	    window.setScene(scene);
	    window.setResizable(false);
	    window.show();
	}

	public static void main(String[] args) {
	    Application.launch(args);
	}
}