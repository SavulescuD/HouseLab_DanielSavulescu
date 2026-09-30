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
        final double HOUSE_WIDTH = 500;
        final double HOUSE_HEIGHT = 450;
        final double HOUSE_X = HOUSE_WIDTH /4;
        final double HOUSE_Y = HOUSE_HEIGHT /4;
        
        final double SCENE_WIDTH = 750;
        final double SCENE_HEIGHT = 750;
        
        Rectangle houseWalls = new Rectangle(HOUSE_WIDTH, HOUSE_HEIGHT);
        
        houseWalls.setX(SCENE_WIDTH / 4);
        houseWalls.setY(SCENE_HEIGHT / 3);
        houseWalls.setFill(Color.GREY);
        houseWalls.setStroke(Color.BLACK);
        
        Polygon roof = new Polygon(100, 300, HOUSE_WIDTH / 2, 150, HOUSE_WIDTH, 300);
        roof.setFill(Color.RED);
        roof.setStroke(Color.BLACK);
        
        Rectangle chimney = new Rectangle(50, 150);
        chimney.setX(120);
        chimney.setY(houseWalls.getY() + 275);
        chimney.setFill(Color.DARKGREY);
        chimney.setStroke(Color.BLACK);
        
        Rectangle window1 = new Rectangle(45, 45);
        
        
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