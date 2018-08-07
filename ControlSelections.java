package part2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlSelections extends Application{

    Stage window;
    Scene scene;
    Button button1, button2, button3;
    ComboBox<String> comboBox;
    CheckBox box1, box2, box3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ComboBox Demo");
        
        button1 = new Button("Order food");
        button1.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		printFood();
            }
	    });
        
        //button1.setOnAction(e->System.out.print(""));
        
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Doner",
                "Pizza",
                "Sosiska v teste",
                "Zakonchilos next plz"
        );
        
        
        //ComboBoxes also generate actions if you need to get value instantly
        comboBox.setPromptText("Davai vybirai bystrei ludi jdut ?");
        
        comboBox.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
            public void handle(ActionEvent event) {
        		System.out.println("User selected " + comboBox.getValue());
            }
        });
        
        //Checkboxes
        box1 = new CheckBox("Kuksi");
        box2 = new CheckBox("Tort");
        box3 = new CheckBox("Zhok");
        box2.setSelected(true);
        
        button2 = new Button("Order food2");
        button2.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
            public void handle(ActionEvent event) {
        		foodOrder2(box1, box2, box3);
            }
        });
        
        button3 = new Button("Set style");
        
        //Create MenuBar
        MenuBar menuBar = new MenuBar();
        
        //Create menus
        Menu fileMenu = new Menu("_File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        
        //Create MenuItems
        MenuItem newItem = new MenuItem("_New..");
        newItem.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("New file has been created ...");
            }
	    });
        
        MenuItem openFileItem = new MenuItem("Open File..");
        openFileItem.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
	    		MessageBox.display("Call  Buddy", "Hello I am here buddy !");
            }
	    });
        
        MenuItem exitItem = new MenuItem("Exit");
        //exitItem.setDisable(true);
        
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        
        //Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, new SeparatorMenuItem(), openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);
        
        //Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(menuBar, comboBox, button1, box1,box2,box3, button2);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void printFood(){
        System.out.println(comboBox.getValue());
    }
    
    //Handle checkbox options
    private void foodOrder2(CheckBox box1, CheckBox box2, CheckBox box3){
        String message = "SDU customer orders:\n";

        if(box1.isSelected())
            message += box1.getText()+"\n";

        if(box2.isSelected())
            message += box2.getText()+"\n";
        
        if(box3.isSelected())
            message += box3.getText()+"\n";
        
        System.out.println(message);
    }
}