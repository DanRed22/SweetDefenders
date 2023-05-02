package tilemanager;

import javafx.scene.layout.StackPane;
import application.Main;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import tilemanager.TileManager;



public class Tile extends StackPane {
	public static final int TILE_SIZE = 100;
    private String currentTurretType = "Candy Mine";
    private TileManager tileopt = new TileManager();


        private int row, col;
        private boolean occupied = false;

        public Tile(int row, int col) {
            this.row = row;
            this.col = col;

            Rectangle border = new Rectangle(TILE_SIZE, TILE_SIZE);
            border.setFill(null);
            border.setStroke(Color.BLACK);
            border.setStrokeType(StrokeType.INSIDE);

            setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (!occupied && currentTurretType != "None") {
                    	if (currentTurretType == "Vanilla Tower" && Main.coins >= 100){
            				System.out.println("Selected Vanilla Tower $100");
            				placeObject(tileopt.tile_option[0].getTileName(), tileopt.tile_option[0].getCost());
            			}else if (currentTurretType == "Choco Tower" && Main.coins >= 150) {
            				System.out.println("Selected Choco Tower $150");
            				placeObject(tileopt.tile_option[1].getTileName(), tileopt.tile_option[1].getCost());
            			}else if (currentTurretType == "Candy Mine" && Main.coins >= 50) {
            				System.out.println("Selected Candy Mine $50");
            				placeObject(tileopt.tile_option[2].getTileName(), tileopt.tile_option[2].getCost());
            			}else if (!occupied && currentTurretType == "Hammer"){
            				System.out.println("Nothing to Remove!");
            			}else {
            				System.out.println("Enough Coins!");
            			}
                    }else if (!occupied && currentTurretType == "Hammer"){
                    	removeObject();
                    }else {
                    	System.out.println("Already Occupied!");
                    }
                }
            });

            getChildren().add(border);
            getChildren().add(tileopt);
        }

        public void placeObject(String name, int val) {
        	 Rectangle object;
            occupied = true;
            Main.coins-= val;
            System.out.println(Main.coins);
            if (name == "Vanilla Tower"){
            	 object = new Rectangle(TILE_SIZE, TILE_SIZE, Color.GREY);
			}else if (name == "Choco Tower") {
				 object = new Rectangle(TILE_SIZE, TILE_SIZE, Color.BROWN);
			}else if (name == "Candy Mine") {
				 object = new Rectangle(TILE_SIZE, TILE_SIZE, Color.LIGHTGOLDENRODYELLOW);
			}else {
				 object = new Rectangle(TILE_SIZE, TILE_SIZE, Color.RED);
			}
            object.setStroke(Color.BLACK);
            object.setStrokeWidth(1);
            object.setStrokeType(StrokeType.INSIDE);
            getChildren().add(object);
        }
        
        public void removeObject() {
        	occupied = false;
        	Rectangle object = new Rectangle(TILE_SIZE, TILE_SIZE, Color.WHITE);
        	object.setStroke(Color.BLACK);
        	object.setStrokeType(StrokeType.INSIDE);
        	object.setStrokeWidth(1);
            getChildren().add(object);
        }


		public String getCurrentTurretType() {
			return currentTurretType;
		}

		public void setCurrentTurretType(String currentTurretType) {
			if (currentTurretType == "Vanilla Tower") {
				System.out.println("Selected Vanilla Tower $100");
			}else if (currentTurretType == "Choco Tower") {
				System.out.println("Selected Choco Tower $150");
			}else if (currentTurretType == "Candy Mine") {
				System.out.println("Selected Candy Mine $50");
			}else if (currentTurretType == "Hammer") {
				System.out.println("Destroy a Tower");
			}else {
				System.out.println("None");
			}
		}
    }