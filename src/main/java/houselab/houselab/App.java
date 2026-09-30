package houselab.houselab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        
        final double WINDOW_SIZE = 70;
        final double WINDOW_Y = HOUSE_Y + 50;
        final double WINDOW1_X = HOUSE_X + 35, WINDOW2_X = HOUSE_X + HOUSE_WIDTH - 35 - WINDOW_SIZE;
        
        Rectangle window1 = new Rectangle(WINDOW1_X, WINDOW_Y, WINDOW_SIZE, WINDOW_SIZE);
        Rectangle window2 = new Rectangle(WINDOW2_X, WINDOW_Y, WINDOW_SIZE, WINDOW_SIZE);
        window1.setFill(Color.LIGHTBLUE);
        window2.setFill(Color.LIGHTBLUE);
        
        Line hPane1 = new Line(WINDOW1_X, WINDOW_Y + WINDOW_SIZE / 2, WINDOW1_X + WINDOW_SIZE, WINDOW_Y + WINDOW_SIZE / 2);
        Line vPane1 = new Line(WINDOW1_X + WINDOW_SIZE / 2, WINDOW_Y, WINDOW1_X + WINDOW_SIZE / 2, WINDOW_Y + WINDOW_SIZE);
        Line hPane2 = new Line(WINDOW2_X, WINDOW_Y + WINDOW_SIZE / 2, WINDOW2_X + WINDOW_SIZE, WINDOW_Y + WINDOW_SIZE / 2);
        Line vPane2 = new Line(WINDOW2_X + WINDOW_SIZE / 2, WINDOW_Y, WINDOW2_X + WINDOW_SIZE / 2, WINDOW_Y + WINDOW_SIZE);
        
        hPane1.setStroke(Color.BLACK);
        hPane2.setStroke(Color.BLACK);
        vPane1.setStroke(Color.BLACK);
        vPane2.setStroke(Color.BLACK);
        
        final double SUN_X = 670, SUN_Y = 80;
        final double SUN_RADIUS = 45;
        
        Circle sun = new Circle(SUN_X, SUN_Y, SUN_RADIUS);
        sun.setFill(Color.YELLOW);
        
        Line ray1 = new Line(SUN_X - SUN_RADIUS - 10, SUN_Y, SUN_X - SUN_RADIUS - 40, SUN_Y);
        Line ray2 = new Line(SUN_X, SUN_Y + SUN_RADIUS + 10, SUN_X, SUN_Y  + SUN_RADIUS + 40);
        Line ray3 = new Line(SUN_X - 35, SUN_Y + 35, SUN_X - SUN_RADIUS - 60, SUN_Y + 60);
        
        ray1.setStroke(Color.GOLD);
        ray2.setStroke(Color.GOLD);
        ray3.setStroke(Color.GOLD);
        
        Pane root = new Pane();
        root.getChildren().addAll();
        
        var scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
