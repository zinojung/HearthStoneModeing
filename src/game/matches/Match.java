package game.matches;

import java.util.ArrayList;

import game.card.Card;
import game.player.Player;

public class Match {
	private Player playerA;
	private Player playerB;
	private ArrayList<Card> battleFieldForA = new ArrayList<Card>();
	private ArrayList<Card> battleFieldForB = new ArrayList<Card>();
	private int round;
	private int MaxMana;
	
	public void readyToMatch() {
		playerA.setHasMana(1);
		playerA.setMaxMana(1);
		playerB.setHasMana(1);
		playerB.setMaxMana(1);
	}
	
	public void nextRound() {
		round ++;
		playerA.setMaxMana(getMaxMana() + 1); 
		playerA.setHasMana(getMaxMana());
		playerB.setMaxMana(getMaxMana() + 1);
		playerB.setHasMana(getMaxMana());
	}
	
	public void  putACardInBattle(Player player, Card card) {
	}

	//setter, getter
	public void setPlayers(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}
	public Player playerA() {
		return playerA;
	}
	public Player playerB() {
		return playerB;
	}
	public ArrayList<Card> getBattleFieldForA() {
		return battleFieldForA;
	}
	public void setBattleFieldForA(ArrayList<Card> battleFieldForA) {
		this.battleFieldForA = battleFieldForA;
	}
	public ArrayList<Card> getBattleFieldForB() {
		return battleFieldForB;
	}
	public void setBattleFieldForB(ArrayList<Card> battleFieldForB) {
		this.battleFieldForB = battleFieldForB;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getMaxMana() {
		return MaxMana;
	}
	public void setMaxMana(int maxMana) {
		MaxMana = maxMana;
	}
}
