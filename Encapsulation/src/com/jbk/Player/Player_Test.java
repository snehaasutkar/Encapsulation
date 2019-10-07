package com.jbk.Player;

public class Player_Test {

	public static void main(String[] args) {
		Player ply=new Player("Sachin","Cricket",23);
		String x=ply.getpName();
		String y=ply.getGameType();
		int z=ply.getpAge();
		
		System.out.println("player name is :"+x+"; "  +"Game Type is :"+y+" ;"+" player age is :"+z);
	}

}
