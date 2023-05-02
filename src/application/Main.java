package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tilemanager.Tile;

public class Main extends Application {
	public static final double SCREEN_RESOLUTION_X = 1280;
	public static final double SCREEN_RESOLUTION_Y = 720;
	
	
	//Player Stats
    public static int coins = 10000;
    
    

    @Override
    public void start(Stage primaryStage) {


    	MainView mainView = new MainView();
        Scene scene = new Scene(mainView, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.setTitle("Sweet Defenders Alpha1.0");
        try{
        Image game_icon = new Image(getClass().getResourceAsStream("/resources/candy_icon.png"));
        primaryStage.getIcons().add(game_icon);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        mainView.draw();
    }



    public static void main(String[] args) {
        launch(args);
    }
    
   
}