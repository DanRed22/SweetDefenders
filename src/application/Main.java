package application;

import application.GameConstants;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import tilemanager.Tile;

public class Main extends Application {
	public GameConstants CONST = new GameConstants();
	public static GameData DATA = new GameData();
	
    
    

    @Override
    public void start(Stage primaryStage) {


    	MainView mainView = new MainView(DATA);
        Scene scene = new Scene(mainView,CONST.SCREEN_RESOLUTION_X , CONST.SCREEN_RESOLUTION_Y);
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