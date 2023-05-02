package application;

import application.Main;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import tilemanager.Tile;

public class MainView extends VBox{
	
	private Canvas canvas;
	public static final int TILE_SIZE = 100;
    public static final int MAP_SIZE_ROW = 5;
    public static final int MAP_SIZE_COL = 8;
    public Tile[][] map = new Tile[MAP_SIZE_ROW][MAP_SIZE_COL];
    Scene scene;
    
	public MainView(){
		
		canvas = new Canvas(Main.SCREEN_RESOLUTION_X, Main.SCREEN_RESOLUTION_Y);
      GridPane grid = new GridPane();

      for (int row = 0; row < MAP_SIZE_ROW; row++) {
          for (int col = 0; col < MAP_SIZE_COL; col++) {
              Tile tile = new Tile(row, col);
              map[row][col] = tile;
              grid.add(tile, col, row);
          }
      }
      this.getChildren().add(grid);
      this.getChildren().add(this.canvas);
	}
	
	public void draw() {
		GraphicsContext g = this.canvas.getGraphicsContext2D();
		
		g.setFill(Color.LIGHTGRAY);
		g.fillRect(0, 0, Main.SCREEN_RESOLUTION_X, Main.SCREEN_RESOLUTION_Y);
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println("UPDATE");
	}
}
