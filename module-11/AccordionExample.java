/* Rashai Robertson
CSD 402
7/20/20025
Module 11: Assignment 2
 */ 
// This program demonstrates the use of an Accordion layout in JavaFX. It creates a simple GUI with multiple titled panes that can be expanded or collapsed, allowing users to view different sections of content without cluttering the interface.
  
// Reference: https://jenkov.com/tutorials/javafx/accordion.html




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create content for each TitledPane
        Label content1 = new Label("Content of Pane 1");
        Label content2 = new Label("Content of Pane 2");
        Label content3 = new Label("Content of Pane 3");

        // Create TitledPanes
        TitledPane pane1 = new TitledPane("Pane 1", content1);
        TitledPane pane2 = new TitledPane("Pane 2", content2);
        TitledPane pane3 = new TitledPane("Pane 3", content3);

        // Create Accordion and add panes
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(pane1, pane2, pane3);

        // Optional: Expand the first pane by default
        accordion.setExpandedPane(pane1);

        // Set up the scene and stage
        VBox root = new VBox(accordion);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Accordion Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
