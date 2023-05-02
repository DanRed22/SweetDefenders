package tilemanager;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class TileOption extends StackPane{
	private String TileName = "None";
	private int cost = 0;
	Rectangle border = new Rectangle(TileManager.TILE_SIZE, TileManager.TILE_SIZE);
    
	public String getTileName() {
		return TileName;
	}
	public void setTileName(String tileName) {
		TileName = tileName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public TileOption(String name, int val) {
		TileName = name;
		cost = val;
		if (name == "Vanila Tower") {
			this.border.setFill(Color.GREY);
		}else if (name == "Choco Tower") {
			this.border.setFill(Color.BROWN);
		}else if (name == "Candy Mine") {
			this.border.setFill(Color.LIGHTGOLDENRODYELLOW);
		}else if (name == "Hammer") {
			this.border.setFill(Color.RED);
		}else {
			this.border.setFill(Color.BLACK);
		}
		this.border.setStroke(Color.BLACK);
		this.border.setStrokeWidth(1);
		this.border.setStrokeType(StrokeType.INSIDE);
		getChildren().add(border);
	}
	
	
	
}

