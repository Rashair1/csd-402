/* Rashai Robertson
CSD 402
7/20/20025
Module 11: Assignment 2
 */ 
// This program demonstrates the use of a FlowPane layout in JavaFX. It creates a simple GUI with buttons arranged in a flow layout that automatically wraps the buttons to the next line when the width is exceeded.
  
// Reference: https://jenkov.com/tutorials/javafx/flowpane.html


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane with horizontal and vertical gaps
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);  // Horizontal gap between elements
        flowPane.setVgap(10);  // Vertical gap between elements

        // Add some buttons to the FlowPane
        for (int i = 1; i <= 12; i++) {
            Button button = new Button("Button " + i);
            button.setPrefWidth(100);  // Optional: set a fixed width
            flowPane.getChildren().add(button);
        }

        // Create a Scene with the FlowPane
        Scene scene = new Scene(flowPane, 400, 300);

        // Set up the stage
        primaryStage.setTitle("JavaFX FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
