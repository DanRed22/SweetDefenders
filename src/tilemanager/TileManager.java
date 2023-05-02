package tilemanager;

import application.Main;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TileManager extends StackPane{
	public static final int TILE_SIZE = 100;
	public static final int TILE_COUNT = 5;
	public TileOption tile_option[] = { 
			new TileOption("Vanila Tower", 100), 
			new TileOption("Choco Tower", 150),
			new TileOption("Candy Mine", 50),
			new TileOption("Hammer", 100)
			};
	

	public static int getTileSize() {
		return TILE_SIZE;
	}

	public static int getTileCount() {
		return TILE_COUNT;
	}
	
	



	

}
