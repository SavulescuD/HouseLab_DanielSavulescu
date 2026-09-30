package houselab.houselab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
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
        final double HOUSE_WIDTH = 600;
        
        Rectangle houseWalls = new Rectangle(HOUSE_WIDTH, 450);
        houseWalls.setX(100);
        houseWalls.setY(30);
        houseWalls.setFill(Color.GREY);
        houseWalls.setStroke(Color.BLACK);
        
        Polygon roof = new Polygon(100, 300, HOUSE_WIDTH / 2, 150, HOUSE_WIDTH, 300);
        roof.setFill(Color.RED);
        
        Rectangle chimney = new Rectangle(50, 150);
        chimney.setX(HOUSE_WIDTH);
        
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}