package houselab.houselab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * 
 * @author - Daniel Savulescu 2540408
 * 
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle houseBaseSquare = new Rectangle(450, 450);

        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}