package application;

public class GameData {
	private int candy_coins = 1000;
	private String player_name = "Player";
	
	void setPlayerName(String name) {
		player_name = name;
	}
	
	public String getPlayerName() {
		return player_name;
	}
	
	public int getCandyCoins() {
		return candy_coins;
	}
	
	public void addCandyCoins(){
		this.candy_coins += 25;
	}
	
	public void subtractCandyCoins(int x) {
		this.candy_coins-= x;
	}
}
