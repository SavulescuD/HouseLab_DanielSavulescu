package houselab.houselab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * 
 * GitHub repository link: https://github.com/SavulescuD/HouseLab_DanielSavulescu.git
 * 
 * @author - Daniel Savulescu 2540408
 * 
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        final double SCENE_WIDTH = 750, SCENE_HEIGHT = 750;
        
        final double GRASS_HEIGHT = 150;
        final double GRASS_Y = SCENE_HEIGHT - GRASS_HEIGHT;
        
        final double HOUSE_WIDTH = 350, HOUSE_HEIGHT = 260;
        final double HOUSE_X = (SCENE_WIDTH - HOUSE_WIDTH) / 2;
        final double HOUSE_Y = 350;
        final double HOUSE_BOTTOM = HOUSE_Y + HOUSE_HEIGHT;
        final double HOUSE_CENTER_X = HOUSE_X + HOUSE_WIDTH / 2;
        
        
        Rectangle grass = new Rectangle(0, GRASS_Y, SCENE_WIDTH, GRASS_HEIGHT);
        grass.setFill(Color.GREEN);
        
        Rectangle houseWalls = new Rectangle(HOUSE_X, HOUSE_Y, HOUSE_WIDTH, HOUSE_HEIGHT);
        houseWalls.setFill(Color.LIGHTGREY);
        houseWalls.setStroke(Color.BLACK);
        
        Rectangle basePlate = new Rectangle(HOUSE_X, HOUSE_BOTTOM, HOUSE_WIDTH, 10);
        basePlate.setFill(Color.BEIGE);
        
        Polygon roof = new Polygon(HOUSE_X, HOUSE_Y, HOUSE_CENTER_X, HOUSE_Y - 175, HOUSE_X + HOUSE_WIDTH, HOUSE_Y);
        roof.setFill(Color.RED);
        roof.setStroke(Color.BLACK);
        
        Rectangle chimney = new Rectangle(HOUSE_CENTER_X - 40, HOUSE_Y - 150, 35, 100);
        chimney.setFill(Color.DARKGREY);
        chimney.setStroke(Color.BLACK);
        
        final double DOOR_WIDTH = 70, DOOR_HEIGHT = 130;
        
        Rectangle door = new Rectangle(HOUSE_CENTER_X - HOUSE_WIDTH / 2, HOUSE_BOTTOM - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT);
        door.setFill(Color.DARKRED);
        
        Pane pane = new Pane();
        pane.getChildren().addAll(houseWalls, roof, chimney);
        
        var scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
