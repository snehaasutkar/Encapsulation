package com.jbk.Player;

public class Player {
	private String pName;
	private String gameType;
	private int pAge;
	public Player(String pName, String gameType, int pAge) {
		this.pName = pName;
		this.gameType = gameType;
		this.pAge = pAge;
	}
	public String getpName() {
		return pName;
	}
	public String getGameType() {
		return gameType;
	}
	public int getpAge() {
		return pAge;
	}
	

}
// If you do not define setter method in class then field can be made read only